import java.io.*;
    public class Admission {
        public int status(double a, double b) {
            if ((a >= 3.6) && (b <= 60))
                return (1);
            else if ((a >= 3.0) && (b <= 70))
                return (1);
            else if ((a >= 2.6) && (b <= 80))
                return (1);
            else if ((a >= 2.0) && (b <= 90))
                return (1);
            else
                return (0);
        }
        public static void main(String[] args)throws IOException {
            try {
            double gp, ts;
            Admission w = new Admission();
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            String prompt1 = new String();
            String prompt2 = new String();
            System.out.print("Enter Grade Point: ");
            prompt1 = x.readLine();
            gp = Double.parseDouble(prompt1);
            System.out.print("Enter Admission Test Score: ");
            prompt2 = x.readLine();
            ts = Double.parseDouble(prompt2);
            int z = w.status(gp, ts);
            if (z == 1)
                System.out.println("Accept");
            else
                System.out.println("Reject");
            } catch (Exception e) {
                System.out.println("PLEASE ENTER A NUMBER");
            }
        }
    }