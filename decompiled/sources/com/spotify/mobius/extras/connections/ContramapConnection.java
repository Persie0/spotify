package com.spotify.mobius.extras.connections;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public class ContramapConnection<A, B, C> implements Connection<B> {

    /* JADX INFO: renamed from: a */
    public final Function f5754a;

    /* JADX INFO: renamed from: b */
    public final Connection f5755b;

    public ContramapConnection(Function function, Connectable connectable, Consumer consumer) {
        this.f5754a = function;
        this.f5755b = connectable.mo3269P(consumer);
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f5755b.accept(this.f5754a.apply(obj));
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        this.f5755b.dispose();
    }
}
