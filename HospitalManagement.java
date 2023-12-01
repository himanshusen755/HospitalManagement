import java.util.Scanner;
import java.util.ArrayList;

class Patient 
{
    private String name;
    private String age;
    private String contactNumber;
      
    
    public Patient(String name, String age, String contactNumber) 
    {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAge() 
    {
        return age;
    }
    public void setHealthIssue1(String age) 
    {
        this.age= age;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return name + " || " + age + " || " + contactNumber;
    }

    public void patientMenu()
    {
        try (Scanner s = new Scanner(System.in)) {
            while (true) 
            {
                System.out.println(" ");
                System.out.println("--------------------------------------------------------");
                System.out.println("         ****** Patient's Home Menu ******"          );
                System.out.println("--------------------------------------------------------");
                System.out.println(" ");
               
                System.out.println("1. Hospital Appointment Menu");
                System.out.println("2. Doctor's Details");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = s.nextInt();

                if (choice == 1) 
                {
                   Appointments a=new Appointments(name, choice, contactNumber, name, contactNumber);
                   a.bookAppointments();
                }
                else if (choice == 2) 
                {
                    Doctor doc=new Doctor(name, name, contactNumber);
                    doc.doctorDetails();
                }
                else if (choice == 3) 
                {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("     ***** Thanks for Visiting **** by HIMANSHU SEN"        );
                    System.out.println("-----------------------------------------------------------");
                    System.exit(0);
                } 
                else 
                {
                    System.out.println("Invalid choice.... Please select a valid option...");
                }
            }
        }
    
    }
    public void patientDetails()
    {
        Patient p1 = new Patient("Avinash Kumar  ", "  32   ", " 9754665263");
        Patient p2 = new Patient("Gaytri Yadav   ", "  44   ", " 9944189771");
        Patient p3 = new Patient("Mahendra Khol  ", "  35   ", " 8805240432");
        Patient p4 = new Patient("Madhu Singh    ", "  50   ", " 9195555646");
        Patient p5 = new Patient("Vishal Jamwal  ", "  62   ", " 7344771321");

        Patient[] p = {p1,p2,p3,p4,p5};
        System.out.println("    --------- Patient's Details ---------        ");
        System.out.println(" ");
        System.out.println("Patient's Name"+"       "+"Age"+"       "+"Phone No.");
        System.out.println("--------------"+"      "+"-----"+"      "+"---------");

        for(int i=0;i<p.length;i++)
        {
        System.out.println(p[i]);
        System.out.println("-------------------------------------------");
        }
    }
}

class Doctor 
{
    private String name;
    private String specialization;
    private String contactNumber;

    public Doctor(String name, String specialization, String contactNumber ) 
    {
        this.name=name;
        this.specialization=specialization;
        this.contactNumber=contactNumber;
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name)
     {
        this.name = name;
    }

    public String getSpecialization() 
    {
        return specialization;
    }
    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() 
    {
        return name + specialization + contactNumber;
    }

