package BANK;

public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomer = 0;//记录客户的个数

    Bank(){
        customers = new Customer[100];
    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer++] = cust;
    }
    //获取客户的个数
    public int getNumberOfCustomer(){
        return numberOfCustomer - 1;
    }
    //获取指定客户的信息
    public Customer getCustomer(int index){
        if(index < numberOfCustomer && index >= 0){
            return customers[index];
        }
        else{
            System.out.println("请输入" + (numberOfCustomer - 1) + "以内的数字。");
            return null;
        }
    }
}
