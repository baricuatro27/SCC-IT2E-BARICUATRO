
package javaapp.baricuatro123;


public class Grades {
    
    String name;
    int id;
    double p, m, pf, f, average;
    
    public void addGrades(int sid, String sname, double sp, double sm, double spf, double sf) {
        this.id = sid;
        this.name = sname;
        this.p = sp;
        this.m = sm;
        this.pf = spf;
        this.f = sf;
    }

    public void viewGrades() {
        
        average = (this.p + this.m + this.pf + this.f) / 4;

        String remarks = (average <= 3.0) ? "Passed" : "Failed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
            this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }
}

    