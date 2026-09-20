package p204p;

import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;

/* JADX INFO: loaded from: classes8.dex */
public final class y790 extends AbstractC1694b7 {

    /* JADX INFO: renamed from: e */
    public final ConsumerSingleObserver f269996e = new ConsumerSingleObserver(new x790(this, 0), new x790(this, 1));

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: r */
    public final void mo28327r() {
        this.f269996e.dispose();
    }
}
