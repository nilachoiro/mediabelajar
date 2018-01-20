/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pisah;

/**
 *
 * @author acer
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Pisah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       String coba = "afganistan,afrika selatan,afrika tengah,albania,algeria,amerika,andorra,angola,antigua,argentina," +
//"armenia,australia,austria,azerbaijan,bahamas,bahrain,bangladesh,barbados,belanda," +
//"belarus,belgia,belize,benin,bolivia,bosnia and herzegovina,botswana,brazil,brunai darussalam," +
//"bulgaria,burkinafaso,burundi,butan,cabo verde,cameroon,canada,ceko,chad,chile," +
//"china,colombia,costa rica,cuba,cyprus,democratic republic of the kongo,denmark,djibouti," +
//"dominica,domonique,ecuador,elsavador,equatorial guenia,eritrea,eslovenia,estonian," +
//"ethiopia,fiji,filipina,finlandia,gabon,gambia,georgia,ghana,grenada,guatemala,guinea," +
//"guyana,gwenia bissau,haiti,honduras,hungaria,india,indonesia,inggris,irak,iran,irlandia," +
//"islandia,israel,italia,ivory coast,jamaica,jepang,jerman,jordania,kamboja,kazakztan,kenya,kepulauan solomon," +
//"kiribati,komorus,korea selatan,korea utara,kosovo,kroasia,kuwait,kyrgyzstan,laos,latvija,leshoto,libanon," +
//"liberia,libya,liechtestain,lithuania,luxemburg,macedonia,madagaskar,malawi,malaysia,maldives,mali,malta,marshal island," +
//"mauritania,mauritius,mesir,mexico,micronesia,moldova,monaco,mongolia,montenegro,moroko," +
//"mozambique,myanmar,namibia,nauru,nepal,new zealand,nicaragua,niger,nigeria,norwegia,oman,pakistan," +
//"palau,panama,papua nugini,paraguay,peru,polandia,portugal,prancis,qatar,republic of the congo,romania," +
//"rusia,rwanda,saint kitt and navis,saint vincent and grenadines,samoa,san marino," +
//"santa lucia,sao tome and principe,saudi arabia,senegal,serbia,seychelles,sierra leone," +
//"singapura,slovakia,somalia,spanyol,srilangka,sudan,suriname,swaziland,swedia,swiss," +
//"syiria,taiwan,tajikistan,tansania,thailand,timor leste,togo,tonga,trinidad and tobago," +
//"tunisia,turki,turkmenistan,tuvalu,uganda,ukrania,united arab emirates,uruguay,uzbekistan,vatikan," +
//"venezwela,vietnam,vunuatu,western sahara,yaman,yunani,zambia,zimbabwe";
//       String[] array=coba.split(",");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print('"');
//            System.out.print(""+array[i]+"");
//            System.out.print('"');
//            System.out.print(',');
//            
//        }
//        System.out.println(array.length);

////cek file suatu directory
//String directory = "aset\\bendera_jpg\\afrika\\afrikautara";
//generatepanel a = new generatepanel(directory);
//a.setVisible(true);
//    
//    try {
//			FileInputStream fileInputStream = new FileInputStream("song.mp3");
//			Player player = new Player(fileInputStream);
//			System.out.println("Song is playing...");
//			
//                        while (true){
//                            System.out.println("pilih setting");
//                            Scanner input = new Scanner(System.in);
//                            String pil=input.next();
//                            if (pil.equalsIgnoreCase("p")) {
//                                player.play();
//                            }
//                            if (pil.equalsIgnoreCase("s")){
//                           player.play(0);
//                            }
//                        }
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JavaLayerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


//        String asli = "123456789123";
//        System.out.println("asli = " + asli);
//        StringBuilder rubah = new StringBuilder(asli);
//        System.out.println("masukan angka");
//        Scanner input = new Scanner(System.in);
//        String get = input.next();
//        char[] getarray = get.toCharArray();
//        int count = 0;
//        int countarray=getarray.length-1;
//        for (int i = asli.length()-1;count<getarray.length; i--) {
//            rubah.setCharAt(i, getarray[countarray]);
//            System.out.println("i = "+i);
//            System.out.println("count = "+count);
//            countarray--;
//            count++;
//        }
//        System.out.println("rubah = " + rubah);
        String getno = gettanggal()+"000000";
        System.out.println("get "+getno);
        String notr=getno.substring(6, 12);
        System.out.println("no tr"+notr);
    }
    
 public static String gettanggal() {
        DateFormat dateformat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        return dateformat.format(date);
    }
}
