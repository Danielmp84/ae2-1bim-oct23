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
public class Crud {

    public Crud(int nextId1, String marca, String modelo, String placa) {
    }
    private List<Crud> Clasevehiculo = new ArrayList<>();
    private int nextId = 1;

    public void createVehiculo(String marca, String modelo, String placa) {
        Clasevehiculo.add(new Crud(nextId, marca, modelo, placa));
        nextId++;
    }

    public List<Crud> readVehiculos() {
        return Clasevehiculo;
    }
    /*
    public void updateVehiculo(int id, String marca, String modelo, String placa) {
        for (Crud vehiculo : Clasevehiculos) {
            if (vehiculo.getId() == id) {
                vehiculo.setMarca(marca);
                vehiculo.setModelo(modelo);
                vehiculo.setPlaca(placa);
                return;
            }
        }
    }

    public void deleteVehiculo(int id) {
        Clasevehiculos.removeIf(Crud -> Crud.getId() == id);
    }
*/
}
