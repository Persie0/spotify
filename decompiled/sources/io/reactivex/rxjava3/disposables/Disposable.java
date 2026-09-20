package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.functions.Action;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface Disposable {
    /* JADX INFO: renamed from: d */
    static Disposable m23398d(Action action) {
        return new ActionDisposable(action);
    }

    /* JADX INFO: renamed from: e */
    static Disposable m23399e(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        Objects.requireNonNull(runnable, "value is null");
        return new RunnableDisposable(runnable);
    }

    void dispose();

    boolean isDisposed();
}
