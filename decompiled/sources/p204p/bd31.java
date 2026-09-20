package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class bd31 implements tc31, t160 {

    /* JADX INFO: renamed from: a */
    public final khy0 f25990a;

    /* JADX INFO: renamed from: b */
    public final v301 f25991b;

    /* JADX INFO: renamed from: c */
    public final Flowable f25992c;

    /* JADX INFO: renamed from: d */
    public final er70 f25993d;

    /* JADX INFO: renamed from: e */
    public final mcu0 f25994e;

    /* JADX INFO: renamed from: f */
    public final okj0 f25995f;

    /* JADX INFO: renamed from: g */
    public final g2q f25996g;

    /* JADX INFO: renamed from: h */
    public final Scheduler f25997h;

    /* JADX INFO: renamed from: i */
    public final Scheduler f25998i;

    /* JADX INFO: renamed from: j */
    public final bg31 f25999j;

    /* JADX INFO: renamed from: k */
    public final wiy0 f26000k;

    /* JADX INFO: renamed from: l */
    public final lla f26001l;

    /* JADX INFO: renamed from: m */
    public final Observable f26002m;

    /* JADX INFO: renamed from: n */
    public final ib60 f26003n;

    /* JADX INFO: renamed from: o */
    public final iw3 f26004o;

    /* JADX INFO: renamed from: p */
    public final PublishSubject f26005p = new PublishSubject();

    /* JADX INFO: renamed from: q */
    public final SerialDisposable f26006q = new SerialDisposable();

    public bd31(khy0 khy0Var, v301 v301Var, Flowable flowable, er70 er70Var, mcu0 mcu0Var, okj0 okj0Var, g2q g2qVar, Scheduler scheduler, Scheduler scheduler2, bg31 bg31Var, wiy0 wiy0Var, lla llaVar, Observable observable, ib60 ib60Var, iw3 iw3Var) {
        this.f25990a = khy0Var;
        this.f25991b = v301Var;
        this.f25992c = flowable;
        this.f25993d = er70Var;
        this.f25994e = mcu0Var;
        this.f25995f = okj0Var;
        this.f25996g = g2qVar;
        this.f25997h = scheduler;
        this.f25998i = scheduler2;
        this.f25999j = bg31Var;
        this.f26000k = wiy0Var;
        this.f26001l = llaVar;
        this.f26002m = observable;
        this.f26003n = ib60Var;
        this.f26004o = iw3Var;
    }

    /* JADX INFO: renamed from: a */
    public final Single m28790a(gh00 gh00Var, gh00 gh00Var2) {
        if (!this.f25994e.m61497d()) {
            return Single.error(v9l.f238977a);
        }
        Single singleOnErrorResumeNext = m28791b().filter(new dnt(2, gh00Var)).firstOrError().timeout(11000L, TimeUnit.MILLISECONDS, this.f25997h).flatMap(new bc21(gh00Var2)).onErrorResumeNext(pnq0.f179486P0);
        wj50.m88279p(singleOnErrorResumeNext);
        return singleOnErrorResumeNext;
    }

    /* JADX INFO: renamed from: b */
    public final Observable m28791b() {
        bg31 bg31Var = this.f25999j;
        return bg31Var.f26827b.subscribeOn(bg31Var.f26826a);
    }

    /* JADX INFO: renamed from: c */
    public final Observable m28792c() {
        return this.f26000k.m88231t().distinctUntilChanged();
    }

    @Override // p204p.t160
    public final void start() {
        Observable observableJust = Observable.just(new zh31());
        yc31 yc31Var = new yc31();
        voi voiVar = (voi) this.f25993d.get();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        Scheduler scheduler = this.f25998i;
        khy0 khy0Var = this.f25990a;
        subtypeEffectHandlerBuilderM15658c.m15665g(eg31.class, new mc1(voiVar, scheduler, khy0Var, 22));
        bg31 bg31Var = this.f25999j;
        subtypeEffectHandlerBuilderM15658c.m15665g(cg31.class, new qal(voiVar, scheduler, khy0Var, bg31Var, 8));
        subtypeEffectHandlerBuilderM15658c.m15665g(fg31.class, new p830(voiVar, scheduler, khy0Var));
        subtypeEffectHandlerBuilderM15658c.m15665g(hg31.class, new n830(this.f26004o, voiVar, scheduler, khy0Var, this.f25995f));
        subtypeEffectHandlerBuilderM15658c.m15665g(kg31.class, new p830(khy0Var, scheduler, bg31Var, 3));
        subtypeEffectHandlerBuilderM15658c.m15665g(dg31.class, new bh31(khy0Var, scheduler, 0));
        subtypeEffectHandlerBuilderM15658c.m15665g(ig31.class, new ch31(khy0Var, scheduler, 0));
        subtypeEffectHandlerBuilderM15658c.m15665g(jg31.class, new ch31(khy0Var, scheduler, 1));
        subtypeEffectHandlerBuilderM15658c.m15665g(xg31.class, new bh31(khy0Var, scheduler, 1));
        subtypeEffectHandlerBuilderM15658c.m15665g(yg31.class, new bh31(khy0Var, scheduler, 2));
        subtypeEffectHandlerBuilderM15658c.m15661c(lg31.class, new sc01(this.f25996g, 23));
        subtypeEffectHandlerBuilderM15658c.m15661c(wg31.class, new sc01(bg31Var, 24));
        subtypeEffectHandlerBuilderM15658c.m15665g(gg31.class, new csr0(scheduler, this.f26003n, 7));
        MobiusLoop.Builder builderMo15592d = Mobius.m15582d(yc31Var, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15590b(new zc31(this)).mo15592d(new ad31(this));
        lla llaVar = this.f26001l;
        Observable observable = this.f26002m;
        PublishSubject publishSubject = this.f26005p;
        v301 v301Var = this.f25991b;
        Flowable flowable = this.f25992c;
        mcu0 mcu0Var = this.f25994e;
        this.f26006q.m23400a(observableJust.compose(RxMobius.m15657b(builderMo15592d.mo15596h(opo.m67572v(publishSubject, v301Var, flowable, mcu0Var, llaVar, observable)), new oi31(null, mcu0Var.m61497d(), -262145))).doOnSubscribe(u9w0.f228299f).doOnDispose(new y1s0(this, 17)).doOnNext(new sc01(this, 21)).subscribe());
    }

    @Override // p204p.t160
    public final void stop() {
        this.f26006q.m23400a(EmptyDisposable.f7220a);
    }
}
