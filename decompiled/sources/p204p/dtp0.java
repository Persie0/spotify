package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dtp0 implements dut {

    /* JADX INFO: renamed from: a */
    public final String f52881a;

    /* JADX INFO: renamed from: b */
    public final String f52882b;

    /* JADX INFO: renamed from: c */
    public final wg61 f52883c = new wg61(new fyo0(this, 7));

    /* JADX INFO: renamed from: d */
    public final ago f52884d;

    /* JADX INFO: renamed from: e */
    public final tjo f52885e;

    /* JADX INFO: renamed from: f */
    public final tjo f52886f;

    /* JADX INFO: renamed from: g */
    public final tjo f52887g;

    /* JADX INFO: renamed from: h */
    public final xiz f52888h;

    /* JADX INFO: renamed from: i */
    public final xu91 f52889i;

    /* JADX INFO: renamed from: t */
    public final cph f52890t;

    public dtp0(String str, String str2, bz80 bz80Var, zw80 zw80Var, opx opxVar) {
        this.f52881a = str;
        this.f52882b = str2;
        ojo ojoVar = ago.f15436t;
        oh51 oh51Var = oh51.f165341a;
        int i = 0;
        int i2 = 1;
        this.f52884d = g9g1.m44033i(new erh(bz80Var.m30979a(oh51Var), zw80Var.m97113a(oh51Var), opxVar));
        wyx wyxVar = wyx.f256380X;
        rko rkoVar = new rko(wyxVar, 2, upp0.f232780Q0, new pko(upp0.f232792Z0), upp0.f232781R0);
        jqv0 jqv0Var = qpv0.f191387a;
        this.f52885e = pag1.m69485u(rkoVar, new rko(new jqx(jqv0Var.mo54112b(ks81.class)), 2, upp0.f232782S0, new pko(upp0.f232793a1), upp0.f232783T0), new rko(xzk.f267695Z0, 2, upp0.f232784U0, new pko(upp0.f232795b1), upp0.f232785V0), x4g0.f258100X0);
        this.f52886f = pag1.m69487w(new rko(wyxVar, 2, upp0.f232786W0, new pko(upp0.f232776M0), upp0.f232788X0), upp0.f232777N0);
        this.f52887g = pag1.m69487w(new rko(new jqx(jqv0Var.mo54112b(eua1.class)), 2, upp0.f232790Y0, new pko(upp0.f232797c1), upp0.f232779P0), ctp0.f41948b);
        this.f52888h = axf1.m27398m(new zsp0(this, i), new zsp0(this, i2), new atp0(this, i), null, upp0.f232775L0, 8);
        this.f52889i = new xu91(new atp0(this, i2), new yuo0(this, 4));
        fyf fyfVar = y0h.f267984a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f52890t = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f52889i;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f52890t;
    }

    /* JADX INFO: renamed from: e */
    public final b0x0 m36863e(fbu0 fbu0Var, nsp0 nsp0Var, String str) {
        ks81 ks81Var;
        Object next;
        String str2 = null;
        if (fbu0Var == null || (ks81Var = fbu0Var.f67901c) == null) {
            return new b0x0(fbu0Var != null ? fbu0Var.f67899a : null, fbu0Var != null ? fbu0Var.f67900b : null, null);
        }
        List list = fbu0Var.f67902d;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((dx80) next).f53899c, nsp0Var.f157863a.mo54251e()));
            dx80 dx80Var = (dx80) next;
            if (dx80Var != null) {
                str2 = dx80Var.f53900d;
            }
        }
        String str3 = fbu0Var.f67899a;
        String str4 = fbu0Var.f67900b;
        String str5 = ks81Var.f125870b;
        String strM43753y0 = g6f.m43753y0(ks81Var.f125875g, ", ", null, null, upp0.f232778O0, 30);
        String strM89458a = ks81Var.f125871c.m89458a(szk.f215606a);
        qsp0 osp0Var = psp0.f180909a;
        if (str2 != null) {
            String strM88484h1 = wl51.m88484h1(str2, ":");
            if (!strM88484h1.equals(this.f52881a)) {
                if (str == null) {
                    str = strM88484h1;
                }
                osp0Var = new osp0(str);
            }
        }
        return new b0x0(str3, str4, new rsp0(str5, strM43753y0, strM89458a, osp0Var));
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f52888h;
    }
}
