package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.mobius.Next;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class zhi0 implements Predicate, cb31, w1j0, Function, ffm0, BiFunction, knx0, BiPredicate, aj5, xua, hw81, j5w0, vd50, fz61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282944a;

    /* JADX INFO: renamed from: b */
    public static final zhi0 f282935b = new zhi0(0);

    /* JADX INFO: renamed from: c */
    public static final zhi0 f282936c = new zhi0(1);

    /* JADX INFO: renamed from: d */
    public static final zhi0 f282937d = new zhi0(2);

    /* JADX INFO: renamed from: e */
    public static final zhi0 f282938e = new zhi0(3);

    /* JADX INFO: renamed from: f */
    public static final zhi0 f282939f = new zhi0(4);

    /* JADX INFO: renamed from: g */
    public static final zhi0 f282940g = new zhi0(5);

    /* JADX INFO: renamed from: h */
    public static final zhi0 f282941h = new zhi0(6);

    /* JADX INFO: renamed from: i */
    public static final zhi0 f282942i = new zhi0(7);

    /* JADX INFO: renamed from: t */
    public static final zhi0 f282943t = new zhi0(8);

    /* JADX INFO: renamed from: X */
    public static final zhi0 f282932X = new zhi0(9);

    /* JADX INFO: renamed from: Y */
    public static final zhi0 f282933Y = new zhi0(10);

    /* JADX INFO: renamed from: Z */
    public static final zhi0 f282934Z = new zhi0(11);

    /* JADX INFO: renamed from: L0 */
    public static final zhi0 f282924L0 = new zhi0(12);

    /* JADX INFO: renamed from: M0 */
    public static final zhi0 f282925M0 = new zhi0(13);

    /* JADX INFO: renamed from: N0 */
    public static final zhi0 f282926N0 = new zhi0(14);

    /* JADX INFO: renamed from: O0 */
    public static final zhi0 f282927O0 = new zhi0(15);

    /* JADX INFO: renamed from: P0 */
    public static final zhi0 f282928P0 = new zhi0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final zhi0 f282929Q0 = new zhi0(17);

    /* JADX INFO: renamed from: R0 */
    public static final zhi0 f282930R0 = new zhi0(18);

    /* JADX INFO: renamed from: S0 */
    public static final zhi0 f282931S0 = new zhi0(19);

    public /* synthetic */ zhi0(int i) {
        this.f282944a = i;
    }

    /* JADX INFO: renamed from: A */
    public static String m96136A(ood0 ood0Var) {
        qqd0 qqd0VarM67496p = ood0Var.m67496p();
        if (qqd0VarM67496p == null) {
            na6.m63957e("Controller Info is Null");
        }
        String strM73515a = qqd0VarM67496p.m73515a();
        if (strM73515a == null) {
            na6.m63957e("Calling package name is Null");
        }
        return strM73515a;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m96137B(k031 k031Var, String str, Set set) {
        ame ameVarM60163d;
        Map map = k031Var.f117870c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (wj50.m88271j((String) entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                lx21 lx21Var = (lx21) k031Var.f117871d.get(Integer.valueOf(((Number) it.next()).intValue()));
                if ((lx21Var == null || (ameVarM60163d = lx21Var.m60163d()) == null) ? false : set.contains(ameVarM60163d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m96138C(k031 k031Var, c0k c0kVar) {
        return m96156f(k031Var, c0kVar) && k031Var.f117869b.f228862j;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m96139D(k031 k031Var, Integer num) {
        Map.Entry entry;
        boolean z;
        Map map = k031Var.f117871d;
        if (k031Var.f117883p < k031Var.f117868a.f85703a) {
            if (num != null) {
                lx21 lx21Var = (lx21) map.get(Integer.valueOf(num.intValue()));
                z = !(lx21Var != null && lx21Var.m60160a());
            } else {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        entry = null;
                        break;
                    }
                    entry = (Map.Entry) it.next();
                    if (!((lx21) entry.getValue()).m60160a()) {
                        entry = null;
                    }
                } while (entry == null);
                z = (entry != null ? (Integer) entry.getKey() : null) == null;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m96140E(c0k c0kVar) {
        return c0kVar.m31178a() == 1;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m96141F(k031 k031Var, c0k c0kVar) {
        if (m96138C(k031Var, c0kVar)) {
            return k031Var.f117869b.f228864l;
        }
        Set setM89073b = c0kVar.m31182e().m89073b();
        if (setM89073b.size() == 1 && setM89073b.contains(uv11.f234312b)) {
            return true;
        }
        return wj50.m88271j(c0kVar.m31182e().m89074c() ? c0kVar.m31181d().m69352a() : Boolean.TRUE, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m96142G(c0k c0kVar) {
        Boolean boolM96146M = m96146M(c0kVar);
        if (boolM96146M != null) {
            return boolM96146M.booleanValue();
        }
        return c0kVar.m31182e().m89072a() == uv11.f234313c;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m96143I(zhi0 zhi0Var, k031 k031Var, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        Boolean bool = k031Var.f117874g;
        Boolean bool2 = Boolean.FALSE;
        return (wj50.m88271j(bool, bool2) || z) && (wj50.m88271j(k031Var.f117875h, Boolean.TRUE) || z2) && (wj50.m88271j(k031Var.f117873f.f111818a, bool2) || k031Var.f117868a.f85715m);
    }

    /* JADX INFO: renamed from: J */
    public static Next m96144J(Next next, k031 k031Var) {
        LinkedHashSet linkedHashSetM96159z = m96159z(xud.m92150q(next));
        if (m96159z(k031Var).equals(linkedHashSetM96159z)) {
            return next;
        }
        return xud.m92155v(xud.m92150q(next), s601.m77308k0(new oy21(linkedHashSetM96159z), next.mo15561b()));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x030e  */
    /* JADX INFO: renamed from: L */
    public static Next m96145L(k031 k031Var, kz21 kz21Var) {
        Next next;
        Integer numM96149Q;
        Integer numM96149Q2;
        int i = kz21Var.f128000a;
        zxc zxcVar = kz21Var.f128001b;
        String str = (String) k031Var.f117870c.get(Integer.valueOf(i));
        Next next2 = null;
        c0k c0kVar = str != null ? (c0k) k031Var.f117872e.get(str) : null;
        if (c0kVar == null) {
            return Next.m15608j();
        }
        if (zxcVar instanceof b031) {
            b031 b031Var = (b031) zxcVar;
            return m96151T(xud.m92156w(k031Var), c0kVar, b031Var.m27715q(), 3, b031Var.m27714p(), 16);
        }
        boolean z = zxcVar instanceof c031;
        uv11 uv11Var = uv11.f234313c;
        if (!z) {
            if (!(zxcVar instanceof a031)) {
                throw new NoWhenBranchMatchedException();
            }
            a031 a031Var = (a031) zxcVar;
            int iM38547C = edb.m38547C(a031Var.m24311q());
            if (iM38547C == 0) {
                return Next.m15608j();
            }
            if (iM38547C == 1) {
                return m96151T(xud.m92156w(k031Var), c0kVar, uv11.f234312b, 2, a031Var.m24310p(), 16);
            }
            if (iM38547C == 2) {
                return m96151T(xud.m92156w(k031Var), c0kVar, uv11Var, 2, a031Var.m24310p(), 16);
            }
            throw new NoWhenBranchMatchedException();
        }
        Next nextM92156w = xud.m92156w(k031Var);
        int i2 = kz21Var.f128000a;
        d850 d850VarM31070p = ((c031) zxcVar).m31070p();
        xud.m92150q(nextM92156w);
        boolean zM89074c = c0kVar.m31182e().m89074c();
        Boolean boolValueOf = Boolean.valueOf(!zM89074c);
        if (zM89074c) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            k031 k031VarM92150q = xud.m92150q(nextM92156w);
            String strM31179b = c0kVar.m31179b();
            Map map = k031VarM92150q.f117870c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (wj50.m88271j((String) entry.getValue(), strM31179b)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                lx21 lx21Var = (lx21) k031VarM92150q.f117871d.get(Integer.valueOf(((Number) obj).intValue()));
                if (lx21Var != null && lx21Var.m60161b()) {
                    arrayList.add(obj);
                }
            }
            Integer num = (Integer) g6f.m43690D0(arrayList);
            if (num != null) {
                return xud.m92155v(xud.m92150q(nextM92156w), s601.m77308k0(new xy21(num.intValue(), d850VarM31070p), nextM92156w.mo15561b()));
            }
        }
        k031 k031VarM92150q2 = xud.m92150q(nextM92156w);
        Integer numValueOf = Integer.valueOf(i2);
        zhi0 zhi0Var = f282926N0;
        boolean zM96162P = zhi0Var.m96162P(k031VarM92150q2, c0kVar, numValueOf);
        Boolean boolValueOf2 = Boolean.valueOf(zM96162P);
        if (!zM96162P) {
            boolValueOf2 = null;
        }
        if (boolValueOf2 != null) {
            lx21 lx21Var2 = (lx21) xud.m92150q(nextM92156w).f117871d.get(Integer.valueOf(i2));
            boolean z2 = lx21Var2 != null && lx21Var2.m60160a();
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            if (!z2) {
                boolValueOf3 = null;
            }
            if (boolValueOf3 != null) {
                return xud.m92155v(k031.m54893a(xud.m92150q(nextM92156w), null, null, null, null, null, null, null, false, false, 0, null, null, null, null, xud.m92150q(nextM92156w).f117883p + 1, 0, null, false, 491519), s601.m77309l0(nextM92156w.mo15561b(), s601.m77310m0(new wy21(i2, c0kVar.m31179b()), ly21.f137947a)));
            }
        }
        uv11 uv11VarM96161K = zhi0Var.m96161K(xud.m92150q(nextM92156w), c0kVar, Integer.valueOf(i2));
        if (uv11VarM96161K != null) {
            xi11 xi11Var = new xi11(nextM92156w, c0kVar, d850VarM31070p, 6);
            Object objSingleton = gbu.f78413a;
            uv11 uv11Var2 = uv11.f234311a;
            if (uv11VarM96161K == uv11Var && xud.m92150q(nextM92156w).f117869b.f228867o && m96156f(xud.m92150q(nextM92156w), c0kVar)) {
                yy21 yy21VarM96150R = m96150R(xud.m92150q(nextM92156w), c0kVar.m31179b());
                if (yy21VarM96150R != null) {
                    objSingleton = Collections.singleton(yy21VarM96150R);
                }
                next = (Next) xi11Var.invoke(uv11Var2, objSingleton);
            } else {
                next = (Next) xi11Var.invoke(uv11VarM96161K, objSingleton);
            }
            Next nextM96147N = m96147N(m96157n(next, new fz21(c0kVar.m31179b())), new fz21(c0kVar.m31179b()), 500L);
            if (xud.m92150q(nextM96147N).f117868a.f85714l > 0) {
                nextM96147N = m96147N(m96157n(nextM96147N, new uz21(c0kVar.m31179b())), new uz21(c0kVar.m31179b()), xud.m92150q(nextM96147N).f117868a.f85714l);
            }
            if (!m96143I(zhi0Var, xud.m92150q(nextM96147N), 7) && m96143I(zhi0Var, xud.m92150q(nextM96147N), 6) && c0kVar.m31182e().m89073b().contains(uv11Var) && xud.m92150q(nextM96147N).f117884q < xud.m92150q(nextM96147N).f117868a.f85704b && zhi0Var.m96164X(xud.m92150q(nextM96147N), c0kVar) == uv11Var2 && (numM96149Q2 = m96149Q(xud.m92150q(nextM96147N))) != null) {
                nextM96147N = xud.m92155v(k031.m54893a(xud.m92150q(nextM96147N), null, null, null, null, null, null, null, false, false, 0, null, null, null, null, 0, xud.m92150q(nextM96147N).f117884q + 1, null, false, 458751), s601.m77309l0(nextM96147N.mo15561b(), s601.m77310m0(new yy21(numM96149Q2.intValue(), c0kVar.m31179b(), 4), my21.f148298a)));
            }
            if (xud.m92150q(nextM96147N).f117886s) {
                Set setMo15561b = nextM96147N.mo15561b();
                if ((setMo15561b instanceof Collection) && setMo15561b.isEmpty()) {
                    numM96149Q = m96149Q(xud.m92150q(nextM96147N));
                    if (numM96149Q != null) {
                        nextM96147N = xud.m92155v(xud.m92150q(nextM96147N), s601.m77308k0(new zy21(numM96149Q.intValue(), c0kVar.m31179b()), nextM96147N.mo15561b()));
                    }
                } else {
                    Iterator it = setMo15561b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            bz21 bz21Var = (bz21) it.next();
                            if ((bz21Var instanceof yy21) || (bz21Var instanceof wy21) || (bz21Var instanceof xy21)) {
                            }
                        } else {
                            numM96149Q = m96149Q(xud.m92150q(nextM96147N));
                            if (numM96149Q != null) {
                                nextM96147N = xud.m92155v(xud.m92150q(nextM96147N), s601.m77308k0(new zy21(numM96149Q.intValue(), c0kVar.m31179b()), nextM96147N.mo15561b()));
                            }
                        }
                    }
                }
            }
            next2 = nextM96147N;
        }
        return next2 == null ? nextM92156w : next2;
    }

    /* JADX INFO: renamed from: M */
    public static Boolean m96146M(c0k c0kVar) {
        if (c0kVar.m31182e().m89074c()) {
            return c0kVar.m31181d().m69353b();
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static Next m96147N(Next next, yz21 yz21Var, long j) {
        return xud.m92155v(k031.m54893a(xud.m92150q(next), null, null, null, null, null, null, null, false, false, xud.m92150q(next).f117878k + 1, null, null, null, null, 0, 0, null, false, 523263), s601.m77308k0(new ry21(new o031(xud.m92150q(next).f117878k, yz21Var), j), next.mo15561b()));
    }

    /* JADX INFO: renamed from: O */
    public static Next m96148O(Next next) {
        xt80 xt80VarM31180c;
        Set set = xud.m92150q(next).f117882o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            c0k c0kVar = (c0k) xud.m92150q(next).f117872e.get((String) obj);
            if (c0kVar != null && (xt80VarM31180c = c0kVar.m31180c()) != null && xt80VarM31180c.m92009a()) {
                arrayList.add(obj);
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        if (setM43736n1.isEmpty()) {
            return next;
        }
        Set set2 = setM43736n1;
        k031 k031VarM54893a = k031.m54893a(xud.m92150q(next), null, null, null, null, null, null, null, false, false, 0, null, null, null, s601.m77305h0(xud.m92150q(next).f117882o, set2), 0, 0, null, false, 507903);
        Set setM43734m1 = g6f.m43734m1(next.mo15561b());
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ty21((String) it.next()));
        }
        setM43734m1.addAll(arrayList2);
        return xud.m92155v(k031VarM54893a, g6f.m43736n1(setM43734m1));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[RETURN] */
    /* JADX INFO: renamed from: Q */
    public static Integer m96149Q(k031 k031Var) {
        for (Map.Entry entry : k031Var.f117871d.entrySet()) {
            if (!((lx21) entry.getValue()).m60162c()) {
                entry = null;
            }
            if (entry != null) {
                if (entry != null) {
                    return (Integer) entry.getKey();
                }
                return null;
            }
        }
        entry = null;
        if (entry != null) {
            return (Integer) entry.getKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static yy21 m96150R(k031 k031Var, String str) {
        Integer numM96149Q = m96149Q(k031Var);
        yy21 yy21Var = null;
        if (numM96149Q != null) {
            if (!k031Var.f117868a.f85717o) {
                numM96149Q = null;
            }
            if (numM96149Q != null) {
                yy21Var = new yy21(numM96149Q.intValue(), str, wj50.m88271j(k031Var.f117873f.f111819b, Boolean.TRUE) ? 3 : 2);
            }
        }
        return yy21Var;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Next m96151T(Next next, c0k c0kVar, uv11 uv11Var, int i, d850 d850Var, int i2) {
        if ((i2 & 8) != 0) {
            d850Var = null;
        }
        return f282926N0.m96163S(next, c0kVar, uv11Var, i, d850Var, null);
    }

    /* JADX INFO: renamed from: U */
    public static int m96152U(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0 || iM38547C == 1 || iM38547C == 2) {
            return 1;
        }
        if (iM38547C == 4) {
            return 2;
        }
        if (iM38547C != 5) {
            return iM38547C != 6 ? 6 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: V */
    public static Set m96153V(k031 k031Var, c0k c0kVar, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (k031Var.f117876i || k031Var.f117868a.f85713k) {
            if ((m96140E(c0kVar) || c0kVar.m31178a() == 2) && m96138C(k031Var, c0kVar)) {
                linkedHashSet.add(new vy21(z, false));
            }
        } else if (m96138C(k031Var, c0kVar) && (m96140E(c0kVar) || c0kVar.m31178a() == 2)) {
            linkedHashSet.add(new vy21(z, false));
        }
        return g6f.m43736n1(linkedHashSet);
    }

    /* JADX INFO: renamed from: W */
    public static Set m96154W(k031 k031Var, c0k c0kVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (k031Var.f117876i || k031Var.f117868a.f85712j) {
            if ((m96140E(c0kVar) || c0kVar.m31178a() == 2) && m96138C(k031Var, c0kVar)) {
                linkedHashSet.add(new vy21(true, true));
            }
        } else if (m96138C(k031Var, c0kVar) && (m96140E(c0kVar) || c0kVar.m31178a() == 2)) {
            linkedHashSet.add(new vy21(true, true));
        }
        return g6f.m43736n1(linkedHashSet);
    }

    /* JADX INFO: renamed from: b */
    public static uv11 m96155b(k031 k031Var, c0k c0kVar) {
        if (m96138C(k031Var, c0kVar) ? k031Var.f117869b.f228865m : m96142G(c0kVar)) {
            return uv11.f234313c;
        }
        return m96141F(k031Var, c0kVar) ? uv11.f234312b : uv11.f234311a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m96156f(k031 k031Var, c0k c0kVar) {
        if (wj50.m88271j(k031Var.f117869b.f228853a, c0kVar.m31179b())) {
            return true;
        }
        if (c0kVar.m31178a() == 2) {
            c0k c0kVar2 = (c0k) k031Var.f117872e.get(k031Var.f117869b.f228853a);
            if ((c0kVar2 != null ? c0kVar2.m31178a() : 0) == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static Next m96157n(Next next, yz21 yz21Var) {
        k031 k031VarM92150q = xud.m92150q(next);
        List list = xud.m92150q(next).f117879l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            l031 l031Var = (l031) obj;
            if (l031Var.m57784b() == null || !wj50.m88271j(l031Var.m57784b().m65974a(), yz21Var)) {
                arrayList.add(obj);
            }
        }
        return xud.m92155v(k031.m54893a(k031VarM92150q, null, null, null, null, null, null, null, false, false, 0, arrayList, null, null, null, 0, 0, null, false, 522239), next.mo15561b());
    }

    /* JADX INFO: renamed from: o */
    public static Next m96158o(Next next) {
        Map map = xud.m92150q(next).f117881n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            uv11 uv11VarM58847d = ((lf61) entry.getValue()).m58847d();
            boolean z = xud.m92150q(next).f117868a.f85716n;
            uv11 uv11VarM96165Y = uv11.f234314d;
            if (z) {
                k031 k031VarM92150q = xud.m92150q(next);
                c0k c0kVar = (c0k) k031VarM92150q.f117872e.get(str);
                if (c0kVar != null) {
                    uv11VarM96165Y = m96155b(k031VarM92150q, c0kVar);
                }
            } else {
                k031 k031VarM92150q2 = xud.m92150q(next);
                c0k c0kVar2 = (c0k) k031VarM92150q2.f117872e.get(str);
                if (c0kVar2 != null) {
                    uv11VarM96165Y = f282926N0.m96165Y(k031VarM92150q2, c0kVar2);
                }
            }
            if (uv11VarM58847d == uv11VarM96165Y) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return next;
        }
        k031 k031VarM92150q3 = xud.m92150q(next);
        Map map2 = xud.m92150q(next).f117881n;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (!linkedHashMap.containsKey((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        k031 k031VarM54893a = k031.m54893a(k031VarM92150q3, null, null, null, null, null, null, null, false, false, 0, null, null, linkedHashMap2, null, 0, 0, null, false, 516095);
        Set setM43734m1 = g6f.m43734m1(next.mo15561b());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str2 = (String) entry3.getKey();
            lf61 lf61Var = (lf61) entry3.getValue();
            uv11 uv11VarM58847d2 = lf61Var.m58847d();
            uv11 uv11Var = uv11.f234313c;
            if (uv11VarM58847d2 == uv11Var || lf61Var.m58844a() == uv11Var) {
                boolean z2 = lf61Var.m58847d() == uv11Var;
                k031 k031VarM92150q4 = xud.m92150q(next);
                c0k c0kVar3 = (c0k) k031VarM92150q4.f117872e.get(str2);
                setM43734m1.add(new ny21(z2, true, str2, lau.f131415a, c0kVar3 != null ? m96138C(k031VarM92150q4, c0kVar3) : false ? k031VarM92150q4.f117876i ? 2 : 3 : 1, m96152U(lf61Var.m58846c()), lf61Var.m58845b()));
            }
        }
        Next nextM92155v = xud.m92155v(k031VarM54893a, g6f.m43736n1(setM43734m1));
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            nextM92155v = m96157n(nextM92155v, new xz21((String) it.next()));
        }
        return nextM92155v;
    }

    /* JADX INFO: renamed from: z */
    public static LinkedHashSet m96159z(k031 k031Var) {
        Set setM43736n1 = g6f.m43736n1(k031Var.f117870c.values());
        String str = k031Var.f117869b.f228853a;
        if (str.length() <= 0) {
            str = null;
        }
        return s601.m77309l0(s601.m77309l0(s601.m77309l0(s601.m77309l0(setM43736n1, s601.m77311n0(str)), k031Var.f117880m.keySet()), k031Var.f117881n.keySet()), k031Var.f117882o);
    }

    /* JADX INFO: renamed from: H */
    public boolean m96160H(k031 k031Var, c0k c0kVar) {
        if (m96143I(this, k031Var, 7) && c0kVar.m31182e().m89073b().contains(uv11.f234313c)) {
            return (m96156f(k031Var, c0kVar) && k031Var.f117869b.f228868p) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public uv11 m96161K(k031 k031Var, c0k c0kVar, Integer num) {
        int iOrdinal = m96164X(k031Var, c0kVar).ordinal();
        uv11 uv11Var = uv11.f234312b;
        if (iOrdinal == 0) {
            return uv11Var;
        }
        uv11 uv11Var2 = uv11.f234311a;
        if (iOrdinal == 1) {
            zhi0 zhi0Var = f282926N0;
            if (zhi0Var.m96160H(k031Var, c0kVar)) {
                boolean zM96160H = zhi0Var.m96160H(k031Var, c0kVar);
                uv11 uv11Var3 = uv11.f234313c;
                if (!zM96160H || m96139D(k031Var, num) || zhi0Var.m96164X(k031Var, c0kVar) == uv11Var2 || !c0kVar.m31182e().m89073b().containsAll(s601.m77310m0(uv11Var2, uv11Var, uv11Var3))) {
                    return uv11Var3;
                }
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return uv11Var2;
    }

    /* JADX INFO: renamed from: P */
    public boolean m96162P(k031 k031Var, c0k c0kVar, Integer num) {
        if (!m96160H(k031Var, c0kVar) || m96139D(k031Var, num)) {
            return false;
        }
        uv11 uv11VarM96164X = m96164X(k031Var, c0kVar);
        uv11 uv11Var = uv11.f234311a;
        return uv11VarM96164X == uv11Var && c0kVar.m31182e().m89073b().containsAll(s601.m77310m0(uv11Var, uv11.f234312b, uv11.f234313c));
    }

    /* JADX INFO: renamed from: S */
    public Next m96163S(Next next, c0k c0kVar, uv11 uv11Var, int i, d850 d850Var, uv11 uv11Var2) {
        boolean zContains;
        uv11 uv11VarM96155b = uv11Var2 == null ? m96155b(xud.m92150q(next), c0kVar) : uv11Var2;
        if (uv11VarM96155b != uv11.f234314d && uv11Var != uv11VarM96155b) {
            k031 k031VarM92150q = xud.m92150q(next);
            int iOrdinal = uv11Var.ordinal();
            uv11 uv11Var3 = uv11.f234311a;
            uv11 uv11Var4 = uv11.f234312b;
            if (iOrdinal == 0) {
                zContains = c0kVar.m31182e().m89073b().contains(uv11Var3);
            } else if (iOrdinal != 1) {
                zContains = iOrdinal != 2 ? false : m96160H(k031VarM92150q, c0kVar);
            } else {
                zContains = c0kVar.m31182e().m89073b().contains(uv11Var4);
            }
            if (zContains) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                long j = xud.m92150q(next).f117876i ? xud.m92150q(next).f117868a.f85705c : xud.m92150q(next).f117868a.f85706d;
                Set setM43734m1 = g6f.m43734m1(next.mo15561b());
                boolean zM89074c = c0kVar.m31182e().m89074c();
                uv11 uv11Var5 = uv11.f234313c;
                if (zM89074c && i != 5) {
                    setM43734m1.add(new py21(c0kVar.m31179b(), uv11Var != uv11Var3, uv11Var == uv11Var5, !m96138C(xud.m92150q(next), c0kVar), (!xud.m92150q(next).f117868a.f85715m && xud.m92150q(next).f117868a.f85711i && wj50.m88271j(xud.m92150q(next).f117873f.f111818a, Boolean.TRUE)) ? false : true));
                }
                if (uv11VarM96155b == uv11Var5) {
                    setM43734m1.addAll(m96153V(xud.m92150q(next), c0kVar, uv11Var == uv11Var4));
                }
                if (uv11Var == uv11Var5) {
                    setM43734m1.addAll(m96154W(xud.m92150q(next), c0kVar));
                    if (!xud.m92150q(next).f117868a.f85710h && (!m96138C(xud.m92150q(next), c0kVar) || xud.m92150q(next).f117876i)) {
                        linkedHashSet.add(c0kVar.m31179b());
                    }
                }
                if (uv11Var != uv11Var5 && uv11VarM96155b != uv11Var5 && m96138C(xud.m92150q(next), c0kVar)) {
                    setM43734m1.add(new vy21(uv11Var == uv11Var4, false));
                }
                return m96148O(m96147N(m96157n(xud.m92155v(k031.m54893a(xud.m92150q(next), null, null, null, null, null, null, null, false, false, 0, null, null, kkc0.m56701n0(xud.m92150q(next).f117881n, pft0.m69840u(c0kVar.m31179b(), new lf61(uv11Var, uv11VarM96155b, i, d850Var))), s601.m77309l0(xud.m92150q(next).f117882o, linkedHashSet), 0, 0, null, false, 499711), g6f.m43736n1(setM43734m1)), new xz21(c0kVar.m31179b())), new xz21(c0kVar.m31179b()), j));
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: X */
    public uv11 m96164X(k031 k031Var, c0k c0kVar) {
        lf61 lf61Var = (lf61) k031Var.f117880m.get(c0kVar.m31179b());
        uv11 uv11VarM58847d = lf61Var != null ? lf61Var.m58847d() : null;
        lf61 lf61Var2 = (lf61) k031Var.f117881n.get(c0kVar.m31179b());
        uv11 uv11VarM58847d2 = lf61Var2 != null ? lf61Var2.m58847d() : null;
        if (uv11VarM58847d == null) {
            return uv11VarM58847d2 == null ? m96165Y(k031Var, c0kVar) : uv11VarM58847d2;
        }
        return uv11VarM58847d;
    }

    /* JADX INFO: renamed from: Y */
    public uv11 m96165Y(k031 k031Var, c0k c0kVar) {
        Boolean bool = k031Var.f117875h;
        ubp0 ubp0Var = k031Var.f117869b;
        boolean zM88271j = wj50.m88271j(bool, Boolean.FALSE);
        uv11 uv11Var = uv11.f234313c;
        boolean zM96142G = false;
        if (!zM88271j) {
            if (m96138C(k031Var, c0kVar) && m96143I(this, k031Var, 5) && c0kVar.m31182e().m89073b().contains(uv11Var) && (!m96156f(k031Var, c0kVar) || !ubp0Var.f228868p)) {
                zM96142G = ubp0Var.f228865m;
            } else if (m96160H(k031Var, c0kVar)) {
                zM96142G = m96142G(c0kVar);
            }
        }
        if (zM96142G) {
            return uv11Var;
        }
        return m96141F(k031Var, c0kVar) ? uv11.f234312b : uv11.f234311a;
    }

    @Override // p204p.xua
    /* JADX INFO: renamed from: a */
    public byte[] mo52874a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f282944a) {
            case 5:
                return (Boolean) obj2;
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: c */
    public vh00 mo52484c() {
        return qhj.f188788b;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        slw slwVarM78506a = slw.m78506a(i);
        return slwVarM78506a == null ? slw.UNRECOGNIZED : slwVarM78506a;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: d */
    public oq91 mo52485d(String str) {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: e */
    public oq91 mo52486e(String str) {
        return null;
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        switch (this.f282944a) {
            case 2:
                return new s1j0(null, n4k0.class);
            default:
                String str = e301Var.f55571a;
                gn80 gn80Var = dme1.f50503a;
                tme1 tme1Var = new tme1();
                Bundle bundle = new Bundle();
                bundle.putString("username", str);
                tme1Var.m49706b1(bundle);
                return tm4.m81099w(tme1Var);
        }
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: h */
    public av91 mo52487h(pv91 pv91Var, tu41 tu41Var, String str) {
        return ((dhg0) pv91Var).m36041h(str);
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        String dataString = intent.getDataString();
        wj50.m88279p(dataString);
        String strM29801l0 = bm51.m29801l0(bm51.m29801l0(dataString, "https://www.spotify.com/", "https://open.spotify.com/"), "https://spotify.com/", "https://open.spotify.com/");
        Intent intent2 = new Intent(intent);
        intent2.setData(Uri.parse(strM29801l0));
        return intent2;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: k */
    public oq91 mo52488k(String str) {
        return null;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: m */
    public oq91 mo52490m(String str) {
        return null;
    }

    @Override // p204p.cb31
    /* JADX INFO: renamed from: p */
    public boolean mo32148p(Object obj, Object obj2) {
        return false;
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: q */
    public oq91 mo52491q(String str) {
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f282944a) {
            case 0:
                return ((yhi0) obj) != yhi0.f272909a;
            case 10:
                return ((PlayerError) obj).error() != ErrorType.SUCCESS;
            case 11:
                return !((Map) obj).isEmpty();
            default:
                return ((gv31) obj).f84603b == 1;
        }
    }

    public String toString() {
        switch (this.f282944a) {
            case 1:
                return "NeverEqualPolicy";
            case 21:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }

    @Override // p204p.aj5
    /* JADX INFO: renamed from: u */
    public void mo26143u(yqq yqqVar, int i, int[] iArr, int[] iArr2) {
        bj5.m29365b(iArr, iArr2, false);
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: v */
    public oq91 mo52495v() {
        return null;
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        return lba0.m58639q6(bz61Var);
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: x */
    public av91 mo52496x(pv91 pv91Var, tu41 tu41Var, String str) {
        return ((dhg0) pv91Var).m36040g();
    }

    @Override // p204p.j5w0
    /* JADX INFO: renamed from: y */
    public oq91 mo52497y(String str) {
        return null;
    }

    public zhi0(fcr fcrVar) {
        this.f282944a = 25;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f282944a) {
            case 3:
                return qfc1.m72698h(((iyk0) obj).m51939a().m89373a());
            case 6:
                return C2244p5.f174033a;
            case 7:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsPrefs$PrefValues.m19514q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 8:
                return ((GetValuesResponse) obj).m7522o();
            case 12:
                return w2a1.f247311a;
            case 15:
                return ((e301) obj).f55571a;
            default:
                return Boolean.valueOf(gwg1.m45948t((String) ((Map) obj).get("filter-age-restricted-content"), false));
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        xul0 xul0Var = (xul0) obj;
        xul0 xul0Var2 = (xul0) obj2;
        api apiVar = (api) xul0Var.mo49283h();
        String strMo26689e = apiVar != null ? apiVar.mo26689e() : null;
        api apiVar2 = (api) xul0Var2.mo49283h();
        if (!wj50.m88271j(strMo26689e, apiVar2 != null ? apiVar2.mo26689e() : null)) {
            return false;
        }
        api apiVar3 = (api) xul0Var.mo49283h();
        Boolean boolValueOf = apiVar3 != null ? Boolean.valueOf(apiVar3.mo26685G()) : null;
        api apiVar4 = (api) xul0Var2.mo49283h();
        if (!wj50.m88271j(boolValueOf, apiVar4 != null ? Boolean.valueOf(apiVar4.mo26685G()) : null)) {
            return false;
        }
        api apiVar5 = (api) xul0Var.mo49283h();
        Integer numValueOf = apiVar5 != null ? Integer.valueOf(apiVar5.mo26680B()) : null;
        api apiVar6 = (api) xul0Var2.mo49283h();
        return wj50.m88271j(numValueOf, apiVar6 != null ? Integer.valueOf(apiVar6.mo26680B()) : null);
    }
}
