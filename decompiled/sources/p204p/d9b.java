package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class d9b implements Disposable {

    /* JADX INFO: renamed from: a */
    public final x8b f46773a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f46774b;

    public d9b(x8b x8bVar) {
        this.f46773a = x8bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f46774b = true;
        this.f46773a.cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f46774b;
    }
}
