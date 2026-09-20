package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes5.dex */
public final class ac01 implements hbm0 {

    /* JADX INFO: renamed from: a */
    public final x1q0 f14216a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f14217b;

    /* JADX INFO: renamed from: c */
    public final ot7 f14218c;

    /* JADX INFO: renamed from: d */
    public final y901 f14219d;

    /* JADX INFO: renamed from: e */
    public final xb01 f14220e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f14221f;

    public ac01(x1q0 x1q0Var, z9j0 z9j0Var, ot7 ot7Var, y901 y901Var, xb01 xb01Var, Scheduler scheduler) {
        this.f14216a = x1q0Var;
        this.f14217b = z9j0Var;
        this.f14218c = ot7Var;
        this.f14219d = y901Var;
        this.f14220e = xb01Var;
        this.f14221f = scheduler;
    }

    @Override // p204p.hbm0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MobiusLoop.Controller mo25410a(hb01 hb01Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        z9j0 z9j0Var = this.f14217b;
        fp9 fp9Var = new fp9(z9j0Var, 16);
        Scheduler scheduler = this.f14221f;
        subtypeEffectHandlerBuilderM15658c.m15662d(j801.class, fp9Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(l801.class, new fp9(z9j0Var, 17), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(k801.class, new l2s0(this.f14216a, 29), scheduler);
        ot7 ot7Var = this.f14218c;
        subtypeEffectHandlerBuilderM15658c.m15665g(o801.class, new u3w(ot7Var, 2));
        xb01 xb01Var = this.f14220e;
        subtypeEffectHandlerBuilderM15658c.m15665g(n801.class, new csr0(6, ot7Var, xb01Var));
        subtypeEffectHandlerBuilderM15658c.m15665g(p801.class, new u3w(ot7Var, 3));
        subtypeEffectHandlerBuilderM15658c.m15665g(m801.class, new s8w0(xb01Var, 19));
        return MobiusAndroid.m15618b(Mobius.m15582d(yb01.f271041a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15596h(this.f14219d), hb01Var, zb01.f281201a);
    }
}
