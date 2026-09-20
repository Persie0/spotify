package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectConsumer implements Consumer<Disposable> {

    /* JADX INFO: renamed from: a */
    public Disposable f10251a;

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f10251a = (Disposable) obj;
    }
}
