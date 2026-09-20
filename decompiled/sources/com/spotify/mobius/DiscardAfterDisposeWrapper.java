package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
class DiscardAfterDisposeWrapper<I> implements Consumer<I>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Consumer f5548a;

    /* JADX INFO: renamed from: b */
    public final Disposable f5549b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f5550c;

    public DiscardAfterDisposeWrapper(Consumer consumer, Connection connection) {
        this.f5548a = consumer;
        this.f5549b = connection;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        if (this.f5550c) {
            return;
        }
        this.f5548a.accept(obj);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f5550c = true;
        Disposable disposable = this.f5549b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
