package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class g1q {

    /* JADX INFO: renamed from: a */
    public final m500 f75678a;

    /* JADX INFO: renamed from: b */
    public final j5y0 f75679b;

    /* JADX INFO: renamed from: c */
    public final ngr f75680c;

    /* JADX INFO: renamed from: d */
    public final zmn0 f75681d;

    /* JADX INFO: renamed from: e */
    public final opr0 f75682e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f75683f;

    /* JADX INFO: renamed from: g */
    public final Scheduler f75684g;

    /* JADX INFO: renamed from: h */
    public final mpr0 f75685h;

    /* JADX INFO: renamed from: i */
    public final tgq f75686i;

    /* JADX INFO: renamed from: j */
    public final og0 f75687j;

    public g1q(m500 m500Var, j5y0 j5y0Var, ngr ngrVar, zmn0 zmn0Var, opr0 opr0Var, Scheduler scheduler, Scheduler scheduler2, mpr0 mpr0Var, tgq tgqVar, og0 og0Var) {
        this.f75678a = m500Var;
        this.f75679b = j5y0Var;
        this.f75680c = ngrVar;
        this.f75681d = zmn0Var;
        this.f75682e = opr0Var;
        this.f75683f = scheduler;
        this.f75684g = scheduler2;
        this.f75685h = mpr0Var;
        this.f75686i = tgqVar;
        this.f75687j = og0Var;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m43365a(b1q b1qVar) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        ngr ngrVar = this.f75680c;
        jor0 jor0Var = new jor0(ngrVar, 1);
        Scheduler scheduler = this.f75683f;
        subtypeEffectHandlerBuilderM15658c.m15662d(znr0.class, jor0Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(xnr0.class, new jor0(ngrVar, 0), scheduler);
        zmn0 zmn0Var = this.f75681d;
        j5y0 j5y0Var = this.f75679b;
        subtypeEffectHandlerBuilderM15658c.m15662d(hor0.class, new xv2(b1qVar, zmn0Var, ngrVar, j5y0Var, 8), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15665g(bor0.class, new lor0(scheduler, b1qVar, zmn0Var, 0));
        tgq tgqVar = this.f75686i;
        subtypeEffectHandlerBuilderM15658c.m15665g(ynr0.class, new i4t(tgqVar, 1));
        subtypeEffectHandlerBuilderM15658c.m15662d(dor0.class, new l4t(tgqVar, 1), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15665g(for0.class, new C2263po(27, scheduler, zmn0Var));
        subtypeEffectHandlerBuilderM15658c.m15661c(cor0.class, new o4n0(this.f75687j, 23));
        subtypeEffectHandlerBuilderM15658c.m15661c(eor0.class, new h4t(j5y0Var, 2));
        subtypeEffectHandlerBuilderM15658c.m15662d(aor0.class, new k4t(this.f75678a, 2), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15665g(ior0.class, new lor0(scheduler, b1qVar, zmn0Var, 1));
        subtypeEffectHandlerBuilderM15658c.m15662d(gor0.class, new o4n0(zmn0Var, 24), scheduler);
        return Mobius.m15580b(Mobius.m15582d(d1q.f44326a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15596h(this.f75685h).mo15590b(new e1q(this)).mo15592d(new f1q(this)), this.f75682e, c1q.f33175a, new SchedulerWorkRunner(scheduler));
    }
}