    public void doctorDetails()
    {
        Doctor[] d = new Doctor[6];
        System.out.println(" ");
    
        d[0] = new Doctor("Dr. Himanshu Sen  ", "     Cardiologist    ", "     6260837579");
        d[1] = new Doctor("Dr. Aaryan tiwari ", "     Physician       ", "     9755553424");
        d[2] = new Doctor("Dr. Ananya Chachra", "     Neurology       ", "     7987379889");
        d[3] = new Doctor("Dr. Khushi kushwah", "     Gynecoloist     ", "     9893009277");
        d[4] = new Doctor("Dr. Aarshi Jain   ", "     Emergency       ", "     6232383628");
        d[5] = new Doctor("Dr. Iffat khatoon ", "     Dermatologist   ", "     6298221733");

        System.out.println("         ------------- Doctor's List ------------                  ");
        System.out.println(" ");
        System.out.println("Doctor's Name"+"       "+" Specialization"+"       "+" Contact Number");
        System.out.println("-------------"+"       "+" --------------"+"       "+" --------------");
        for(int i=0;i<d.length;i++) 
        {
            System.out.println(d[i]);
            System.out.println("---------------------------------------------------------------");
        }

    }
    public void doctorMenu()
    {
        try (Scanner s1 = new Scanner(System.in)) {
            while(true)
            {
             System.out.println(" ");
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
             System.out.println("            ----- Hospital Doctor's Menu -----            ");
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

             System.out.println(" ");
   
             System.out.println("1. See Patient's Details");
             System.out.println("2. See Appointments");
             System.out.println("3. Back to Login Menu");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             int choose = s1.nextInt();
            if(choose ==1)
            {
                Patient p=new Patient(name, name, contactNumber);
                p.patientDetails();
            }
            else if(choose==2)
            { 
                String patientName="Madhu Singh";
                int age=50;
                String medicalEmergency="Heart Surgery";
                String Date="05/11/2023";
                String time="11 AM";

                System.out.println(" ");
                System.out.println("       ******* List of Appointments *******");
                System.out.println("Patient Name"+"    "+"Age"+"   "+"   Medical Emergency   "+"   "+"   Date    "+"     "+"  Time");
                System.out.println("------------"+"    "+"---"+"   "+"  -------------------  "+"   "+"   ----    "+"     "+"  ----");
                System.out.println(patientName.toUpperCase() + "  ||  " + age + "  ||  "+ medicalEmergency
                +"    ||   " + Date + "   ||    " + time );
                System.out.println("-----------------------------------------------------------------");
                
            }
            else if(choose==3)
            {
                HospitalManagement h=new HospitalManagement();
                h.main(null);
            }

            else if(choose==4)
            {
            System.out.println("-----------------------------------------------------------");
            System.out.println("     ***** Thanks for Visiting **** by HIMANSHU SEN");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
            }
            else 
            {
            System.out.println("Invalid Input -> Give a proper Ipnut");
            }
            }
        }
    }
}

class Appointments 
{
    public String patientName;
    public int age;
    public String medicalEmergency;
    public String Date;
    public String time;
    
    public Appointments(String patientName, int age, String medicalEmergency, String Date, String contactNumber2) 
    {
        this.patientName = patientName;
        this.age = age;
        this.medicalEmergency=medicalEmergency;
        this.Date = Date;
        this.time = contactNumber2;
    }

    public String getPatientName() 
    {
        return patientName;
    }
    public void setPatientName(String patientName) 
    {
        this.patientName = patientName;
    }

    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getMedicalEmergency() 
    {
        return medicalEmergency;
    }
    public void setHealthIsuue(String medicalEmergency) 
    {
        this.medicalEmergency = medicalEmergency;
    }

    public String getDate() 
    {
        return Date;
    }
    public void setDate(String date) 
    {
        Date = date;
    }

    public String getTime() 
    {
        return time;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }


    @Override
    public String toString() 
    {
        return "Patient's Name: " + patientName.toUpperCase() + "      ||  Age: " + age + "        || Medical Emergency: "+ medicalEmergency
        +"     || Date: " + Date + "     || Time: " + time ;
    }

