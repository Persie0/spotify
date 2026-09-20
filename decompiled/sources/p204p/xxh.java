package p204p;

import android.content.Context;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class xxh implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f267004a;

    public xxh(luk lukVar, luk lukVar2, qzh qzhVar, epx epxVar, q831 q831Var, Context context, xre xreVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        txh txhVar = new txh(epxVar, lukVar2);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qxh.class), c1037x558fa59a.m15633a(txhVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(pxh.class), new C1037x558fa59a().m15633a(new uxh(qzhVar, q831Var, context)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rxh.class), new C1033x3ae6ae8e().m15631a(new wxh(xreVar, qzhVar)));
        this.f267004a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f267004a.mo3269P(consumer);
    }
}
