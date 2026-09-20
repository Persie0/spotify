package p204p;

import android.os.Build;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v5p implements ssi {

    /* JADX INFO: renamed from: X */
    public Disposable f237543X;

    /* JADX INFO: renamed from: a */
    public final Scheduler f237544a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f237545b;

    /* JADX INFO: renamed from: c */
    public final dxo f237546c;

    /* JADX INFO: renamed from: d */
    public final lqw f237547d;

    /* JADX INFO: renamed from: e */
    public final er70 f237548e;

    /* JADX INFO: renamed from: f */
    public final cea0 f237549f;

    /* JADX INFO: renamed from: g */
    public PublishSubject f237550g;

    /* JADX INFO: renamed from: h */
    public PublishSubject f237551h;

    /* JADX INFO: renamed from: i */
    public Observable f237552i;

    /* JADX INFO: renamed from: t */
    public CompositeDisposable f237553t;

    public v5p(Scheduler scheduler, Scheduler scheduler2, dxo dxoVar, lqw lqwVar, er70 er70Var, cea0 cea0Var) {
        this.f237544a = scheduler;
        this.f237545b = scheduler2;
        this.f237546c = dxoVar;
        this.f237547d = lqwVar;
        this.f237548e = er70Var;
        this.f237549f = cea0Var;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        CompositeDisposable compositeDisposable = this.f237553t;
        if (compositeDisposable != null) {
            if (compositeDisposable != null) {
                compositeDisposable.m23396g();
            } else {
                wj50.m88260d0("disposableSet");
                throw null;
            }
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        this.f237553t = new CompositeDisposable();
        Disposable disposable = this.f237543X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f237543X = null;
        this.f237550g = new PublishSubject();
        PublishSubject publishSubject = new PublishSubject();
        this.f237551h = publishSubject;
        this.f237552i = publishSubject.startWithItem(w2a1.f247311a).switchMap(new t5p(this, 0));
        dxo dxoVar = this.f237546c;
        Disposable disposableSubscribe = dxoVar.f54036b.skip(1L).distinctUntilChanged().subscribe(new C2428tu(this, 22));
        CompositeDisposable compositeDisposable = this.f237553t;
        if (compositeDisposable == null) {
            wj50.m88260d0("disposableSet");
            throw null;
        }
        compositeDisposable.mo23393b(disposableSubscribe);
        Observable observable = this.f237552i;
        if (observable == null) {
            wj50.m88260d0("performDiscoveryObservable");
            throw null;
        }
        Scheduler scheduler = this.f237545b;
        Disposable disposableSubscribe2 = observable.observeOn(scheduler).subscribe(new u5p(this, 0));
        CompositeDisposable compositeDisposable2 = this.f237553t;
        if (compositeDisposable2 == null) {
            wj50.m88260d0("disposableSet");
            throw null;
        }
        compositeDisposable2.mo23393b(disposableSubscribe2);
        Disposable disposableSubscribe3 = k0e1.m54988g(this.f237549f.f37068b, dau.f47107a).skip(1L).filter(r101.f194653U0).observeOn(scheduler).subscribe(new u5p(this, 1));
        CompositeDisposable compositeDisposable3 = this.f237553t;
        if (compositeDisposable3 == null) {
            wj50.m88260d0("disposableSet");
            throw null;
        }
        compositeDisposable3.mo23393b(disposableSubscribe3);
        CompositeDisposable compositeDisposable4 = this.f237553t;
        if (compositeDisposable4 == null) {
            wj50.m88260d0("disposableSet");
            throw null;
        }
        compositeDisposable4.mo23393b(dxoVar.f54036b.filter(e370.f55649U0).take(1L).singleOrError().onErrorComplete().m23370h(scheduler).subscribe(new u5p(this, 3), C2234p.f172404Z));
        m84737c();
    }

    /* JADX INFO: renamed from: c */
    public final void m84737c() {
        if (Build.VERSION.SDK_INT <= 36 || this.f237549f.f37067a.m32585a()) {
            lqw lqwVar = this.f237547d;
            lqwVar.f136152b.m60127a(lqwVar.f136151a.m56126c(Empty.m1933n()).doOnSuccess(faq.f67594Q0).doOnError(faq.f67595R0).subscribe());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m84738d() {
        ((qnx0) this.f237548e.get()).mo36153d();
        m84737c();
        lqw lqwVar = this.f237547d;
        lwr lwrVar = lqwVar.f136152b;
        C2048kd c2048kd = lqwVar.f136151a;
        lwrVar.m60127a(c2048kd.m56131h(Empty.m1933n()).doOnSuccess(C2234p.f172390N0).doOnError(faq.f67596S0).subscribe());
        lwrVar.m60127a(c2048kd.m56119K(Empty.m1933n()).doOnSuccess(faq.f67597T0).doOnError(faq.f67598U0).subscribe());
    }

    /* JADX INFO: renamed from: g */
    public final void m84739g(String str) {
        Disposable disposable = this.f237543X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f237543X = null;
        if (str.equals("connect/devicepicker")) {
            m84738d();
            return;
        }
        PublishSubject publishSubject = this.f237550g;
        if (publishSubject != null) {
            publishSubject.onNext(w2a1.f247311a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m84740i() {
        PublishSubject publishSubject = this.f237551h;
        if (publishSubject != null) {
            publishSubject.onNext(w2a1.f247311a);
        }
        Disposable disposable = this.f237543X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f237543X = null;
        this.f237543X = Single.timer(10L, TimeUnit.SECONDS, this.f237544a).observeOn(this.f237545b).subscribe(new u5p(this, 2));
    }
}
