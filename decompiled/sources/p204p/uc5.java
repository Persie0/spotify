package p204p;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.spotify.interapp.model.AbstractC0800a;
import com.spotify.interapp.model.AppProtocol$Album;
import com.spotify.interapp.model.AppProtocol$Artist;
import com.spotify.interapp.model.AppProtocol$Empty;
import com.spotify.interapp.model.AppProtocol$TrackData;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class uc5 implements nx81, i5w0, vd50, lhx0, Function, cb31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228941a;

    public /* synthetic */ uc5(int i) {
        this.f228941a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final jph0 m82735c(String str, TimeUnit timeUnit, fiz fizVar, Set set, azu0 azu0Var, ygy0 ygy0Var) {
        AtomicInteger atomicInteger = tgy0.f220288d;
        boolean z = ygy0Var.f272696c;
        wa81 wa81Var = jmj0.f113900a;
        if (z && wl51.m88496t0("profile", "release", false)) {
            wa81Var = wv4.f255393a;
        }
        return new jph0(str, fizVar, azu0Var, set, timeUnit, ygy0Var, wa81Var);
    }

    /* JADX INFO: renamed from: d */
    public static final Scheduler m82736d() {
        AtomicInteger atomicInteger = tgy0.f220288d;
        Scheduler scheduler = tgy0.f220290f;
        return scheduler == null ? (Scheduler) tgy0.f220289e.getValue() : scheduler;
    }

    /* JADX INFO: renamed from: e */
    public static final float m82737e(float f, float f2, float f3) {
        return (((f2 - f) * (f3 - 48.0f)) / 16.0f) + f;
    }

    /* JADX INFO: renamed from: f */
    public static final float m82738f(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: g */
    public static final void m82739g(uc5 uc5Var, View view, int i) {
        uc5Var.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: t */
    public static vfe m82740t(String str, boolean z) {
        String strM29801l0;
        int iM88457G0 = wl51.m88457G0(str, '`', 0, 6);
        if (iM88457G0 == -1) {
            iM88457G0 = str.length();
        }
        int iM88463M0 = wl51.m88463M0(str, "/", iM88457G0, 4);
        String str2 = "";
        if (iM88463M0 == -1) {
            strM29801l0 = bm51.m29801l0(str, "`", "");
        } else {
            String strReplace = str.substring(0, iM88463M0).replace('/', '.');
            strM29801l0 = bm51.m29801l0(str.substring(iM88463M0 + 1), "`", "");
            str2 = strReplace;
        }
        return new vfe(new y400(str2), new y400(strM29801l0), z);
    }

    /* JADX INFO: renamed from: v */
    public static void m82741v(Scheduler scheduler) {
        tgy0.f220290f = scheduler;
    }

    /* JADX INFO: renamed from: w */
    public static WindowInsets m82742w(WindowInsets windowInsets, dx40 dx40Var) {
        hwd1 dwd1Var;
        swd1 swd1VarM79536g = swd1.m79536g(null, windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            dwd1Var = new gwd1(swd1VarM79536g);
        } else if (i >= 31) {
            dwd1Var = new fwd1(swd1VarM79536g);
        } else if (i >= 30) {
            dwd1Var = new ewd1(swd1VarM79536g);
        } else {
            dwd1Var = i >= 29 ? new dwd1(swd1VarM79536g) : new bwd1(swd1VarM79536g);
        }
        dwd1Var.mo40142c(519, dx40Var);
        return dwd1Var.mo30680b().m79541f();
    }

    /* JADX INFO: renamed from: x */
    public static vfe m82743x(y400 y400Var) {
        return new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g());
    }

    /* JADX INFO: renamed from: y */
    public static AppProtocol$TrackData m82744y(PlayerState playerState) {
        List listM87883c = playerState != null ? new wej0(28).m87883c(playerState, new l241(), true, null, false, new a8d0(false, nau.f152117a, false, false, false, rhj.f199233a, false, false), false, null) : lau.f131415a;
        p7d0 p7d0Var = p7d0.f174650b;
        if (playerState == null) {
            return AppProtocol$TrackData.f4417v;
        }
        xul0 xul0VarTrack = playerState.track();
        if (!xul0VarTrack.mo49279c()) {
            return AppProtocol$TrackData.f4417v;
        }
        ContextTrack contextTrack = (ContextTrack) xul0VarTrack.mo49278b();
        xf40 xf40VarMetadata = contextTrack.metadata();
        String str = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ALBUM_TITLE);
        if (str == null) {
            str = "";
        }
        String str2 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ALBUM_URI);
        if (str2 == null) {
            str2 = "";
        }
        AppProtocol$Album appProtocol$Album = new AppProtocol$Album(str, str2);
        String str3 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ARTIST_NAME);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ARTIST_URI);
        if (str4 == null) {
            str4 = "";
        }
        AppProtocol$Artist appProtocol$Artist = new AppProtocol$Artist(str3, str4);
        String str5 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_ALBUM_TRACK_NUMBER);
        Integer numValueOf = Integer.valueOf((int) ((Number) playerState.duration().mo49280e(0L)).longValue());
        String str6 = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_TITLE);
        String str7 = str6 != null ? str6 : "";
        Integer numValueOf2 = Integer.valueOf(str5 != null ? Integer.parseInt(str5) : 0);
        String strUri = contextTrack.uri();
        u7d0 u7d0Var = u7d0.f227574d;
        Boolean boolValueOf = Boolean.valueOf(listM87883c.contains(u7d0Var));
        Boolean boolValueOf2 = Boolean.valueOf(listM87883c.contains(u7d0Var) || listM87883c.contains(d7d0.f46073d));
        Boolean bool = Boolean.FALSE;
        Boolean boolValueOf3 = Boolean.valueOf(listM87883c.contains(t7d0.f217753e));
        Boolean boolValueOf4 = Boolean.valueOf(listM87883c.contains(l7d0.f130627a));
        Boolean boolValueOf5 = Boolean.valueOf(listM87883c.contains(n7d0.f151137a));
        h7d0 h7d0Var = h7d0.f88438a;
        Boolean boolValueOf6 = Boolean.valueOf(listM87883c.contains(h7d0Var) || listM87883c.contains(p7d0Var));
        Boolean boolValueOf7 = Boolean.valueOf(listM87883c.contains(h7d0Var) || listM87883c.contains(p7d0Var));
        AppProtocol$Empty appProtocol$Empty = AbstractC0800a.f4604a;
        return new AppProtocol$TrackData(appProtocol$Album, appProtocol$Artist, numValueOf, str7, numValueOf2, "track", strUri, boolValueOf, 0, boolValueOf2, bool, boolValueOf3, bool, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, bool, bif1.m29340u(contextTrack));
    }

    @Override // p204p.lhx0
    /* JADX INFO: renamed from: a */
    public Object mo42314a(String str, zmy zmyVar, nxs0 nxs0Var) {
        return zmyVar.invoke(nxs0Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f228941a) {
            case 22:
                throw ei6.m39072i(obj);
            default:
                zjr0 zjr0Var = (zjr0) obj;
                boolean z = zjr0Var.f283527a;
                if (z) {
                    i = 1;
                } else if (zjr0Var.f283528b) {
                    i = 2;
                } else {
                    i = !z ? 3 : 4;
                }
                return new tk51(i);
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return n5w0.f150633a;
        }
        if (h9xVar.equals(e9x.f57549a)) {
            return o5w0.f162141a;
        }
        return null;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        ltx ltxVar;
        switch (i) {
            case 0:
                ltxVar = ltx.UNKNOWN;
                break;
            case 1:
                ltxVar = ltx.GENRE;
                break;
            case 2:
                ltxVar = ltx.MOOD;
                break;
            case 3:
                ltxVar = ltx.ACTIVITY;
                break;
            case 4:
                ltxVar = ltx.INSTRUMENT;
                break;
            case 5:
                ltxVar = ltx.TIME;
                break;
            case 6:
                ltxVar = ltx.ERA;
                break;
            case 7:
                ltxVar = ltx.AESTHETIC;
                break;
            case 8:
                ltxVar = ltx.AUDIENCE;
                break;
            case 9:
                ltxVar = ltx.CULTURAL_REFERENCE;
                break;
            case 10:
                ltxVar = ltx.GEOGRAPHIC_LOCATION;
                break;
            case 11:
                ltxVar = ltx.LANGUAGE;
                break;
            case 12:
                ltxVar = ltx.LOCATION;
                break;
            case 13:
                ltxVar = ltx.MEDIA;
                break;
            case 14:
                ltxVar = ltx.MUSIC_FESTIVAL;
                break;
            case 15:
                ltxVar = ltx.MUSIC_VENUE;
                break;
            case 16:
                ltxVar = ltx.MUSICAL_DESCRIPTOR;
                break;
            case 17:
                ltxVar = ltx.MUSICAL_TERM;
                break;
            case 18:
                ltxVar = ltx.PLACE;
                break;
            case 19:
                ltxVar = ltx.PUBLICATION;
                break;
            case 20:
                ltxVar = ltx.RADIO;
                break;
            case 21:
                ltxVar = ltx.RECORD_LABEL;
                break;
            case 22:
                ltxVar = ltx.RECORD_STORE;
                break;
            case 23:
                ltxVar = ltx.RELIGION;
                break;
            case 24:
                ltxVar = ltx.SLANG;
                break;
            default:
                ltxVar = null;
                break;
        }
        return ltxVar == null ? ltx.UNRECOGNIZED : ltxVar;
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: h */
    public String mo30404h(String str, ebf0 ebf0Var) {
        m340 m340Var;
        z240 z240VarM60640a;
        cbf0 cbf0VarM35556a;
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(erc1.class, str);
        erc1 erc1Var = (erc1) ((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a);
        if (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11862c)) == null) {
            return null;
        }
        return z240VarM60640a.f278475a.f198763a;
    }

    /* JADX INFO: renamed from: i */
    public void m82745i(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Integer num = tw50.f224315a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
            return;
        }
        Method method = bdo0.f26190a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public String m82746j(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:ai-playlist:reedit:".concat(str)).m35694A();
        if (strM35694A != null) {
            return strM35694A;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: k */
    public Set mo30407k() {
        return bk5.m29624m1(new gww0[]{new eww0(y7t0.class), new eww0(erc1.class), new fww0(v140.class)});
    }

    /* JADX INFO: renamed from: m */
    public mo91 m82747m(jn91 jn91Var, List list) {
        List listMo25171e = jn91Var.mo25171e();
        bo91 bo91Var = (bo91) g6f.m43689C0(listMo25171e);
        if (bo91Var == null || !bo91Var.mo27376S()) {
            return new ao40((bo91[]) listMo25171e.toArray(new bo91[0]), (ho91[]) list.toArray(new ho91[0]), false);
        }
        List listMo25171e2 = jn91Var.mo25171e();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listMo25171e2, 10));
        Iterator it = listMo25171e2.iterator();
        while (it.hasNext()) {
            arrayList.add(((bo91) it.next()).mo27378k());
        }
        return new uo41(kkc0.m56705r0(g6f.m43746s1(arrayList, list)), 1);
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: n */
    public pqm0 mo30413n(String str, ebf0 ebf0Var) {
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(v140.class, str);
        if (dbf0VarM38368c == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cbf0 cbf0VarM35556a = dbf0VarM38368c.m35556a();
        wj50.m88279p(cbf0VarM35556a);
        v140 v140Var = (v140) ((ktx) cbf0VarM35556a.f36107a);
        u140 u140Var = v140Var.f236247e;
        cem cemVar = u140Var != null ? new cem(u140Var.f225679b, u140Var.f225678a) : null;
        List<t140> list = v140Var.f236246d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (t140 t140Var : list) {
            arrayList.add(new bem(t140Var.f216154b, t140Var.f216153a));
        }
        return new pqm0(cemVar, arrayList);
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: o */
    public long mo30415o(String str, ebf0 ebf0Var) {
        cbf0 cbf0VarM35556a;
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(y7t0.class, str);
        Long lM88338t = wjg1.m88338t((y7t0) ((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a));
        Long lValueOf = lM88338t != null ? Long.valueOf(lM88338t.longValue() / ((long) 1000)) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // p204p.cb31
    /* JADX INFO: renamed from: p */
    public boolean mo32148p(Object obj, Object obj2) {
        l771 l771Var = (l771) obj;
        l771 l771Var2 = (l771) obj2;
        if (l771Var == null || l771Var2 == null) {
            if ((l771Var == null) ^ (l771Var2 == null)) {
                return false;
            }
            return true;
        }
        if (l771Var.f130601e == l771Var2.f130601e && l771Var.f130602f == l771Var2.f130602f && l771Var.f130598b == l771Var2.f130598b && wj50.m88271j(l771Var.f130599c, l771Var2.f130599c) && b8j.m28424c(l771Var.f130600d, l771Var2.f130600d)) {
            return true;
        }
        return false;
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: q */
    public String mo30419q(String str, ebf0 ebf0Var) {
        cbf0 cbf0VarM35556a;
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(v140.class, str);
        if (dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) {
            return null;
        }
        return ((v140) cbf0VarM35556a.f36107a).f236243a;
    }

    /* JADX INFO: renamed from: r */
    public AbstractC2604y8 m82748r() {
        Integer num = uw50.f234575a;
        return (num == null || num.intValue() >= 34) ? new feo0() : new hby();
    }

    @Override // p204p.nx81
    /* JADX INFO: renamed from: s */
    public String mo30423s(String str, ebf0 ebf0Var) {
        cbf0 cbf0VarM35556a;
        v140 v140Var;
        dbf0 dbf0VarM38368c = ebf0Var.m38368c(v140.class, str);
        if (dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null || (v140Var = (v140) cbf0VarM35556a.f36107a) == null) {
            return null;
        }
        return v140Var.f236244b;
    }

    /* JADX INFO: renamed from: u */
    public String m82749u(String str) {
        int iM88458H0 = wl51.m88458H0(str, "@", 0, false, 6);
        String strSubstring = iM88458H0 == -1 ? "" : str.substring(0, iM88458H0);
        if (strSubstring.length() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strSubstring.length(); i++) {
                char cCharAt = strSubstring.charAt(i);
                if (!Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (string.length() != 0) {
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                if (lowerCase.length() <= 0) {
                    return lowerCase;
                }
                return ((Object) String.valueOf(lowerCase.charAt(0)).toUpperCase(locale)) + lowerCase.substring(1);
            }
        }
        return "";
    }

    public /* synthetic */ uc5(int i, Object obj, Object obj2) {
        this.f228941a = i;
    }

    public uc5(kq11 kq11Var) {
        this.f228941a = 27;
    }

    public /* synthetic */ uc5(boolean z, int i) {
        this.f228941a = i;
    }
}
