package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lko0 implements dut {

    /* JADX INFO: renamed from: L0 */
    public final i5x f134398L0;

    /* JADX INFO: renamed from: M0 */
    public final cph f134399M0;

    /* JADX INFO: renamed from: X */
    public final wg61 f134400X = new wg61(new iko0(this, 1));

    /* JADX INFO: renamed from: Y */
    public final wg61 f134401Y = new wg61(new iko0(this, 0));

    /* JADX INFO: renamed from: Z */
    public final wxh0 f134402Z;

    /* JADX INFO: renamed from: a */
    public final r1w0 f134403a;

    /* JADX INFO: renamed from: b */
    public final q831 f134404b;

    /* JADX INFO: renamed from: c */
    public final s5m0 f134405c;

    /* JADX INFO: renamed from: d */
    public final rf50 f134406d;

    /* JADX INFO: renamed from: e */
    public final ndm0 f134407e;

    /* JADX INFO: renamed from: f */
    public final er70 f134408f;

    /* JADX INFO: renamed from: g */
    public final hc80 f134409g;

    /* JADX INFO: renamed from: h */
    public final k7k f134410h;

    /* JADX INFO: renamed from: i */
    public final ku00 f134411i;

    /* JADX INFO: renamed from: t */
    public final xso0 f134412t;

    public lko0(r1w0 r1w0Var, q831 q831Var, s5m0 s5m0Var, rf50 rf50Var, ndm0 ndm0Var, er70 er70Var, hc80 hc80Var, k7k k7kVar, ku00 ku00Var, pto0 pto0Var) {
        this.f134403a = r1w0Var;
        this.f134404b = q831Var;
        this.f134405c = s5m0Var;
        this.f134406d = rf50Var;
        this.f134407e = ndm0Var;
        this.f134408f = er70Var;
        this.f134409g = hc80Var;
        this.f134410h = k7kVar;
        this.f134411i = ku00Var;
        this.f134412t = pto0Var;
        peo0 peo0Var = peo0.f176800O0;
        n5q n5qVar = xsr.f265651a;
        this.f134402Z = uuf1.m83998r(peo0Var, pvb0.f181680a, null, new h3n0(this, 10), 4);
        this.f134398L0 = mhf1.m61771p(this).m94133b(mfo0.f143126e, mfo0.f143127f);
        fyf fyfVar = j0h.f107462c;
        wpi0 wpi0Var = xwt.f266743a;
        this.f134399M0 = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (((p204p.bem0) r7).m28947a(r9, r8, r15) == r5) goto L31;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m59286e(lko0 lko0Var, gko0 gko0Var, hko0 hko0Var, d850 d850Var, String str, ibk ibkVar) {
        jko0 jko0Var;
        String str2;
        yuk yukVar;
        boolean z;
        String str3;
        z650 z650Var;
        fko0 fko0Var;
        gko0 gko0Var2 = gko0Var;
        hko0 hko0Var2 = hko0Var;
        d850 d850Var2 = d850Var;
        if (ibkVar instanceof jko0) {
            jko0Var = (jko0) ibkVar;
            int i = jko0Var.f113347h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jko0Var.f113347h = i - Integer.MIN_VALUE;
            } else {
                jko0Var = new jko0(lko0Var, ibkVar);
            }
        } else {
            jko0Var = new jko0(lko0Var, ibkVar);
        }
        jko0 jko0Var2 = jko0Var;
        Object obj = jko0Var2.f113345f;
        int i2 = jko0Var2.f113347h;
        yuk yukVar2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            boolean zEquals = hko0Var2.f92464b.equals(dko0.f50010a);
            if (zEquals) {
                z1w0 z1w0Var = (z1w0) lko0Var.f134400X.getValue();
                String str4 = gko0Var2.f80873a;
                String str5 = gko0Var2.f80874b;
                List listSingletonList = Collections.singletonList(str5);
                long j = gko0Var2.f80875c;
                String str6 = (d850Var2 == null || (z650Var = d850Var2.f46380a) == null) ? null : z650Var.f279709a;
                Long l = new Long(j);
                jko0Var2.f113340a = gko0Var2;
                jko0Var2.f113341b = hko0Var2;
                jko0Var2.f113342c = d850Var2;
                jko0Var2.f113343d = str;
                jko0Var2.f113344e = zEquals;
                jko0Var2.f113347h = 1;
                yukVar = yukVar2;
                if (z1w0.m95161b(z1w0Var, str4, str5, listSingletonList, str6, null, l, null, false, jko0Var2, 208) != yukVar) {
                    z = zEquals;
                    str3 = str;
                }
                return yukVar;
            }
            str2 = str;
            lko0Var.f134410h.m55693a(d850Var2);
            fko0Var = hko0Var2.f92464b;
            if (fko0Var.equals(ako0.f16619a)) {
                lko0Var.f134405c.m77283a(gko0Var2.f80873a);
            } else if (fko0Var.equals(bko0.f27996a)) {
                ((emx) lko0Var.f134401Y.getValue()).m39465a(gko0Var2.f80874b);
            } else {
                lko0Var.f134404b.m72305j(new g631(null, str2, null, null, null, null, null, null, false));
            }
            return w2a1.f247311a;
        }
        if (i2 == 1) {
            boolean z2 = jko0Var2.f113344e;
            String str7 = jko0Var2.f113343d;
            d850Var2 = jko0Var2.f113342c;
            hko0 hko0Var3 = jko0Var2.f113341b;
            gko0 gko0Var3 = jko0Var2.f113340a;
            bga.m29073P(obj);
            ((s6x0) obj).getClass();
            z = z2;
            str3 = str7;
            hko0Var2 = hko0Var3;
            gko0Var2 = gko0Var3;
            yukVar = yukVar2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str8 = jko0Var2.f113343d;
            d850 d850Var3 = jko0Var2.f113342c;
            hko0 hko0Var4 = jko0Var2.f113341b;
            gko0 gko0Var4 = jko0Var2.f113340a;
            bga.m29073P(obj);
            d850Var2 = d850Var3;
            hko0Var2 = hko0Var4;
            str3 = str8;
            gko0Var2 = gko0Var4;
        }
        str2 = str3;
        lko0Var.f134410h.m55693a(d850Var2);
        fko0Var = hko0Var2.f92464b;
        if (fko0Var.equals(ako0.f16619a)) {
            lko0Var.f134405c.m77283a(gko0Var2.f80873a);
        } else if (fko0Var.equals(bko0.f27996a)) {
            ((emx) lko0Var.f134401Y.getValue()).m39465a(gko0Var2.f80874b);
        } else {
            lko0Var.f134404b.m72305j(new g631(null, str2, null, null, null, null, null, null, false));
        }
        return w2a1.f247311a;
        ndm0 ndm0Var = lko0Var.f134407e;
        String str9 = gko0Var2.f80873a;
        long j2 = (gko0Var2.f80876d + gko0Var2.f80875c) / ((long) 1000);
        jko0Var2.f113340a = gko0Var2;
        jko0Var2.f113341b = hko0Var2;
        jko0Var2.f113342c = d850Var2;
        jko0Var2.f113343d = str3;
        jko0Var2.f113344e = z;
        jko0Var2.f113347h = 2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: f */
    public static final Object m59287f(lko0 lko0Var, gko0 gko0Var, hko0 hko0Var, d850 d850Var, String str, ibk ibkVar) {
        kko0 kko0Var;
        Object obj;
        d850 d850Var2;
        String str2;
        String str3;
        yuk yukVar;
        gko0 gko0Var2;
        z650 z650Var;
        ndm0 ndm0Var;
        String str4;
        long j;
        String str5;
        gko0 gko0Var3 = gko0Var;
        q831 q831Var = lko0Var.f134404b;
        if (ibkVar instanceof kko0) {
            kko0Var = (kko0) ibkVar;
            int i = kko0Var.f123676f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kko0Var.f123676f = i - Integer.MIN_VALUE;
            } else {
                kko0Var = new kko0(lko0Var, ibkVar);
            }
        } else {
            kko0Var = new kko0(lko0Var, ibkVar);
        }
        kko0 kko0Var2 = kko0Var;
        Object obj2 = kko0Var2.f123674d;
        int i2 = kko0Var2.f123676f;
        yuk yukVar2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                String str6 = kko0Var2.f123673c;
                d850Var2 = kko0Var2.f123672b;
                gko0 gko0Var4 = kko0Var2.f123671a;
                bga.m29073P(obj2);
                str2 = str6;
                gko0Var3 = gko0Var4;
                obj = obj2;
            } else if (i2 == 2) {
                String str7 = kko0Var2.f123673c;
                d850Var2 = kko0Var2.f123672b;
                gko0Var2 = kko0Var2.f123671a;
                bga.m29073P(obj2);
                ((s6x0) obj2).getClass();
                str2 = str7;
                yukVar = yukVar2;
                ndm0Var = lko0Var.f134407e;
                str4 = gko0Var2.f80873a;
                j = (gko0Var2.f80876d + gko0Var2.f80875c) / ((long) 1000);
                kko0Var2.f123671a = null;
                kko0Var2.f123672b = d850Var2;
                kko0Var2.f123673c = str2;
                kko0Var2.f123676f = 3;
                if (((bem0) ndm0Var).m28947a(j, str4, kko0Var2) == yukVar) {
                    return yukVar;
                }
                str5 = str2;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str8 = kko0Var2.f123673c;
                d850Var2 = kko0Var2.f123672b;
                bga.m29073P(obj2);
                str5 = str8;
            }
            lko0Var.f134410h.m55693a(d850Var2);
            q831Var.m72305j(new g631(null, str5, null, null, null, null, null, null, false));
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        fko0 fko0Var = hko0Var.f92464b;
        eko0 eko0Var = fko0Var instanceof eko0 ? (eko0) fko0Var : null;
        if (eko0Var != null && (str3 = eko0Var.f60511a) != null) {
            q831Var.m72305j(new g631(null, str3, null, null, null, null, null, null, false));
        }
        ku00 ku00Var = lko0Var.f134411i;
        String str9 = gko0Var3.f80873a;
        kko0Var2.f123671a = gko0Var3;
        kko0Var2.f123672b = d850Var;
        kko0Var2.f123673c = str;
        kko0Var2.f123676f = 1;
        Object objM57371f = ku00Var.m57371f(str9, kko0Var2);
        if (objM57371f == yukVar2) {
            return yukVar2;
        }
        obj = objM57371f;
        d850Var2 = d850Var;
        str2 = str;
        if (wj50.m88271j((es00) obj, ds00.f52456a)) {
            z1w0 z1w0Var = (z1w0) lko0Var.f134400X.getValue();
            String str10 = gko0Var3.f80873a;
            String str11 = gko0Var3.f80874b;
            List listSingletonList = Collections.singletonList(str11);
            long j2 = gko0Var3.f80875c;
            String str12 = (d850Var2 == null || (z650Var = d850Var2.f46380a) == null) ? null : z650Var.f279709a;
            Long l = new Long(j2);
            kko0Var2.f123671a = gko0Var3;
            kko0Var2.f123672b = d850Var2;
            kko0Var2.f123673c = str2;
            kko0Var2.f123676f = 2;
            gko0 gko0Var5 = gko0Var3;
            yukVar = yukVar2;
            if (z1w0.m95161b(z1w0Var, str10, str11, listSingletonList, str12, null, l, null, false, kko0Var2, 208) == yukVar) {
                return yukVar;
            }
            gko0Var2 = gko0Var5;
            ndm0Var = lko0Var.f134407e;
            str4 = gko0Var2.f80873a;
            j = (gko0Var2.f80876d + gko0Var2.f80875c) / ((long) 1000);
            kko0Var2.f123671a = null;
            kko0Var2.f123672b = d850Var2;
            kko0Var2.f123673c = str2;
            kko0Var2.f123676f = 3;
            if (((bem0) ndm0Var).m28947a(j, str4, kko0Var2) == yukVar) {
                return yukVar;
            }
            str5 = str2;
            lko0Var.f134410h.m55693a(d850Var2);
            q831Var.m72305j(new g631(null, str5, null, null, null, null, null, null, false));
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f134398L0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f134399M0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f134402Z;
    }
}
