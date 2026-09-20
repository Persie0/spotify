package p204p;

import androidx.work.rxjava3.RxWorker;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kyx0 implements SingleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gbb f127935a;

    public kyx0(gbb gbbVar) {
        this.f127935a = gbbVar;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f127935a.m44212c(th);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        Objects.requireNonNull(disposable);
        this.f127935a.m44210a(new RunnableC2364s6(disposable, 10), RxWorker.f1434e);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f127935a.m44211b(obj);
    }
}
