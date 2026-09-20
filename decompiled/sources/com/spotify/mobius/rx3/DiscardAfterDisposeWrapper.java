package com.spotify.mobius.rx3;

import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
class DiscardAfterDisposeWrapper<I> implements Consumer<I>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Consumer f5776a;

    /* JADX INFO: renamed from: b */
    public final Disposable f5777b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f5778c;

    public DiscardAfterDisposeWrapper(Consumer consumer, Connection connection) {
        this.f5776a = consumer;
        this.f5777b = connection;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        if (this.f5778c) {
            return;
        }
        this.f5776a.accept(obj);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f5778c = true;
        Disposable disposable = this.f5777b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
