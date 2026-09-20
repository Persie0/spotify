package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class fza implements cza {

    /* JADX INFO: renamed from: a */
    public final jwa f74952a;

    /* JADX INFO: renamed from: b */
    public final wza f74953b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f74954c;

    /* JADX INFO: renamed from: d */
    public final PublishSubject f74955d = new PublishSubject();

    /* JADX INFO: renamed from: e */
    public final BehaviorSubject f74956e = BehaviorSubject.m23796g("");

    public fza(jwa jwaVar, wza wzaVar, Scheduler scheduler) {
        this.f74952a = jwaVar;
        this.f74953b = wzaVar;
        this.f74954c = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final void m43184a(String str) {
        if (bm51.m29803n0(str, "spotify:messaging", false)) {
            return;
        }
        this.f74956e.onNext(str);
        ObservableSource observableSourceHide = this.f74952a.f116611a.hide();
        wza wzaVar = this.f74953b;
        Observable.combineLatest(observableSourceHide, wzaVar.f256543a.map(new e99(wzaVar, 5)), t6x0.f217644g).filter(p4h1.f173924L0).take(1L).ignoreElements().m23303t(this.f74954c).subscribe(new eza(this, str));
    }
}
