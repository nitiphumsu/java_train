package mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        List<Iphone> phonesList = new ArrayList<>();

        Iphone iphone1 = new Iphone();
        Iphone iphone2 = new Iphone();
        Iphone iphone3 = new Iphone();

        phonesList.add(iphone1);
        phonesList.add(iphone2);
        phonesList.add(iphone3);
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| 	 Unlock 	|");
        System.out.println("| ----------------------- |\n");
        iphone1.slideToUnlock();
        iphone2.slideToUnlock();
        iphone3.slideToUnlock();
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("|  MakeCall 		  |");
        System.out.println("| ----------------------- |\n");
        iphone1.makeCall("000-000-0000");
        iphone2.makeCall("000-000-0000");
        iphone3.makeCall("000-000-0000");
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("|   ReceiveCall 	  |");
        System.out.println("| ----------------------- |\n");
        iphone1.receiveCall("111-111-1111");
        iphone2.receiveCall("111-111-1111");
        iphone3.receiveCall("111-111-1111");
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("|   install App 	  |");
        System.out.println("| ----------------------- |\n");
        iphone1.installApplication("Cookie Run");
        iphone2.installApplication("Rov");
        iphone3.installApplication("Pubg Mobile");
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| 	Play Song 	  |");
        System.out.println("| ----------------------- |\n");
        String playSong1 = iphone1.playSong(" วิโรจน์ ก้าวไก่ ");
        String playSong2 = iphone2.playSong(" ลุงตู่อยู่ไหน");
        String playSong3 = iphone3.playSong(" เพื่อไทยแลนด์สไลด์");
        System.out.println("iphone1 : " + playSong1);
        System.out.println("iphone2 : " + playSong2);
        System.out.println("iphone3 : " + playSong3);
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| 	Play VDO 	  |");
        System.out.println("| ----------------------- |\n");
        String playVdo1 = iphone1.playVideo("Youtube");
        String playVdo2 = iphone1.playVideo("Twitch");
        String playVdo3 = iphone1.playVideo("Netflix");
        System.out.println("iphone1 : " + playVdo1);
        System.out.println("iphone2 : " + playVdo2);
        System.out.println("iphone3 : " + playVdo3);
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| 	Get Location 	  |");
        System.out.println("| ----------------------- |\n");
        String location1 = iphone1.getLocation();
        String location2 = iphone2.getLocation();
        String location3 = iphone3.getLocation();
        System.out.println("iphone1 : " + location1);
        System.out.println("iphone2 : " + location2);
        System.out.println("iphone3 : " + location3);

        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| Numbers of all 3 devices|");
        System.out.println("| ----------------------- |\n");
        phonesList.forEach(phone -> System.out.println(phone));

        Map<String, Iphone> phonesMap = new HashMap<>();
        phonesMap.put("123-456-7890", iphone1);
        phonesMap.put("987-654-3210", iphone2);
        phonesMap.put("313-313-3131", iphone3);
        
        System.out.println("\n");
        System.out.println("| ----------------------- |");
        System.out.println("| Devices by phone number |");
        System.out.println("| ----------------------- |\n");
        phonesMap.forEach((i, j) -> System.out.println(i + ": " + j));
    }
}
