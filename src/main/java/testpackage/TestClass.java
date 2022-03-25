package testpackage;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {

	public static void main(String[] args) throws Throwable {
//		String[] stringArray = new String[] {"1", "2"};
//		
//		for(String children : stringArray) {
//			System.out.println(children);
//		}
//		
//		System.out.println();
//		
//		List<String> stringList = Arrays.asList(stringArray);
//		
//		for(String children : stringList) {
//			System.out.println(children);
//		}
//		
//		System.out.println();
//		
//		String[] secondStringArray = stringList.toArray(new String[stringList.size()]);
//		
//		for(String children : secondStringArray) {
//			System.out.println(children);
//		}
//		
//		StringBuffer sb = new StringBuffer();
//		
//		sb.append(stringList);
//		
//		System.out.println(sb.toString());
//		
//		System.out.println(new Date().toLocaleString());
//		System.out.println("홈페이지1224매장위치 1호점 경기도 군포시 산본동 9141 지하1층2호점 수원시 팔달구 덕영대로 899 지하1층페이스북 1000(전화번호)네이버카페 인스타그램 1201영상제보 및 출연요청 12".split(" ").length);
//		System.out.println("홈페이지1224매장위치 1호점 경기도 군포시 산본동 9141 지하1층2호점 수원시 팔달구 덕영대로 899 지하1층페이스북 1000(전화번호)네이버카페 인스타그램 1201영상제보 및 출연요청 12".replaceAll("\\s{2,}", " ").split(" ").length);
		
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis() - 86400000)));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//		System.out.println(LocalDateTime.now());
		
//		System.out.println(String.format("%s 번째 파일에 다음과 같은 오류가 있습니다.\n%s\n%.03f", 1, "정말 우려스러운 상황이군요.", 12323.123));
//		
//		System.out.println("12345".charAt(2));
//		
//		System.out.println("역시 중은 모닝.근데 씬님 썬크림은 안 바르시나요 그리고 목에 파데 바르면 옷에 안 묻어요 이리저리 돌리면 묻을 것 같은데.".replace(".", " "));
//		
//		List<String> tempList = Arrays.asList("1", "2", "3", "4");
//		
//		System.out.println(tempList.subList(1, tempList.size()));
//		
//		System.out.println("Processor count - " + Runtime.getRuntime().availableProcessors());
//		
//		System.out.println(Pattern.matches(".*(\\d|[a-zA-Z]){15,}.*", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
		
//		List<String> tempList = Arrays.asList("가나다라", "가", "가나", "가나다");
		
//		System.out.println(tempList);
//		System.out.println(tempList.sort(Comparator.reverseOrder()));
		
//		System.out.println(600.0 / 1 >= 600);
		
//		System.out.println("\\u00001234".replaceAll("\\\\u\\d{4}", ""));
		
//		String temp = "비속어 re.compile('이기야') 치환";
//		
//		System.out.println(temp.substring(temp.indexOf("'") + 1, temp.lastIndexOf("'")));
		
//		System.out.println("10:50".replaceAll("([0-9-]+:[0-9-]+)", "A"));
		
//		try {
//			List<String> fileList = Files.lines(Paths.get("/data_bak2/load_tmp/inno.txt"))
//										.collect(Collectors.toList());
//			
//			List<Path> depth1PathList = Files.list(Paths.get("/data_bak2/part2_review_02_name_mask"))
//											.filter(path -> Files.isDirectory(path))
//											.collect(Collectors.toList());
//			
//			List<String> movedList = Files.list(Paths.get("/data_bak2/load_tmp/inno"))
//										.map(path -> path.getFileName().toString())
//										.collect(Collectors.toList());
//			
//			for(Path depth1Path : depth1PathList) {
//				List<Path> depth2PathList = Files.list(depth1Path)
//												.filter(path -> fileList.contains(path.getFileName().toString())
//																&& !movedList.contains(path.getFileName().toString()))
//												.collect(Collectors.toList());
//				
//				System.out.println("Target files - " + depth2PathList.size());
//				
//				for(Path depth2Path : depth2PathList) {
//					try {
//						Files.copy(depth2Path
//								, Paths.get("/data_bak2/load_tmp/inno" + File.separator + depth2Path.getFileName().toString())
//								, StandardCopyOption.REPLACE_EXISTING);
//					} catch(Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//			System.out.println("done.");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("".split(" ").length);
		
