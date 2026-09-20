package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes.dex */
public final class g5q0 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final epx f76725a;

    public g5q0(epx epxVar) {
        this.f76725a = epxVar;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(d5q0.class, new ynb0(this, 18));
        return RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()).mo3269P(consumer);
    }
}
