package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: classes10.dex */
public final class m1q implements Connectable {

    /* JADX INFO: renamed from: a */
    public final s7s0 f139046a;

    /* JADX INFO: renamed from: b */
    public final zam0 f139047b;

    public m1q(s7s0 s7s0Var, zam0 zam0Var) {
        this.f139046a = s7s0Var;
        this.f139047b = zam0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        u7s0 u7s0VarMo59839a = this.f139046a.mo59839a(this.f139047b);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(u4s0.class, new bi1(u7s0VarMo59839a, 12));
        return RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h()).mo3269P(consumer);
    }
}
