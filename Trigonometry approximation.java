public class TrignometryApproximation 
{
public static void main(String[]args) {
double theta=Double.parseDouble(args[0]);
double cossquaretheta=Math.cos(theta)*Math.cos(theta); 
double sinsquaretheta=Math.sin(theta)*Math.sin(theta); 
double result=cossquaretheta+sinsquaretheta;
boolean isApproximateOne=(result==1);
System.out.println(isApproximateOne);
} 
}
