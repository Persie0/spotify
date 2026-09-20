package p204p;

import android.view.View;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncResponse;
import com.spotify.mobius.Next;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class mkr0 implements Function, Predicate, Producer, BiFunction, com.spotify.mobius.functions.Function, InterfaceC1667ah, oec1, ojn0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144664a;

    /* JADX INFO: renamed from: b */
    public static final mkr0 f144655b = new mkr0(0);

    /* JADX INFO: renamed from: c */
    public static final mkr0 f144656c = new mkr0(1);

    /* JADX INFO: renamed from: d */
    public static final mkr0 f144657d = new mkr0(2);

    /* JADX INFO: renamed from: e */
    public static final mkr0 f144658e = new mkr0(3);

    /* JADX INFO: renamed from: f */
    public static final mkr0 f144659f = new mkr0(4);

    /* JADX INFO: renamed from: g */
    public static final mkr0 f144660g = new mkr0(5);

    /* JADX INFO: renamed from: h */
    public static final mkr0 f144661h = new mkr0(6);

    /* JADX INFO: renamed from: i */
    public static final mkr0 f144662i = new mkr0(9);

    /* JADX INFO: renamed from: t */
    public static final mkr0 f144663t = new mkr0(10);

    /* JADX INFO: renamed from: X */
    public static final mkr0 f144650X = new mkr0(11);

    /* JADX INFO: renamed from: Y */
    public static final mkr0 f144652Y = new mkr0(12);

    /* JADX INFO: renamed from: Z */
    public static final mkr0 f144654Z = new mkr0(13);

    /* JADX INFO: renamed from: L0 */
    public static final mkr0 f144638L0 = new mkr0(14);

    /* JADX INFO: renamed from: M0 */
    public static final mkr0 f144639M0 = new mkr0(15);

    /* JADX INFO: renamed from: N0 */
    public static final mkr0 f144640N0 = new mkr0(16);

    /* JADX INFO: renamed from: O0 */
    public static final mkr0 f144641O0 = new mkr0(17);

    /* JADX INFO: renamed from: P0 */
    public static final mkr0 f144642P0 = new mkr0(18);

    /* JADX INFO: renamed from: Q0 */
    public static final mkr0 f144643Q0 = new mkr0(20);

    /* JADX INFO: renamed from: R0 */
    public static final mkr0 f144644R0 = new mkr0(21);

    /* JADX INFO: renamed from: S0 */
    public static final mkr0 f144645S0 = new mkr0(22);

    /* JADX INFO: renamed from: T0 */
    public static final mkr0 f144646T0 = new mkr0(23);

    /* JADX INFO: renamed from: U0 */
    public static final mkr0 f144647U0 = new mkr0(24);

    /* JADX INFO: renamed from: V0 */
    public static final mkr0 f144648V0 = new mkr0(25);

    /* JADX INFO: renamed from: W0 */
    public static final /* synthetic */ mkr0 f144649W0 = new mkr0(26);

    /* JADX INFO: renamed from: X0 */
    public static final mkr0 f144651X0 = new mkr0(27);

    /* JADX INFO: renamed from: Y0 */
    public static final mkr0 f144653Y0 = new mkr0(28);

    public /* synthetic */ mkr0(int i) {
        this.f144664a = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m62178a(s6y0 s6y0Var) {
        u6y0 u6y0Var = s6y0Var.f206237r;
        List list = s6y0Var.f206235p;
        if (u6y0Var != u6y0.CONFIRM_CHANGES) {
            return false;
        }
        if (!list.contains(u6y0.SET_DISPLAY_NAME) || wj50.m88271j(s6y0Var.f206224e, s6y0Var.f206228i)) {
            return ((list.contains(u6y0.SET_IMAGE) || list.contains(u6y0.REMOVE_IMAGE)) && wj50.m88271j(s6y0Var.f206225f, s6y0Var.f206227h)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static arx0 m62179c(br50 br50Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bep0 bep0Var) {
        if (br50Var instanceof qq50) {
            return new qqx0((qq50) br50Var);
        }
        boolean z7 = false;
        if (br50Var instanceof cq50) {
            cq50 cq50Var = (cq50) br50Var;
            boolean z8 = cq50Var.f40739d;
            if (z3 && cq50Var.f40740e) {
                z7 = true;
            }
            return new vpx0(cq50Var, z7, z8);
        }
        if (br50Var instanceof lq50) {
            return new hqx0((lq50) br50Var);
        }
        if (br50Var instanceof dq50) {
            dq50 dq50Var = (dq50) br50Var;
            return new wpx0(dq50Var, dq50Var.f51824d);
        }
        if (br50Var instanceof tq50) {
            tq50 tq50Var = (tq50) br50Var;
            boolean z9 = tq50Var.f222722t;
            boolean z10 = tq50Var.f222719g;
            return new vqx0(tq50Var, ((z5 && tq50Var.f222720h) || (z4 && z10) || z9) ? false : true, z2, z3 && tq50Var.f222721i, (z6 && z10) || z9, m62183g(bep0Var, tq50Var.f222718f), z ? 1 : 2);
        }
        if (!(br50Var instanceof jq50)) {
            if (!(br50Var instanceof fq50)) {
                throw new NoWhenBranchMatchedException();
            }
            fq50 fq50Var = (fq50) br50Var;
            return new xpx0(fq50Var, (z4 && fq50Var.f72068h) ? false : true, m62183g(bep0Var, fq50Var.f72066f), z ? 1 : 2);
        }
        jq50 jq50Var = (jq50) br50Var;
        int i = z ? 1 : 2;
        mqx0 mqx0VarM62183g = m62183g(bep0Var, jq50Var.f114795e);
        if ((!z5 || !jq50Var.f114798h) && (!z4 || !jq50Var.f114797g)) {
            z7 = true;
        }
        return new aqx0(jq50Var, z7, mqx0VarM62183g, i);
    }

    /* JADX INFO: renamed from: d */
    public static Next m62180d(s6y0 s6y0Var, Set set) {
        u6y0 u6y0Var;
        Collection collectionSingleton;
        s6y0 s6y0VarM77350a = s6y0Var;
        Set setM43734m1 = g6f.m43734m1(set);
        u6y0 u6y0Var2 = s6y0VarM77350a.f206237r;
        List listM43701O0 = s6y0VarM77350a.f206236q;
        String str = s6y0VarM77350a.f206222c;
        u6y0 u6y0Var3 = u6y0.NOTHING;
        if (u6y0Var2 != u6y0Var3) {
            listM43701O0 = g6f.m43701O0(u6y0Var2, listM43701O0);
        }
        List list = listM43701O0;
        List list2 = s6y0VarM77350a.f206235p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!list.contains((u6y0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            s6y0VarM77350a = s6y0.m77350a(s6y0VarM77350a, 1, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862);
            u6y0Var = u6y0Var3;
        } else {
            u6y0 u6y0Var4 = (u6y0) arrayList.get(0);
            switch (u6y0Var4.ordinal()) {
                case 0:
                    collectionSingleton = Collections.singleton(n5y0.f150639d);
                    break;
                case 1:
                    collectionSingleton = Collections.singleton(new m5y0(str, false));
                    break;
                case 2:
                    collectionSingleton = Collections.singleton(new u5y0(s6y0VarM77350a.f206229j));
                    break;
                case 3:
                    collectionSingleton = Collections.singleton(new q5y0(str, s6y0VarM77350a.f206223d));
                    break;
                case 4:
                    Integer num = s6y0VarM77350a.f206230k;
                    wj50.m88279p(num);
                    collectionSingleton = Collections.singleton(new s5y0(str, num.intValue()));
                    break;
                case 5:
                    String str2 = s6y0VarM77350a.f206231l;
                    wj50.m88279p(str2);
                    collectionSingleton = Collections.singleton(new r5y0(str, str2));
                    break;
                case 6:
                    collectionSingleton = Collections.singleton(new o5y0(str));
                    break;
                case 7:
                    collectionSingleton = Collections.singleton(new p5y0(str, s6y0VarM77350a.f206228i));
                    break;
                case 8:
                    collectionSingleton = Collections.singleton(new t5y0(str, s6y0VarM77350a.f206232m, s6y0VarM77350a.f206233n, s6y0VarM77350a.f206234o));
                    break;
                case 9:
                    collectionSingleton = bk5.m29624m1(new nsf1[]{new m5y0(str, true), new l5y0(true)});
                    break;
                case 10:
                    collectionSingleton = gbu.f78413a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            setM43734m1.addAll(collectionSingleton);
            u6y0Var = u6y0Var4;
        }
        return Next.m15607i(m62184h(s6y0.m77350a(s6y0VarM77350a, 0, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, u6y0Var, 16777215), 0.0f), setM43734m1);
    }

    /* JADX INFO: renamed from: e */
    public static bdb1 m62181e(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        int iHashCode = upperCase.hashCode();
        bdb1 bdb1Var = bdb1.f26073c;
        if (iHashCode == -1402997159) {
            upperCase.equals("VERIFICATION_NEEDED");
            return bdb1Var;
        }
        if (iHashCode != -1211756856) {
            if (iHashCode == 175259132 && upperCase.equals("INELIGIBLE")) {
                return bdb1.f26072b;
            }
        } else if (upperCase.equals("VERIFIED")) {
            return bdb1.f26071a;
        }
        return bdb1Var;
    }

    /* JADX INFO: renamed from: f */
    public static List m62182f(List list, List list2, Random random) {
        hd81 hd81Var;
        qqm0 qqm0Var;
        if (list == null && list2 == null) {
            return lau.f131415a;
        }
        boolean z = (list == null || list2 == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new qqm0((hd81) it.next(), md81.f142347a));
            }
            arrayList.addAll(arrayList2);
        }
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new qqm0((hd81) it2.next(), md81.f142348b));
            }
            arrayList.addAll(arrayList3);
        }
        Iterator it3 = arrayList.iterator();
        float fM35057b = 0.0f;
        while (it3.hasNext()) {
            fM35057b += d67.m35057b((qqm0) it3.next(), z);
        }
        ArrayList arrayList4 = new ArrayList();
        while (!arrayList.isEmpty()) {
            float fNextFloat = random.nextFloat() * fM35057b;
            Iterator it4 = arrayList.iterator();
            float fM35057b2 = 0.0f;
            while (true) {
                hd81Var = null;
                if (!it4.hasNext()) {
                    qqm0Var = null;
                    break;
                }
                qqm0Var = (qqm0) it4.next();
                if (d67.m35057b(qqm0Var, z) + fM35057b2 >= fNextFloat) {
                    break;
                }
                fM35057b2 += d67.m35057b(qqm0Var, z);
            }
            zn91.m96557j(arrayList).remove(qqm0Var);
            fM35057b -= d67.m35057b(qqm0Var, z);
            if (qqm0Var != null) {
                hd81Var = (hd81) qqm0Var.f191620a;
            }
            wj50.m88279p(hd81Var);
            arrayList4.add(hd81Var);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: g */
    public static mqx0 m62183g(bep0 bep0Var, String str) {
        if (str.length() == 0) {
            return jqx0.f115019a;
        }
        boolean z = bep0Var instanceof tdp0;
        kqx0 kqx0Var = kqx0.f125472a;
        if (z) {
            tdp0 tdp0Var = (tdp0) bep0Var;
            if (str.equals(tdp0Var.f219447a)) {
                return new lqx0(tdp0Var.f219448b, 0.0f);
            }
        } else if (bep0Var instanceof aep0) {
            aep0 aep0Var = (aep0) bep0Var;
            if (wj50.m88271j(aep0Var.f14934a, str)) {
                return new lqx0(aep0Var.f14935b, aep0Var.f14936c);
            }
        } else if (!(bep0Var instanceof xdp0) && (bep0Var instanceof udp0) && wj50.m88271j(((udp0) bep0Var).f229291a, str)) {
            return iqx0.f104864a;
        }
        return kqx0Var;
    }

    /* JADX INFO: renamed from: h */
    public static s6y0 m62184h(s6y0 s6y0Var, float f) {
        List list = s6y0Var.f206235p;
        Iterator it = s6y0Var.f206236q.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((u6y0) it.next()).f227461a;
        }
        float f2 = i2;
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 += ((u6y0) it2.next()).f227461a;
        }
        float f3 = f2 / i3;
        u6y0 u6y0Var = s6y0Var.f206237r;
        if (u6y0Var != u6y0.NOTHING) {
            float f4 = u6y0Var.f227461a;
            Iterator it3 = s6y0Var.f206235p.iterator();
            while (it3.hasNext()) {
                i += ((u6y0) it3.next()).f227461a;
            }
            f3 += (f4 / i) * f;
        }
        return s6y0.m77350a(s6y0Var, 0, f3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108861);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f144664a) {
            case 10:
                return h6f.m46715L((List) obj, (List) obj2);
            default:
                return new qle1(((Boolean) obj).booleanValue(), (ple1) obj2);
        }
    }

    @Override // p204p.oec1
    /* JADX INFO: renamed from: b */
    public eh00 mo41931b(AbstractC2441u6 abstractC2441u6) {
        if (!abstractC2441u6.isAttachedToWindow()) {
            rlv0 rlv0Var = new rlv0();
            rrp rrpVar = new rrp(14, abstractC2441u6, rlv0Var);
            abstractC2441u6.addOnAttachStateChangeListener(rrpVar);
            rlv0Var.f200373a = new gnb1(15, abstractC2441u6, rrpVar);
            return new ijq(rlv0Var, 6);
        }
        hc80 hc80VarM40067h = eug1.m40067h(abstractC2441u6);
        if (hc80VarM40067h != null) {
            return krg1.m57161e(abstractC2441u6, hc80VarM40067h.getLifecycle());
        }
        mt40.m62792d("View tree for " + abstractC2441u6 + " has no ViewTreeLifecycleOwner");
        throw new KotlinNothingValueException();
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }

    @Override // p204p.ojn0
    /* JADX INFO: renamed from: i */
    public Object mo24963i(d7x0 d7x0Var) {
        return ((d5g1) d7x0Var).f45437b;
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        view.performClick();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f144664a) {
            case 1:
                String str = ((e301) obj).f55571a;
                return !(str == null || wl51.m88460J0(str));
            case 3:
                return ((Boolean) obj).booleanValue();
            case 5:
                return e72.m37991Y((ContextTrack) ((PlayerState) obj).track().mo49278b());
            case 11:
                return ((gv31) obj).f84603b == 1;
            case 16:
                return !((List) obj).isEmpty();
            default:
                return ((PlayerState) obj).track().mo49279c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba A[LOOP:1: B:43:0x00b4->B:45:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ?? arrayList;
        List list;
        String str;
        int i;
        switch (this.f144664a) {
            case 0:
                PutValuesSyncResponse putValuesSyncResponse = (PutValuesSyncResponse) obj;
                if (putValuesSyncResponse.m7530n() != 0) {
                    return Completable.m23286j(new IOException(s571.m77246e(putValuesSyncResponse.m7530n(), "Failed to update product state. Error code: ")));
                }
                return CompletableEmpty.f7437a;
            case 2:
                return p1j0.f173119a;
            case 6:
                o2x0 o2x0Var = (o2x0) obj;
                Object obj2 = null;
                o1u o1uVar = o2x0Var.f161171a.f149852O0 ? (o1u) o2x0Var.f161172b : null;
                if (o1uVar != null) {
                    String str2 = o1uVar.f160861a;
                    r1u r1uVar = o1uVar.f160862b;
                    if (r1uVar != null && (list = r1uVar.f194922a) != null) {
                        for (Object obj3 : list) {
                            if ("EMAIL".equalsIgnoreCase((String) obj3)) {
                                obj2 = obj3;
                                str = (String) obj2;
                                if (str != null) {
                                    arrayList = new ArrayList(str.length());
                                    for (i = 0; i < str.length(); i++) {
                                        str.charAt(i);
                                        arrayList.add(l1u.f128800a);
                                    }
                                } else {
                                    arrayList = lau.f131415a;
                                }
                            }
                        }
                        str = (String) obj2;
                        if (str != null) {
                            arrayList = new ArrayList(str.length());
                            while (i < str.length()) {
                                str.charAt(i);
                                arrayList.add(l1u.f128800a);
                            }
                        } else {
                            arrayList = lau.f131415a;
                        }
                    } else {
                        arrayList = lau.f131415a;
                    }
                    return new s1u(new k1u(str2, arrayList, r1uVar != null ? r1uVar.f194923b : false));
                }
                return t1u.f216358a;
            case 9:
                return (am81) ((pqm0) obj).f180350a;
            case 12:
                return xul0.m92201d((i2p0) ((pqm0) obj).f180351b);
            case 13:
                return ((u521) obj).f226883a;
            case 14:
                Map map = (Map) obj;
                return new zjr0(dxf1.m37222K(map), gwg1.m45947s((String) map.get("pick-and-shuffle")));
            case 15:
                return new vhj0((Throwable) obj, null);
            case 18:
                na6.m63959g("Unexpected error monitoring downloads", (Throwable) obj);
                return Boolean.FALSE;
            case 21:
                lcf lcfVar = (lcf) obj;
                if (lcfVar instanceof hcf) {
                    return new sot0(((hcf) lcfVar).f89783a);
                }
                return tot0.f222319a;
            case 22:
                return fob1.f71498a;
            default:
                return (String) ((PlayerState) obj).playbackId().mo49280e("");
        }
    }
}
