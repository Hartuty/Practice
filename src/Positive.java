import java.util.Arrays;

public class Positive {
    int[] a;
    int lower;
    public Positive(int[] a) {
        this.a=a;
    }
    public int gethighest()
    {
        Arrays.sort(a);
        return a[a.length-1];
    }
    public boolean checkiflowerexists(){
        int lower=gethighest()-1;
        this.lower=lower;
        int x=0;
        while(x<a.length)
        {
            if(a[x]==lower)
            {
                return true;
            }
            x+=1;
        }
        return false;
    }
    public boolean checkifnegativenumber()
    {
        if(gethighest()<1)
        {
            return true;
        }
        return false;
    }

    public int lastmethod()
    {
        if(checkifnegativenumber())
        {
            return 1;
        }

        if(!checkiflowerexists())
        {
            return lower;
        }
        else{
            return gethighest()+1;
        }
    }
}
