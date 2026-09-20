package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class zqs0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1044a f285446a;

    public zqs0(String str, luk lukVar, mys mysVar) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(qpv0.f191387a.mo54112b(ars0.class), new C1037x558fa59a().m15633a(new yqs0(mysVar, str)));
        this.f285446a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f285446a.mo3269P(consumer);
    }
}
