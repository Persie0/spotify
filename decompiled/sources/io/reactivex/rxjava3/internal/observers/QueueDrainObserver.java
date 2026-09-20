package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.ObservableQueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {

    /* JADX INFO: renamed from: b */
    public final SerializedObserver f7393b;

    /* JADX INFO: renamed from: c */
    public final MpscLinkedQueue f7394c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7395d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f7396e;

    public QueueDrainObserver(SerializedObserver serializedObserver, MpscLinkedQueue mpscLinkedQueue) {
        this.f7393b = serializedObserver;
        this.f7394c = mpscLinkedQueue;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    /* JADX INFO: renamed from: a */
    public abstract void mo23469a(Observer observer, Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m23470b() {
        return this.f7397a.getAndIncrement() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m23471c(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.f7397a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.f7393b;
        MpscLinkedQueue mpscLinkedQueue = this.f7394c;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            mo23469a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
            if (!m23470b()) {
                return;
            }
        }
        QueueDrainHelper.m23773c(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    /* JADX INFO: renamed from: f */
    public final void m23472f(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.f7397a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.f7393b;
        MpscLinkedQueue mpscLinkedQueue = this.f7394c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            mpscLinkedQueue.offer(obj);
            if (!m23470b()) {
                return;
            }
        } else if (mpscLinkedQueue.isEmpty()) {
            mo23469a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
        }
        QueueDrainHelper.m23773c(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    /* JADX INFO: renamed from: g */
    public final int m23473g(int i) {
        return this.f7397a.addAndGet(i);
    }
}
