package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class z62 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f279678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(Object obj, int i) {
        super(4);
        this.f279677a = i;
        this.f279678b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String string;
        iqg1 bfc0Var;
        Object obj5;
        int i2;
        int i3;
        Object obj6;
        sl8 ql8Var;
        int i4;
        int i5 = this.f279677a;
        ?? r5 = "";
        ?? r10 = 0;
        int i6 = 3;
        w2a1 w2a1Var = w2a1.f247311a;
        int i7 = 2;
        boolean z = false;
        Object obj7 = this.f279678b;
        switch (i5) {
            case 0:
                mvh0 mvh0Var = (mvh0) obj;
                gh00 gh00Var = (gh00) obj2;
                xq00 xq00Var = (xq00) obj3;
                int iIntValue = ((Number) obj4).intValue();
                b72 b72Var = (b72) obj7;
                if ((iIntValue & 6) == 0) {
                    i = (xq00Var.m91766g(mvh0Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= xq00Var.m91770i(gh00Var) ? 32 : 16;
                }
                if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
                    qqg1.m73532b(vm6.f242710a.mo30068a(b72Var.f24117a), rkk.m75772x(915122120, new C2436u1((Object) mvh0Var, gh00Var, (Object) b72Var, 17), xq00Var), xq00Var, 56);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 1:
                ((Number) obj3).intValue();
                tfh0 tfh0Var = (tfh0) ((C1947hm) obj7).f92784d;
                tfh0Var.getClass();
                return new jfh0(tfh0Var);
            case 2:
                eh2 eh2Var = (eh2) obj;
                int iIntValue2 = ((Number) obj4).intValue();
                wj50.m88279p(eh2Var);
                ih2 ih2Var = (ih2) obj7;
                z1h1.m95108a(eh2Var, (gh00) obj2, ih2Var.f102126d, ih2Var.f102127e, null, (xq00) obj3, iIntValue2 & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1Var;
            case 3:
                z9g0 z9g0Var = (z9g0) obj;
                if (!((cy2) obj4).equals(cy2.f43142a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM37470a = ((dzj) ((b7v0) obj7).f24399d).m37470a(2);
                dv91 dv91Var = new dv91("hit", 1);
                if (strM37470a != null) {
                    string = strM37470a.toString();
                }
                if (r10 != 0) {
                    r10 = string;
                    r5 = r10;
                }
                r10 = string;
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", r5)), z9g0Var.f280774a, z9g0Var.f280775b.f284179b, System.currentTimeMillis());
            case 4:
                return new C1778dh((Context) obj2, (ViewGroup) obj3, (e23) obj7);
            case 5:
                b7v0 b7v0Var = (b7v0) obj7;
                return new asp((i4t0) b7v0Var.f24398c, (ViewGroup) obj3, new k23(b7v0Var, z ? 1 : 0), (Context) obj2, true);
            case 6:
                b7v0 b7v0Var2 = (b7v0) obj7;
                return new C1778dh((Context) obj2, (ViewGroup) obj3, new C2529wd(3, new l23(b7v0Var2, 1)), b7v0Var2);
            case 7:
                return new C2636z3((Context) obj2, (ViewGroup) obj3, (iv0) obj7);
            case 8:
                dag0 dag0Var = (dag0) obj;
                if (!((n63) obj4).equals(n63.f150671a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = (String) ((wg61) ((e23) obj7).f55320e).getValue();
                dag0Var.getClass();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), dag0Var.f47043a, dag0Var.f47044b.f57666b, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                i8g0 i8g0Var = ((jk3) obj7).f113193a;
                i8g0Var.getClass();
                return new tag0(i8g0Var);
            case 10:
                ((Number) obj3).intValue();
                return new rag0(new tag0(((sk3) obj7).f209984b));
            case 11:
                ((Number) obj3).intValue();
                return new uag0((i8g0) ((hjb0) obj7).f92009c);
            case 12:
                ((Number) obj3).intValue();
                return new vag0(((sk3) obj7).f209984b);
            case 13:
                return new pqm0(new iv0(new ibp((Observable) obj), new vq3((eh00) obj3), (voc1) ((s5f1) ((yic1) obj7).f273079b).f205793b, new uq3((th00) obj4), ((Number) obj2).intValue()), pq3.f180167a);
            case 14:
                ((wk5) obj7).f252127f.m81190a((lp5) obj, (gh00) obj2, (xq00) obj3, ((Number) obj4).intValue() & 126);
                return w2a1Var;
            case 15:
                bye byeVar = (bye) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                eh00 eh00Var = (eh00) obj3;
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                String str2 = byeVar.f32167d;
                String str3 = byeVar.f32169f;
                kfc0 kfc0Var = byeVar.f32168e;
                if (kfc0Var instanceof gfc0) {
                    bfc0Var = new zec0(((gfc0) kfc0Var).f79327a);
                } else if (kfc0Var instanceof hfc0) {
                    bfc0Var = new afc0(((hfc0) kfc0Var).f90675a);
                } else if (kfc0Var instanceof ifc0) {
                    bfc0Var = new cfc0(((ifc0) kfc0Var).f101743a);
                } else {
                    if (!(kfc0Var instanceof jfc0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bfc0Var = new bfc0(((jfc0) kfc0Var).f111876a);
                }
                return new yec0(str2, str3, ((ms5) obj7).f146697b, bfc0Var, zBooleanValue, eh00Var, zBooleanValue2);
            case 16:
                lq0 lq0Var = (lq0) obj7;
                return new kq0((Context) obj2, new C2529wd(3, new mz5(lq0Var, i7)), lq0Var);
            case 17:
                nug0 nug0Var = (nug0) obj;
                x26 x26Var = (x26) obj2;
                if (!((p26) obj4).equals(p26.f173257a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((i36) obj7).f98042d != null) {
                    return null;
                }
                String str4 = x26Var.f257364a;
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str4 != null ? str4.toString() : null;
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), nug0Var.f158646b, nug0Var.f158645a, System.currentTimeMillis());
            case 18:
                return new C1778dh((Context) obj2, (a96) obj7);
            case 19:
                int iIntValue3 = ((Number) obj3).intValue();
                kbg0 kbg0Var = new kbg0(new x9g0(((yc6) obj7).f271407a, (byte) 0));
                zzb zzbVar = ((wc6) obj).f249963a;
                return new jbg0(kbg0Var, zzbVar.f287942i.f236316a, Integer.valueOf(iIntValue3), zzbVar.f287942i.f236317b);
            case 20:
                gg6 gg6Var = (gg6) obj;
                int iIntValue4 = ((Number) obj4).intValue();
                cxe cxeVar = (cxe) obj7;
                md6 md6Var = (md6) cxeVar.f43012b;
                wj50.m88279p(gg6Var);
                md6Var.m61514a(gg6Var, (gh00) obj2, ((mg6) cxeVar.f43014d).m61694k().mo41418j(), null, (xq00) obj3, iIntValue4 & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1Var;
            case 21:
                ((Number) obj3).intValue();
                int iOrdinal = ((ye6) obj).f271924a.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i6 = 2;
                } else if (iOrdinal == 2) {
                    i6 = 1;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return new ibg0((l9g0) ((np0) obj7).f156833c, i6);
            case 22:
                uxh0 uxh0Var = (uxh0) obj;
                xq00 xq00Var2 = (xq00) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                xq00Var2.m91771i0(-845322380);
                kqi0 kqi0VarM77651H = sam.m77651H((xg6) obj2, xq00Var2);
                boolean zM91770i = xq00Var2.m91770i(kqi0VarM77651H);
                Object objM91750T = xq00Var2.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    obj5 = objM91750T;
                    g82 g82Var = new g82(kqi0VarM77651H, (fbk) r10, i7);
                    xq00Var2.m91793t0(g82Var);
                    obj5 = g82Var;
                }
                obj5 = objM91750T;
                uxh0Var.m84174a((xh00) obj5, xq00Var2, (iIntValue5 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                yg6 yg6VarM69645f = pd7.m69645f((pd7) obj7, (xg6) kqi0VarM77651H.getValue());
                xq00Var2.m91788r(false);
                return yg6VarM69645f;
            case 23:
                ga7 ga7Var = (ga7) obj;
                gh00 gh00Var2 = (gh00) obj2;
                xq00 xq00Var3 = (xq00) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i2 = (xq00Var3.m91766g(ga7Var) ? 4 : 2) | iIntValue6;
                } else {
                    i2 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i2 |= xq00Var3.m91770i(gh00Var2) ? 32 : 16;
                }
                if (xq00Var3.m91752Y(i2 & 1, (i2 & 147) != 146)) {
                    vig1.m85649d(null, b3g.f23044a, null, null, rkk.m75772x(-792952814, new jo21(ga7Var, gh00Var2, (ja7) obj7, 18), xq00Var3), xq00Var3, 24624, 13);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 24:
                uxh0 uxh0Var2 = (uxh0) obj;
                xq00 xq00Var4 = (xq00) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                np0 np0Var = (np0) obj7;
                boolean zM91770i2 = xq00Var4.m91770i(np0Var);
                Object objM91750T2 = xq00Var4.m91750T();
                if (zM91770i2 || objM91750T2 == t6x0.f217647t) {
                    objM91750T2 = new g82(np0Var, (fbk) r10, i6);
                    xq00Var4.m91793t0(objM91750T2);
                }
                uxh0Var2.m84174a((xh00) objM91750T2, xq00Var4, (iIntValue7 << 3) & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1Var;
            case 25:
                w88 w88Var = (w88) obj;
                gh00 gh00Var3 = (gh00) obj2;
                xq00 xq00Var5 = (xq00) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                y88 y88Var = (y88) obj7;
                if ((iIntValue8 & 6) == 0) {
                    i3 = ((iIntValue8 & 8) == 0 ? xq00Var5.m91766g(w88Var) : xq00Var5.m91770i(w88Var) ? 4 : 2) | iIntValue8;
                } else {
                    i3 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i3 |= xq00Var5.m91770i(gh00Var3) ? 32 : 16;
                }
                if (xq00Var5.m91752Y(i3 & 1, (i3 & 147) != 146)) {
                    pfm0 pfm0Var = y88Var.f270247f;
                    ajq0 ajq0Var = y88Var.f270246e;
                    g64 g64Var = ajq0Var.f16338b;
                    pfm0Var.m69810a(new pw71(new sl51(w88Var.f248879d)));
                    int i8 = i3 << 3;
                    whg1.m88128a(ajq0Var.m26173a().m66895a(true), w88Var, gh00Var3, null, g64Var.m43640C(), g64Var.m43639B(), y88Var.f270243b.f88891a, xq00Var5, (i8 & ContentType.LONG_FORM_ON_DEMAND) | 64 | (i8 & 896));
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 26:
                tl8 tl8Var = (tl8) obj2;
                xq00 xq00Var6 = (xq00) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                xq00Var6.m91771i0(-1500991962);
                C2065kt c2065kt = (C2065kt) obj7;
                kqi0 kqi0VarM77671j = sam.m77671j(((nsb) c2065kt.f126080c).f157734c, xq00Var6, 0);
                kqi0 kqi0VarM77670i = sam.m77670i((fiz) ((ik40) c2065kt.f126081d).f103011g, null, null, xq00Var6, 48, 2);
                w0e1 w0e1Var = (w0e1) c2065kt.f126085h;
                long j = tl8Var.f221386b;
                FlowableMap flowableMap = (FlowableMap) w0e1Var.f246723e;
                d0k[] d0kVarArr = bmu0.f28619a;
                kqi0 kqi0VarM77670i2 = sam.m77670i(mvl0.m62953p(new kl8(new zux(new onc(flowableMap), mvl0.m62955r(new onc(((Flowable) w0e1Var.f246722d).m23331J(kqd1.f125275X)), new ejz(new plv0(), 0), mvl0.f147608b), new ml8(i6, z ? 1 : 0, (fbk) r10), 1), w0e1Var, j)), new n6f(j), null, xq00Var6, 0, 2);
                String str5 = tl8Var.f221385a;
                boolean zM91770i3 = xq00Var6.m91770i(c2065kt) | ((((iIntValue9 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var6.m91766g(tl8Var)) || (iIntValue9 & 48) == 32);
                Object objM91750T3 = xq00Var6.m91750T();
                if (zM91770i3 || objM91750T3 == t6x0.f217647t) {
                    obj6 = objM91750T3;
                    of5 of5Var = new of5(c2065kt, tl8Var, r10, 13);
                    xq00Var6.m91793t0(of5Var);
                    obj6 = of5Var;
                }
                obj6 = objM91750T3;
                hz40.m49237i(str5, (th00) obj6, xq00Var6);
                boolean zBooleanValue3 = ((Boolean) kqi0VarM77671j.getValue()).booleanValue();
                g4a g4aVar = (g4a) kqi0VarM77670i.getValue();
                g4a g4aVar2 = mkg1.m62159u(g4aVar) ? g4aVar : null;
                if (g4aVar2 instanceof e4a) {
                    e4a e4aVar = (e4a) g4aVar2;
                    ql8Var = new pl8(e4aVar.f56033a, e4aVar.f56034b);
                } else if (g4aVar2 instanceof f4a) {
                    f4a f4aVar = (f4a) g4aVar2;
                    ql8Var = new ql8(f4aVar.f65713a, f4aVar.f65714b);
                } else {
                    ql8Var = rl8.f200233a;
                }
                ul8 ul8Var = new ul8(zBooleanValue3, ql8Var, ((n6f) kqi0VarM77670i2.getValue()).f150873a);
                xq00Var6.m91788r(false);
                return ul8Var;
            case 27:
                return new is8((lq0) obj7, (gh00) obj4);
            case 28:
                pe9 pe9Var = (pe9) obj;
                gh00 gh00Var4 = (gh00) obj2;
                xq00 xq00Var7 = (xq00) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i4 = (xq00Var7.m91766g(pe9Var) ? 4 : 2) | iIntValue10;
                } else {
                    i4 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i4 |= xq00Var7.m91770i(gh00Var4) ? 32 : 16;
                }
                if (xq00Var7.m91752Y(i4 & 1, (i4 & 147) != 146)) {
                    wj50.m88279p(pe9Var);
                    ksg1.m57212b(pe9Var, gh00Var4, ((re9) obj7).f198319d, null, xq00Var7, i4 & ContentType.LONG_FORM_ON_DEMAND);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            default:
                wwg0 wwg0Var = (wwg0) obj;
                zg9 zg9Var = (zg9) obj2;
                if (!((yg9) obj4).equals(yg9.f272516a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c = wwg0Var.f255765b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("managed_group", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("birthday_row", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String strM29206e = bh9.m29206e((bh9) obj7, zg9Var);
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = strM29206e != null ? strM29206e.toString() : null;
                return new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a, wwg0Var.f255764a, System.currentTimeMillis());
        }
    }
}
