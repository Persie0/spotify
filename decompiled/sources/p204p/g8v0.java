package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes10.dex */
public final class g8v0 implements e8v0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f77600a;

    /* JADX INFO: renamed from: b */
    public final d2j0 f77601b;

    /* JADX INFO: renamed from: c */
    public final hyo0 f77602c;

    /* JADX INFO: renamed from: d */
    public final emx f77603d;

    /* JADX INFO: renamed from: e */
    public final cq9 f77604e;

    /* JADX INFO: renamed from: f */
    public final s4k f77605f;

    /* JADX INFO: renamed from: g */
    public final yfu0 f77606g;

    /* JADX INFO: renamed from: h */
    public h8v0 f77607h = new h8v0(1570, new b450(0, 15, 1));

    /* JADX INFO: renamed from: i */
    public MobiusLoop f77608i;

    public g8v0(Scheduler scheduler, d2j0 d2j0Var, hyo0 hyo0Var, emx emxVar, cq9 cq9Var, s4k s4kVar, yfu0 yfu0Var) {
        this.f77600a = scheduler;
        this.f77601b = d2j0Var;
        this.f77602c = hyo0Var;
        this.f77603d = emxVar;
        this.f77604e = cq9Var;
        this.f77605f = s4kVar;
        this.f77606g = yfu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m43966a(h6v0 h6v0Var) {
        MobiusLoop mobiusLoop = this.f77608i;
        if (mobiusLoop != null) {
            mobiusLoop.m15600a(h6v0Var);
        } else {
            wj50.m88260d0("loop");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43967b(c8v0 c8v0Var, c8v0 c8v0Var2) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(q5v0.class, new ynb0(new gem0(this.f77601b, 1), 25));
        subtypeEffectHandlerBuilderM15658c.m15665g(p5v0.class, new ynb0(this, 26));
        Scheduler scheduler = this.f77600a;
        subtypeEffectHandlerBuilderM15658c.m15662d(t5v0.class, c8v0Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(r5v0.class, c8v0Var2, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(m5v0.class, new f8v0(this, 0), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(n5v0.class, new f8v0(this, 1), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(s5v0.class, new f8v0(this, 2), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(o5v0.class, new f8v0(this, 3), scheduler);
        MobiusLoop mobiusLoopMo15595g = Mobius.m15582d(mfr0.f143151j, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15590b(hkr0.f92500f).mo15592d(mkr0.f144659f).mo15595g(this.f77607h);
        this.f77608i = mobiusLoopMo15595g;
        mobiusLoopMo15595g.m15600a(new a6v0(wwg1.m89179A(this.f77607h)));
    }
}
