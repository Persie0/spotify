package p204p;

import android.net.Uri;
import android.os.Build;
import com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException;
import com.spotify.mobius.Next;
import com.spotify.rcs.resolver.grpc.p141v0.Configuration;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public class t46 implements vd50, deu0, gw51, qja1, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216924a;

    public /* synthetic */ t46(int i) {
        this.f216924a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final im91 m80038a(xq00 xq00Var) {
        return jg31.m53259E((int) cks.m33187f(leu.m58817c(xq00Var).f235363b.f225039a), 0, ((pku) leu.m58817c(xq00Var).f235362a.f197473d).f178550a, 2);
    }

    /* JADX INFO: renamed from: c */
    public static yau0 m80039c() {
        return yau0.f271015d;
    }

    /* JADX INFO: renamed from: d */
    public static yau0 m80040d(kw10 kw10Var) {
        List list = kw10Var.f126989c;
        yau0 yau0Var = yau0.f271015d;
        int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : list) {
            lb6 lb6Var = (lb6) obj;
            yau0 yau0Var2 = yau0.f271015d;
            linkedHashMap.put(m80043n(lb6Var.f131570b, lb6Var.f131569a), obj);
        }
        return new yau0(kw10Var, Collections.unmodifiableMap(linkedHashMap));
    }

    /* JADX INFO: renamed from: j */
    public static yau0 m80041j(byte[] bArr) {
        Configuration configurationM20121s = Configuration.m20121s(bArr);
        ae50<Configuration.AssignedValue> ae50VarM20122n = configurationM20121s.m20122n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM20122n, 10));
        for (Configuration.AssignedValue assignedValue : ae50VarM20122n) {
            wj50.m88279p(assignedValue);
            arrayList.add(kb6.m55933b(assignedValue));
        }
        return m80040d(new kw10(configurationM20121s.m20123o(), configurationM20121s.m20124q(), Collections.unmodifiableList(arrayList), configurationM20121s.m20125r(), 16));
    }

    /* JADX INFO: renamed from: m */
    public static r040 m80042m(EnumC2166nj enumC2166nj, String str) {
        return new r040(Collections.singletonList(new xe21(enumC2166nj, str)));
    }

    /* JADX INFO: renamed from: n */
    public static String m80043n(String str, String str2) {
        return klh.m56834f(str, ":", str2);
    }

    /* JADX INFO: renamed from: p */
    public static String m80044p(String str) {
        Matcher matcher;
        zm91 zm91Var;
        zm91[] zm91VarArrValues = zm91.values();
        int iM31820L = c95.m31820L(zm91VarArrValues.length);
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        int i = 0;
        for (zm91 zm91Var2 : zm91VarArrValues) {
            linkedHashMap.put(zm91Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))".concat(zm91Var2.f284198a)));
        }
        zm91[] zm91VarArrValues2 = zm91.values();
        int length = zm91VarArrValues2.length;
        Matcher matcher2 = null;
        while (true) {
            if (i >= length) {
                matcher = matcher2;
                zm91Var = null;
                break;
            }
            zm91Var = zm91VarArrValues2[i];
            Object obj = linkedHashMap.get(zm91Var);
            wj50.m88279p(obj);
            matcher = ((Pattern) obj).matcher(str);
            if (matcher.find()) {
                break;
            }
            i++;
            matcher2 = matcher;
        }
        if (zm91Var == null) {
            throw new IllegalArgumentException("Specified artistUri doesn't match any type");
        }
        if (matcher == null) {
            wj50.m88260d0("matcher");
            throw null;
        }
        String strGroup = matcher.group(2);
        wj50.m88279p(strGroup);
        return strGroup;
    }

    /* JADX INFO: renamed from: q */
    public static String m80045q(String str) {
        return String.format("spotify:artist:%s:concerts", Arrays.copyOf(new Object[]{m80044p(str)}, 1));
    }

    /* JADX INFO: renamed from: r */
    public static void m80046r() {
        r040 r040Var = r040.f194380b;
    }

    /* JADX INFO: renamed from: s */
    public static Next m80047s(iuy0 iuy0Var) {
        return iuy0Var.f106053a ? Next.m15605a(Collections.singleton(new fqy0(iuy0Var.f106054b))) : Next.m15608j();
    }

    /* JADX INFO: renamed from: t */
    public static void m80048t() {
        File[] fileArrListFiles;
        if (n0b1.m63382v()) {
            return;
        }
        File fileM57621p = kxf1.m57621p();
        if (fileM57621p == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileM57621p.listFiles(new l4l(2));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(dxf1.m37221J(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((r150) obj).m74455a()) {
                arrayList2.add(obj);
            }
        }
        List listM43711Y0 = g6f.m43711Y0(arrayList2, new C2109m(5));
        JSONArray jSONArray = new JSONArray();
        Iterator it = n0e1.m63417Y(0, Math.min(listM43711Y0.size(), 5)).iterator();
        while (((a450) it).f12141c) {
            jSONArray.put(listM43711Y0.get(((t350) it).nextInt()));
        }
        kxf1.m57630y("crash_reports", jSONArray, new C2146n(1, listM43711Y0));
    }

    /* JADX INFO: renamed from: u */
    public static String m80049u(String str) {
        Set set = dd41.f47702f;
        return r46.m74726U(str).m35710h();
    }

    /* JADX INFO: renamed from: v */
    public static void m80050v(String str, Object obj, Object obj2) throws FieldValidator$ValidationException {
        if (obj.equals(obj2)) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sbM38573v = edb.m38573v("Expected \"", str, "\" to be ", strValueOf, ", but was ");
        sbM38573v.append(strValueOf2);
        throw new FieldValidator$ValidationException(sbM38573v.toString());
    }

    /* JADX INFO: renamed from: w */
    public static void m80051w(String str, List list, String str2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Set set = dd41.f47702f;
            if (!r46.m74712E(str3, avp0.f20242e, ivp0.f106258f) && !r46.m74709B(str3, gn80.TRACK, gn80.ALBUM, gn80.SHOW_SHOW, gn80.SHOW_EPISODE, gn80.PODCAST_CHAPTER, gn80.CLIP, gn80.KALLAX, gn80.TRANSITION, gn80.TRANSITION_WITH_REVISION)) {
                throw new IllegalArgumentException(("The item uri must be either a track, episode, show (audiobook), podcast chapter, clip, an album or playlist URI: " + list + ". Originates from source context " + str2 + " and source view " + str).toString());
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m80052x(String str, String str2) throws FieldValidator$ValidationException {
        if (kgg1.m56363z(str)) {
            throw new FieldValidator$ValidationException(s571.m77251j("\"", str2, "\" can not be empty"));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m80053y(Object obj, String str) throws FieldValidator$ValidationException {
        if (obj == null) {
            throw new FieldValidator$ValidationException(str.concat(" can't be null"));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m80054z(int i, int i2, int i3, String str) throws FieldValidator$ValidationException {
        if (i3 < i || i3 > i2) {
            StringBuilder sbM38571t = edb.m38571t(i3, "\"", str, "\" ", " is not within range ");
            sbM38571t.append(i);
            sbM38571t.append(" to ");
            sbM38571t.append(i2);
            throw new FieldValidator$ValidationException(sbM38571t.toString());
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f216924a) {
            case 23:
                return ((Boolean) obj).booleanValue() ? kew0.f121986a : kew0.f121987b;
            default:
                ArrayList<u1l0> arrayList = ((v1l0) obj).f236410a;
                boolean z = false;
                if (!arrayList.isEmpty()) {
                    for (u1l0 u1l0Var : arrayList) {
                        if (u1l0Var.f225859b != 1) {
                            Set set = dd41.f47702f;
                            if (r46.m74726U(u1l0Var.f225858a).f47709c != gn80.COLLECTION_ARTIST) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: b */
    public int mo45919b(r300 r300Var) {
        String str = r300Var.f195387p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(edb.m38564m("Unsupported MIME type: ", str));
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        switch (this.f216924a) {
            case 2:
                knn0 knn0VarM56948a = knn0.m56948a(i);
                return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
            default:
                j3a1 j3a1VarM52255a = j3a1.m52255a(i);
                return j3a1VarM52255a == null ? j3a1.UNRECOGNIZED : j3a1VarM52255a;
        }
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: e */
    public long mo35830e(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(1050932339);
        if (z) {
            xq00Var.m91771i0(628666078);
            xq00Var.m91788r(false);
            j = n6f.f150870j;
        } else {
            xq00Var.m91771i0(628667708);
            j = leu.m58815a(xq00Var).f112823a.f229875b.f123094b;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: f */
    public long mo35831f(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(1966177013);
        if (z) {
            xq00Var.m91771i0(-289496866);
            j = leu.m58815a(xq00Var).f112823a.f229875b.f123094b;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-289496192);
            xq00Var.m91788r(false);
            j = n6f.f150870j;
        }
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: g */
    public boolean mo45920g(r300 r300Var) {
        String str = r300Var.f195387p;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: h */
    public long mo35832h(xq00 xq00Var) {
        xq00Var.m91771i0(-1420523422);
        long j = leu.m58815a(xq00Var).f112823a.f229875b.f123093a;
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.gw51
    /* JADX INFO: renamed from: i */
    public iw51 mo45921i(r300 r300Var) {
        String str = r300Var.f195387p;
        List list = r300Var.f195390s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new twy(list);
                case "application/pgs":
                    return new qun0();
                case "application/x-mp4-vtt":
                    return new l3d0();
                case "text/vtt":
                    return new rpd1();
                case "application/x-quicktime-tx3g":
                    rjr rjrVar = new rjr();
                    rjrVar.f199898g = new l2n0();
                    if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                        byte[] bArr = (byte[]) list.get(0);
                        rjrVar.f199893b = bArr[24];
                        rjrVar.f199894c = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                        rjrVar.f199895d = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
                        int i = bArr[25] * 20;
                        rjrVar.f199897f = i;
                        boolean z = (bArr[0] & 32) != 0;
                        rjrVar.f199892a = z;
                        if (z) {
                            rjrVar.f199896e = h0b1.m46315i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                        } else {
                            rjrVar.f199896e = 0.85f;
                        }
                    } else {
                        rjrVar.f199893b = 0;
                        rjrVar.f199894c = -1;
                        rjrVar.f199895d = "sans-serif";
                        rjrVar.f199892a = false;
                        rjrVar.f199896e = 0.85f;
                        rjrVar.f199897f = -1;
                    }
                    return rjrVar;
                case "text/x-ssa":
                    return new wg41(list);
                case "application/vobsub":
                    return new asc1(list);
                case "application/x-subrip":
                    return new xs51();
                case "application/ttml+xml":
                    return new rl91();
            }
        }
        throw new IllegalArgumentException(edb.m38564m("Unsupported MIME type: ", str));
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: k */
    public boolean mo35833k(int i) {
        return true;
    }

    @Override // p204p.qja1
    /* JADX INFO: renamed from: l */
    public boolean mo27923l(Uri uri) {
        return wj50.m88271j(uri.getFragment(), "close");
    }

    /* JADX INFO: renamed from: o */
    public float m80055o() {
        String str = Build.MODEL;
        return (bm51.m29803n0(str, "SM-F731", false) || bm51.m29803n0(str, "SM-F741", false)) ? jjr.f113085a : 0;
    }

    public /* synthetic */ t46(Object obj, int i) {
        this.f216924a = i;
    }

    public /* synthetic */ t46(son sonVar, otn otnVar, int i) {
        this.f216924a = i;
    }

    public /* synthetic */ t46(boolean z, int i) {
        this.f216924a = i;
    }
}
