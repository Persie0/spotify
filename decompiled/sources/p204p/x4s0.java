package p204p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes10.dex */
public final class x4s0 implements w4s0 {

    /* JADX INFO: renamed from: a */
    public final q7s0 f258193a;

    /* JADX INFO: renamed from: b */
    public final zam0 f258194b;

    public x4s0(q7s0 q7s0Var, zam0 zam0Var) {
        this.f258193a = q7s0Var;
        this.f258194b = zam0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(u4s0.class, new ynb0(this, 23));
        return RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()).mo3269P(consumer);
    }
}
