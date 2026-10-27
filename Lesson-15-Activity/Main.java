class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  
  void init(){
  
    
    
  }
  
  String build = "";
  String spaces(int n){
    for(int x=0;x<n;x++){
      build+="";
    }
    return build;
  }

  double harmonic(int N){
    double sum = 0;
    for(int x=1;x<N;x++){
      sum += 1./x;
    }
    return sum;
  }

  double sine(int N, double x){
    double sum=0;
    int sign=1;
    for(int i=1; i<2*N;i+=2){
      sum+= sign * Math.pow(x,i)/fact(i);
      sign*=-1;
    }
    return sum;
  }
  
  double sine2(int N, double x){
    double sum=0;
    for(int i=0; i<=N;i++){
      sum+= (Math.pow(-1,i)*Math.pow(x,2*i+1))/fact(2*i+1);
    }
    return sum;
  }

  void fib(int n){
    int f1=0,f2=1;
    int f=0;
    if(n==1)
      print(f1);
    else if(n==2)
      print(f1+"\n"+f2);
    else
            print(f1+"\n"+f2);

    for(int x=3;x<=n; x++){
      f=f1+f2;
      print(f);
      f1=f2;
      f2=f;
    }
  }
  
}