class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String num){
    if(num.substring(0,1).equals("4"))
      return "American Express";
    else if (num.substring(0,2).equals("34") || num.substring(0,2).equals("37"))
      return "Visa";
    else if (num.substring(0,2).equals("51") || num.substring(0,2).equals("55"))
      return "Mastercard";
    else if (num.substring(0,2).equals("36"))
      return "Diner Club";
    else if (num.substring(0,2).equals("65") || num. substring(0,4).equals("6011"))
      return "Discover";
    else
      return "Unknown card";
  }
  
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }

  String nycLocate(String zip){
    if(zip.substring(0,2).equals("100")) || zip.substring(0,2).equals("101") || zip.substring(0,2).equals("102")
      return "Manhattan";
    else if(zip.substring(0,2).equals("103"))
      return "Staten Island";
    else if(zip.substring(0,2).equals("104"))
      return "Bronx";
    else if(zip.substring(0,2).equals("112"))
      return "Brooklyn";
    else if(zip.substring(0,2).equals("113")) || zip.substring(0,2).equals("114") || zip.substring(0,2).equals("111")
      return "Queens";
  }

  String getMonth(String m, String d, String y){
    if(m.substring(0,1).equals("07") && d.substring(0,1).equals("21") && y.substring(0,3).equals("2023"))
      return "July";
  }

  boolean validatePswd(String password){
    if(password.length() < 5 || password.length() > 8){
      return False;
    }
  }
}