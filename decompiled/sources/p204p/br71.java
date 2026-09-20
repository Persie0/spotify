package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes7.dex */
public final class br71 implements nr71 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f30007a;

    /* JADX INFO: renamed from: b */
    public final gq71 f30008b;

    /* JADX INFO: renamed from: c */
    public final k4k0 f30009c;

    public br71(Scheduler scheduler, gq71 gq71Var, k4k0 k4k0Var) {
        this.f30007a = scheduler;
        this.f30008b = gq71Var;
        this.f30009c = k4k0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Builder m30290a(Consumer consumer) {
        yq71 yq71Var = new yq71();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        gq71 gq71Var = this.f30008b;
        subtypeEffectHandlerBuilderM15658c.m15665g(dq71.class, new fq71(gq71Var, 0));
        subtypeEffectHandlerBuilderM15658c.m15661c(eq71.class, new qw90(consumer, 20));
        subtypeEffectHandlerBuilderM15658c.m15665g(cq71.class, new fq71(gq71Var, 1));
        return klh.m56831c("seadragon", Mobius.m15582d(yq71Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15596h(RxEventSources.m15655a(new ObservableFromPublisher(etz.m39984s((etz) this.f30009c.f119244b)).map(haz.f89319W0))).mo15590b(new zq71(this)).mo15592d(new ar71(this)));
    }
}
