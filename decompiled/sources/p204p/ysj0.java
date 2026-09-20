package p204p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import com.comscore.android.ConnectivityType;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.music.R;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ysj0 {

    /* JADX INFO: renamed from: a */
    public static final float[] f275803a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: renamed from: b */
    public static final long[] f275804b = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    /* JADX INFO: renamed from: c */
    public static sd40 f275805c;

    /* JADX INFO: renamed from: A */
    public static void m94482A(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static String m94483B(i490 i490Var) {
        if (i490Var instanceof v390) {
            return "";
        }
        if (i490Var instanceof a490) {
            return "name.asc";
        }
        if (i490Var instanceof o390) {
            return "addTime.desc";
        }
        if (i490Var instanceof s390) {
            return "album.name.asc";
        }
        if (i490Var instanceof u390) {
            return "artist.name.asc";
        }
        if (i490Var instanceof z390) {
            return m94502q("name", (f490) i490Var);
        }
        if (i490Var instanceof p390) {
            return m94502q("addedBy", (f490) i490Var);
        }
        if (i490Var instanceof n390) {
            return m94502q("addTime", (f490) i490Var);
        }
        if (i490Var instanceof y390) {
            return m94502q("duration", (f490) i490Var);
        }
        if (i490Var instanceof g490) {
            return m94502q("show.name", (f490) i490Var);
        }
        if (i490Var instanceof r390) {
            return m94502q("album.name", (f490) i490Var);
        }
        if (i490Var instanceof t390) {
            return m94502q("artist.name", (f490) i490Var);
        }
        if (i490Var instanceof w390) {
            return m94502q("discNumber", (f490) i490Var);
        }
        if (i490Var instanceof e490) {
            return m94502q("publishDate", (f490) i490Var);
        }
        if (i490Var instanceof h490) {
            return m94502q("trackNumber", (f490) i490Var);
        }
        if (i490Var instanceof q390) {
            return m94502q("album.artist.name", (f490) i490Var);
        }
        if (i490Var instanceof b490) {
            return m94502q(edb.m38564m("provided.", ((b490) i490Var).f23273b), (f490) i490Var);
        }
        if (i490Var instanceof c490) {
            return edb.m38564m("providedNonReversible.", ((c490) i490Var).f33880b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: C */
    public static Rect m94484C(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: D */
    public static List m94485D(z0g1 z0g1Var) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(z0g1Var.f278106e));
        double dCos = Math.cos(Math.toRadians(z0g1Var.f278106e));
        int i = z0g1Var.f278102a;
        int i2 = z0g1Var.f278103b;
        pointArr[0] = new Point(i, i2);
        double d = z0g1Var.f278104c;
        Point point = new Point((int) (((double) i) + (d * dCos)), (int) ((d * dSin) + ((double) i2)));
        pointArr[1] = point;
        double d2 = point.x;
        int i3 = z0g1Var.f278105d;
        pointArr[2] = new Point((int) (d2 - (((double) i3) * dSin)), (int) ((((double) i3) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i4 = point2.x;
        Point point3 = pointArr[2];
        int i5 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }

    /* JADX INFO: renamed from: a */
    public static final void m94486a(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        xq00Var.m91775k0(-114457317);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                fxh0Var = cxh0.f43038a;
            }
            riw0.m75615i(xq00Var, nec.m64246i(mi21.m61824h(leu.m58816b(xq00Var).f117231c.f127592a, mi21.m61822f(1.0f, fxh0Var)), leu.m58815a(xq00Var).f112823a.f229875b.f123094b, kxf1.f127485a));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new s7c(fxh0Var, i, i2, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m94487b(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m94488c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: d */
    public static final Object[] m94489d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final Object[] m94490e(Object[] objArr, int i, int i2, lj91 lj91Var) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bk5.m29636u0(0, i, 6, objArr, objArr2);
        bk5.m29629p0(i, i + 2, i2, objArr, objArr2);
        objArr2[i2 - 2] = lj91Var;
        bk5.m29629p0(i2 - 1, i2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: f */
    public static final Object[] m94491f(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        bk5.m29629p0(i + 2, i + 1, objArr.length, objArrCopyOf, objArrCopyOf);
        bk5.m29629p0(i2 + 2, i2, i, objArrCopyOf, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public static void m94492g(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.m752a(null, str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m94493h(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jM94504s = m94504s(bArr, 0) & 67108863;
        int i = 3;
        long jM94504s2 = (m94504s(bArr, 3) >> 2) & 67108611;
        long jM94504s3 = (m94504s(bArr, 6) >> 4) & 67092735;
        long jM94504s4 = (m94504s(bArr, 9) >> 6) & 66076671;
        long jM94504s5 = (m94504s(bArr, 12) >> 8) & 1048575;
        long j = jM94504s2 * 5;
        long j2 = jM94504s3 * 5;
        long j3 = jM94504s4 * 5;
        long j4 = jM94504s5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jM94504s6 = j9 + (m94504s(bArr3, 0) & 67108863);
            long jM94504s7 = j5 + ((m94504s(bArr3, i) >> 2) & 67108863);
            long jM94504s8 = j6 + ((m94504s(bArr3, 6) >> 4) & 67108863);
            long jM94504s9 = j7 + ((m94504s(bArr3, 9) >> 6) & 67108863);
            long j10 = jM94504s2;
            long jM94504s10 = j8 + (((m94504s(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jM94504s10 * j) + (jM94504s9 * j2) + (jM94504s8 * j3) + (jM94504s7 * j4) + (jM94504s6 * jM94504s);
            long j12 = (jM94504s10 * j2) + (jM94504s9 * j3) + (jM94504s8 * j4) + (jM94504s7 * jM94504s) + (jM94504s6 * j10);
            long j13 = (jM94504s10 * j3) + (jM94504s9 * j4) + (jM94504s8 * jM94504s) + (jM94504s7 * j10) + (jM94504s6 * jM94504s3);
            long j14 = (jM94504s10 * j4) + (jM94504s9 * jM94504s) + (jM94504s8 * j10) + (jM94504s7 * jM94504s3) + (jM94504s6 * jM94504s4);
            long j15 = jM94504s9 * j10;
            long j16 = jM94504s10 * jM94504s;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jM94504s8 * jM94504s3) + (jM94504s7 * jM94504s4) + (jM94504s6 * jM94504s5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jM94504s2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jM94504s11 = m94504s(bArr, 16) + j50;
        long j54 = jM94504s11 & 4294967295L;
        long jM94504s12 = m94504s(bArr, 20) + j51 + (jM94504s11 >> 32);
        long jM94504s13 = m94504s(bArr, 24) + j52 + (jM94504s12 >> 32);
        long jM94504s14 = (m94504s(bArr, 28) + j53 + (jM94504s13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m94482A(j54, bArr4, 0);
        m94482A(jM94504s12 & 4294967295L, bArr4, 4);
        m94482A(jM94504s13 & 4294967295L, bArr4, 8);
        m94482A(jM94504s14, bArr4, 12);
        return bArr4;
    }

    /* JADX INFO: renamed from: i */
    public static final r67 m94494i(Transport transport) {
        return new r67(transport);
    }

    /* JADX INFO: renamed from: j */
    public static m7t0 m94495j(gh00 gh00Var, gh00 gh00Var2, th00 th00Var, gh00 gh00Var3, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        if ((i & 16) != 0) {
            gh00Var3 = te90.f219632t;
        }
        icp icpVar = new icp();
        gh00Var3.invoke(icpVar);
        return new m7t0(new ax4(gh00Var, 2), gh00Var2, th00Var, icpVar, true, j1a1Var);
    }

    /* JADX INFO: renamed from: k */
    public static m7t0 m94496k(gh00 gh00Var, th00 th00Var, gh00 gh00Var2, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        if ((i & 8) != 0) {
            gh00Var2 = te90.f219617Y;
        }
        icp icpVar = new icp();
        gh00Var2.invoke(icpVar);
        return new m7t0(new x10(14, gh00Var), new ri80(gh00Var, th00Var), th00Var, icpVar, true, j1a1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX INFO: renamed from: l */
    public static i490 m94497l(String str, i490 i490Var) {
        if (i490Var instanceof b490) {
            b490 b490Var = (b490) i490Var;
            b490 b490VarM28077j = b490.m28077j(b490Var, false);
            if (str.equals(m94483B(b490VarM28077j))) {
                i490Var = b490VarM28077j;
            } else if (str.equals(m94483B(b490.m28077j(b490Var, true)))) {
                i490Var = b490.m28077j(b490Var, true);
            } else {
                i490Var = null;
            }
        } else if (!(i490Var instanceof c490) || !str.equals(m94483B((c490) i490Var))) {
            i490Var = null;
        }
        if (i490Var != null) {
            return i490Var;
        }
        boolean zM29796g0 = bm51.m29796g0(str, " REVERSE", false);
        String strM88470T0 = wl51.m88470T0(str, " REVERSE");
        int iHashCode = strM88470T0.hashCode();
        v390 v390Var = v390.f236813a;
        switch (iHashCode) {
            case -2112490667:
                if (strM88470T0.equals("artist.name.asc")) {
                    return u390.f226305a;
                }
                return v390Var;
            case -1992012396:
                if (strM88470T0.equals("duration")) {
                    return new y390(zM29796g0);
                }
                return v390Var;
            case -1982576430:
                if (strM88470T0.equals("artist.name")) {
                    return new t390(zM29796g0);
                }
                return v390Var;
            case -1948766500:
                if (strM88470T0.equals("show.name")) {
                    return new g490(zM29796g0);
                }
                return v390Var;
            case -1148582130:
                if (strM88470T0.equals("addTime")) {
                    return new n390(zM29796g0);
                }
                return v390Var;
            case -1148081801:
                if (strM88470T0.equals("addedBy")) {
                    return new p390(zM29796g0);
                }
                return v390Var;
            case -891624790:
                if (strM88470T0.equals("album.name")) {
                    return new r390(zM29796g0);
                }
                return v390Var;
            case -741584941:
                if (strM88470T0.equals("album.artist.name")) {
                    return new q390(zM29796g0);
                }
                return v390Var;
            case -615128739:
                if (strM88470T0.equals("publishDate")) {
                    return new e490(zM29796g0);
                }
                return v390Var;
            case -407924418:
                if (strM88470T0.equals("discNumber")) {
                    return new w390(zM29796g0);
                }
                return v390Var;
            case -146970255:
                if (strM88470T0.equals("addTime.desc")) {
                    return o390.f161327a;
                }
                return v390Var;
            case 0:
                strM88470T0.equals("");
                return v390Var;
            case 3373707:
                if (strM88470T0.equals("name")) {
                    return new z390(zM29796g0);
                }
                return v390Var;
            case 1112560756:
                if (strM88470T0.equals("trackNumber")) {
                    return new h490(zM29796g0);
                }
                return v390Var;
            case 1208738093:
                if (strM88470T0.equals("album.name.asc")) {
                    return s390.f205242a;
                }
                return v390Var;
            case 1839440014:
                if (strM88470T0.equals("name.asc")) {
                    return a490.f12157a;
                }
                return v390Var;
            default:
                return v390Var;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final d3h1 m94498m(f5k f5kVar) {
        e5k e5kVar = f5kVar.f66102i;
        if (!(e5kVar instanceof e5k)) {
            e5kVar = null;
        }
        if (e5kVar != null) {
            return e5kVar.f56420a;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static b0l m94499n() {
        return b0l.f21940e;
    }

    /* JADX INFO: renamed from: o */
    public static int m94500o(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return ConnectivityType.UNKNOWN;
            case 10:
                return 100000;
            case 11:
                return pxb.AUDIO_CONTENT_SAMPLING_RATE;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static final int m94501p(y64 y64Var) {
        if (!y64Var.m92879M()) {
            return 1;
        }
        int iOrdinal = y64Var.m92916l0().ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    public static String m94502q(String str, f490 f490Var) {
        return s571.m77250i(str, f490Var.mo28078c() ? " REVERSE" : "");
    }

    /* JADX INFO: renamed from: r */
    public static final int m94503r(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: s */
    public static long m94504s(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: t */
    public static l9g0 m94505t(String str) {
        return new l9g0(str, 8);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0221  */
    /* JADX INFO: renamed from: u */
    public static final long m94506u(int i, int i2, String str) {
        char cCharAt;
        int i3;
        long j;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        char c3;
        int i9;
        int i10;
        int i11;
        int i12;
        long j3 = 4294967295L;
        if (i == i2) {
            return (((long) i) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i);
        boolean z = cCharAt2 == '-';
        if (z) {
            i3 = i + 1;
            if (i3 == i2) {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i3);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i3 = i;
        }
        int length = str.length();
        int i13 = i3;
        long j4 = 0;
        while (true) {
            if (i13 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i14 = cCharAt - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i14);
            i13++;
            cCharAt = i13 < length ? str.charAt(i13) : (char) 0;
            j3 = j;
        }
        int i15 = i13 - i3;
        char c4 = '0';
        if (i13 == i2 || cCharAt != '.') {
            c = ' ';
            c2 = 1;
            i4 = i13;
            i5 = i4;
            i6 = 0;
        } else {
            int i16 = i13 + 1;
            c = ' ';
            i4 = i16;
            while (true) {
                c2 = 1;
                if (i2 - i4 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long jCharAt = ((long) str.charAt(i4)) | (((long) str.charAt(i4 + 1)) << 16) | (((long) str.charAt(i4 + 2)) << 32) | (((long) str.charAt(i4 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i17 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i17);
                i4 += 4;
                i16 = i12;
            }
            char cCharAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i4 == i2) {
                        break loop2;
                    }
                    int i18 = cCharAt - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i18);
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i4);
            }
            i6 = i12 - i4;
            i15 -= i6;
            i5 = i12;
        }
        if (i15 == 0) {
            return (((long) i4) << c) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i4 + 1;
            char cCharAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c5 = cCharAt4 == '-' ? c2 : (char) 0;
            if (c5 != 0 || cCharAt4 == '+') {
                i7 = i4 + 2;
            }
            char cCharAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i11 = i6;
                    break;
                }
                int i19 = cCharAt5 - '0';
                i11 = i6;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i19;
                }
                i7++;
                cCharAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i11;
            }
            if (c5 != 0) {
                i8 = -i8;
            }
            i6 = i11 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char cCharAt6 = str.charAt(i3);
            int i21 = i3;
            while (true) {
                if (i7 != i2) {
                    char c6 = c4;
                    if (cCharAt6 != c6 && cCharAt6 != '.') {
                        i9 = 19;
                        break;
                    }
                    if (cCharAt6 == c6) {
                        i15--;
                    }
                    int i22 = i21 + 1;
                    i21 = i22;
                    cCharAt6 = i22 < length ? str.charAt(i22) : (char) 0;
                    i20 = 19;
                    c4 = '0';
                } else {
                    i9 = i20;
                    break;
                }
            }
            if (i15 > i9) {
                char cCharAt7 = str.charAt(i3);
                long j6 = 0;
                while (true) {
                    i10 = i3;
                    if (i3 == i13 || Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j6 = (j6 * 10) + ((long) (cCharAt7 - '0'));
                    i3 = i10 + 1;
                    cCharAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i6 = (i13 - i10) + i8;
                } else {
                    char cCharAt8 = str.charAt(i5);
                    int i23 = i5;
                    while (i23 != i4 && Long.compare(j6 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j6 = (j6 * 10) + ((long) (cCharAt8 - '0'));
                        i23++;
                        cCharAt8 = i23 < length ? str.charAt(i23) : (char) 0;
                    }
                    i6 = (i5 - i23) + i8;
                }
                j2 = j6;
                c3 = c2;
            } else {
                j2 = j4;
                c3 = 0;
            }
        } else {
            j2 = j4;
            c3 = 0;
        }
        if (-10 <= i6 && i6 < 11 && c3 == 0 && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
            float f = j2;
            float[] fArr = f275803a;
            float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
            if (z) {
                f2 = -f2;
            }
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(f2)) & j);
        }
        if (j2 == 0) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(z ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i6 || i6 >= 128) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j7 = f275804b[i6 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j8 = j2 << iNumberOfLeadingZeros;
        long j9 = j8 & j;
        long j10 = j8 >>> c;
        long j11 = j7 & j;
        long j12 = j7 >>> c;
        long j13 = j10 * j12;
        long j14 = j12 * j9;
        long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c)) + (j14 & j)) >>> c) + (j14 >>> c);
        int i24 = (int) (j15 >>> 63);
        long j16 = j15 >>> (i24 + 9);
        int i25 = iNumberOfLeadingZeros + (i24 ^ 1);
        long j17 = j15 & 511;
        if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j18 = (j16 + 1) >>> c2;
        if (j18 >= 9007199254740992L) {
            i25--;
            j18 = 4503599627370496L;
        }
        long j19 = j18 & (-4503599627370497L);
        long j20 = ((((((long) i6) * 217706) >> 16) + ((long) 1024)) + ((long) 63)) - ((long) i25);
        if (j20 < 1 || j20 > 2046) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        return (((long) i7) << c) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L)))) & j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: v */
    public static final void m94507v(jl4 jl4Var, w591 w591Var, fb71 fb71Var, me40 me40Var, hmv hmvVar, f671 f671Var, hqi0 hqi0Var, pec1 pec1Var, g671 g671Var, ibk ibkVar) {
        fr4 fr4Var;
        if (ibkVar instanceof fr4) {
            fr4Var = (fr4) ibkVar;
            int i = fr4Var.f72351b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fr4Var.f72351b = i - Integer.MIN_VALUE;
            } else {
                fr4Var = new fr4(ibkVar);
            }
        } else {
            fr4Var = new fr4(ibkVar);
        }
        fr4 fr4Var2 = fr4Var;
        Object obj = fr4Var2.f72350a;
        int i2 = fr4Var2.f72351b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        View view = jl4Var.f113478a;
        ujh vjhVar = Build.VERSION.SDK_INT >= 34 ? new vjh(view) : new ujh(view);
        fr4Var2.f72351b = 1;
        m94508w(jl4Var, w591Var, fb71Var, me40Var, hmvVar, f671Var, vjhVar, hqi0Var, pec1Var, g671Var, fr4Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: w */
    public static final void m94508w(jl4 jl4Var, w591 w591Var, fb71 fb71Var, me40 me40Var, gh00 gh00Var, eh00 eh00Var, ujh ujhVar, hqi0 hqi0Var, pec1 pec1Var, gh00 gh00Var2, ibk ibkVar) {
        gr4 gr4Var;
        if (ibkVar instanceof gr4) {
            gr4Var = (gr4) ibkVar;
            int i = gr4Var.f83641b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gr4Var.f83641b = i - Integer.MIN_VALUE;
            } else {
                gr4Var = new gr4(ibkVar);
            }
        } else {
            gr4Var = new gr4(ibkVar);
        }
        Object obj = gr4Var.f83640a;
        int i2 = gr4Var.f83641b;
        if (i2 == 0) {
            bga.m29073P(obj);
            kr4 kr4Var = new kr4(hqi0Var, w591Var, fb71Var, ujhVar, jl4Var, me40Var, gh00Var, eh00Var, pec1Var, gh00Var2, null);
            gr4Var.f83641b = 1;
            if (kk40.m56684z(kr4Var, gr4Var) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m94509x(d5y d5yVar, byte[] bArr, int i, int i2) {
        try {
            d5yVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m94510y(TextView textView, vc41 vc41Var) {
        Context context = textView.getContext();
        tc41 tc41Var = new tc41(context, vc41Var, context.getResources().getDimension(R.dimen.text_view_icon_size));
        tc41Var.m80417b(context.getColor(R.color.white));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(tc41Var, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m94511z(d5y d5yVar, int i) {
        try {
            d5yVar.mo35044v(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
