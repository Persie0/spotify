package p204p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class eza implements CompletableObserver {

    /* JADX INFO: renamed from: a */
    public final lwr f64312a = new lwr();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fza f64313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64314c;

    public eza(fza fzaVar, String str) {
        this.f64313b = fzaVar;
        this.f64314c = str;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f64313b.f74955d.onNext(new zya(this.f64314c));
        this.f64312a.m60129c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f64312a.m60129c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f64312a.m60127a(disposable);
    }
}
