package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes11.dex */
final class FlowableFromCompletionStage$BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Throwable th) {
        Throwable th2 = th;
        BiConsumer<T, Throwable> biConsumer = get();
        if (biConsumer != null) {
            biConsumer.accept(obj, th2);
        }
    }
}
