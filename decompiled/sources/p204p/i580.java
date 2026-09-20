package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class i580 {

    /* JADX INFO: renamed from: a */
    public final f580 f98844a;

    public i580(f580 f580Var) {
        this.f98844a = f580Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Factory m49767a() {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        f580 f580Var = this.f98844a;
        b580 b580Var = new b580(f580Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ygt.class), c1037x558fa59a.m15633a(b580Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(aht.class), new C1037x558fa59a().m15633a(new c580(f580Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(uht.class), new C1037x558fa59a().m15633a(new d580(f580Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fit.class), new C1037x558fa59a().m15633a(new e580(f580Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ngt.class), new C1037x558fa59a().m15633a(new z480(f580Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(udt.class), new C1037x558fa59a().m15633a(new a580(f580Var)));
        return Mobius.m15582d(h580.f87770a, new C1044a(f580Var.f65978b, coroutinesSubtypeEffectHandlerBuilderM42464h));
    }
}
