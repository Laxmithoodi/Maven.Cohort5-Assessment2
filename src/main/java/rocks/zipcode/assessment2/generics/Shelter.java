package rocks.zipcode.assessment2.generics;




import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<p extends Ageable>{



    private volatile ArrayList<Object> list = new ArrayList<Object>();


    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return list.size();
    }

    public void add(Object object) {
    list.add(object);


    }

    public Boolean contains(Object object) {


        return list.contains(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return index;
    }

    public Integer getIndexOf(Object ageable) {


        return (Integer) ageable;
    }
}