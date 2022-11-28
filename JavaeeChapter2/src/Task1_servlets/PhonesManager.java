package Task1_servlets;

import java.util.ArrayList;

public class PhonesManager {
    private static ArrayList<Item> phones=new ArrayList<>();
    private static int id =3;
    static {

        phones.add(new Item(1, "Iphone", 10000 , 5));
        phones.add(new Item(2, "Sumsung", 8000, 4));
    }
    public static void addPhone(Item phone) {
        phone.setId(id);
        phones.add(phone);
        id++;
    }
    public static ArrayList<Item> getPhones(){
        return phones;
    }
     public static Item getPhoneById(long id){
         Item newPhone=new Item();
        for (Item phone : phones){
            if (phone.getId()==id){
                newPhone= phone;
            }
        }
        return newPhone;
     }
}
