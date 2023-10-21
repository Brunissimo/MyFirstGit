
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bruno
 */
public class Persons {

    private ArrayList<Person> alPersons = new ArrayList<>();

    public int size() {
        return alPersons.size();
    }

    public Object[] toArray() {
        return alPersons.toArray();
    }

    public boolean add(Person e) {
        return alPersons.add(e);
    }

    public void clear() {
        alPersons.clear();
    }

}
