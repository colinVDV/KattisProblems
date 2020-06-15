//Java Program to demonstrate the conversion of Octal to Decimal  
//using custom code  
public class OctalToDecimalExample3{  
//Declaring method  
public static int getDecimal(long octal){    
    //Declaring variable to store decimal number  
    int decimal = 0;    
    //Declaring variable to use in power  
    int n = 0;    
    //writing logic   
    while(true){    
      if(octal == 0){    
        break;    
      } else {    
          int temp = octal%10;    
          decimal += temp*Math.pow(8, n);    
          octal = octal/10;    
          n++;    
       }    
    }    
    return decimal;    
}    
public static void main(String args[]){      
//Printing the result of conversion  
System.out.println("Decimal of 121 octal is: "+getDecimal(Long.parseLong(0535453306155733262440350674403046056331220070102051143367114533220151340715
6533220144336661573442016332272040302665453502604030667556346625433506256435
2710403026215134064563306645563162014533064564134201043526456310061557334635
6531220154322611453446741234662555130201563366704030667556354605543306456310
0651653467215710066141306645563226044030227040246725633406255631064563346624
4034272551346201543026156534620156336670403306454735266141100621413406454235
2714123367115630271145134201203446755133420144302701513047256310061557332665
5731067440312715641007154531020146312725473226056413420120312661543126716431
2715613526244035467554352721603027205410072562334604403020516331266560312710
4031671141354645443022604031271141350201453467204034661545330625623227156135
2624403146255432271454100604403406756235072151350675621006615131672554302201
5430261565346201413062014432260555134051163526615430266440354675543527216030
2720403022014533064564100701543026154534460564100625473127156430271456100465
4131261545334605631006614130664556322604403026615134272545350201603527116534
6201513100516335271543322701513502704022267164312635453442015633667040330725
4335072563100671653346145410070565322714403126614533262556350725551006754432
2674561005154531020163312620403126615135020146302615513306456332271454024731
4533462556302721513462015631270565312201453522604030272543350675621006215130
2664561004156230271440302614403026154335266563302670403306756231266456100501
6233664556100625651006215131667151346715513320514534460564134201113347214531
6625621006756233460562312201573446155110060564100721573447215734420162320675
5630672563130201513347214534462165332201453166256335060563100665413166714110
0621413406454235271456024471413322015431261564352714403106454133226040314605
6530664542352714403427255134620152352715643362014535226040346605473227216432
2714403026154335266563302670403366215133627040240711573226704034071145350645
6533205165330721623226154534620145330645641302016535020151334721453446216533
2201553127216534620162320675563067256310064544134201263227314133272563100611
5130462556310725551006614533620155322260403226701234062554330625563506256334
2725451006655110072554350711513066256310070565322714561004716533461440322670
4034660547322721643227144033260565344645631302015633667040314625653166454135
0201643527116032271456024465413527115134620144302701513047256310064556100671
6533461440302201603526616632267141344270120244714133220151332701453446215131
2720403247256335067440346615453306256232271561352624403346456332220143336671
6331261564312721653442016035266166322671413442014130620151334201543226114534
4674561004256432260555024621513026644033264454100731573307256434060564100605
4310073151354625623446044030464542312671443526645410062547312715643027144035
4625541006754432267456100421573346254310071545310201663227314534471141024605
6531672545134201013306456135260555100625623027204035467554352721603027205610
0415623027144035272040334645633302015131020164312661543527144030266151342725
4535020144302701513047256313420120344675513340515530266145346725413106044033
4645423202016632272141312201553027156330220164312665603527144034064141344625
6434460456100421653227144030271143352201563526714313020146312711553126716435
2664403466754430266145346051443027015130472563100625473127205410066157304675
6235064563100731453302015632271554134201253502014531662563350605631006455635
0625623107255510070565302664403466456410060555312720403146054332266151346645
6313405123352715603126714432271563312201603367116430220162352721623526644033
4645633222014535220163312665603127105610051565346701453346215134671545100625
6410063562302731513106044032270163352664561004215733462543024665413507215134
6201563366704033064547352661411007056532271440304645423126714435266456100531
5135460555352714403466254410061151304625563107255510066145306721653462704024
2725513467056531220145334645550246654134671541130201433366716331261564312721
6534420156336670403406756335262562312201453502604031460543322661513466456310
0605543227056531272040330625571342012031266154312671643127156135262412332605
5431271565302621411302014433666157344201513102014531662563350605631006155733
2665573106745410071541340645453342016534467141100711503366714335271440334725
5433060454100605431006315133464542352714123546255432272040334645633222015131
0201513407156533227012024515453102015133420145346720403147115133463551330661
4113020141306615653327154133420154312674403127245410066541350721513462015632
2715541342011635266154302664403346254310073151354625623446044033462561352624
5602450145330661453347214534670565312201663126604033264440310605603226116534
6260403046614133462151350201453467204034664564100605553127205410071165350711
6533220144336661573442704021067556312614403306054332267151302051453526456333
2675441007056530266440352720403466754430266145346270402226716431263545344201
6631264151306725543022016232271565346201633227204030266545350201453306456410
0721453327015734426040334675560246155733463565312201443526444033067542336711
6432271456100461573446255510064560346725551006215733067562100715513502014133
2625641302014333667163312615643127216534420141310645603227154332267147100625
5432272056024405453346254133420163306625543127115134670565312201623227156534
6201603526616632267141344201643226714332262165334720403546256335064542352661
6533227040234725543306044033472556306201623227156534626012330725433507256310
0625473127204035271156302201413062604032260543352661513462015734467141344624
4030267164312270402427255134670565312201413502016533066141332615573447014534
4201553026355630227040252720403127201234660547322721643227144032270163352664
5410067157334201553027415133272563100645603467255513420104336671453062014630
2615513306456332271440302725473526244034664564100605553127204030667556346625
6135260564024615573346356531227040234725543306044031263545346721413462015432
2635653306044033064547352661411302014130620155302721643227144031267151332201
4333666555336621571007154531027012024415623027144030220154336711453322015632
2611501342011635266154302664403146256233262556350725551006155733471545342725
4135020146312711553126716435266456100515453102014130661565332715413342015133
4201663126615135005145352201643446456335064561352624561004216532271440302661
5134272541332201453467204033472554330604541007315135060545100665573306615134
6201653446714110066557330661513462015631261456100501503027154533066165346051
5133420154312615643527144033671143322270402226716431271144352664403127204033
2605543127156530262141100631413326256310060543100605563506244032270163352664
4034071151332645631006455610063141352615513047256313405116352661543026644035
4645643026244034066141306625623027204035067562350675621342011133420163322720
4030266545350201543026156534620145330625513146255631020154322635653306044034
0711453506456533205160344625643227255513405012240641413466255433072563100731
4134464565346201423226114533462165332201563526714310066165306721653462014233
0605563106456413420123312620403526616434464543312714403466255510073145330645
6413020156336670123126354534672141346201623227156534620163352715433227015135
0201453522704023472554330604403406756335262562312201453602016535020163302635
5135072151346201553026614534672541310604561004215733462543024701573447216432
2721573442015530272164322714403027254735262440302201503126714434462562322720
5610053145346721513047255435266440314645563226116534620144322615643526644031
2711573462604030261440322671643127114435266412324725633506744030667556346625
6135260564100725641342012535020145316625641007154533220143336671663026615432
2714541006614133671145312720403466255510071545310260403526615430266543336711
6031271040340725623527145602451565346701453346215134671545100701573506255635
0644561004716533461440314625623326255635072555100701573447214110071565346615
5134064564134050122506414510060556346735453442015134635040346625703526055410
07215034462541310050)));    
System.out.println("Decimal of 23 octal is: "+getDecimal(23));    
System.out.println("Decimal of 10 octal is: "+getDecimal(10));    
}}  