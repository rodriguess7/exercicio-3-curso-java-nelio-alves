package entities;

public class Student {
    public String name;
    public double _1quarterNote;
    public double _2quarterNote;
    public double _3quarterNote;

    public double finalNote(){
       return (_1quarterNote + _2quarterNote + _3quarterNote);
    }
    public String isAprovedOrNot(){
       if (finalNote() >= 60){
           return String.format("Aproved with %.2f points",finalNote());
       }
       else {
           return String.format("reproved. %.2f points remaining",60.0 - finalNote());
       }
    }
}
