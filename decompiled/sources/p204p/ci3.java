package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class ci3 implements jnh0 {

    /* JADX INFO: renamed from: a */
    public final ce3 f38196a;

    /* JADX INFO: renamed from: b */
    public final EventSource f38197b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f38198c;

    public ci3(ce3 ce3Var, EventSource eventSource, Scheduler scheduler) {
        this.f38196a = ce3Var;
        this.f38197b = eventSource;
        this.f38198c = scheduler;
    }

    @Override // p204p.jnh0
    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller mo32865a(Object obj, bi1 bi1Var) {
        uh3 uh3Var = uh3.f230352h;
        v961 v961Var = new v961(22);
        he3 he3Var = (he3) this.f38196a;
        he3Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(ld3.class, he3Var.f90297e.m95701t());
        int i = 1;
        subtypeEffectHandlerBuilderM15658c.m15661c(td3.class, new de3(he3Var, i));
        int i2 = 2;
        subtypeEffectHandlerBuilderM15658c.m15661c(sd3.class, new de3(he3Var, i2));
        subtypeEffectHandlerBuilderM15658c.m15663e(gd3.class, new ac5(he3Var, 11));
        int i3 = 0;
        subtypeEffectHandlerBuilderM15658c.m15665g(id3.class, new fe3(bi1Var, i3));
        m0o0 m0o0Var = he3Var.f90294b;
        subtypeEffectHandlerBuilderM15658c.m15665g(md3.class, m0o0Var.m60469a());
        subtypeEffectHandlerBuilderM15658c.m15665g(be3.class, m0o0Var.m60470b());
        de3 de3Var = new de3(he3Var, 3);
        Scheduler scheduler = he3Var.f90298f;
        subtypeEffectHandlerBuilderM15658c.m15662d(ud3.class, de3Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15660b(vd3.class, new ge3(he3Var.f90299g, 0), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(wd3.class, new de3(he3Var, 4), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15661c(hd3.class, new de3(he3Var, 5));
        subtypeEffectHandlerBuilderM15658c.m15665g(yd3.class, he3Var.f90296d.mo60158a());
        subtypeEffectHandlerBuilderM15658c.m15665g(zd3.class, (ObservableTransformer) he3Var.f90305m.f167577c.getValue());
        subtypeEffectHandlerBuilderM15658c.m15665g(od3.class, (ObservableTransformer) he3Var.f90304l.f215064d.getValue());
        subtypeEffectHandlerBuilderM15658c.m15665g(nd3.class, (y421) he3Var.f90306n.f257251f);
        subtypeEffectHandlerBuilderM15658c.m15662d(xd3.class, new de3(he3Var, 6), scheduler);
        subtypeEffectHandlerBuilderM15658c.m15661c(qd3.class, new de3(he3Var, i3));
        gnt.m45317a(subtypeEffectHandlerBuilderM15658c, kd3.class, new ee3(he3Var, i3));
        gnt.m45317a(subtypeEffectHandlerBuilderM15658c, pd3.class, new ee3(he3Var, i));
        gnt.m45317a(subtypeEffectHandlerBuilderM15658c, jd3.class, new ee3(he3Var, i2));
        subtypeEffectHandlerBuilderM15658c.m15661c(rd3.class, C1710bm.f28312L0);
        subtypeEffectHandlerBuilderM15658c.m15661c(fd3.class, C1710bm.f28313M0);
        return Mobius.m15580b(Mobius.m15582d(v961Var, RxConnectables.m15653a(new hnt(subtypeEffectHandlerBuilderM15658c.m15666h(), i3))).mo15596h(this.f38197b).mo15592d(new vh3(this)).mo15590b(new wh3(this)).mo15594f(csa0.m33762a()), (ph3) obj, new pu40(xh3.f261426a, yh3.f272719a, zh3.f282788h, ai3.f15863a, bi3.f27316h), MainThreadWorkRunner.m15627a());
    }
}
