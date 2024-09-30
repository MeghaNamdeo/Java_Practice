class Solution{
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> ans=new ArrayList();
        for(int i=1;i<=10;i++)
        {
            ans.add(N*i);
        }
        return ans;
    }
}