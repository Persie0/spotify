package io.reactivex.rxjava3.disposables;

/* JADX INFO: loaded from: classes2.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: a */
    public final void mo23390a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
