package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s5p implements voi, woi {

    /* JADX INFO: renamed from: X */
    public final iwr f205869X = new iwr();

    /* JADX INFO: renamed from: Y */
    public final BehaviorSubject f205870Y = BehaviorSubject.m23796g(new spi());

    /* JADX INFO: renamed from: a */
    public final ihm f205871a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f205872b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f205873c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f205874d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f205875e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f205876f;

    /* JADX INFO: renamed from: g */
    public final i4t0 f205877g;

    /* JADX INFO: renamed from: h */
    public final i4t0 f205878h;

    /* JADX INFO: renamed from: i */
    public final luk f205879i;

    /* JADX INFO: renamed from: t */
    public rpi f205880t;

    public s5p(ihm ihmVar, i4t0 i4t0Var, i4t0 i4t0Var2, ihm ihmVar2, ihm ihmVar3, ihm ihmVar4, ihm ihmVar5, ihm ihmVar6, luk lukVar) {
        this.f205871a = ihmVar;
        this.f205872b = i4t0Var;
        this.f205873c = i4t0Var2;
        this.f205874d = ihmVar2;
        this.f205875e = ihmVar3;
        this.f205876f = ihmVar4;
        this.f205877g = ihmVar5;
        this.f205878h = ihmVar6;
        this.f205879i = lukVar;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f205869X.m51847a();
        this.f205870Y.onNext(new spi());
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        Observable observableNever = Observable.never();
        MobiusLoop.Builder builderMo15592d = Mobius.m15582d(new p5p(), RxConnectables.m15653a(zoi.m96619a())).mo15590b(new q5p(this)).mo15592d(new r5p(this));
        x5p x5pVar = (x5p) this.f205874d.get();
        x5pVar.getClass();
        MobiusLoop.Builder builderM38558g = edb.m38558g(builderMo15592d.mo15596h(wug1.m89045m(Observable.defer(new yh1(x5pVar, 6)).subscribeOn(x5pVar.f258487a), (k7p) this.f205872b.get(), (C2615yj) this.f205878h.get(), (l480) this.f205875e.get())));
        rpi rpiVar = this.f205880t;
        if (rpiVar == null) {
            lau lauVar = lau.f131415a;
            rpiVar = new rpi(lauVar, false, lauVar, lauVar);
        }
        this.f205869X.m51848b(observableNever.compose(RxMobius.m15657b(builderM38558g, rpiVar)).doOnNext(new C2428tu(this, 21)).distinctUntilChanged().observeOn((Scheduler) this.f205876f.get()).subscribe(new g8f(this, 23)));
    }

    /* JADX INFO: renamed from: c */
    public final api m77296c() {
        xul0 xul0Var;
        spi spiVar = (spi) this.f205870Y.m23798h();
        if (spiVar == null || (xul0Var = spiVar.f212882c) == null) {
            return null;
        }
        return (api) xul0Var.mo49283h();
    }

    /* JADX INFO: renamed from: d */
    public final Observable m77297d() {
        return this.f205870Y.map(b5v.f23713U0);
    }

    /* JADX INFO: renamed from: g */
    public final List m77298g() {
        List list;
        spi spiVar = (spi) this.f205870Y.m23798h();
        return (spiVar == null || (list = spiVar.f212881b) == null) ? lau.f131415a : list;
    }

    /* JADX INFO: renamed from: i */
    public final Observable m77299i() {
        return this.f205870Y.map(hcp0.f89855N0);
    }

    /* JADX INFO: renamed from: j */
    public final y5p m77300j() {
        xul0 xul0Var;
        spi spiVar = (spi) this.f205870Y.m23798h();
        if (spiVar == null || (xul0Var = spiVar.f212883d) == null) {
            return null;
        }
        return (y5p) xul0Var.mo49283h();
    }

    /* JADX INFO: renamed from: k */
    public final Observable m77301k() {
        return this.f205870Y.map(efy.f59156Z0);
    }

    /* JADX INFO: renamed from: l */
    public final Observable m77302l() {
        return this.f205870Y.map(v450.f237059W0);
    }
}
