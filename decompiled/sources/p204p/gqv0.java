package p204p;

import android.content.Context;
import com.spotify.home.evopage.structureapi.InterfaceC0791a;

/* JADX INFO: loaded from: classes2.dex */
public final class gqv0 implements dfo {

    /* JADX INFO: renamed from: a */
    public final e940 f83553a;

    /* JADX INFO: renamed from: b */
    public final q831 f83554b;

    /* JADX INFO: renamed from: c */
    public final Context f83555c;

    /* JADX INFO: renamed from: d */
    public final pgo f83556d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0791a f83557e;

    /* JADX INFO: renamed from: f */
    public final gst0 f83558f;

    /* JADX INFO: renamed from: g */
    public final tjo f83559g;

    /* JADX INFO: renamed from: h */
    public final xiz f83560h;

    /* JADX INFO: renamed from: i */
    public final i5x f83561i;

    /* JADX INFO: renamed from: t */
    public final cph f83562t;

    public gqv0(e940 e940Var, q831 q831Var, Context context, pgo pgoVar, InterfaceC0791a interfaceC0791a, gst0 gst0Var) {
        this.f83553a = e940Var;
        this.f83554b = q831Var;
        this.f83555c = context;
        this.f83556d = pgoVar;
        this.f83557e = interfaceC0791a;
        this.f83558f = gst0Var;
        jqv0 jqv0Var = qpv0.f191387a;
        this.f83559g = pag1.m69486v(new rko(new jqx(jqv0Var.mo54112b(v140.class)), 1, phv0.f177736T0, new pko(j1l0.f107782W0), phv0.f177737U0), new rko(new jqx(jqv0Var.mo54112b(erc1.class)), 1, phv0.f177738V0, new pko(phv0.f177735S0), phv0.f177739W0), or40.f168456a1);
        this.f83560h = vsf1.m86335u(new ono0(this, 11), duu0.f53282Q0, null, 12);
        this.f83561i = mhf1.m61771p(this).m94133b(oxu0.f171587Y0, oxu0.f171589Z0);
        fyf fyfVarM75763o = rkk.m75763o(new fqv0(this, 0), true, -1630554337);
        wpi0 wpi0Var = xwt.f266743a;
        this.f83562t = new cph(fyfVarM75763o, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f83561i;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f83562t;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f83556d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f83560h;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f83559g;
    }
}
