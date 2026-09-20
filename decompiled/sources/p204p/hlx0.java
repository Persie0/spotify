package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes8.dex */
public final class hlx0 {

    /* JADX INFO: renamed from: a */
    public final gh00 f92762a;

    /* JADX INFO: renamed from: b */
    public final gh00 f92763b;

    /* JADX INFO: renamed from: c */
    public final C1044a f92764c;

    public hlx0(luk lukVar, xre xreVar, gh00 gh00Var, gh00 gh00Var2) {
        this.f92762a = gh00Var;
        this.f92763b = gh00Var2;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        glx0 glx0Var = new glx0();
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(clx0.class), c1037x558fa59a.m15633a(glx0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(blx0.class), new C1037x558fa59a().m15633a(new dlx0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(alx0.class), new C1037x558fa59a().m15633a(new elx0(this)));
        this.f92764c = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }
}
