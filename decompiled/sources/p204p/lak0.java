package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes8.dex */
public final class lak0 {

    /* JADX INFO: renamed from: a */
    public final Flowable f131356a;

    /* JADX INFO: renamed from: b */
    public final itb1 f131357b;

    /* JADX INFO: renamed from: c */
    public final g6p f131358c;

    /* JADX INFO: renamed from: d */
    public final wek0 f131359d;

    /* JADX INFO: renamed from: e */
    public final u6p f131360e;

    /* JADX INFO: renamed from: f */
    public final xre f131361f;

    /* JADX INFO: renamed from: g */
    public final qwx0 f131362g;

    /* JADX INFO: renamed from: h */
    public final dr11 f131363h;

    /* JADX INFO: renamed from: i */
    public final si70 f131364i;

    /* JADX INFO: renamed from: j */
    public final djs f131365j;

    /* JADX INFO: renamed from: k */
    public final Scheduler f131366k;

    /* JADX INFO: renamed from: l */
    public final Scheduler f131367l;

    /* JADX INFO: renamed from: m */
    public final y54 f131368m;

    /* JADX INFO: renamed from: n */
    public final i5z f131369n;

    public lak0(Flowable flowable, itb1 itb1Var, g6p g6pVar, wek0 wek0Var, u6p u6pVar, xre xreVar, qwx0 qwx0Var, dr11 dr11Var, si70 si70Var, djs djsVar, Scheduler scheduler, Scheduler scheduler2, y54 y54Var, i5z i5zVar) {
        this.f131356a = flowable;
        this.f131357b = itb1Var;
        this.f131358c = g6pVar;
        this.f131359d = wek0Var;
        this.f131360e = u6pVar;
        this.f131361f = xreVar;
        this.f131362g = qwx0Var;
        this.f131363h = dr11Var;
        this.f131364i = si70Var;
        this.f131365j = djsVar;
        this.f131366k = scheduler;
        this.f131367l = scheduler2;
        this.f131368m = y54Var;
        this.f131369n = i5zVar;
    }

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Controller m58571a() {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        qbj0 qbj0Var = new qbj0(this.f131359d, 8);
        Scheduler scheduler = this.f131366k;
        subtypeEffectHandlerBuilderM15658c.m15662d(s8k0.class, qbj0Var, scheduler);
        subtypeEffectHandlerBuilderM15658c.m15662d(r8k0.class, new qbj0(this.f131360e, 7), scheduler);
        si70 si70Var = this.f131364i;
        subtypeEffectHandlerBuilderM15658c.m15662d(t8k0.class, new qbj0(si70Var, 9), scheduler);
        MobiusLoop.Builder builderMo15592d = Mobius.m15582d(jak0.f110480a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15592d(new kak0(this));
        Observable observableStartWithItem = this.f131357b.m51626a().startWithItem(new o5c1(gbu.f78413a));
        yv7 yv7Var = this.f131358c.f77089a;
        int i = 0;
        noa0 noa0Var = new noa0(1, this.f131365j, djs.class, "indicatorEligibleToShowForTrack", "indicatorEligibleToShowForTrack(Lcom/spotify/player/model/ContextTrack;)Z", 0, i, 20);
        ooa0 ooa0Var = new ooa0(0, this.f131361f, xre.class, "currentTimeMillis", "currentTimeMillis()J", i, 0, 29);
        Flowable flowable = this.f131356a;
        Observable map = new ObservableFromPublisher(flowable).map(new a5j0(5, ooa0Var, noa0Var)).distinctUntilChanged().map(y3z.f269012Q0);
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(flowable);
        Observable map2 = Observable.combineLatest(observableFromPublisher.filter(uty.f234009N0), observableStartWithItem.map(q2z.f184734Q0), ((rwx0) this.f131362g).m76590a("allow-child-video", "true").map(r2z.f195265Q0), observableFromPublisher.compose(this.f131363h), new w090(this.f131368m, 25)).distinctUntilChanged().map(s2z.f205104Q0);
        dau dauVar = dau.f47107a;
        Observable map3 = k0e1.m54988g(yv7Var, dauVar).map(isy.f105337Q0).distinctUntilChanged().map(jsy.f115605Q0);
        Observable map4 = k0e1.m54988g(new zux(si70Var.f209369c, si70Var.m78185a(), new qi70(si70Var, null), 1), dauVar).distinctUntilChanged().map(t2z.f216647Q0);
        i5z i5zVar = this.f131369n;
        return MobiusAndroid.m15618b(klh.m56831c("NowPlayingBar", builderMo15592d.mo15596h(RxEventSources.m15655a(map, map2, map3, map4, k0e1.m54988g(new b7g0(!((cd4) ((a660) i5zVar.f99060c).f12703a.get()).m32347B() ? new ysk(Boolean.FALSE, 27) : mvl0.m62953p(new qp20(((mb80) i5zVar.f99059b).f141817b.current(), 16)), 17), dauVar)))), new pak0(z9p0.f280849a, xxj.f267012a, awi.f20542a, false, false, false), new Init() { // from class: p.iak0
            @Override // com.spotify.mobius.Init
            /* JADX INFO: renamed from: f0 */
            public final First mo15576f0(Object obj) {
                this.f100272a.getClass();
                return First.m15574b((pak0) obj);
            }
        });
    }
}
