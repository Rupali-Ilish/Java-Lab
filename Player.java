public class Player {
    protected String name;
    protected int age;
    protected int jersey_no;
    protected char gender;
    protected String country;

    public Player(){}
    public Player(String name, int age, int jersey_no, char gender, String country) {
        this.name = name;
        this.age = age;
        this.jersey_no = jersey_no;
        this.gender = gender;
        this.country = country;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setJersey_no(int jersey_no){
        this.jersey_no = jersey_no;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getJersey_no() {
        return this.jersey_no;
    }
    public char getGender() {
        return this.gender;
    }
    public String getCountry() {
        return this.country;
    }
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Jersey No: " + this.jersey_no);
        System.out.println("Gender: " + this.gender);
        System.out.println("Country: " + this.country);
    }
}
