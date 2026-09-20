package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class ldi implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f132177a;

    public ldi(luk lukVar, z9j0 z9j0Var, dei deiVar, vk9 vk9Var, ydi ydiVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        idi idiVar = new idi(z9j0Var);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fdi.class), c1037x558fa59a.m15633a(idiVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(hdi.class), new C1037x558fa59a().m15633a(new jdi()));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gdi.class), new C1037x558fa59a().m15633a(new kdi(vk9Var, deiVar, ydiVar)));
        this.f132177a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f132177a.mo3269P(consumer);
    }
}
