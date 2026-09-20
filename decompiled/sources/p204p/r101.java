package p204p;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken$AcquireResult;
import com.spotify.image.esperanto.proto.EsImage$ImageData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.offline_esperanto.proto.EsOffline$TotalProgressResponse;
import com.spotify.rcs.resolver.grpc.p141v0.Configuration;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class r101 implements Function, Predicate, BiFunction, Function3, BiConsumer {

    /* JADX INFO: renamed from: L0 */
    public static final i450 f194644L0;

    /* JADX INFO: renamed from: N0 */
    public static final i450 f194646N0;

    /* JADX INFO: renamed from: O0 */
    public static final i450 f194647O0;

    /* JADX INFO: renamed from: P0 */
    public static final i450 f194648P0;

    /* JADX INFO: renamed from: R0 */
    public static final i450 f194650R0;

    /* JADX INFO: renamed from: d */
    public static final r101 f194667d;

    /* JADX INFO: renamed from: e */
    public static final r101 f194669e;

    /* JADX INFO: renamed from: f */
    public static final r101 f194671f;

    /* JADX INFO: renamed from: g */
    public static final r101 f194673g;

    /* JADX INFO: renamed from: h */
    public static final r101 f194675h;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194679a;

    /* JADX INFO: renamed from: b */
    public static final r101 f194663b = new r101(0);

    /* JADX INFO: renamed from: c */
    public static final long[] f194665c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* JADX INFO: renamed from: i */
    public static final r101 f194677i = new r101(6);

    /* JADX INFO: renamed from: t */
    public static final r101 f194678t = new r101(7);

    /* JADX INFO: renamed from: X */
    public static final r101 f194656X = new r101(8);

    /* JADX INFO: renamed from: Y */
    public static final r101 f194658Y = new r101(9);

    /* JADX INFO: renamed from: Z */
    public static final r101 f194660Z = new r101(10);

    /* JADX INFO: renamed from: M0 */
    public static final kuj f194645M0 = new kuj();

    /* JADX INFO: renamed from: Q0 */
    public static final lez f194649Q0 = new lez();

    /* JADX INFO: renamed from: S0 */
    public static final r101 f194651S0 = new r101(12);

    /* JADX INFO: renamed from: T0 */
    public static final r101 f194652T0 = new r101(13);

    /* JADX INFO: renamed from: U0 */
    public static final r101 f194653U0 = new r101(14);

    /* JADX INFO: renamed from: V0 */
    public static final r101 f194654V0 = new r101(15);

    /* JADX INFO: renamed from: W0 */
    public static final r101 f194655W0 = new r101(16);

    /* JADX INFO: renamed from: X0 */
    public static final r101 f194657X0 = new r101(18);

    /* JADX INFO: renamed from: Y0 */
    public static final r101 f194659Y0 = new r101(19);

    /* JADX INFO: renamed from: Z0 */
    public static final r101 f194661Z0 = new r101(20);

    /* JADX INFO: renamed from: a1 */
    public static final r101 f194662a1 = new r101(21);

    /* JADX INFO: renamed from: b1 */
    public static final r101 f194664b1 = new r101(22);

    /* JADX INFO: renamed from: c1 */
    public static final r101 f194666c1 = new r101(23);

    /* JADX INFO: renamed from: d1 */
    public static final r101 f194668d1 = new r101(25);

    /* JADX INFO: renamed from: e1 */
    public static final r101 f194670e1 = new r101(26);

    /* JADX INFO: renamed from: f1 */
    public static final r101 f194672f1 = new r101(27);

    /* JADX INFO: renamed from: g1 */
    public static final r101 f194674g1 = new r101(28);

    /* JADX INFO: renamed from: h1 */
    public static final r101 f194676h1 = new r101(29);

    static {
        int i = 1;
        f194667d = new r101(i);
        int i2 = 2;
        f194669e = new r101(i2);
        int i3 = 3;
        f194671f = new r101(i3);
        int i4 = 4;
        f194673g = new r101(i4);
        int i5 = 5;
        f194675h = new r101(i5);
        f194644L0 = new i450(i);
        f194646N0 = new i450(i3);
        f194647O0 = new i450(i4);
        f194648P0 = new i450(i5);
        f194650R0 = new i450(i2);
    }

    public /* synthetic */ r101(int i) {
        this.f194679a = i;
    }

    /* JADX INFO: renamed from: a */
    public static Set m74425a(q960 q960Var) {
        y860 y860Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p960 p960Var = q960Var.f186508a;
        boolean z = p960Var.f175169a && (p960Var.f175170b || p960Var.f175171c);
        Set set = q960Var.f186509b;
        oc8 oc8Var = r860.f196719b.f196723a;
        a960 a960Var = null;
        Object a960Var2 = (!z || set.contains(oc8Var)) ? (z || !set.contains(oc8Var)) ? null : new a960(Collections.singleton(oc8Var)) : new y860(Collections.singleton(oc8Var));
        if (a960Var2 != null) {
            linkedHashSet.add(a960Var2);
        }
        boolean z2 = p960Var.f175169a && (p960Var.f175170b || p960Var.f175171c);
        oc8 oc8Var2 = r860.f196720c.f196723a;
        Object a960Var3 = (!z2 || set.contains(oc8Var2)) ? (z2 || !set.contains(oc8Var2)) ? null : new a960(Collections.singleton(oc8Var2)) : new y860(Collections.singleton(oc8Var2));
        if (a960Var3 != null) {
            linkedHashSet.add(a960Var3);
        }
        boolean z3 = p960Var.f175173e && p960Var.f175169a && (p960Var.f175170b || p960Var.f175171c);
        mc8 mc8Var = new mc8(h2a1.JAM_CLOSE);
        Object a960Var4 = (!z3 || set.contains(mc8Var)) ? (z3 || !set.contains(mc8Var)) ? null : new a960(Collections.singleton(mc8Var)) : new y860(Collections.singleton(mc8Var));
        if (a960Var4 != null) {
            linkedHashSet.add(a960Var4);
        }
        boolean z4 = p960Var.f175173e && p960Var.f175169a && (p960Var.f175170b || p960Var.f175171c);
        mc8 mc8Var2 = new mc8(h2a1.JAM_FAR);
        Object a960Var5 = (!z4 || set.contains(mc8Var2)) ? (z4 || !set.contains(mc8Var2)) ? null : new a960(Collections.singleton(mc8Var2)) : new y860(Collections.singleton(mc8Var2));
        if (a960Var5 != null) {
            linkedHashSet.add(a960Var5);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof y860) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6f.m52564V(((y860) it.next()).f270228a, arrayList2);
            }
            y860Var = new y860(g6f.m43736n1(arrayList2));
        } else {
            y860Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof a960) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                j6f.m52564V(((a960) it2.next()).f13490a, arrayList4);
            }
            a960Var = new a960(g6f.m43736n1(arrayList4));
        }
        return s601.m77312o0(y860Var, a960Var);
    }

    /* JADX INFO: renamed from: b */
    public static final void m74426b(String str, String str2) {
        if (p2l.f173365a.contains(r101.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            csy csyVarM52990j = jcg1.m52990j(str, str2);
            csyVarM52990j.m33792I("fb_mobile_activate_app", bundle);
            if (jcg1.m52994n() != 2) {
                csyVarM52990j.m33788D();
            }
        } catch (Throwable th) {
            p2l.m68953a(r101.class, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m74427d(String str, dy0 dy0Var, String str2) {
        String string;
        Set set = p2l.f173365a;
        if (set.contains(r101.class) || dy0Var == null) {
            return;
        }
        try {
            long jLongValue = dy0Var.m37303p().longValue();
            r101 r101Var = f194663b;
            if (jLongValue < 0) {
                r101Var.m74430c();
                jLongValue = 0;
            }
            long jM37307t = dy0Var.m37307t();
            if (jM37307t < 0) {
                r101Var.m74430c();
                jM37307t = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", dy0Var.m37304q());
            Locale locale = Locale.ROOT;
            int i = 0;
            if (!set.contains(r101.class)) {
                int i2 = 0;
                while (true) {
                    try {
                        long[] jArr = f194665c;
                        if (i2 >= 19 || jArr[i2] >= jLongValue) {
                            break;
                        } else {
                            i2++;
                        }
                    } catch (Throwable th) {
                        p2l.m68953a(r101.class, th);
                    }
                }
                i = i2;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
            ezo ezoVarM37308u = dy0Var.m37308u();
            if (ezoVarM37308u == null || (string = ezoVarM37308u.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lM37306s = dy0Var.m37306s();
            bundle.putLong("_logTime", (lM37306s != null ? lM37306s.longValue() : 0L) / ((long) 1000));
            jcg1.m52990j(str, str2).m33791H("fb_mobile_deactivate_app", jM37307t / 1000, bundle);
        } catch (Throwable th2) {
            p2l.m68953a(r101.class, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Set m74428e(q960 q960Var) {
        z860 z860Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p960 p960Var = q960Var.f186508a;
        Set set = q960Var.f186510c;
        boolean z = p960Var.f175169a && (p960Var.f175170b || p960Var.f175171c) && p960Var.f175172d;
        oc8 oc8Var = r860.f196721d.f196723a;
        b960 b960Var = null;
        Object b960Var2 = (!z || set.contains(oc8Var)) ? (z || !set.contains(oc8Var)) ? null : new b960(Collections.singleton(oc8Var)) : new z860(Collections.singleton(oc8Var));
        if (b960Var2 != null) {
            linkedHashSet.add(b960Var2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof z860) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j6f.m52564V(((z860) it.next()).f280394a, arrayList2);
            }
            z860Var = new z860(g6f.m43736n1(arrayList2));
        } else {
            z860Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof b960) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                j6f.m52564V(((b960) it2.next()).f24783a, arrayList4);
            }
            b960Var = new b960(g6f.m43736n1(arrayList4));
        }
        return s601.m77312o0(z860Var, b960Var);
    }

    /* JADX INFO: renamed from: f */
    public static String m74429f(String str, String str2, xas xasVar) {
        String str3 = xoc1.f264157o6.f243453a;
        ro80 ro80VarM44508o = geg1.m44508o();
        if (str != null) {
            ro80VarM44508o.add("entityName=" + Uri.encode(str));
        }
        if (str2 != null) {
            ro80VarM44508o.add("imageUrl=" + Uri.encode(str2));
        }
        if (xasVar != null) {
            ro80VarM44508o.add("entityType=" + xasVar.name());
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        return ro80VarM44506m.isEmpty() ? str3 : klh.m56834f(str3, "?", g6f.m43753y0(ro80VarM44506m, "&", null, null, null, 62));
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return (Boolean) obj;
    }

    @Override // io.reactivex.rxjava3.functions.BiConsumer
    public void accept(Object obj, Object obj2) {
        Configuration configuration = (Configuration) obj;
        String strM20123o = configuration != null ? configuration.m20123o() : null;
        if (strM20123o == null || wl51.m88460J0(strM20123o)) {
            throw new IllegalStateException("invalid data from RCR");
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        BadgingState badgingState = (BadgingState) obj;
        Integer num = (Integer) obj2;
        if (num.intValue() > 0) {
            return new er8(num.intValue());
        }
        return badgingState == BadgingState.SHOW_BADGE ? fr8.f72382a : gr8.f83683a;
    }

    /* JADX INFO: renamed from: c */
    public void m74430c() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            iq3 iq3Var = tra0.f223025b;
            iq3.m51331r(hsa0.f94648c);
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f194679a) {
            case 9:
                return ((b97) obj).m28458a();
            case 12:
                e301 e301Var = (e301) obj;
                return e301Var.f55572b && !e301Var.f55574d;
            case 14:
                return ((Boolean) obj).booleanValue();
            case 22:
                return ((Boolean) obj).booleanValue();
            case 25:
                return ((e301) obj).f55572b;
            case 26:
                return ((xul0) obj).mo49279c();
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f194679a) {
            case 1:
                return C2244p5.f174033a;
            case 2:
                return Boolean.valueOf(((fv3) obj).f73627a);
            case 3:
                return Boolean.FALSE;
            case 4:
                return Boolean.valueOf(((EsOffline$TotalProgressResponse) obj).m16212o().m16198C());
            case 5:
                jc8 jc8Var = (jc8) obj;
                return new hh8(jc8Var.f111011a, jc8Var.f111012b);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Message message = ((uj91) it.next()).f230949c;
                    if (message != null) {
                        arrayList.add(message);
                    }
                }
                return arrayList;
            case 7:
                return (Boolean) ((pqm0) obj).f180350a;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsClientToken$AcquireResult.m7465r(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken.AcquireResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 13:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 16:
                return new l0s(((p0s) obj).m68727a());
            case 20:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 23:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsImage$ImageData.m12008t(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.image.esperanto.proto.EsImage.ImageData: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 28:
                aoe0 aoe0Var = (aoe0) obj;
                if (aoe0Var instanceof zne0) {
                    zne0 zne0Var = (zne0) aoe0Var;
                    return new c1f0(zne0Var.f284483c, zne0Var.f284481a, zne0Var.f284482b);
                }
                if (aoe0Var instanceof yne0) {
                    return new a1f0(((yne0) aoe0Var).f274448a);
                }
                throw new NoWhenBranchMatchedException();
            default:
                return Boolean.valueOf(((knm0) obj) instanceof hnm0);
        }
    }
}
