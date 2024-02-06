class Bank{
    private int accNum=1234;
    private String MyName="Sri";
    private int amount;

    public int getAccNum(){
        return accNum;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMyName(){
        return MyName;
    }

    public void setName(String Name){
        MyName=Name;
    }
}

class A2Encapsulation {
    public static void main(String args[]){

        //Encapsulation -> wrapping data and member fun together in a single unit
        Bank Obj = new Bank();
        // Obj.accNum = 23451;
        // Obj.myName="Sriram";
        // Obj.amount=50000;
        System.out.println(Obj.getAccNum()+" "+Obj.getMyName());
        //System.out.println(Obj.accNum + " " + Obj.myName + " " + Obj.amount);
    }
}
