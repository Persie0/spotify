package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class eg51 implements awr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Disposable f59226a;

    public eg51(Disposable disposable) {
        this.f59226a = disposable;
    }

    @Override // p204p.awr
    public final void dispose() {
        this.f59226a.dispose();
    }
}
