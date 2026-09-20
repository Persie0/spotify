package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public abstract class QueueDrainHelper {
    /* JADX INFO: renamed from: a */
    public static boolean m23771a(boolean z, boolean z2, Observer observer, MpscLinkedQueue mpscLinkedQueue, Disposable disposable, ObservableQueueDrain observableQueueDrain) {
        if (((QueueDrainObserver) observableQueueDrain).f7395d) {
            mpscLinkedQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static SimplePlainQueue m23772b(int i) {
        return i < 0 ? new SpscLinkedArrayQueue(-i) : new SpscArrayQueue(i);
    }

    /* JADX INFO: renamed from: c */
    public static void m23773c(MpscLinkedQueue mpscLinkedQueue, SerializedObserver serializedObserver, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        int iM23473g = 1;
        while (true) {
            MpscLinkedQueue mpscLinkedQueue2 = mpscLinkedQueue;
            SerializedObserver serializedObserver2 = serializedObserver;
            Disposable disposable2 = disposable;
            QueueDrainObserver queueDrainObserver2 = queueDrainObserver;
            if (m23771a(queueDrainObserver.f7396e, mpscLinkedQueue.isEmpty(), serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                return;
            }
            while (true) {
                boolean z = queueDrainObserver2.f7396e;
                Object objPoll = mpscLinkedQueue2.poll();
                boolean z2 = objPoll == null;
                boolean z3 = z2;
                if (m23771a(z, z2, serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                    return;
                }
                if (z3) {
                    break;
                } else {
                    queueDrainObserver2.mo23469a(serializedObserver2, objPoll);
                }
            }
            iM23473g = queueDrainObserver2.m23473g(-iM23473g);
            if (iM23473g == 0) {
                return;
            }
            serializedObserver = serializedObserver2;
            mpscLinkedQueue = mpscLinkedQueue2;
            disposable = disposable2;
            queueDrainObserver = queueDrainObserver2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m23774d(ft51 ft51Var, ArrayDeque arrayDeque, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (arrayDeque.isEmpty()) {
            ft51Var.onComplete();
            return;
        }
        if (m23775e(atomicLong.get(), ft51Var, arrayDeque, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            m23775e(j2, ft51Var, arrayDeque, atomicLong, booleanSupplier);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m23775e(long j, ft51 ft51Var, Queue queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        boolean zMo23407a;
        boolean zMo23407a2;
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                try {
                    zMo23407a = booleanSupplier.mo23407a();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    zMo23407a = true;
                }
                if (zMo23407a) {
                    break;
                }
                Object objPoll = queue.poll();
                if (objPoll == null) {
                    ft51Var.onComplete();
                    return true;
                }
                ft51Var.onNext(objPoll);
                j2++;
            } else {
                try {
                    zMo23407a2 = booleanSupplier.mo23407a();
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    zMo23407a2 = true;
                }
                if (zMo23407a2) {
                    break;
                }
                if (queue.isEmpty()) {
                    ft51Var.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j2 = jAddAndGet & Long.MIN_VALUE;
                    j = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m23776f(long j, ft51 ft51Var, ArrayDeque arrayDeque, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, BackpressureHelper.m23744c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        m23775e(j | Long.MIN_VALUE, ft51Var, arrayDeque, atomicLong, booleanSupplier);
        return true;
    }
}
