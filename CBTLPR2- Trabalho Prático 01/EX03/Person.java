package EX03;

//@author Maria Eduarda Fodor CB3025063
//@author Pedro Xavier Oliveira CB3027376



public class Person {
    protected String name;
    protected String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name="+ name + ",address=" + address + "]";
    }
}

