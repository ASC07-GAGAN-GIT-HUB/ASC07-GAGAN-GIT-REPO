import java.util.Scanner;

class StudentDetails {
    private int Id;
    private String Name;
    private String City;
    private int Marks1;
    private int Marks2;
    private int Marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public void setId(int id)
    {
        this.Id = id;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public void setCity(String city)
    {
        this.City = city;
    }

    public void setMarks1(int m)
    {
        this.Marks1 = m;
    }

    public void setMarks2(int m)
    {
        this.Marks2 = m;
    }

    public void setMarks3(int m)
    {
        this.Marks3 = m;
    }

    public void setFeePerMonth(float fee)
    {
        this.feePerMonth = fee;
    }

    public void setEligibleForScholarship(boolean scholarship)
    {
        this.isEligibleForScholarship = scholarship;
    }

    public float getAnnualFee()
    {
        return feePerMonth*12;
    }

    public int getId()
    {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getCity()
    {
        return City;
    }

    public float getFeePerMonth()
    {
        return feePerMonth;
    }

    public int getTotalMarks()
    {
        return Marks1 + Marks2 + Marks3;
    }

    public float getAverage()
    {
        return (float)(Marks1 + Marks2 + Marks3)/3 ;
    }

    public String getResult()
    {
        if(Marks1 >= 60 && Marks2 >= 60 && Marks3 >= 60)
        {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public boolean getScholarshipStatus()
    {
        return isEligibleForScholarship;
    }
}

public class Student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter Number of Students:");
        n = sc.nextInt();
        StudentDetails[] students = new StudentDetails[n];

        for (int i = 0; i < n; i++)
        {
            students[i] = new StudentDetails();

            System.out.println("Enter Student ID:");
            students[i].setId(sc.nextInt());

            System.out.println("Enter Name:");
            students[i].setName(sc.next());

            System.out.println("Enter City:");
            students[i].setCity(sc.next());

            System.out.println("Enter Marks1");
            students[i].setMarks1(sc.nextInt());

            System.out.println("Enter Marks2");
            students[i].setMarks2(sc.nextInt());

            System.out.println("Enter Marks3");
            students[i].setMarks3(sc.nextInt());

            System.out.println("Enter Fee:");
            students[i].setFeePerMonth(sc.nextFloat());

            System.out.println("Eligibility of Scholarship");
            students[i].setEligibleForScholarship(sc.nextBoolean());
        }

        int maxmarks = Integer.MIN_VALUE;
        String topper = "";

        for(StudentDetails s1 : students)
        {
            if(s1.getTotalMarks()> maxmarks)
            {
                maxmarks = s1.getTotalMarks();
                topper = s1.getName();
            }
        }

        System.out.println("The Topper of the Class is " + topper + " with " + maxmarks + " marks");

        float leastfee = Float.MAX_VALUE;
        String leastfeeStudent = "";

        for(StudentDetails s2 : students)
        {
            if(leastfee > s2.getFeePerMonth()) {
                leastfee = s2.getFeePerMonth();
                leastfeeStudent = s2.getName();
            }
        }

        System.out.println("The least monthly fee is " + leastfee + " of " + leastfeeStudent);

        System.out.println(" ************ Students Details **********");

        for(StudentDetails s3: students)
        {
            System.out.println("Name: " + s3.getName());
            System.out.println("Total Marks: " + s3.getTotalMarks());
            System.out.println("Average Marks: " + s3.getAverage());
            System.out.println("Result: " + s3.getResult());
            System.out.println("Annual Fee " + s3.getAnnualFee());
            System.out.println("Scholarship Status: " + (s3.getScholarshipStatus() ? "Eligible" : "Not Eligible"));

            sc.close();
        }
    }
}