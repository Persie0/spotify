package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes.dex */
public final class vho implements CompletableObserver {
    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        Logger.m3966b("Failed to subscribe to completable", new Object[0]);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
    }
}
