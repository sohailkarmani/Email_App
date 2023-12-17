import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String dept;
    private int mailboxCap = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "ZongComany.com";
    private String email;

    // Constructor to receive the first name and last name
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        // System.out.println("Email Created "+this.firstname+" "+this.lastname );
        // call a method asking for the dept - return the dept
        this.dept = setDept();
        // System.out.println("Department Name : "+this.dept);
        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :" + this.password);
        // combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + dept + "." + companySuffix;
        System.out.println("Your Email is :" + email);
    }

    // ask for the dept
    private String setDept() {
        System.out.println(
                "Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0\nEnter the Dept Code :");
        Scanner sc = new Scanner(System.in);
        int Deptchoice = sc.nextInt();
        if (Deptchoice == 1) {
            return "Sales";
        } else if (Deptchoice == 2) {
            return "Development";
        } else if (Deptchoice == 3) {
            return "Accounting";
        } else {
            return "None";

        }

    }

    // generate random password
    private String randomPassword(int lenght) {
        String passwordSet = "12345";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // set the mail box capacity
    public void setmailBoxCap(int capacity) {
        this.mailboxCap = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String alternate) {
        this.alternateEmail = alternate;
    }

    // change the password
    public void ChangePassword(String password) {
        this.password = password;
    }

    public int getMailbowcap() {
        return mailboxCap;
    }

    public String getAlternatemail() {
        return alternateEmail;
    }

    public String getpassword() {
        return password;
    }

    public String ShowInfo() {
        return "Display Customer Infor \n" + "Name :" + firstname + " " + lastname + "\nCompany Email  : " + email
                + "\nMail Box Capacity  : " + mailboxCap;
    }

}
