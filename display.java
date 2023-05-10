import java.util.Stack;

public class display
{
    public static void display(Stack<Integer> st)
    {//function methods approch
        st.push(6);
    }

    public static void displayreverse(Stack<Integer> st){
        //reverse order print
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        System.out.println();
        displayreverse(st);
        st.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer>st=new Stack<>();

        st.push(9);
        st.push(12);
        st.push(2);
        st.push(3);
        st.push(5);

        display(st);

        displayreverse(st);

        System.out.print(st);

        /*Arrays methods
        int n=st.size();
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        */


        //System.out.println(st);
        /*
        Stack<Integer>rt=new Stack<>();

        while(st.size()>0)
        {
            rt.push(st.pop());
        }

        while(st.size()>0){
            int x=rt.pop();
            System.out.println(x+" ");
            st.push(x);
        }
        */

    }
}