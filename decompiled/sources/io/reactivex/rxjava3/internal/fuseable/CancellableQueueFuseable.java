package io.reactivex.rxjava3.internal.fuseable;

/* JADX INFO: loaded from: classes11.dex */
public final class CancellableQueueFuseable<T> extends AbstractEmptyQueueFuseable<T> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f7266a;

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, p204p.ot51
    public final void cancel() {
        this.f7266a = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f7266a = true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7266a;
    }
}
