package model;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String email;
    private int bloodSugar;
    private String nation;
    private String date;   
    private String time;
    private String notes;

    public User() {
        id = 0;
        email = "none@test.com";
        bloodSugar = 0;
        nation = "none";
        date = "1970-01-01";
        time = "00:01 AM";
        notes = "none";
    }

    public User(int id, String email, int bloodSugar, String nation, String date, String time, String notes) {
        this.id = id;
        this.email = email;
        this.bloodSugar = bloodSugar;
        this.nation = nation;
        this.date = date;
        this.time = time;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(int bloodSugar) {
        this.bloodSugar = bloodSugar;
    }
    
     public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String inHTMLRowFormat() {
        return "<tr><td>" + id + "</td>"
                + "<td>" + email + "</td>"
                + "<td>" + bloodSugar + "</td>"
                + "<td>" + nation + "</td>"
                + "<td>" + date + "</td>"
                + "<td>" + time + "</td>"
                + "<td>" + notes + "</td></tr>\n";
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", bloodSugar="
                + bloodSugar + ", nation=" + nation + ", date=" + date + ", time=" + time
                + ", notes=" + notes + '}';
    }
}