//		System.out.println(Pattern.matches("(19|20)[0-9]{2}(-|/|\\.)?[0-1][0-9](-|/|\\.)?[0-3][0-9]", "2020.08.25"));
//		System.out.println("문화는 文化".replaceAll("[^\\(\\),\\.\\w\\s가-힣]+", ""));
//		System.out.println(Pattern.matches("", "'30년'도 되지 않았지만 인터넷의 개발과 보급은 우리의 삶을 엄청나게 바꾸어 놓았습니다."));
//		System.out.println("1:19:57 다시봐도 너무 웃겨욬 뜯자마자 도도 달려 들어오는겈".replaceAll("([0-9]{1,2}:)?[0-9]{1,2}:[0-9]{1,2}", ""));
		
//		System.out.println(Paths.get("C:\\Users\\KHS\\Downloads\\tmp").getFileName());
//		
//		System.out.println(String.format("%,.03f", 1234567890.123456));
		
//		System.out.println("<!--nowsence[mt_201402211554275726722]-- asdfasdfasdfsdfasdfasdf>"
//				.replaceAll("<\\/?(!\\-\\-article_split\\-\\-|!\\-\\-end_block\\-\\-|!\\-\\-end_division\\-\\-|!\\-\\-endfragment\\-\\-|!\\-\\-function|!\\-\\-nowsence\\[mt_201401031310174741736\\]\\-\\-|!\\-\\-nowsence\\[mt_201401131522175533748\\]\\-\\-|!\\-\\-nowsence\\[mt_2014011495383558876\\]\\-\\-|!\\-\\-nowsence\\[mt_201401151345364953625\\]\\-\\-|!\\-\\-nowsence\\[mt_20140121184206506043\\]\\-\\-|!\\-\\-nowsence\\[mt_20140123172966294697\\]\\-\\-|!\\-\\-nowsence\\[mt_201402031751506431038\\]\\-\\-!|!\\-\\-nowsence\\[mt_20140204103652382122\\]\\-\\-|!\\-\\-nowsence\\[mt_20140206131414764175\\]\\-\\-|!\\-\\-nowsence\\[mt_201402101641246008481\\]\\-\\-|!\\-\\-nowsence\\[mt_2014021098513293184\\]\\-\\-|!\\-\\-nowsence\\[mt_20140217171126186217\\]\\-\\-|!\\-\\-nowsence\\[mt_201402171727506287042\\]\\-\\-|!\\-\\-nowsence\\[mt_201402201330204862065\\]\\-\\-|!\\-\\-nowsence\\[mt_201402201653286080899\\]\\-\\-|!\\-\\-nowsence\\[mt_201402211554275726722\\]\\-\\-|!\\-\\-nowsence\\[mt_20140226152318553986\\]\\-\\-|!\\-\\-nowsence\\[mt_201402281658356111551\\]\\-\\-|!\\-\\-nowsence\\[mt_201403061315214772196\\]\\-\\-|!\\-\\-nowsence\\[mt_201403131127324125299\\]\\-\\-|!\\-\\-nowsence\\[mt_201403171748416412109\\]\\-\\-|!\\-\\-nowsence\\[mt_20140320113343981468\\]\\-\\-|!\\-\\-nowsence\\[mt_201403261010153661584\\]\\-\\-|!\\-\\-nowsence\\[mt_20140326134059492597\\]\\-\\-|!\\-\\-nowsence\\[mt_20140328165126066275\\]\\-\\-|!\\-\\-nowsence\\[mt_201404031057383945812\\]\\-\\-|!\\-\\-nowsence\\[mt_20140409950433544317\\]\\-\\-|!\\-\\-nowsence\\[mt_201404101029113775127\\]\\-\\-|!\\-\\-nowsence\\[mt_201404141753106439055\\]\\-\\-|!\\-\\-nowsence\\[mt_201404171149194255986\\]\\-\\-|!\\-\\-nowsence\\[mt_2014041892233372344\\]\\-\\-|!\\-\\-nowsence\\[mt_201404241158544313425\\]\\-\\-|!\\-\\-nowsence\\[mt_201405091511575471751\\]\\-\\-|!\\-\\-nowsence\\[mt_20140512163875988723\\]\\-\\-|!\\-\\-nowsence\\[mt_201405191322224814205\\]\\-\\-|!\\-\\-nowsence\\[mt_201406031658496112943\\]\\-\\-|!\\-\\-nowsence\\[mt_2014060316725802208\\]\\-\\-|!\\-\\-nowsence\\[mt_20140609173676336763\\]\\-\\-|!\\-\\-nowsence\\[mt_201406091742256374582\\]\\-\\-|!\\-\\-nowsence\\[mt_20140609944473508713\\]\\-\\-|!\\-\\-nowsence\\[mt_20140613105173906794\\]\\-\\-|!\\-\\-nowsence\\[mt_201406171449405338072\\]\\-\\-|!\\-\\-nowsence\\[mt_20140623153365598624\\]\\-\\-|!\\-\\-nowsence\\[mt_20140624131214752178\\]\\-\\-|!\\-\\-nowsence\\[mt_201406241549265696625\\]\\-\\-|!\\-\\-nowsence\\[mt_201407161530285582854\\]\\-\\-|!\\-\\-nowsence\\[mt_201408011028393771936\\]\\-\\-|!\\-\\-nowsence\\[mt_2014082018576510782\\]\\-\\-|!\\-\\-nowsence\\[mt_201408221655416094152\\]\\-\\-|!\\-\\-nowsence\\[mt_201409291534305607014\\]\\-\\-|!\\-\\-nowsence\\[mt_20141104103273620741\\]\\-\\-|!\\-\\-nowsence\\[mt_20141117936493460907\\]\\-\\-|!\\-\\-nowsence\\[mw_201401281432355235541\\]\\-\\-|!\\-\\-nowsence\\[mw_20140217171146127405\\]\\-\\-|!\\-\\-nowsence\\[mw_20140306173586143871\\]\\-\\-|!\\-\\-nowsence\\[mw_201403111320224802273\\]\\-\\-|!\\-\\-nowsence\\[mw_20140328155425572653\\]\\-\\-|!\\-\\-nowsence\\[mw_201403281655146091441\\]\\-\\-|!\\-\\-nowsence\\[mw_20140401952223554267\\]\\-\\-|!\\-\\-nowsence\\[mw_20140409930253422566\\]\\-\\-|!\\-\\-nowsence\\[mw_2014042816005760099\\]\\-\\-|!\\-\\-nowsence\\[mw_201405151040223842213\\]\\-\\-|!\\-\\-nowsence\\[mw_201405271118304071031\\]\\-\\-|!\\-\\-nowsence\\[mw_201409251039503839007\\]\\-\\-|!\\-\\-nowsence\\[mw_201410221440505285011\\]\\-\\-|!\\-\\-start_block\\-\\-|!\\-\\-start_division\\-\\-|!\\-\\-startfragment\\-\\-|!\\-\\-td|!\\-\\-textlinkstart\\-\\-|!\\-\\-textlinktopend\\-\\-|!\\-\\-textlinktopstart\\-\\-|br|c|camouflaged|cbs|celebrate|center|c'est|ch\\.|cha’r|chai797|cheek|chloe′:|choices|chow|circulation\\(blossoming\\)|cite|city|cj|cjes\\.junyeol@gmail\\.com|clinical|club|coach:|code)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(coincidence|col\\.l\\.age\\+|cold|colgroup|collision|color|colorful|come|comfortech|console|cool1001@newsis\\.com|csi|curious|d\\.p|d\\.p\\.|d’|d’talk|dance|dancing|danger|daum:word|davichi|david|dd|dealing|dear|deep|definitions|deflection|del|deloitte\\(2015\\)|detail\\.nhn?docid=39987700|detail\\.nhn?docid=8726800|dfs:design|dhc|d\\-holic|dialogue:|dingo|dj|dji|dl|dmc|dmz|dna|do|dolce|down|drag|drawing|dreamtalk|drunken|dt|duo|dystopia|e\\.t|e\\.t\\.|e1|ebs|ebs1|eclipse|eco|editor’s|ee\\-1|eliminate,|elon|em|embed|engraved|entry\\.nhn?docid=665428&cid=50293&categoryid=50293|entry\\.nhn?docid=674371&cid=50293&categoryid=50293|ep\\-16|eqb\\-510|ets|eve|exo|exotic|eye|eyes|f|f1|f1,|fabulous|face|faces|fair|fake|fall|fallin’|falling|family|fancy|farm|fashion|fc|figure|file:|firewater|fl\\-lm3|floor|focus)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(font|fontcolor=blue|fontcolor=green|forgotten|fragmented|from|frontinfoevent_list\\.do|frozen|fruitland|ft|g\\.|g\\.on|g7|gd\\-400huf\\-1dr|geek|gen|get|gifametecthermprocessnewcast|girls|global|glory|go|god|gods|gorgeous|gq|gre|great|great!|green|grm|gs25|gspr|gypsy|half|hand:work:ii|hanmi\\.recruiter\\.co\\.kr|hanwha|hapburn|happy|harper’s|healing|healthy|hee|hello|hello,|here|herethere|hey,|hf_04@daum\\.net|him|hip\\-pop:|history,|hit|home|honey|hong93@police\\.ac\\.kr|hop\\(e\\)|hot&cold|house|how|hr|http:|https:|httpwww\\.customellow\\.com|human|hvod|hx|hyundai|hyunjin\\.park@allianzlife\\.kr|hyunkim@sechanglaw\\.com|i|i\\(|i’m|icecream|ict|idol|iframe|il|il\\+elle|illusion|illusion\\.|illusionist|imagine|imperfectly|in\\-complete|indi|ins|inside\\-out|internatioanl|interview|intro:|invierno|irony|is|ise\\(integrated|it|it’s|ivanov|jiyeong\\.lee@cj\\.net)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(jo1|journal|js|jtbc|jungjoonyoung|just|k|k\\.i\\.m\\(kitsne|k2|kbapr@koreanbar\\.or\\.kr|kbs|kbs1|kbs2|k\\-cineflex|kcon|kcon:tact|keri|key|kfc|kg|ki|kiara|km|koreana|k\\-science|kt|kudoku|kwdi|l\\.o\\.λ\\.e|l\\.o\\.λ\\.e&|le|leon|les|let’s|lg:nc|lol|lol\\+|loofla:|lovcat|love|love,|lovegame|loving|low|lucky|luckyday18@naver\\.com|lucrezia|m|m!|m\\.|m\\.o\\.e|m\\.o\\.e\\.|m\\.the300\\.kr|m:brkbin|m:brkbinsub|m:defjc|m:dispdef|m:intlim|m:lmargin|m:mathfont|m:mathpr|m:narylim|m:rmargin|m:smallfrac|m:wrapindent|m\\+|ma|made|magical|mailto:contract@kofia\\.or\\.kr|mailto:sh_baek@hanafn\\.com|mak|mama|mamma|man|map|marie|matthew|maximum|mbc|mblaq|media\\.ikwave\\.com|meet|memories|men’s|mercury|metro\\-meteor|mind|mindful|minecraft|mini|minisoft|minus|minzy|mirage|miss|mobile|monthly|more|mother)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(mountain|movement_de:light|movement_de;light|movie|moving|mozart|mozu|mr\\.beau’s|mr\\.blue’s|msg|mtv|mu|munsoo|musical|mxi_kwave@naver\\.com|my|myteen|n3|nature|nba|never|new|news@assembly\\.go\\.kr|news@navercorp\\.corn|news3523@naver\\.com|newton|next|nhk|nhl|nkanalysis@unikorea\\.go\\.kr|no|no\\.101\\-80|nointel,|none|north|noscript|not|note|nsc|nu|o|o,|o:allowpng|o:lock|o:officedocumentsettings|o:p|o:pixelsperinch|o:relyonvml|o:targetscreensize|object|oblivion|obsession|ocn|odysseia|official|oh|oh!|ohzin@news1\\.kr|once|one|only|ontact:d|ootp|openinig|original|orthopedics|osen|osteoarthritis|ostrich|our|ourstory3|ouverture|que|queen|quickly|r|r6s|r6s​|ra\\.l|ready|reboot|red|redden|reference|reflection|regeneration|regeneration\\]|return|rock|rocking|rolling|romanson|rookie|roxanne|run|rupaul’s|russian|s|s&i|s\\.s\\.t)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(s\\.u\\.n|s\\.u\\.n\\.|s4|sac|sacai:|salon|sam\\(senior|sasuke|satarlit|sbs|sealed|search|sechs|secret|semu\\-yeol|seoul|series|sex|sf8|shadow|she|shoes:|show|sign|since|singing|skin|sladong@posco\\.com|smart|snl|solid|solo|some|someone|sometimes,|song|sos|sound|spaghetti|spiegel|spring|star|stay|stool|storm|story|storyrhyme1@naver\\.com|storyrhyme2@naver\\.com|street|strike|string|style|sub|subjective|suite|summer|sun|sunny|sunrise|sunset|sup|super|sure|surprise|svooc@hanmail\\.net|svt|swan|symphony|system|t|tag|take|talk|tango|tb|tbs|team|telephone|ten|time|tip|tkkim@prbridge\\.com|to1|top|tumi|tvn|twinkle|twitterwidget|twitter\\-widget|two|u|u1:p|uae|ufc|un·cover|underground|united|universe|university|untitled)[^>가-힣]*>", "!")
//				.replaceAll("<\\/?(v|v:f|v:fill|v:formulas|v:imagedata|v:oval|v:path|v:shape|v:shapetype|v:stroke|vera|verry|verythings:|vi\\-68|vic|vip|vips|voez|vokal|voyage|vr|w|w:adjustlineheightintable|w:alwaysshowplaceholdertext|w:balancesinglebytedoublebytewidth|w:breakwrappedtables|w:compatibility|w:displayhorizontaldrawinggridevery|w:displayverticaldrawinggridevery|w:donotexpandshiftreturn|w:donotleavebackslashalone|w:donotpromoteqf|w:dontflipmirrorindents|w:dontgrowautofit|w:enableopentypekerning|w:ignoremixedcontent|w:latentstyles|w:lidthemeasian|w:lidthemecomplexscript|w:lidthemeother|w:lsdexception|w:overridetablestylehps|w:saveifxmlinvalid|w:snaptogridincell|w:spaceforul|w:splitpgbreakandparamark|w:trackformatting|w:trackmoves|w:ultrailspace|w:useasianbreakrules|w:usefelayout|w:validateagainstschemas|w:view|w:worddocument|w:wrap|w:wraptextwithpunct|w:zoom|wake|walk|wall|water|wbr|weather|week|welcome|weme|what|where|whit1227@naver\\.com|who|who?|who’s|who's|why|wildlife|win|win:d|windward|wise|with|wonderful|worker|world|wow|wwd|www\\.hi\\-ib\\.com|www\\.kcultureglobal\\.com|www\\.kdbdw\\.com|www\\.myasset\\.com|www\\.twitter\\.com|xii\\-69|xml|yeah!|yellow|yester|yolo,|yonhap|yoon’s|you|you00@newsis\\.com|young|younger|ytn|yujeong\\.lee@ahnlab\\.com|zumanity|zzzzz,)[^>가-힣]*>", "!")
//				);
		
//		System.out.println("!--nowsence[mt_201402211554275726722]--".replaceAll("!\\-\\-nowsence\\[mt_201402211554275726722\\]\\-\\-", "!@#"));
		
//		CRC32 crc32 = new CRC32();
//		crc32.update("asdf".getBytes());
//		
//		System.out.println(crc32.getValue());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX");
		
		System.out.println(sdf.format(new Date()));
		
		String dateStr = "2022-02-11T10:35:43.845943+09:00";
		
		System.out.println(sdf.parse(dateStr));
		
		System.out.println("done.");
	}
	
	public static String hashing(String data) {
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			
			return hexString.toString();
			
		} catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
}
