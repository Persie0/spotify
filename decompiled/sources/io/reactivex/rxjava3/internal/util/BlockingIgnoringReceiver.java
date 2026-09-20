package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class BlockingIgnoringReceiver extends CountDownLatch implements Consumer<Throwable>, Action {

    /* JADX INFO: renamed from: a */
    public Throwable f10250a;

    public BlockingIgnoringReceiver() {
        super(1);
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f10250a = (Throwable) obj;
        countDown();
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        countDown();
    }
}
