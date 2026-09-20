package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class ip80 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final ip80 f104401L0;

    /* JADX INFO: renamed from: M0 */
    public static final ip80 f104402M0;

    /* JADX INFO: renamed from: N0 */
    public static final ip80 f104403N0;

    /* JADX INFO: renamed from: O0 */
    public static final ip80 f104404O0;

    /* JADX INFO: renamed from: P0 */
    public static final ip80 f104405P0;

    /* JADX INFO: renamed from: Q0 */
    public static final ip80 f104406Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ip80 f104407R0;

    /* JADX INFO: renamed from: S0 */
    public static final ip80 f104408S0;

    /* JADX INFO: renamed from: T0 */
    public static final ip80 f104409T0;

    /* JADX INFO: renamed from: U0 */
    public static final ip80 f104410U0;

    /* JADX INFO: renamed from: V0 */
    public static final ip80 f104411V0;

    /* JADX INFO: renamed from: W0 */
    public static final ip80 f104412W0;

    /* JADX INFO: renamed from: X */
    public static final ip80 f104413X;

    /* JADX INFO: renamed from: X0 */
    public static final ip80 f104414X0;

    /* JADX INFO: renamed from: Y */
    public static final ip80 f104415Y;

    /* JADX INFO: renamed from: Y0 */
    public static final ip80 f104416Y0;

    /* JADX INFO: renamed from: Z */
    public static final ip80 f104417Z;

    /* JADX INFO: renamed from: Z0 */
    public static final ip80 f104418Z0;

    /* JADX INFO: renamed from: a1 */
    public static final ip80 f104419a1;

    /* JADX INFO: renamed from: b */
    public static final ip80 f104420b;

    /* JADX INFO: renamed from: b1 */
    public static final ip80 f104421b1;

    /* JADX INFO: renamed from: c */
    public static final ip80 f104422c;

    /* JADX INFO: renamed from: c1 */
    public static final ip80 f104423c1;

    /* JADX INFO: renamed from: d */
    public static final ip80 f104424d;

    /* JADX INFO: renamed from: e */
    public static final ip80 f104425e;

    /* JADX INFO: renamed from: f */
    public static final ip80 f104426f;

    /* JADX INFO: renamed from: g */
    public static final ip80 f104427g;

    /* JADX INFO: renamed from: h */
    public static final ip80 f104428h;

    /* JADX INFO: renamed from: i */
    public static final ip80 f104429i;

    /* JADX INFO: renamed from: t */
    public static final ip80 f104430t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104431a;

    static {
        int i = 2;
        f104420b = new ip80(i, 0);
        f104422c = new ip80(i, 1);
        f104424d = new ip80(i, 2);
        f104425e = new ip80(i, 3);
        f104426f = new ip80(i, 4);
        f104427g = new ip80(i, 5);
        f104428h = new ip80(i, 6);
        f104429i = new ip80(i, 7);
        f104430t = new ip80(i, 8);
        f104413X = new ip80(i, 9);
        f104415Y = new ip80(i, 10);
        f104417Z = new ip80(i, 11);
        f104401L0 = new ip80(i, 12);
        f104402M0 = new ip80(i, 13);
        f104403N0 = new ip80(i, 14);
        f104404O0 = new ip80(i, 15);
        f104405P0 = new ip80(i, 16);
        f104406Q0 = new ip80(i, 17);
        f104407R0 = new ip80(i, 18);
        f104408S0 = new ip80(i, 19);
        f104409T0 = new ip80(i, 20);
        f104410U0 = new ip80(i, 21);
        f104411V0 = new ip80(i, 22);
        f104412W0 = new ip80(i, 23);
        f104414X0 = new ip80(i, 24);
        f104416Y0 = new ip80(i, 25);
        f104418Z0 = new ip80(i, 26);
        f104419a1 = new ip80(i, 27);
        f104421b1 = new ip80(i, 28);
        f104423c1 = new ip80(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip80(int i, int i2) {
        super(i);
        this.f104431a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:237:0x049e  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x044b, code lost:
    
        if (r3 == 0) goto L235;
     */
    @Override // p204p.th00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object ojoVar;
        String str;
        String str2;
        poa0 poa0Var;
        int i = 8;
        String strM35721s = null;
        switch (this.f104431a) {
            case 0:
                return new rq91(((en51) obj).f61073c);
            case 1:
                return new rq91(((cn51) obj).f39898e);
            case 2:
                return Next.m15608j();
            case 3:
                return First.m15574b((hs80) obj2);
            case 4:
                hs80 hs80Var = (hs80) obj;
                sr80 sr80Var = (sr80) obj2;
                if (sr80Var instanceof kr80) {
                    sp80 sp80Var = ((kr80) sr80Var).f125579a;
                    if (hs80Var instanceof cs80) {
                        return Next.m15606h(new ur80(((cs80) hs80Var).f41491a, sp80Var));
                    }
                    if (hs80Var instanceof ds80) {
                        return sp80Var.f212769b.isEmpty() ? Next.m15606h(new es80(sp80Var)) : Next.m15606h(new ur80(((ds80) hs80Var).mo33758a(), sp80Var));
                    }
                    return Next.m15606h(new es80(sp80Var));
                }
                if (sr80Var instanceof jr80) {
                    jr80 jr80Var = (jr80) sr80Var;
                    if (!(hs80Var instanceof ur80)) {
                        return hs80Var instanceof es80 ? Next.m15606h(new fs80(((es80) hs80Var).f62307a, 0)) : Next.m15608j();
                    }
                    int i2 = jr80Var.f115106a;
                    ur80 ur80Var = (ur80) hs80Var;
                    sp80 sp80Var2 = ur80Var.f233276b;
                    return i2 >= sp80Var2.f212768a ? Next.m15606h(new vr80(ur80Var.f233275a, sp80Var2)) : Next.m15608j();
                }
                boolean z = sr80Var instanceof or80;
                bs80 yr80Var = zr80.f285581a;
                if (z) {
                    nr80 nr80Var = ((or80) sr80Var).f168496a;
                    if (nr80Var instanceof lr80) {
                        yr80Var = new yr80(((lr80) nr80Var).f136239a);
                    } else if (!nr80Var.equals(mr80.f146448a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((hs80Var instanceof ds80) && (((ds80) hs80Var).mo33758a() instanceof as80) && !(hs80Var instanceof xr80)) {
                        return Next.m15608j();
                    }
                    if (hs80Var instanceof cs80) {
                        return Next.m15606h(new cs80(yr80Var));
                    }
                    if (hs80Var instanceof ur80) {
                        return Next.m15606h(new ur80(yr80Var, ((ur80) hs80Var).f233276b));
                    }
                    if (hs80Var instanceof vr80) {
                        return Next.m15606h(new vr80(yr80Var, ((vr80) hs80Var).f244108b));
                    }
                    if (hs80Var instanceof wr80) {
                        return Next.m15606h(new vr80(yr80Var, ((wr80) hs80Var).f254293b));
                    }
                    if (hs80Var instanceof xr80) {
                        return Next.m15606h(new vr80(yr80Var, ((xr80) hs80Var).f265290b));
                    }
                    if (hs80Var instanceof es80) {
                        return Next.m15606h(new ur80(yr80Var, ((es80) hs80Var).f62307a));
                    }
                    if (hs80Var instanceof fs80) {
                        return Next.m15606h(new vr80(yr80Var, ((fs80) hs80Var).f72802a));
                    }
                    if (wj50.m88271j(hs80Var, gs80.f83905a)) {
                        return Next.m15606h(new cs80(yr80Var));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (sr80Var instanceof pr80) {
                    return Next.m15605a(Collections.singleton(new hr80(((pr80) sr80Var).f180528a)));
                }
                if (!(sr80Var instanceof qr80)) {
                    if (!sr80Var.equals(rr80.f201985a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(hs80Var instanceof wr80)) {
                        return Next.m15608j();
                    }
                    wr80 wr80Var = (wr80) hs80Var;
                    return Next.m15606h(new xr80(wr80Var.f254292a, wr80Var.f254293b));
                }
                qr80 qr80Var = (qr80) sr80Var;
                yk91 yk91Var = qr80Var.f191762b;
                b450 b450Var = qr80Var.f191761a;
                int i3 = b450Var.f278778a;
                boolean z2 = ((Number) yk91Var.f273650a).intValue() != 0;
                boolean z3 = hs80Var instanceof vr80;
                if (z3) {
                    vr80 vr80Var = (vr80) hs80Var;
                    sp80 sp80Var3 = vr80Var.f244108b;
                    bs80 bs80Var = vr80Var.f244107a;
                    List list = sp80Var3.f212769b;
                    if (i3 != -1 && list.size() > i3) {
                        ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
                        Iterator it = b450Var.iterator();
                        while (((a450) it).f12141c) {
                            arrayList.add(((sec1) list.get(((t350) it).nextInt())).f208275b);
                        }
                        if (!bs80Var.equals(yr80Var)) {
                            if (bs80Var instanceof yr80) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (wj50.m88271j(it2.next(), ((yr80) bs80Var).f275422a)) {
                                                if (bs80Var.equals(yr80Var)) {
                                                    return Next.m15607i(new xr80(bs80Var, sp80Var3), Collections.singleton(new gr80(yk91Var)));
                                                }
                                                if (!(bs80Var instanceof yr80) || (bs80Var instanceof as80)) {
                                                    return Next.m15607i(new wr80(bs80Var, sp80Var3), Collections.singleton(new gr80(yk91Var)));
                                                }
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (!(bs80Var instanceof as80)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (wj50.m88271j(it3.next(), ((as80) bs80Var).f19354a)) {
                                                if (bs80Var.equals(yr80Var)) {
                                                    return Next.m15607i(new xr80(bs80Var, sp80Var3), Collections.singleton(new gr80(yk91Var)));
                                                }
                                                if (bs80Var instanceof yr80) {
                                                }
                                                return Next.m15607i(new wr80(bs80Var, sp80Var3), Collections.singleton(new gr80(yk91Var)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z3 && z2) {
                    return Next.m15607i(new fs80(((vr80) hs80Var).f244108b, i3), Collections.singleton(new gr80(yk91Var)));
                }
                if ((hs80Var instanceof wr80) && z2) {
                    return Next.m15607i(new fs80(((wr80) hs80Var).f254293b, i3), Collections.singleton(new gr80(yk91Var)));
                }
                if ((hs80Var instanceof xr80) && z2) {
                    return Next.m15607i(new fs80(((xr80) hs80Var).f265290b, i3), Collections.singleton(new gr80(yk91Var)));
                }
                return hs80Var instanceof fs80 ? Next.m15607i(new fs80(((fs80) hs80Var).f72802a, i3), Collections.singleton(new gr80(yk91Var))) : Next.m15608j();
            case 5:
                ex80 ex80Var = (ex80) obj;
                p2x0 p2x0Var = (p2x0) obj2;
                return p2x0Var == null ? new mjo(new hjo(ex80Var)) : (pjo) p2x0Var.m68969b(new c7x(ex80Var, i), new x10(11, lg80.f133129Z0));
            case 6:
                dy80 dy80Var = (dy80) obj;
                av31 av31Var = (av31) obj2;
                if (av31Var instanceof yu31) {
                    return new mjo(new jjo("Failed to get members for key " + dy80Var + ": " + ((yu31) av31Var).f276272a));
                }
                if (!(av31Var instanceof zu31)) {
                    throw new NoWhenBranchMatchedException();
                }
                p2x0 p2x0Var2 = (p2x0) ((zu31) av31Var).f286335a;
                da70 da70Var = new da70(dy80Var, 26);
                p2x0Var2.getClass();
                if (p2x0Var2 instanceof k2x0) {
                    ojoVar = da70Var.invoke(((k2x0) p2x0Var2).f118699a);
                } else {
                    if (!(p2x0Var2 instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kfe0 kfe0Var = (kfe0) ((m2x0) p2x0Var2).f139474a;
                    ojoVar = new ojo(new ey80(kfe0Var.f122150c, kfe0Var.f122153f));
                }
                return (pjo) ojoVar;
            case 7:
                iz80 iz80Var = (iz80) obj;
                p2x0 p2x0Var3 = (p2x0) obj2;
                return p2x0Var3 == null ? new mjo(new hjo(iz80Var)) : (pjo) p2x0Var3.m68969b(new c7x(iz80Var, i), new x10(11, ay80.f21160g));
            case 8:
                return tg1.m80727q((av31) obj2, (iz80) obj, ay80.f21162i);
            case 9:
                return tg1.m80727q((av31) obj2, (pz80) obj, ay80.f21138P0);
            case 10:
                av31 av31Var2 = (av31) obj2;
                if (av31Var2 instanceof yu31) {
                    return new ojo(bv41.f31274a);
                }
                if (av31Var2 instanceof zu31) {
                    return new ojo(((zu31) av31Var2).f286335a);
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                return ufc1.m82980w(((njm0) obj).f154636d, (b250) obj2);
            case 12:
                return (e790) obj2;
            case 13:
                return new p790((i490) obj2);
            case 14:
                return (v601) obj2;
            case 15:
                wa90 wa90Var = (wa90) obj;
                xa90 xa90Var = (xa90) obj2;
                Set set = wa90Var.f249420b;
                return !wj50.m88271j(set, xa90Var.f259629e) ? Next.m15607i(xa90.m90284c(xa90Var, null, null, 0L, false, wa90Var.f249420b, 15), Collections.singleton(new wft(set))) : Next.m15606h(xa90Var);
            case 16:
                return new ib90(((Boolean) obj2).booleanValue());
            case 17:
                return (ld90) obj2;
            case 18:
                le90 le90Var = (le90) obj;
                oe90 oe90Var = (oe90) obj2;
                pe90 pe90Var = oe90Var.f164385a;
                erc1 erc1Var = oe90Var.f164386b;
                String strM85298a = erc1Var != null ? ve90.m85298a(erc1Var) : null;
                erc1 erc1Var2 = pe90Var.f176672a;
                String strM85298a2 = erc1Var2 != null ? ve90.m85298a(erc1Var2) : null;
                v140 v140Var = pe90Var.f176673b;
                if (v140Var == null || (str2 = v140Var.f236243a) == null) {
                    str = le90Var.f132492a;
                    List list2 = ve90.f240652a;
                    if (str != null) {
                        Set set2 = dd41.f47702f;
                        strM35721s = r46.m74726U(str).m35721s();
                    }
                    if (strM35721s == null) {
                        str2 = "";
                    } else {
                        str2 = strM35721s;
                    }
                } else {
                    if (wl51.m88460J0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str = le90Var.f132492a;
                        List list3 = ve90.f240652a;
                        if (str != null) {
                            Set set3 = dd41.f47702f;
                            strM35721s = r46.m74726U(str).m35721s();
                        }
                        if (strM35721s == null) {
                            str2 = "";
                        } else {
                            str2 = strM35721s;
                        }
                    }
                }
                return new me90(strM85298a, strM85298a2, str2);
            case 19:
                return ((Boolean) obj2).booleanValue() ? "1" : "0";
            case 20:
                return new nj90(((mj90) obj).f144206a, (Map) obj2);
            case 21:
                return (pm90) obj2;
            case 22:
                return new vm90(((Boolean) obj2).booleanValue() ? 10L : 0L, 10L);
            case 23:
                return new wm90(((Boolean) obj2).booleanValue() ? 10L : 0L, 10L);
            case 24:
                return null;
            case 25:
                return Next.m15606h((rca0) obj2);
            case 26:
                return new vfa0(((ufa0) obj).f229733a);
            case 27:
                dna0 dna0Var = (dna0) obj;
                return Next.m15606h(new uoa0(dna0Var, h1m0.f86661d, stf1.m79250j(dna0Var)));
            case 28:
                dna0 dna0Var2 = (dna0) obj;
                String str3 = dna0Var2.f50715a;
                ina0 ina0Var = dna0Var2.f50716b;
                l9g0 l9g0Var = new l9g0(str3, 21);
                if (ina0Var instanceof x9f) {
                    poa0Var = new poa0(l9g0Var, (x9f) ina0Var);
                } else {
                    if (!(ina0Var instanceof baz0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    poa0Var = new poa0(l9g0Var, (baz0) ina0Var);
                }
                return poa0Var.mo48654l();
            default:
                era0 era0Var = (era0) obj2;
                return h6f.m46715L(Boolean.valueOf(era0Var.f62051c), Boolean.valueOf(era0Var.f62052d));
        }
    }
}
