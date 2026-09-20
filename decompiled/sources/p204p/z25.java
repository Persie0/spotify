package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes8.dex */
public final class z25 {

    /* JADX INFO: renamed from: a */
    public final ons0 f278492a;

    /* JADX INFO: renamed from: b */
    public final ict0 f278493b;

    /* JADX INFO: renamed from: c */
    public final C1044a f278494c;

    public z25(luk lukVar, ons0 ons0Var, ict0 ict0Var) {
        this.f278492a = ons0Var;
        this.f278493b = ict0Var;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        y25 y25Var = new y25();
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(t25.class), c1037x558fa59a.m15633a(y25Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(r25.class), new C1037x558fa59a().m15633a(new v25(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(s25.class), new C1037x558fa59a().m15633a(new w25(this)));
        this.f278494c = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }
}
