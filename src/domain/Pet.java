package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pet implements Comparable<Pet>{
    private String type;
    private String name;
    private String gender;
    private LocalDateTime date;


    public Pet(String type,String name,String gender,LocalDateTime date){

        this.type=type;
        this.name=name;
        this.gender=gender;
        this.date=date;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pet-> type:"+this.type+" name:"+this.name+" gender:"+this.gender+" date:"+date.format(DateTimeFormatter.ofPattern("MMMM dd, uuuu HH:mm:ss"))+"\n";
    }

    public int compareTo(Pet o) {
        return this.name.compareTo(o.name);
    }
}
