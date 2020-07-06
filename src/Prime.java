public class Prime {
    public int number;
    public Prime(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean firstlaw()
    {
        int x=number;
        int fact=1;
        int result=(x-1);
        for(int i=1;i<=result;i++){
            fact=fact*i;
        }
        int y=fact%x;
        //System.out.println(fact);
        if(y+1==x)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
