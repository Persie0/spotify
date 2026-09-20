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
public final class j5v implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f109103a;

    public j5v(i2v i2vVar, u6x u6xVar, rwt0 rwt0Var, m8p0 m8p0Var, em11 em11Var, luk lukVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        g5v g5vVar = new g5v(i2vVar);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(x4v.class), c1037x558fa59a.m15633a(g5vVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(y4v.class), new C1037x558fa59a().m15633a(new i5v(u6xVar)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(z4v.class), new C1033x3ae6ae8e().m15631a(new d5v(m8p0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(a5v.class), new C1033x3ae6ae8e().m15631a(new e5v(rwt0Var)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(b5v.class), new C1037x558fa59a().m15633a(new c5v(em11Var)));
        this.f109103a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f109103a.mo3269P(consumer);
    }
}
