package p204p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class cpw0 {

    /* JADX INFO: renamed from: a */
    public final tis0 f40669a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f40670b;

    /* JADX INFO: renamed from: c */
    public final ObservableTransformer f40671c;

    public cpw0(tis0 tis0Var, z9j0 z9j0Var, Scheduler scheduler) {
        this.f40669a = tis0Var;
        this.f40670b = z9j0Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(bpw0.class, new s8w0(this, 1));
        subtypeEffectHandlerBuilderM15658c.m15662d(yow0.class, new l2s0(this, 18), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15660b(wow0.class, new y1s0(this, 11), scheduler);
        this.f40671c = subtypeEffectHandlerBuilderM15658c.m15666h();
    }
}
