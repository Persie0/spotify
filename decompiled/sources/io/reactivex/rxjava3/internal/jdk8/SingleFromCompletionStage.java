package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleFromCompletionStage<T> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final CompletionStage f7332a;

    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f7333a;

        /* JADX INFO: renamed from: b */
        public final FlowableFromCompletionStage$BiConsumerAtomicReference f7334b;

        public CompletionStageHandler(SingleObserver singleObserver, FlowableFromCompletionStage$BiConsumerAtomicReference flowableFromCompletionStage$BiConsumerAtomicReference) {
            this.f7333a = singleObserver;
            this.f7334b = flowableFromCompletionStage$BiConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            SingleObserver singleObserver = this.f7333a;
            if (th2 != null) {
                singleObserver.onError(th2);
            } else if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7334b.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7334b.get() == null;
        }
    }

    public SingleFromCompletionStage(CompletionStage completionStage) {
        this.f7332a = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        FlowableFromCompletionStage$BiConsumerAtomicReference flowableFromCompletionStage$BiConsumerAtomicReference = new FlowableFromCompletionStage$BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(singleObserver, flowableFromCompletionStage$BiConsumerAtomicReference);
        flowableFromCompletionStage$BiConsumerAtomicReference.lazySet(completionStageHandler);
        singleObserver.onSubscribe(completionStageHandler);
        this.f7332a.whenComplete(flowableFromCompletionStage$BiConsumerAtomicReference);
    }
}
