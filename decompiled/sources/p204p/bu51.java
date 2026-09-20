package p204p;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes11.dex */
public final class bu51 extends bqa implements Observer, MaybeObserver {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31026X = AtomicReferenceFieldUpdater.newUpdater(bu51.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    @Override // p204p.bqa
    /* JADX INFO: renamed from: I */
    public final void mo30217I() {
        Disposable disposable = (Disposable) f31026X.getAndSet(this, null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        m30233l(null, false);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        m30233l(th, false);
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        f31026X.set(this, disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        mo30231j(obj);
        m30233l(null, false);
    }
}
