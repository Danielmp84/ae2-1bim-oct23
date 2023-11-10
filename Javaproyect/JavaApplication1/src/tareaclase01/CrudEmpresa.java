/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaclase01;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel Moreira
 */
public class CrudEmpresa {    
    public CrudEmpresa(int nextId1, String nombre, String ruc, String direccion, String telefono, String correo) {
    }
    private List<CrudEmpresa> ClaseEmpresa = new ArrayList<>();
    private int nextId = 1;

    public void createEmpresa(String nombre, String ruc, String direccion, String telefono, String correo) {
        ClaseEmpresa.add(new CrudEmpresa(nextId, nombre, ruc, direccion, telefono, correo));
        nextId++;
    }

    public List<CrudEmpresa> readEmpresa() {
        return ClaseEmpresa;
    }
    /*
    public void updateEmpresa(int id, String nombre, String ruc, String direccion, String telefono, String correo) {
        for (Crud Empresa : ClaseEmpresa) {
            if (Empresa.getId() == id) {
                Empresa.setNomre(nombre);
                Empresa.setRuc(Ruc);
                Empresa.setDireccion(direccion);
                Empresa.setTelefono(telefono);
                Empresa.setCorreo(correo);    
                return;
            }
        }
    }

    public void deleteEmpresa(int id) {
        ClaseEmpresa.removeIf(CrudEmpresa -> CrudEmpresa.getId() == id);
    }
*/
}