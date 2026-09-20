package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes2.dex */
public final class wa50 implements dut {

    /* JADX INFO: renamed from: M0 */
    public static final String f249386M0 = xoc1.f264109i6.f243453a;

    /* JADX INFO: renamed from: L0 */
    public final i5x f249387L0;

    /* JADX INFO: renamed from: X */
    public final tw60 f249388X;

    /* JADX INFO: renamed from: Y */
    public final mmh0 f249389Y;

    /* JADX INFO: renamed from: Z */
    public final cph f249390Z;

    /* JADX INFO: renamed from: a */
    public final n430 f249391a;

    /* JADX INFO: renamed from: b */
    public final nb50 f249392b;

    /* JADX INFO: renamed from: c */
    public final uvc f249393c;

    /* JADX INFO: renamed from: d */
    public final jan f249394d;

    /* JADX INFO: renamed from: e */
    public final p8p0 f249395e;

    /* JADX INFO: renamed from: f */
    public final sy31 f249396f;

    /* JADX INFO: renamed from: g */
    public final luk f249397g;

    /* JADX INFO: renamed from: h */
    public final C1947hm f249398h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2609yd f249399i;

    /* JADX INFO: renamed from: t */
    public final aj2 f249400t;

    public wa50(n430 n430Var, nb50 nb50Var, uvc uvcVar, jan janVar, p8p0 p8p0Var, sy31 sy31Var, luk lukVar, C1947hm c1947hm, InterfaceC2609yd interfaceC2609yd, aj2 aj2Var, tw60 tw60Var) {
        this.f249391a = n430Var;
        this.f249392b = nb50Var;
        this.f249393c = uvcVar;
        this.f249394d = janVar;
        this.f249395e = p8p0Var;
        this.f249396f = sy31Var;
        this.f249397g = lukVar;
        this.f249398h = c1947hm;
        this.f249399i = interfaceC2609yd;
        this.f249400t = aj2Var;
        this.f249388X = tw60Var;
        oa50 oa50Var = oa50.f163230b;
        lpc lpcVar = new lpc(this, 9);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        pa50 pa50Var = new pa50(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(x950.class), c1037x558fa59a.m15633a(pa50Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(y950.class), new C1037x558fa59a().m15633a(new ra50(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(aa50.class), new C1037x558fa59a().m15633a(new sa50(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ba50.class), new C1037x558fa59a().m15633a(new ua50(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(z950.class), new C1037x558fa59a().m15633a(new va50(this)));
        this.f249389Y = alf1.m26340w(oa50Var, lpcVar, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), or40.f168459c, new zc30(this, 26));
        fyf fyfVarM75763o = rkk.m75763o(new b640(this, 13), true, -307235825);
        wpi0 wpi0Var = xwt.f266743a;
        this.f249390Z = new cph(fyfVarM75763o, 3);
        this.f249387L0 = mhf1.m61771p(this).m94133b(x30.f257611O0, new n100(this, 25));
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f249387L0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f249390Z;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f249389Y;
    }
}
