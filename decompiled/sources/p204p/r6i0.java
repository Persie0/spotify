package p204p;

import android.content.Context;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes8.dex */
public final class r6i0 implements j6i0 {

    /* JADX INFO: renamed from: L0 */
    public final boolean f196281L0;

    /* JADX INFO: renamed from: M0 */
    public final eh00 f196282M0;

    /* JADX INFO: renamed from: N0 */
    public final eh00 f196283N0;

    /* JADX INFO: renamed from: O0 */
    public final eh00 f196284O0;

    /* JADX INFO: renamed from: P0 */
    public final mmh0 f196285P0;

    /* JADX INFO: renamed from: Q0 */
    public final cph f196286Q0;

    /* JADX INFO: renamed from: R0 */
    public final j2a1 f196287R0;

    /* JADX INFO: renamed from: X */
    public final gh00 f196288X;

    /* JADX INFO: renamed from: Y */
    public final gtc1 f196289Y;

    /* JADX INFO: renamed from: Z */
    public final fxh0 f196290Z;

    /* JADX INFO: renamed from: a */
    public final Context f196291a;

    /* JADX INFO: renamed from: b */
    public final san f196292b;

    /* JADX INFO: renamed from: c */
    public final k5m0 f196293c;

    /* JADX INFO: renamed from: d */
    public final mdf0 f196294d;

    /* JADX INFO: renamed from: e */
    public final luk f196295e;

    /* JADX INFO: renamed from: f */
    public final p8p0 f196296f;

    /* JADX INFO: renamed from: g */
    public final sy31 f196297g;

    /* JADX INFO: renamed from: h */
    public final i6i0 f196298h;

    /* JADX INFO: renamed from: i */
    public final qe70 f196299i;

    /* JADX INFO: renamed from: t */
    public final qe70 f196300t;

    /* JADX WARN: Multi-variable type inference failed */
    public r6i0(Context context, san sanVar, k5m0 k5m0Var, mdf0 mdf0Var, luk lukVar, p8p0 p8p0Var, sy31 sy31Var, i6i0 i6i0Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, gtc1 gtc1Var, fxh0 fxh0Var, boolean z, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3) {
        this.f196291a = context;
        this.f196292b = sanVar;
        this.f196293c = k5m0Var;
        this.f196294d = mdf0Var;
        this.f196295e = lukVar;
        this.f196296f = p8p0Var;
        this.f196297g = sy31Var;
        this.f196298h = i6i0Var;
        this.f196299i = (qe70) gh00Var;
        this.f196300t = (qe70) gh00Var2;
        this.f196288X = gh00Var3;
        this.f196289Y = gtc1Var;
        this.f196290Z = fxh0Var;
        this.f196281L0 = z;
        this.f196282M0 = eh00Var;
        this.f196283N0 = eh00Var2;
        this.f196284O0 = eh00Var3;
        m6i0 m6i0Var = new m6i0(this, 0);
        lpc lpcVar = new lpc(this, 18);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        q6i0 q6i0Var = new q6i0(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(k6i0.class), c1037x558fa59a.m15633a(q6i0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(l6i0.class), new C1037x558fa59a().m15633a(new o6i0(this)));
        this.f196285P0 = alf1.m26338u(m6i0Var, lpcVar, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), hzh0.f96947d, new m6i0(this, 1));
        fyf fyfVar = new fyf(new une0(this, 29), true, -957882077);
        wpi0 wpi0Var = xwt.f266743a;
        this.f196286Q0 = new cph(fyfVar, 3);
        this.f196287R0 = new j2a1();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f196287R0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f196286Q0;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f196285P0;
    }
}
