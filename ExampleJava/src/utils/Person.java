package utils;

public class Person {
    protected String _name;
    protected int _age;

    public Person() {
        this._name = "John";
        this._age = 30;
    }

    public Person(String name, int age) {
        this._name = name;
        this._age = age;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
