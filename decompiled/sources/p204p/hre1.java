package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class hre1 implements jnh0 {

    /* JADX INFO: renamed from: a */
    public final sry0 f94426a;

    /* JADX INFO: renamed from: b */
    public final EventSource f94427b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f94428c;

    public hre1(sry0 sry0Var, EventSource eventSource, Scheduler scheduler) {
        this.f94426a = sry0Var;
        this.f94427b = eventSource;
        this.f94428c = scheduler;
    }

    @Override // p204p.jnh0
    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller mo32865a(Object obj, bi1 bi1Var) {
        zqe1 zqe1Var = zqe1.f285376h;
        jlx0 jlx0Var = new jlx0(13);
        vry0 vry0Var = (vry0) this.f94426a;
        vry0Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(ld3.class, vry0Var.f244281d.m95701t());
        subtypeEffectHandlerBuilderM15658c.m15665g(id3.class, new fe3(bi1Var, 2));
        int i = 0;
        subtypeEffectHandlerBuilderM15658c.m15665g(rd3.class, new ury0(vry0Var, i));
        subtypeEffectHandlerBuilderM15658c.m15665g(fd3.class, new ury0(vry0Var, 1));
        m0o0 m0o0Var = vry0Var.f244278a;
        subtypeEffectHandlerBuilderM15658c.m15665g(md3.class, m0o0Var.m60469a());
        subtypeEffectHandlerBuilderM15658c.m15665g(be3.class, m0o0Var.m60470b());
        ge3 ge3Var = new ge3(vry0Var.f244280c, 2);
        Scheduler scheduler = vry0Var.f244282e;
        subtypeEffectHandlerBuilderM15658c.m15660b(vd3.class, ge3Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(wd3.class, new l2s0(vry0Var, 23), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15661c(hd3.class, hyx0.f96705N0);
        subtypeEffectHandlerBuilderM15658c.m15661c(td3.class, hyx0.f96706O0);
        subtypeEffectHandlerBuilderM15658c.m15661c(sd3.class, hyx0.f96707P0);
        subtypeEffectHandlerBuilderM15658c.m15661c(od3.class, hyx0.f96708Q0);
        subtypeEffectHandlerBuilderM15658c.m15661c(yd3.class, hyx0.f96719Z);
        subtypeEffectHandlerBuilderM15658c.m15661c(gd3.class, hyx0.f96703L0);
        subtypeEffectHandlerBuilderM15658c.m15661c(jd3.class, hyx0.f96704M0);
        return Mobius.m15580b(Mobius.m15582d(jlx0Var, RxConnectables.m15653a(new hnt(subtypeEffectHandlerBuilderM15658c.m15666h(), i))).mo15596h(this.f94427b).mo15592d(new are1(this)).mo15590b(new bre1(this)).mo15594f(csa0.m33762a()), (ph3) obj, new pu40(cre1.f41285a, dre1.f52316a, ere1.f62112h, fre1.f72474a, gre1.f83755h), MainThreadWorkRunner.m15627a());
    }
}
