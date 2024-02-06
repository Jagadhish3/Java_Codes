class Bank{
    private int accNum;
    private String MyName="Sri";
    private int amount;

    public int getAccNum(){
        return accNum;
    }
    
    public int getAmount() {
        return amount;
    }

    public String getMyName(){
        return MyName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAccNum(int accNum) {
        //accNum = accNum;//Confusion in compiler so use this
        this.accNum=accNum;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    
}

class A2Encapsulation {
    public static void main(String args[]){

        //Encapsulation -> wrapping data and member fun together in a single unit
        Bank Obj = new Bank();
        // Obj.accNum = 23451;
        // Obj.myName="Sriram";
        // Obj.amount=50000;
        Obj.setAccNum(2222);
        System.out.println(Obj.getAccNum());
        //System.out.println(Obj.getAccNum()+" "+Obj.getMyName());
        //System.out.println(Obj.accNum + " " + Obj.myName + " " + Obj.amount);
    }
}
