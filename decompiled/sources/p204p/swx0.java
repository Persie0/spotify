package p204p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes.dex */
public final class swx0 implements CompletableObserver {

    /* JADX INFO: renamed from: a */
    public Disposable f214733a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ twx0 f214734b;

    public swx0(twx0 twx0Var) {
        this.f214734b = twx0Var;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f214733a.dispose();
        this.f214734b.f224504b.mo23392a(this.f214733a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        onComplete();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f214733a = disposable;
        this.f214734b.f224504b.mo23393b(disposable);
    }
}
