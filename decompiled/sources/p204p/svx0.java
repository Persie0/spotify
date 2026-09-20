package p204p;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class svx0 implements MaybeObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f214528a;

    public svx0(hqb hqbVar) {
        this.f214528a = hqbVar;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f214528a.resumeWith(null);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f214528a.resumeWith(new c6x0(th));
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        this.f214528a.mo42415l(new rv70(disposable, 20));
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f214528a.resumeWith(obj);
    }
}
