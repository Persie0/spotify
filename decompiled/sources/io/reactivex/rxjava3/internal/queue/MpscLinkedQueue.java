package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.operators.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class MpscLinkedQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10093a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10094b;

    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {

        /* JADX INFO: renamed from: a */
        public Object f10095a;
    }

    public MpscLinkedQueue() {
        AtomicReference atomicReference = new AtomicReference();
        this.f10093a = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.f10094b = atomicReference2;
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        atomicReference2.lazySet(linkedQueueNode);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return ((LinkedQueueNode) this.f10094b.get()) == ((LinkedQueueNode) this.f10093a.get());
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        linkedQueueNode.f10095a = obj;
        ((LinkedQueueNode) this.f10093a.getAndSet(linkedQueueNode)).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        LinkedQueueNode linkedQueueNode;
        AtomicReference atomicReference = this.f10094b;
        LinkedQueueNode linkedQueueNode2 = (LinkedQueueNode) atomicReference.get();
        LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            Object obj = linkedQueueNode3.f10095a;
            linkedQueueNode3.f10095a = null;
            atomicReference.lazySet(linkedQueueNode3);
            return obj;
        }
        if (linkedQueueNode2 == ((LinkedQueueNode) this.f10093a.get())) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        Object obj2 = linkedQueueNode.f10095a;
        linkedQueueNode.f10095a = null;
        atomicReference.lazySet(linkedQueueNode);
        return obj2;
    }
}
