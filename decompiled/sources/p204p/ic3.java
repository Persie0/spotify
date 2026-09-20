package p204p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ic3 {

    /* JADX INFO: renamed from: a */
    public final xqb f100717a;

    /* JADX INFO: renamed from: b */
    public final lj3 f100718b;

    /* JADX INFO: renamed from: c */
    public final ihj0 f100719c;

    /* JADX INFO: renamed from: d */
    public final pl3 f100720d;

    /* JADX INFO: renamed from: e */
    public final s1e1 f100721e;

    public ic3(xqb xqbVar, lj3 lj3Var, ihj0 ihj0Var, pl3 pl3Var, s1e1 s1e1Var) {
        this.f100717a = xqbVar;
        this.f100718b = lj3Var;
        this.f100719c = ihj0Var;
        this.f100720d = pl3Var;
        this.f100721e = s1e1Var;
    }

    /* JADX INFO: renamed from: a */
    public final ObservableTransformer m50225a(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(ac3.class, new gc3(this, 0));
        subtypeEffectHandlerBuilderM15658c.m15665g(cc3.class, new gc3(this, 1));
        subtypeEffectHandlerBuilderM15658c.m15661c(zb3.class, new jz0(5, this, consumer));
        subtypeEffectHandlerBuilderM15658c.m15665g(dc3.class, hc3.f89676b);
        return subtypeEffectHandlerBuilderM15658c.m15666h();
    }
}
