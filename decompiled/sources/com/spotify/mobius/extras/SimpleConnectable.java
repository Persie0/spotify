package com.spotify.mobius.extras;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class SimpleConnectable<T, R> implements Connectable<T, R> {

    /* JADX INFO: renamed from: a */
    public final Function f5753a;

    public SimpleConnectable(Function function) {
        this.f5753a = function;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return (Connection) this.f5753a.apply(consumer);
    }
}
