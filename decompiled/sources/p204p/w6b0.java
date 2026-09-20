package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class w6b0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final zse f248320a;

    /* JADX INFO: renamed from: b */
    public final luk f248321b;

    public w6b0(zse zseVar, luk lukVar) {
        this.f248320a = zseVar;
        this.f248321b = lukVar;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(qpv0.f191387a.mo54112b(u6b0.class), new C1037x558fa59a().m15633a(new v6b0(this)));
        return new C1044a(this.f248321b, coroutinesSubtypeEffectHandlerBuilderM42464h).mo3269P(consumer);
    }
}
