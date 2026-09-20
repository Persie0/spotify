package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SerialDisposable implements Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7212a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final void m23400a(Disposable disposable) {
        DisposableHelper.m23417f(this.f7212a, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.m23414a(this.f7212a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.m23415b((Disposable) this.f7212a.get());
    }
}
