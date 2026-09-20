package p204p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes8.dex */
public final class nwa implements CompletableObserver {

    /* JADX INFO: renamed from: a */
    public final lwr f159073a = new lwr();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ owa f159074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rza f159075c;

    public nwa(owa owaVar, rza rzaVar) {
        this.f159074b = owaVar;
        this.f159075c = rzaVar;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f159074b.f170680d.onNext(this.f159075c);
        this.f159073a.m60129c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f159073a.m60129c();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f159073a.m60127a(disposable);
    }
}
