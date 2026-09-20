package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class r6y0 implements j5y0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f196376a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f196377b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f196378c;

    /* JADX INFO: renamed from: d */
    public final vsk f196379d;

    /* JADX INFO: renamed from: e */
    public final Flowable f196380e;

    /* JADX INFO: renamed from: f */
    public final p140 f196381f;

    /* JADX INFO: renamed from: i */
    public final m12 f196384i;

    /* JADX INFO: renamed from: j */
    public final wg61 f196385j;

    /* JADX INFO: renamed from: l */
    public boolean f196387l;

    /* JADX INFO: renamed from: m */
    public boolean f196388m;

    /* JADX INFO: renamed from: n */
    public boolean f196389n;

    /* JADX INFO: renamed from: p */
    public boolean f196391p;

    /* JADX INFO: renamed from: g */
    public final PublishSubject f196382g = new PublishSubject();

    /* JADX INFO: renamed from: h */
    public final BehaviorSubject f196383h = BehaviorSubject.m23796g(new t6y0());

    /* JADX INFO: renamed from: k */
    public Disposable f196386k = EmptyDisposable.f7220a;

    /* JADX INFO: renamed from: o */
    public final wg61 f196390o = new wg61(new f8w0(this, 24));

    public r6y0(RetrofitMaker retrofitMaker, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, vsk vskVar, Flowable flowable, p140 p140Var, zvy zvyVar) {
        this.f196376a = scheduler;
        this.f196377b = scheduler2;
        this.f196378c = scheduler3;
        this.f196379d = vskVar;
        this.f196380e = flowable;
        this.f196381f = p140Var;
        this.f196384i = zvyVar.m97098a();
        this.f196385j = new wg61(new nzk0(retrofitMaker, 26));
    }

    /* JADX INFO: renamed from: a */
    public final void m74878a() {
        if (!this.f196391p || (!this.f196389n && !this.f196387l)) {
            if (this.f196386k.isDisposed()) {
                return;
            }
            this.f196386k.dispose();
        } else if (this.f196386k.isDisposed()) {
            Observable observableCompose = Observable.never().compose(RxMobius.m15657b(edb.m38558g(Mobius.m15582d(m6y0.f140599a, RxConnectables.m15653a(y5y0.m92855a(this.f196377b, this.f196379d, this.f196384i, this.f196381f, (ld40) this.f196385j.getValue(), this.f196380e))).mo15590b(new n6y0(this)).mo15592d(new o6y0(this)).mo15596h(rsf1.m76336t(this.f196382g))), new s6y0()));
            Scheduler scheduler = this.f196376a;
            this.f196386k = observableCompose.subscribeOn(scheduler).observeOn(scheduler).subscribe(new q6y0(this, 1));
        }
    }
}
