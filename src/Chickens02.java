public class Chickens02 {
    public static void main(String[] args) {
        double segundaOvo = 100.0;
        double tercaOvo = 121.0;
        double quartaOvo = 117.0;
        
        double dailyAverage = (segundaOvo + tercaOvo + quartaOvo) / 3;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;
        
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
    }
    
}
