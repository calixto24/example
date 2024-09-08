package controller;

import dao.EmployeeDao;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.Register;
import model.Employee;
import utils.Validate;

public class EmployeeController {

    //atributos
    private EmployeeDao employeeDao;
    private Register view;
    private String action;
    private Validate vldt;
    private long selectedId;

    //constructor vacio
    public EmployeeController(Register view) {
        this.view = view;
        action = "add";
        selectedId = 0;

        //instancia de los objetos a utilizar
        employeeDao = new EmployeeDao();
        vldt = new Validate();
    }

    public void handleRegisterClick() {
        String name = view.getjTFName().getText();
        vldt.setElement(name)
                .isRequired("El nombre es obligatorio");

        if (!vldt.exec()) {

            view.showMessage(vldt.getMessage());
            view.getjTFName().requestFocus();
            return;

        }

        String ap = view.getjTFAP().getText();
        vldt.setElement(ap)
                .isRequired("El apellido materno es obligatorio");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFAP().requestFocus();
            return;

        }

        //VALIDACION A. MATERNO
        String am = view.getjTFAM().getText();
        vldt.setElement(am)
                .isRequired("El apellido materno es obligatorio");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFAM().requestFocus();
            return;

        }

        //VALIDACION F, NACIMIENTO
        String date = view.getjTFBirthdate().getText();

        vldt.setElement(date).isRequired("La fecha es obligatoria")
                .isDate("formato de fecha invalida");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFBirthdate().requestFocus();
            return;
        }

        int[] dateV = new int[3];

        String[] datePart = date.split("/");
        dateV[0] = Integer.parseInt(datePart[0]);
        dateV[1] = Integer.parseInt(datePart[1]);
        dateV[2] = Integer.parseInt(datePart[2]);

        //VALIDACION DNI
        String dnistr = view.getjTFDni().getText();
        vldt.setElement(dnistr)
                .isRequired("El DNI es obligatorio")
                .isInt("El DNI debe ser numerico")
                .equalsLength(8, "El DNI debe tener 8 digitos");

        if (action.equals("add")) vldt.equalsDNI("El DNI ya existe");
        else if (action.equals("edit")) vldt.equalsDNI("El DNI ya existe", selectedId);

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFDni().requestFocus();
            return;
        }

        int dni = Integer.parseInt(dnistr);

        //VALIDACION RUC
        String ruc = view.getjTFRuc().getText();
        vldt.setElement(ruc)
                .isRequired("El RUC es obligatorio")
                .equalsLength(11, "El RUC debe tener 11 digitos")
                .equalsAttribute("El RUC ya existe", ruc, "ruc");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFRuc().requestFocus();
            return;

        }

        //VALIDACION CORREO
        String email = view.getjTFEmail().getText();

        vldt.setElement(email)
                .isRequired("El email es obligatorio")
                .isEmail("Email invalido");

        if (!vldt.exec()) {

            view.showMessage(vldt.getMessage());
            view.getjTFEmail().requestFocus();
            return;

        }

        //VALIDACION USERNAME
        String username = view.getjTFUser().getText();

        vldt.setElement(username)
                .isRequired("El usuario es obligatorio")
                .equalsAttribute("El usuario ya existe", username, "username");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFUser().requestFocus();
            return;
        }

        //VALIDACION CONTRASEÑA
        String password = view.getjTFPass().getText();

        vldt.setElement(password)
                .isRequired("La contraseña es obligatoria")
                .minLength(8, "La contraseña debe tener minimo 8 caracteres");

        if (!vldt.exec()) {
            view.showMessage(vldt.getMessage());
            view.getjTFPass().requestFocus();
            return;

        }

        //ROL
        String role = (String) view.getjCBRole().getSelectedItem();

        //---------------------------------------------- Crear el nuevo empleado
        Employee newEmployee = new Employee(username, password, role, name, ap, am, dni, LocalDate.of(dateV[2], dateV[1], dateV[0]), ruc, email);

        if (action.equals("add")) {

            try {
                employeeDao.add(newEmployee);

                view.showMessage("Usuario creado");
            } catch (Exception e) {

                view.showMessage("Usuario no creado" + e.toString());
            }
        } else if (action.equals("edit")) {

            try {
                employeeDao.update(selectedId, newEmployee);

                view.showMessage("Usuario actualizado");
            } catch (Exception e) {

                view.showMessage("Usuario no actualizado" + e.toString());
            }

        }

        handleCleanForm();
        view.renderTable();
    }

    public DefaultTableModel getEmployeeModel() {
        String[] columns = {
            "Id",
            "Usuario",
            "Contraseña",
            "Rol",
            "Nombre",
            "A. Paterno",
            "A. Materno",
            "DNI",
            "Fecha Nacimiento",
            "RUC",
            "Email"
        };
        DefaultTableModel employeeModel = new DefaultTableModel(null, columns);

        ArrayList<Employee> employeeList = employeeDao.getAll();

        for (Employee employee : employeeList) {
            Object[] row = {
                employee.getId(),
                employee.getUsername(),
                employee.getPassword(),
                employee.getRole(),
                employee.getName(),
                employee.getLastname_paternal(),
                employee.getLastname_maternal(),
                employee.getDni(),
                employee.getBirthdateFormatted(),
                employee.getRuc(),
                employee.getEmail()
            };

            employeeModel.addRow(row);
        }

        return employeeModel;
    }

    public void handleCleanForm() {
        action = "add";

        view.getjTFUser().setText(" ");
        view.getjTFAM().setText(" ");
        view.getjTFAP().setText(" ");
        view.getjTFBirthdate().setText(" ");
        view.getjTFDni().setText(" ");
        view.getjTFEmail().setText(" ");
        view.getjTFName().setText(" ");
        view.getjTFPass().setText(" ");
        view.getjTFRuc().setText(" ");
    }

    public void heandleViewEditClick() {
        selectedId = Long.parseLong(view.getjTUserList().getModel().getValueAt(view.getRow(), 0).toString());

        //pintando la columna con la informacion de la fila
        view.getjTFUser().setText(view.getjTUserList().getValueAt(view.getRow(), 0).toString());
        view.getjTFPass().setText(view.getjTUserList().getValueAt(view.getRow(), 1).toString());
        view.getjCBRole().setSelectedItem(view.getjTUserList().getValueAt(view.getRow(), 2).toString());
        view.getjTFName().setText(view.getjTUserList().getValueAt(view.getRow(), 3).toString());
        view.getjTFAP().setText(view.getjTUserList().getValueAt(view.getRow(), 4).toString());
        view.getjTFAM().setText(view.getjTUserList().getValueAt(view.getRow(), 5).toString());
        view.getjTFDni().setText(view.getjTUserList().getValueAt(view.getRow(), 6).toString());
        view.getjTFBirthdate().setText(view.getjTUserList().getValueAt(view.getRow(), 7).toString());
        view.getjTFRuc().setText(view.getjTUserList().getValueAt(view.getRow(), 8).toString());
        view.getjTFEmail().setText(view.getjTUserList().getValueAt(view.getRow(), 9).toString());

        action = "edit";
    }

    public void heandleDeleteClick() {
        selectedId = Long.parseLong(view.getjTUserList().getModel().getValueAt(view.getRow(), 0).toString());

        try {
            employeeDao.delete(selectedId);

            //renderizar los cambios en la tabla
            view.renderTable();
            view.showMessage("Usuario eliminado correctamente");
            handleCleanForm();

        } catch (Exception e) {
            view.showMessage("Error al eliminar el usuario" + e.toString());
        }

    }
}
