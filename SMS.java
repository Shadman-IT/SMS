import java.util.Scanner;

class SMS {
    static SMS[][] database = new SMS[120][10];
    static int it, mech, textile, civil, cse, entc, prod, elec, instru, chem;
    static int itr, mechr, texr, civilr, cser, entcr, prodr, elecr, intrur, chemr;
    static Scanner scanner = new Scanner(System.in);

    String[] info;
    String name, branch, age, year_type;
    String reg_no, email;

    SMS(String data) {
        info = data.split("/");
        if (info.length != 4) {
            System.out.println("Invalid input format. Please enter data as Name/Branch/Age/regular or DSY");
            return;
        }

        this.name = info[0].trim();
        this.branch = info[1].trim();
        this.age = info[2].trim();
        this.year_type = info[3].trim();

        if (year_type.equalsIgnoreCase("regular")) {
            switch (branch.toUpperCase()) {
                case "CSE":
                    this.reg_no = "2023BCS" + String.format("%03d", ++cser);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[cser - 1][0] = this;
                    break;
                case "IT":
                    this.reg_no = "2023BIT" + String.format("%03d", ++itr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[itr - 1][1] = this;
                    break;
                case "MECH":
                    this.reg_no = "2023BME" + String.format("%03d", ++mechr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[mechr - 1][2] = this;
                    break;
                case "CHEM":
                    this.reg_no = "2023BCH" + String.format("%03d", ++chemr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[chemr - 1][3] = this;
                    break;
                case "CIVIL":
                    this.reg_no = "2023BCE" + String.format("%03d", ++civilr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[civilr - 1][4] = this;
                    break;
                case "TEXTILE":
                    this.reg_no = "2023BTT" + String.format("%03d", ++texr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[texr - 1][5] = this;
                    break;
                case "ELEC":
                    this.reg_no = "2023BEL" + String.format("%03d", ++elecr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[elecr - 1][6] = this;
                    break;
                case "INSTRU":
                    this.reg_no = "2023BIN" + String.format("%03d", ++intrur);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[intrur - 1][7] = this;
                    break;
                case "ENTC":
                    this.reg_no = "2023BEC" + String.format("%03d", ++entcr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[entcr - 1][8] = this;
                    break;
                case "PROD":
                    this.reg_no = "2023BPE" + String.format("%03d", ++prodr);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[prodr - 1][9] = this;
                    break;
                default:
                    System.out.println("Provide valid branch input for Regular year");
                    return;
            }
        } else if (year_type.equalsIgnoreCase("dsy")) {
            switch (branch.toUpperCase()) {
                case "CSE":
                    this.reg_no = "2023BCS5" + String.format("%02d", ++cse);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[cse - 1][0] = this;
                    break;
                case "IT":
                    this.reg_no = "2023BIT5" + String.format("%02d", ++it);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[it - 1][1] = this;
                    break;
                case "MECH":
                    this.reg_no = "2023BME5" + String.format("%02d", ++mech);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[mech - 1][2] = this;
                    break;
                case "CHEM":
                    this.reg_no = "2023BCH5" + String.format("%02d", ++chem);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[chem - 1][3] = this;
                    break;
                case "CIVIL":
                    this.reg_no = "2023BCE5" + String.format("%02d", ++civil);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[civil - 1][4] = this;
                    break;
                case "TEXTILE":
                    this.reg_no = "2023BTT5" + String.format("%02d", ++textile);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[textile - 1][5] = this;
                    break;
                case "ELEC":
                    this.reg_no = "2023BEL5" + String.format("%02d", ++elec);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[elec - 1][6] = this;
                    break;
                case "INSTRU":
                    this.reg_no = "2023BIN5" + String.format("%02d", ++instru);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[instru - 1][7] = this;
                    break;
                case "ENTC":
                    this.reg_no = "2023BEC5" + String.format("%02d", ++entc);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[entc - 1][8] = this;
                    break;
                case "PROD":
                    this.reg_no = "2023BPE5" + String.format("%02d", ++prod);
                    this.email = this.reg_no.toLowerCase() + "@sggs.ac.in";
                    database[prod - 1][9] = this;
                    break;
                default:
                    System.out.println("Provide valid branch input for DSY year");
                    return;
            }
        } else {
            System.out.println("Invalid year type. Please enter 'Regular' or 'DSY'");
            return;
        }

        System.out.println("\nName: " + this.name +
                "\nReg.No.: " + this.reg_no +
                "\nEmail: " + this.email +
                "\nBranch: " + this.branch.toUpperCase() +
                "\nAge: " + this.age +
                "\nYear type: " + this.year_type.toUpperCase());
    }

    public static void main(String[] args) {
        for (String arg : args) {
            String formattedInput = arg.replace(",", "/");
            new SMS(formattedInput);
        }
    }
}
