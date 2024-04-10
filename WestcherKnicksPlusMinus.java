public class WestcherKnicksPlusMinus{
    static int[][] jan = {
        {3, 114, 122, 1},
        {5, 121, 128, 1},
        {6 , 118,108, 1}, 
        {8, 123, 122, 0},
        {11, 129, 126 ,0},
        {15, 126, 111, 0},
        {16 , 117, 125, 0},
        {18, 120 , 153, 1},
        {24, 119, 125, 0},
        {25, 100, 102, 0},
        {27, 114, 113, 1},
        {29, 110, 116, 1},
    };

    static int[][] feb = {
        {1, 100, 107, 1},
        {3, 120, 128, 1},
        {8, 105, 141, 0},
        {9, 139, 128, 0},
        {14, 99, 115, 0},
        {22, 84, 98, 0},
        {5, 100, 130, 1},
    };

    static int[][] march = {
        {2 , 130, 99, 1},
        {3 , 116 , 119, 1},
        {6,121, 126 , 1}, 
        {10 , 111, 115, 1},
        {11, 131, 116, 1},
        {13, 104, 114, 1},
        {19, 134, 106 ,1},
        {21, 118, 122, 1},
        {25 , 112, 103, 0},
        { 27 , 110, 92 , 0},
        {29, 102, 96, 0},
        {30, 105, 113, 0},
    };

    public static int calculatePlusMinus(int[] arr) {
        int knicksScore = arr[1];
        int oppScore = arr[2];
        return knicksScore - oppScore;
    }
    public static int calculatePlusMinusDate(String date) {
        int result = 0;
        String month = date.substring(0,date.indexOf("/"));
        int day =Integer.parseInt(date.substring(date.indexOf("/")+ 1));
       if(month.equals("1")) {
           for(int i = 0; i < jan.length; i++) {
                if (jan[i][0] == day) {
                    return calculatePlusMinus(jan[i]);
                }
           }
       }

       else if(month.equals("2")) {
        for(int i = 0; i < feb.length; i++) {
            if (feb[i][0] == day) {
                return calculatePlusMinus(feb[i]);
            }
       }
       }

       else if(month.equals("3")) {
        for(int i = 0; i < march.length; i++) {
            if (march[i][0] == day) {
                return calculatePlusMinus(march[i]);
            }
       }
       }

       else {
           System.out.println("Invalid month, please try January, February, or March");
       }
       System.out.println("Invalid day, no game in that month");

       return 0;
   }

    public static int calculatePlusMinusMonth(String month) {
         int result = 0;
        if(month.equals("January")) {
            for(int i = 0; i < jan.length; i++) {
                result += calculatePlusMinus(jan[i]);
            }

            return result;
        }

        else if(month.equals("February")) {
            for(int i = 0; i < feb.length; i++) {
                result += calculatePlusMinus(feb[i]);
            }
            return result;
        }

        else if(month.equals("March")) {
            for(int i = 0; i < march.length; i++) {
                result += calculatePlusMinus(march[i]);
            }
            return result;
        }

        else {
            System.out.println("Invalid month, please try January, February, or March got "+month);
        }

        return 0;
    }

    public static int[] countHomeAway(String month) {
        int countHome = 0;
        int countAway = 0;
        if(month.equals("January")) {
            for(int i = 0; i < jan.length; i++) {
                if(jan[i][3] == 0) countHome++;
                else countAway++;
            }
        }

        else if(month.equals("February")) {
            for(int i = 0; i < feb.length; i++) {
                if(feb[i][3] == 0) countHome++;
                else countAway++;
            }
        }

        else if(month.equals("March")) {
            for(int i = 0; i < march.length; i++) {
                if(march[i][3] == 0) countHome++;
                else countAway++;
            }
        }

        else {
            System.out.println("Invalid month, please try January, February, or March");
        }

        int [] answer = {countHome, countAway};
        return answer;
    }

    public static String formatNumber(int num) {
        if (num < 0) {
            return num+"";
        } else {
            return "+"+num;
        }
    }

    //System.out.println("Number of Home games: " + countHomeAway("January")[0])
    public static void main(String[] args) {
        System.out.println("January played "+jan.length); 
        for ( int i = 0; i < jan.length; i ++){
            System.out.println("game " + i + ": " + formatNumber(calculatePlusMinus(jan[i])));

           
        }
        System.out.println("plus minus score of the month is:" + formatNumber(calculatePlusMinusMonth("January")));
        System.out.println("home: " + countHomeAway("January")[0]+ " Away: "+ countHomeAway("January")[1]);
       
       
        System.out.println("february played "+feb.length); 
        for ( int i = 0; i < feb.length; i ++){
            System.out.println("game " + i + ": " + formatNumber(calculatePlusMinus(feb[i])));
        
           
        }
        System.out.println("plus minus score of the month is:" + formatNumber(calculatePlusMinusMonth("February")));
        System.out.println("home: " + countHomeAway("February")[0]+ " Away: "+ countHomeAway("February")[1]);
    
        System.out.println("March played "+march.length); 
        for ( int i = 0; i < march.length; i ++){
            System.out.println("game " + i + ": " + formatNumber(calculatePlusMinus(march[i])));

           
        }
        System.out.println("plus minus score of the month is:" + formatNumber(calculatePlusMinusMonth("March")));
        System.out.println("home: " + countHomeAway("March")[0]+ " Away: "+ countHomeAway("March")[1]);
        int [] scores ={calculatePlusMinusMonth("January"),calculatePlusMinusMonth("February"),
            calculatePlusMinusMonth("March")
        };

        int maxScore = scores[0];
        int maxIndex = 0;

        for ( int i = 1; i < scores.length; i ++){
            if (scores[i]> maxScore){
                maxScore = scores [i];
                maxIndex = i;
            }
        }
        System.out.println(maxScore + " in " + (maxIndex + 1));        
    }
}

