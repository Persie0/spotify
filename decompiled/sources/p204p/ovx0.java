package p204p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class ovx0 implements CompletableObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f170583a;

    public ovx0(hqb hqbVar) {
        this.f170583a = hqbVar;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f170583a.resumeWith(w2a1.f247311a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        this.f170583a.resumeWith(new c6x0(th));
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        this.f170583a.mo42415l(new rv70(disposable, 20));
    }
}
