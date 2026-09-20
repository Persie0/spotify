package p204p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes9.dex */
public final class olc implements dut, f7x0 {

    /* JADX INFO: renamed from: a */
    public final luk f166812a;

    /* JADX INFO: renamed from: b */
    public final rmm0 f166813b;

    /* JADX INFO: renamed from: c */
    public final r46 f166814c;

    /* JADX INFO: renamed from: d */
    public final zv41 f166815d = jag1.m52819d(null);

    /* JADX INFO: renamed from: e */
    public final hb11 f166816e;

    /* JADX INFO: renamed from: f */
    public final mmh0 f166817f;

    /* JADX INFO: renamed from: g */
    public final i5x f166818g;

    /* JADX INFO: renamed from: h */
    public final cph f166819h;

    public olc(mrt mrtVar, rum rumVar, luk lukVar, rmm0 rmm0Var, ziq ziqVar, r46 r46Var) {
        this.f166812a = lukVar;
        this.f166813b = rmm0Var;
        this.f166814c = r46Var;
        hb11 hb11VarM52092t = j0g1.m52092t(1, 0, 2, 2);
        this.f166816e = hb11VarM52092t;
        p7x0 p7x0VarMo27151a = rmm0Var.mo29877i().mo27151a(uh1.f230330t, this);
        og0 og0VarM69854h = rmm0Var.mo29870b().mo34132s().m69854h("COVER_ART_PERMISSIONS_REQUEST", new o5m0(false, 3), new ag0(hb11VarM52092t));
        luk lukVar2 = (luk) ((yus) ((upl) rumVar.f202876a.f265375c).f232721b).f276451b.get();
        jg31.m53271i(lukVar2);
        po10 po10Var = new po10(7, lukVar2, p7x0VarMo27151a);
        tvh0 tvh0Var = new tvh0(null, false, null, false, 127);
        C2362s4 c2362s4 = C2362s4.f205391q;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        brt brtVar = new brt(po10Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(akt.class), c1037x558fa59a.m15633a(brtVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(djt.class), new C1037x558fa59a().m15633a(new crt(og0VarM69854h)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(tft.class), new C1037x558fa59a().m15633a(new drt(ziqVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cjt.class), new C1037x558fa59a().m15633a(new jrt(mrtVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(alt.class), new C1037x558fa59a().m15633a(new lrt(mrtVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ujt.class), new C1033x3ae6ae8e().m15631a(new frt(mrtVar.f146605e)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vjt.class), new C1033x3ae6ae8e().m15631a(new hrt(new xvx0(18, ((upl) mrtVar.f146604d.f192740a.f265375c).m83719p(), rmm0Var))));
        this.f166817f = alf1.m26337t(tvh0Var, c2362s4, new C1044a(mrtVar.f146601a, coroutinesSubtypeEffectHandlerBuilderM42464h), new zme1(this, 23), new mlc(this));
        this.f166818g = mhf1.m61771p(this).m94133b(nlc.f155062b, nlc.f155064c);
        fyf fyfVar = new fyf(new ms8(this, 20), true, 1968490526);
        wpi0 wpi0Var = xwt.f266743a;
        this.f166819h = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f166818g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f166819h;
    }

    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        Uri data;
        if (c7x0Var instanceof n6x0) {
            Intent intent = (Intent) ((n6x0) c7x0Var).f150980a;
            if (intent.getData() == null || (data = intent.getData()) == null) {
                return;
            }
            zv41 zv41Var = this.f166815d;
            zv41Var.getClass();
            zv41Var.m97091m(null, data);
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f166817f;
    }
}
