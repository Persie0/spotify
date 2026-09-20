package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class a801 implements dut {

    /* JADX INFO: renamed from: a */
    public final Context f13160a;

    /* JADX INFO: renamed from: b */
    public final fj1 f13161b;

    /* JADX INFO: renamed from: c */
    public final wxh0 f13162c;

    /* JADX INFO: renamed from: d */
    public final i5x f13163d;

    /* JADX INFO: renamed from: e */
    public final cph f13164e;

    public a801(Context context, fj1 fj1Var) {
        this.f13160a = context;
        this.f13161b = fj1Var;
        int i = 0;
        y701 y701Var = new y701(this, i);
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a.f197428f;
        y701 y701Var2 = new y701(this, 1);
        fyf fyfVar = new fyf(new z701(this, i), true, 666437009);
        jtp jtpVar = new jtp();
        y701Var2.invoke(jtpVar);
        this.f13162c = new wxh0(jtpVar, y701Var, rb20Var, fyfVar);
        int i2 = 3;
        this.f13163d = mhf1.m61771p(this).m94133b(drz0.f52448i, new nfx0(this, i2));
        fyf fyfVar2 = n7h.f151162a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f13164e = new cph(fyfVar2, i2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m25007e(a801 a801Var, w701 w701Var) {
        fj1 fj1Var = a801Var.f13161b;
        be01 be01Var = w701Var.f248505a;
        String str = w701Var.f248506b;
        String str2 = w701Var.f248507c;
        lc11 lc11Var = (lc11) fj1Var.f70041b;
        lc11Var.getClass();
        lv31 lv31VarEdit = lc11Var.m58679a(be01Var.f26239a).edit();
        lv31VarEdit.m60048a(ri5.m75538i(str, str2), true);
        lv31VarEdit.m60054g();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f13163d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f13164e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f13162c;
    }
}
