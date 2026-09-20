package p204p;

import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes5.dex */
public final class le11 {

    /* JADX INFO: renamed from: a */
    public final e3p f132426a;

    /* JADX INFO: renamed from: b */
    public final q831 f132427b;

    /* JADX INFO: renamed from: c */
    public final psp f132428c;

    /* JADX INFO: renamed from: d */
    public final x5m f132429d;

    /* JADX INFO: renamed from: e */
    public final wt80 f132430e;

    /* JADX INFO: renamed from: f */
    public final luk f132431f;

    /* JADX INFO: renamed from: g */
    public final luk f132432g;

    /* JADX INFO: renamed from: h */
    public final ce11 f132433h = new ce11(this);

    /* JADX INFO: renamed from: i */
    public final C1044a f132434i;

    public le11(e3p e3pVar, q831 q831Var, psp pspVar, x5m x5mVar, wt80 wt80Var, luk lukVar, luk lukVar2) {
        this.f132426a = e3pVar;
        this.f132427b = q831Var;
        this.f132428c = pspVar;
        this.f132429d = x5mVar;
        this.f132430e = wt80Var;
        this.f132431f = lukVar;
        this.f132432g = lukVar2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        ke11 ke11Var = new ke11(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wd11.class), c1033x3ae6ae8e.m15631a(ke11Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(xd11.class), new C1037x558fa59a().m15633a(new de11(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vd11.class), new C1037x558fa59a().m15633a(new fe11(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zd11.class), new C1037x558fa59a().m15633a(new ge11(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yd11.class), new C1037x558fa59a().m15633a(new ie11(this)));
        this.f132434i = new C1044a(lukVar2, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }
}
