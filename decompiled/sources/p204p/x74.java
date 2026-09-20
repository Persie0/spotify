package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class x74 implements uq7, deu0, rzu0, vd50, fr81, i5w0, p5e0, Predicate, Init, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258819a;

    public /* synthetic */ x74(int i) {
        this.f258819a = i;
    }

    /* JADX INFO: renamed from: A */
    public static int m90113A(PlayabilityRestriction playabilityRestriction) {
        int i = tqw.f222900a[playabilityRestriction.ordinal()];
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        i2 = 6;
                        if (i != 6) {
                            return 1;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: B */
    public static srq0 m90114B(sbu0 sbu0Var, i291 i291Var) {
        boolean z;
        ?? r0 = sbu0Var.f207585a;
        if (r0.isEmpty()) {
            return new srq0(lau.f131415a);
        }
        int i = i291Var.f97779a;
        int i2 = i291Var.f97780b;
        wb71 wb71Var = i291Var.f97781c;
        List<qbu0> listM43711Y0 = g6f.m43711Y0(r0, ecb.f58286M0);
        ArrayList arrayList = new ArrayList();
        qbu0 qbu0Var = (qbu0) g6f.m43741q0(listM43711Y0);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        long jLongValue = Long.valueOf(qbu0Var.f187173b.f195113b).longValue();
        boolean zContains = false;
        boolean z2 = true;
        boolean z3 = i2 > 1;
        for (qbu0 qbu0Var2 : listM43711Y0) {
            String str = qbu0Var2.f187172a;
            t2b0 t2b0Var = qbu0Var2.f187173b;
            if (wl51.m88460J0(str)) {
                z = z3;
            } else {
                z = z3;
                if (z3 || (!zContains && Long.valueOf(t2b0Var.f195112a).longValue() - jLongValue <= 0.1f)) {
                    int length = sb.length();
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(str);
                    if (wb71Var.mo81103a(sb) > (z ? (i2 + 1) * i : i)) {
                        sb.setLength(length);
                        m90119t(arrayList2, sb, arrayList);
                        sb.append(str);
                        arrayList2.add(qbu0Var2);
                    } else {
                        arrayList2.add(qbu0Var2);
                    }
                } else {
                    m90119t(arrayList2, sb, arrayList);
                    sb.append(str);
                    arrayList2.add(qbu0Var2);
                }
                jLongValue = Long.valueOf(t2b0Var.f195113b).longValue();
                zContains = h291.f86934a.contains(Character.valueOf(wl51.m88461K0(str)));
            }
            z2 = z2;
            z3 = z;
        }
        m90119t(arrayList2, sb, arrayList);
        return new srq0(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m90115l(Request request) {
        Map<String, String> headers = request.getHeaders();
        if (headers == null || !headers.containsKey("force-request") || !wj50.m88271j(headers.get("force-request"), "true")) {
            String uri = request.getUri();
            if (uri == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!bm51.m29803n0(uri, "sp://esperanto/spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider/getToken", false) && !bm51.m29803n0(uri, "sp://esperanto/spotify.authentication.login5esperanto.Login5/", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static m5p m90117p() {
        return xhi.f261579a;
    }

    /* JADX INFO: renamed from: q */
    public static uxi0 m90118q(Context context, jyi0 jyi0Var, Bundle bundle, fb80 fb80Var, dyi0 dyi0Var) {
        return new uxi0(context, jyi0Var, bundle, fb80Var, dyi0Var, UUID.randomUUID().toString(), null);
    }

    /* JADX INFO: renamed from: t */
    public static void m90119t(ArrayList arrayList, StringBuilder sb, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        String string = sb.toString();
        int i = 0;
        int length = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            qbu0 qbu0Var = (qbu0) obj;
            if (i > 0) {
                length++;
            }
            length += qbu0Var.f187172a.length();
            arrayList2.add(new rrq0(string, length, qbu0Var.f187173b));
            i = i2;
        }
        arrayList.clear();
        sb.setLength(0);
    }

    /* JADX INFO: renamed from: u */
    public static y74 m90120u(Context context, String str, String str2) {
        File dir = context.getDir("remote-config", 0);
        if (str2.length() > 0) {
            File file = new File(dir, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            dir = file;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return new y74(new File(dir, str));
    }

    /* JADX INFO: renamed from: w */
    public static wwu m90122w(String str) {
        Object next;
        wwu wwuVar;
        nzv nzvVar = viu.f241792e;
        nzvVar.getClass();
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!((viu) next).f241793a.equals(str));
        viu viuVar = (viu) next;
        return (viuVar == null || (wwuVar = viuVar.f241794b) == null) ? hou.f93607c : wwuVar;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m90123x(String str) {
        return str != null && (bm51.m29803n0(str, "publish", false) || bm51.m29803n0(str, "manage", false) || aza0.f21465c.contains(str));
    }

    /* JADX INFO: renamed from: y */
    public static List m90124y(wu21 wu21Var, int i, wu21 wu21Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iM89006u = wu21Var.m89006u(i);
        int i2 = i + iM89006u;
        int iM88992f = wu21Var.m88992f(i);
        int iM88992f2 = wu21Var.m88992f(i2);
        int i3 = iM88992f2 - iM88992f;
        boolean z5 = i >= 0 && (wu21Var.f255071b[(wu21Var.m89003r(i) * 5) + 1] & 201326592) != 0;
        wu21Var2.m89008w(iM89006u);
        wu21Var2.m89009x(i3, wu21Var2.f255089t);
        if (wu21Var.f255076g < i2) {
            wu21Var.m88964B(i2);
        }
        if (wu21Var.f255080k < iM88992f2) {
            wu21Var.m88965C(iM88992f2, i2);
        }
        int[] iArr = wu21Var2.f255071b;
        int i4 = wu21Var2.f255089t;
        int i5 = i4 * 5;
        bk5.m29627o0(i5, i * 5, i2 * 5, wu21Var.f255071b, iArr);
        Object[] objArr = wu21Var2.f255072c;
        int i6 = wu21Var2.f255078i;
        System.arraycopy(wu21Var.f255072c, iM88992f, objArr, i6, i3);
        int i7 = wu21Var2.f255091v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iM89006u;
        int iM88993g = i6 - wu21Var2.m88993g(iArr, i4);
        int i10 = wu21Var2.f255082m;
        int i11 = wu21Var2.f255081l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = wu21.m88961i(wu21Var2.m88993g(iArr, i13) + iM88993g, i12 < i13 ? 0 : wu21Var2.f255080k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        wu21Var2.f255082m = i12;
        int iM73867a = qu21.m73867a(wu21Var.f255073d, i, wu21Var.m89001p());
        int iM73867a2 = qu21.m73867a(wu21Var.f255073d, i2, wu21Var.m89001p());
        if (iM73867a < iM73867a2) {
            ArrayList arrayList = wu21Var.f255073d;
            ArrayList arrayList2 = new ArrayList(iM73867a2 - iM73867a);
            for (int i15 = iM73867a; i15 < iM73867a2; i15++) {
                rq00 rq00Var = (rq00) arrayList.get(i15);
                rq00Var.f201675a += i8;
                arrayList2.add(rq00Var);
            }
            wu21Var2.f255073d.addAll(qu21.m73867a(wu21Var2.f255073d, wu21Var2.f255089t, wu21Var2.m89001p()), arrayList2);
            arrayList.subList(iM73867a, iM73867a2).clear();
            list = arrayList2;
        } else {
            list = lau.f131415a;
        }
        if (!list.isEmpty()) {
            HashMap map = wu21Var.f255074e;
            HashMap map2 = wu21Var2.f255074e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = wu21Var2.f255091v;
        wu21Var2.m88979Q(i7);
        int iM88969G = wu21Var.m88969G(wu21Var.f255071b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM88969G >= 0;
            if (z7) {
                wu21Var.m88980R();
                wu21Var.m88987a(iM88969G - wu21Var.f255089t);
                wu21Var.m88980R();
            }
            wu21Var.m88987a(i - wu21Var.f255089t);
            boolean zM88972J = wu21Var.m88972J();
            if (z7) {
                wu21Var.m88977O();
                wu21Var.m88995j();
                wu21Var.m88977O();
                wu21Var.m88995j();
            }
            z4 = zM88972J;
        } else {
            boolean zM88973K = wu21Var.m88973K(i, iM89006u);
            wu21Var.m88974L(iM88992f, i3, i - 1);
            z4 = zM88973K;
        }
        if (z4) {
            vph.m86124a("Unexpectedly removed anchors");
        }
        int i18 = wu21Var2.f255084o;
        int i19 = iArr3[i5 + 1];
        wu21Var2.f255084o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            wu21Var2.f255089t = i9;
            wu21Var2.f255078i = i6 + i3;
        }
        if (z6) {
            wu21Var2.m88985W(i7);
        }
        return list;
    }

    @Override // p204p.fr81
    /* JADX INFO: renamed from: a */
    public req mo41482a(Context context) {
        req reqVar = new req(context);
        meq meqVar = reqVar.f198409f;
        meqVar.getClass();
        leq leqVar = new leq(meqVar);
        int iM91397f = xl81.m91397f(4);
        int iM91394c = xl81.m91394c(4);
        leqVar.f41218e = iM91397f;
        leqVar.f41219f = iM91394c;
        leqVar.f41214a = iM91397f;
        leqVar.f41215b = iM91394c;
        leqVar.f132655J = true;
        reqVar.mo33116c(new meq(leqVar));
        return reqVar;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m90126o((br50) it.next()));
        }
        return arrayList;
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

    @Override // p204p.uq7
    /* JADX INFO: renamed from: c */
    public xul0 mo37748c(Uri uri, ar7 ar7Var) {
        return C2244p5.f174033a;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        won0 won0Var;
        switch (this.f258819a) {
            case 13:
                knn0 knn0VarM56948a = knn0.m56948a(i);
                return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
            default:
                if (i == 0) {
                    won0Var = won0.RESTRICTION_REASON_UNSPECIFIED;
                } else if (i == 1) {
                    won0Var = won0.RESTRICTION_REASON_AGE_ASSURANCE;
                } else if (i == 2) {
                    won0Var = won0.RESTRICTION_REASON_EXPLICIT_CONTENT;
                } else if (i == 3) {
                    won0Var = won0.RESTRICTION_REASON_AGE_ASSURANCE_19_PLUS;
                } else if (i != 4) {
                    won0Var = i != 5 ? null : won0.RESTRICTION_REASON_OFFLINE_UNAVAILABLE_CONTENT;
                } else {
                    won0Var = won0.RESTRICTION_REASON_UNAVAILABLE_CONTENT;
                }
                return won0Var == null ? won0.UNRECOGNIZED : won0Var;
        }
    }

    @Override // p204p.p5e0
    public q5e0 create() {
        return new q5e0();
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: d */
    public Bundle mo37749d(String str, String str2, int i, String str3) {
        throw new UnsupportedOperationException("Google Assistant linking does not support access tokens");
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: e */
    public long mo35830e(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(376003163);
        if (z) {
            xq00Var.m91771i0(235604698);
            j = leu.m58815a(xq00Var).f112823a.f229876c;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(235655724);
            j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: f */
    public long mo35831f(boolean z, xq00 xq00Var) {
        long j;
        xq00Var.m91771i0(-50361251);
        if (z) {
            xq00Var.m91771i0(-1368354102);
            j = leu.m58815a(xq00Var).f112823a.f229874a.f123094b;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1368290056);
            j = leu.m58815a(xq00Var).f112823a.f229876c;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return j;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15575c((nis0) obj, Collections.singleton(res0.f198431a));
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: g */
    public Intent mo37750g(zew zewVar, String str, String str2) {
        return null;
    }

    @Override // p204p.rzu0
    public gd70 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: h */
    public long mo35832h(xq00 xq00Var) {
        xq00Var.m91771i0(1735978122);
        long j = leu.m58815a(xq00Var).f112823a.f229875b.f123093a;
        xq00Var.m91788r(false);
        return j;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: i */
    public Bundle mo37751i(String str, String str2, String str3) {
        return dq60.m36606f("extra_token", str);
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: j */
    public Intent mo37752j(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    @Override // p204p.deu0
    /* JADX INFO: renamed from: k */
    public boolean mo35833k(int i) {
        return false;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: m */
    public xul0 mo37753m(Uri uri, zew zewVar, String str) {
        return C2244p5.f174033a;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public AbstractC1961i m90126o(br50 br50Var) {
        if (br50Var instanceof tq50) {
            tq50 tq50Var = (tq50) br50Var;
            String str = tq50Var.f222713a;
            String str2 = tq50Var.f222714b;
            String str3 = tq50Var.f222715c;
            boolean z = tq50Var.f222722t;
            String str4 = tq50Var.f222718f;
            boolean z2 = tq50Var.f222719g;
            boolean z3 = tq50Var.f222721i;
            boolean z4 = tq50Var.f222720h;
            ?? r0 = tq50Var.f222712X;
            ArrayList arrayList = new ArrayList(i6f.m49804T(r0, 10));
            for (sq50 sq50Var : r0) {
                arrayList.add(new C1839f(sq50Var.f213018a, sq50Var.f213019b));
            }
            return new C1879g(str, str2, str3, str4, true, z2, z3, z4, z, arrayList, null);
        }
        if (!(br50Var instanceof fq50)) {
            if (!(br50Var instanceof jq50)) {
                throw new IllegalArgumentException(s571.m77250i(br50Var.getUri(), " is not supported"));
            }
            jq50 jq50Var = (jq50) br50Var;
            return new C1796e(jq50Var.f114791a, jq50Var.f114792b, jq50Var.f114793c, jq50Var.f114795e, true, jq50Var.f114797g, false, jq50Var.f114798h, jq50Var.f114794d, jq50Var.f114796f, jq50Var.f114799i, jq50Var.f114800t);
        }
        fq50 fq50Var = (fq50) br50Var;
        String str5 = fq50Var.f72061a;
        String str6 = fq50Var.f72062b;
        String str7 = fq50Var.f72064d;
        float f = fq50Var.f72065e;
        List list = fq50Var.f72059Y;
        String str8 = fq50Var.f72063c;
        boolean z5 = fq50Var.f72068h;
        return new C1760d(str5, str6, str8, fq50Var.f72066f, true, z5, false, false, str7, f, "", fq50Var.f72067g, fq50Var.f72069i, fq50Var.f72070t, fq50Var.f72058X, list, fq50Var.f72060Z);
    }

    /* JADX INFO: renamed from: r */
    public void m90127r() {
        Object obj = Boolean.FALSE;
        xhi.f261579a.m60867a(Boolean.valueOf(!obj.equals(obj)), "location group", "user location collection enabled");
    }

    /* JADX INFO: renamed from: s */
    public void m90128s() {
        xhi.f261579a.m60867a(Boolean.valueOf(Boolean.FALSE.equals(Boolean.TRUE)), "device id sharing group", "device id sharing enabled");
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((bzv0) ((ty80) obj).f224877f.f271279x.mo30169a(bzv0.class)) != null;
    }

    public /* synthetic */ x74(Object obj, int i) {
        this.f258819a = i;
    }

    public /* synthetic */ x74(son sonVar, otn otnVar, int i) {
        this.f258819a = i;
    }

    public /* synthetic */ x74(boolean z) {
        this.f258819a = 19;
    }
}
