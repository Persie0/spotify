package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes6.dex */
public final class f72 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Connectable f66539a;

    public f72(ron0 ron0Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(d72.class, new bi1(ron0Var, 2));
        this.f66539a = RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h());
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f66539a.mo3269P(consumer);
    }
}
