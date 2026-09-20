package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class x2d1 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final z9j0 f257421a;

    /* JADX INFO: renamed from: b */
    public final n011 f257422b;

    /* JADX INFO: renamed from: c */
    public final y0i0 f257423c;

    /* JADX INFO: renamed from: d */
    public final luk f257424d;

    public x2d1(z9j0 z9j0Var, n011 n011Var, y0i0 y0i0Var, luk lukVar) {
        this.f257421a = z9j0Var;
        this.f257422b = n011Var;
        this.f257423c = y0i0Var;
        this.f257424d = lukVar;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        u2d1 u2d1Var = new u2d1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(r2d1.class), c1037x558fa59a.m15633a(u2d1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(t2d1.class), new C1037x558fa59a().m15633a(new v2d1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(s2d1.class), new C1037x558fa59a().m15633a(new w2d1(this)));
        return new C1044a(this.f257424d, coroutinesSubtypeEffectHandlerBuilderM42464h).mo3269P(consumer);
    }
}
