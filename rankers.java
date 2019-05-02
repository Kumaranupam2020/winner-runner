import java.util.*;


public class rankers{
    
	public static void main(String[] args)
    {
        new String();
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter total no of runners");
        int n = myobj.nextInt();
        //myobj.num = n;
        String name[] = new String[n];
        int time[] = new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println(+(i+1)+"."+"Enter the name of the the runner and time taken");
           name[i]=myobj.next();
          // myobj.next();
           time[i]=myobj.nextInt();
        }
        int x = winnerIndex(name,time);
        int y = runnerIndex(time,x); 
        System.out.println("Winner's name: "+name[x]+"\n"+" Time taken: "+time[x]);
        //System.out.println("Runner's name: ",+name[y]);
        System.out.println("runner's name: "+name[y]+"\n"+" Time taken: "+time[y]);
    }
   
    public static int winnerIndex(String name[],int time[])
    {
        int lesstime=time[0];
        int x = 0;
        for(int i=0;i<time.length;i++)
        {
            if(time[i] < lesstime)
            {
                lesstime = time[i];
                x = i;
            }
            
        }
        return x;
    }
 
    public static int runnerIndex(int time[],int x)
    {
    	int lesstime = time[0];
    	int a=0;
    	
    	for(int i=0;i<time.length;i++)
    	{
    		if(time[i]<lesstime && i!=x)
    		{
    
    			lesstime = time[i];
             a=i;
    		}
    	}
    	//System.out.println("the index is"+a+" "+time[a]);
    	return a;
    }
   
}



