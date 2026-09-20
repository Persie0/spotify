package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Connection<I> extends Disposable, Consumer<I> {
    @Override // com.spotify.mobius.functions.Consumer
    void accept(Object obj);

    @Override // com.spotify.mobius.disposables.Disposable
    void dispose();
}
