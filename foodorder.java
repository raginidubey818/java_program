import java.util.Scanner;
public class foodorder {
    public static void main(String[] args) {

        int order, start_s, main_m, des_d, amt=0 , ans ,total,gst,qt=0,pay, card, expiry ,cv;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("What you want to eat\n  1:Starter\n 2:Main course\n 3:desert");
                    order = sc.nextInt();

            switch (order){
                case 1:

                    System.out.println("Enter your choice: ");
                    do{
                        System.out.println("1:Chicken crispy : 200 \n  2:Chicken Lolipop : 300\n 3:Chicken pahadi : 340");
                        start_s = sc.nextInt();
                        System.out.println("Enter the quantity");
                        qt = sc.nextInt();
                        if(start_s == 1){
                            System.out.println("Your chicken crispy will be served ");
                            amt =amt + 200*qt;
                        }else if(start_s==2){
                            System.out.println("Your Chicken lolipop will be served ");

                            amt = amt + 300;
                            amt =amt + 200*qt;
                        }else if(start_s==3){
                            System.out.println("Your Chicken pahadi will be served ");
                            amt = amt + 340;
                            amt =amt + 200*qt;
                        }else{
                            System.out.println("Please enter valid option");
                        }
                        System.out.println("Do you want to add anything into your starter\n 1: yes\n 2: no");
                        ans = sc.nextInt();
                        break;

                    }while(ans ==1);
                    break;

                case 2 :
                    System.out.println("Please enter your choice");
                    do{
                        System.out.println("1:Chicken Biryani : 700\n 2:Chicken fried rice : 600\n 3:Butter chicken: 650");
                        main_m = sc.nextInt();
                        System.out.println("Enter the quantity :");
                        qt = sc.nextInt();
                        if (main_m==1){
                            System.out.println("Your Chicken Biyani will be served ");
//                            amt =amt + 700;
                            amt =amt + 700*qt;
                        }else if(main_m==2){
                            System.out.println("Your Chicken fried rice will be served");
//                            amt =amt + 600;
                            amt =amt + 600*qt;
                        }else if(main_m==3){
                            System.out.println("Your butter chickne will be served");
//                            amt =amt + 650;
                            amt =amt + 650*qt;
                        }else{
                            System.out.println("Please enter valid option");
                        }
                        System.out.println("Do you want to add other item \n 1:yes\n 2:no");
                        ans = sc.nextInt();
                    }while(ans == 1);
                    break;

                case 3:
                    System.out.println("Enter your choice");
                    do{
                        System.out.println("1:Choclate icecrean: 350 \n  2:mix iceream:300\n 3: Milkshake:100");
                        des_d = sc.nextInt();
                        System.out.println("Enter the quantity");
                        qt  = sc.nextInt();
                        if(des_d == 1){
                            System.out.println("Your choclate icecream will be served");
//                            amt =amt + 350;
                            amt =amt + 350*qt;
                        }else if(des_d == 2){
                            System.out.println("Your Mic icecream will be served");
//                            amt =amt + 300;
                            amt =amt + 300*qt;
                        }else if(des_d == 3){
                            System.out.println("Your milshake will be served ");
//                            amt =amt + 100;
                            amt =amt + 100*qt;
                        }
                        System.out.println("Do you want to add any other item \n  1: yes\n 2: no");
                        ans = sc.nextInt();
                    }while(ans == 1);
                    break;
            }
            System.out.println("Do you want to add anything\n  1:yes\n 2:no");
           ans = sc.nextInt();

        }while(ans == 1);


        total= amt;
        System.out.println("Your Total bill is: "+total);

        do{
            System.out.println("Enter payment mehtod\n 1: Card\n 2:Cash\n 3: Google pay\n 4:Paytm");
            pay = sc.nextInt();
            switch (pay){
                case 1:
                    System.out.println("Enter card Details: ");
                    card = sc.nextInt();
                    System.out.println("Enter expiry date");
                    expiry = sc.nextInt();
                    System.out.println("Enter cv number");
                    cv = sc.nextInt();
                    System.out.println("Thanks for paying");
                    break;
                case 2:
                    System.out.println("Thanks for paying");
                    break;
                case 3:
                    System.out.println("Please scan our QR code");
                    break;
                case 4:
                    System.out.println("Please scan our code");
                    break;
            }
            System.out.println("Are you satisfied with uor services 1:yes\n 2:no");
            ans = sc.nextInt();
        }while(ans==2);
        System.out.println("Thank you for visiting");
}
}