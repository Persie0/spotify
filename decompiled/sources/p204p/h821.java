package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class h821 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f88605a;

    public h821(x8x0 x8x0Var, adn0 adn0Var, k5k0 k5k0Var, ae00 ae00Var, gc41 gc41Var, cz90 cz90Var, x610 x610Var, bx3 bx3Var, cx21 cx21Var, luk lukVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        u721 u721Var = new u721(x8x0Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(q721.class), c1037x558fa59a.m15633a(u721Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(p721.class), new C1037x558fa59a().m15633a(new v721(adn0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(o721.class), new C1033x3ae6ae8e().m15631a(new x721(k5k0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(n721.class), new C1037x558fa59a().m15633a(new a821(ae00Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(s721.class), new C1037x558fa59a().m15633a(new c821(gc41Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(k721.class), new C1037x558fa59a().m15633a(new w721(cz90Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(m721.class), new C1037x558fa59a().m15633a(new e821(x610Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(l721.class), new C1037x558fa59a().m15633a(new g821()));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(r721.class), new C1033x3ae6ae8e().m15631a(new y721(cx21Var)));
        this.f88605a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f88605a.mo3269P(consumer);
    }
}