    public void bookAppointments()
    {
        Scanner s1=new Scanner(System.in);
        ArrayList<Appointments> appointments1=new ArrayList<Appointments>(); 

        while(true)
        {
         System.out.println(" ");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("          ----- Hospital Appointment Menu -----           ");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

         System.out.println(" ");
    
         System.out.println("1. Book Appointments");
         System.out.println("2. See Appointments");
         System.out.println("3. Back to Login Menu");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choose = s1.nextInt();
         
         if(choose ==1)
         {
            
            System.out.println(" ");
            System.out.println("** Please Enter Patient's NAME: ");
            patientName=s1.next();
            System.out.println("** Please Enter Patient's AGE: ");
            age= s1.nextInt();
        
            System.out.println("** Please Write the Medical Emergency for Appointment **");
            System.out.println("1. Heart Related -");
            System.out.println("2. Injuries -");
            System.out.println("3. Head/Brain/Stroke -");
            System.out.println("4. Pregnancy -");
            System.out.println("5. Accident -");
            System.out.println("6. Allergy/Infection-");
            System.out.println("7. Other Issues -");
            // medicalEmergency=s1.next().toUpperCase();
            int emergencyChoice = s1.nextInt();

            String medicalEmergency = "";
            switch (emergencyChoice) 
            {
            case 1:
                medicalEmergency = "Heart Related";
                break;
            case 2:
                medicalEmergency = "Injuries";
                break;
            case 3:
                medicalEmergency = "Head/Brain/Stroke";
                break;
            case 4:
                medicalEmergency = "Pregnancy";
                break;
            case 5:
                medicalEmergency = "Accident";
                break;
            case 6:
                medicalEmergency = "Allergy/Infection";
                break;
            case 7:
                System.out.print("Enter Other Medical Emergency: ");
                medicalEmergency = s1.next();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return;
            }
            System.out.println("** Please Enter Date of Appointment(dd/mm/yyyy): ");
            Date=s1.next();
            
            while(true)
            {
               System.out.println("** Please Enter Timing of Appointment(Between 10 AM to 2 PM): ");
               String time=s1.next();
               Appointments a= new Appointments(patientName, age, medicalEmergency, Date, time);
               appointments1.add(a);

                if(time.equals("10") || time.equals("11") || time.equals("12")
                   || time.equals("1") || time.equals("2") )
                {
                    System.out.println(" ");
                    System.out.println("      **** APPOINTMENT HAS BEEN BOOKED ****           ");
                    break; 
                }
                else
                {
                    System.out.println("Invalid Input..");
                    break;
                }
             }
            }
            else if(choose==2)
           {
                System.out.println(" ");
                System.out.println("                     ******* List of Appointments *******                    ");

                for(Appointments appointment: appointments1)  
               {
                System.out.println("--------------------------------------------------------------------------------------------------------");
                System.out.println(appointment);
                System.out.println("--------------------------------------------------------------------------------------------------------");
               }
           }
            else if(choose==3)
            {
                HospitalManagement h=new HospitalManagement();
                h.main(null);
            }
           else if(choose==4)
           {
            System.out.println("-----------------------------------------------------------");
            System.out.println("     ***** Thanks for Visiting **** by HIMANSHU SEN  ");
            System.out.println("-----------------------------------------------------------");
            System.exit(0);
            }
           else 
           {
            System.out.println("Invalid Input");
            }
         
        }
        
    }
}

public class HospitalManagement
{
    public static void main(String[] args) 
    { 

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("         --------  WELCOME TO HOSPITAL MANAGEMENT  --------           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner s2=new Scanner(System.in);
        System.out.println("................................................");
        System.out.println("   Enter the role in which you want to LOGIN:-  ");
        System.out.println("................................................");
        System.out.println("Login as:-");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("3. Exit");

        int choose=s2.nextInt();
        while(true)
        {
        if(choose==1)
        {
            System.out.print("** Please Enter your NAME: ");
            String UserName=s2.next().toUpperCase();
            System.out.print("** Please Enter your Password: ");
            String userPassword ;
            userPassword = s2.next(); 
            
            if (userPassword.equals("123")) {
             System.out.println("                 *** SUSSESSFULLY LOGGED IN ***     ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("    *** Welcome DR."+ UserName + " in Hospital Management System ***");
            System.out.println("--------------------------------------------------------------------------");
            Doctor d=new Doctor(UserName, UserName, userPassword);
            d.doctorMenu();
            } 
            else {
                System.out.println("Incorrect password");
                HospitalManagement j = new HospitalManagement();
                j.main(null);
            }
            
            
            
        }
        else if(choose==2)
        {
            System.out.println(" ");
            System.out.print("** Please Enter your NAME: ");
            String UserName=s2.next().toUpperCase();
            System.out.print("** Please Enter your Password: ");
            String userPassword;
            userPassword = s2.next();
            if (userPassword.equals("6260")) {
                System.out.println(" ");
            System.out.println("                  *** SUSSESSFULLY LOGGED IN *** ");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("       *** Welcome "+ UserName + " in Hospital Management System ***");
            System.out.println("--------------------------------------------------------------------------");
            Patient p=new Patient(UserName, UserName, userPassword);
            p.patientMenu();
            Appointments a=new Appointments(userPassword, choose, userPassword, UserName, userPassword);
            a.bookAppointments();
            } 
            else
             {
                System.out.println("Incorrect password");
                HospitalManagement j = new HospitalManagement();
                j.main(null);
             }
            
        }
        else if(choose==3)
           {
            System.out.println("-----------------------------------------------------------");
            System.out.println("     ***** Thanks for Visiting **** by HIMANSHU SEN");
            System.out.println("-----------------------------------------------------------");
           System.exit(0);
            }
        else
        {
            System.out.println("Invalid Input");
        
        }
        }
    }
}