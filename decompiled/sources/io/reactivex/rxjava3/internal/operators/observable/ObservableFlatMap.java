package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: renamed from: b */
    public final Function f8935b;

    /* JADX INFO: renamed from: c */
    public final boolean f8936c;

    /* JADX INFO: renamed from: d */
    public final int f8937d;

    /* JADX INFO: renamed from: e */
    public final int f8938e;

    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {

        /* JADX INFO: renamed from: a */
        public final MergeObserver f8939a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f8940b;

        /* JADX INFO: renamed from: c */
        public volatile SimpleQueue f8941c;

        /* JADX INFO: renamed from: d */
        public int f8942d;

        public InnerObserver(MergeObserver mergeObserver) {
            this.f8939a = mergeObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8940b = true;
            this.f8939a.m23613c();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f8939a.f8957h.m23737a(th)) {
                MergeObserver mergeObserver = this.f8939a;
                if (!mergeObserver.f8952c) {
                    mergeObserver.m23612b();
                }
                this.f8940b = true;
                this.f8939a.m23613c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f8942d != 0) {
                this.f8939a.m23613c();
                return;
            }
            MergeObserver mergeObserver = this.f8939a;
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.f8950a.onNext(obj);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.f8941c;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(mergeObserver.f8954e);
                    this.f8941c = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.m23614f();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23418g(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo23423a = queueDisposable.mo23423a(7);
                if (iMo23423a == 1) {
                    this.f8942d = iMo23423a;
                    this.f8941c = queueDisposable;
                    this.f8940b = true;
                    this.f8939a.m23613c();
                    return;
                }
                if (iMo23423a == 2) {
                    this.f8942d = iMo23423a;
                    this.f8941c = queueDisposable;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: N0 */
        public static final InnerObserver[] f8943N0 = new InnerObserver[0];

        /* JADX INFO: renamed from: O0 */
        public static final InnerObserver[] f8944O0 = new InnerObserver[0];

        /* JADX INFO: renamed from: L0 */
        public final ArrayDeque f8945L0;

        /* JADX INFO: renamed from: M0 */
        public int f8946M0;

        /* JADX INFO: renamed from: X */
        public Disposable f8947X;

        /* JADX INFO: renamed from: Y */
        public long f8948Y;

        /* JADX INFO: renamed from: Z */
        public int f8949Z;

        /* JADX INFO: renamed from: a */
        public final Observer f8950a;

        /* JADX INFO: renamed from: b */
        public final Function f8951b;

        /* JADX INFO: renamed from: c */
        public final boolean f8952c;

        /* JADX INFO: renamed from: d */
        public final int f8953d;

        /* JADX INFO: renamed from: e */
        public final int f8954e;

        /* JADX INFO: renamed from: f */
        public volatile SimplePlainQueue f8955f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f8956g;

        /* JADX INFO: renamed from: h */
        public final AtomicThrowable f8957h = new AtomicThrowable();

        /* JADX INFO: renamed from: i */
        public volatile boolean f8958i;

        /* JADX INFO: renamed from: t */
        public final AtomicReference f8959t;

        public MergeObserver(int i, int i2, Observer observer, Function function, boolean z) {
            this.f8950a = observer;
            this.f8951b = function;
            this.f8952c = z;
            this.f8953d = i;
            this.f8954e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f8945L0 = new ArrayDeque(i);
            }
            this.f8959t = new AtomicReference(f8943N0);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23611a() {
            if (this.f8958i) {
                return true;
            }
            Throwable th = this.f8957h.get();
            if (this.f8952c || th == null) {
                return false;
            }
            m23612b();
            this.f8957h.m23740d(this.f8950a);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m23612b() {
            this.f8947X.dispose();
            AtomicReference atomicReference = this.f8959t;
            InnerObserver[] innerObserverArr = f8944O0;
            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.getAndSet(innerObserverArr);
            if (innerObserverArr2 == innerObserverArr) {
                return false;
            }
            for (InnerObserver innerObserver : innerObserverArr2) {
                innerObserver.getClass();
                DisposableHelper.m23414a(innerObserver);
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public final void m23613c() {
            if (getAndIncrement() == 0) {
                m23614f();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f8958i = true;
            if (m23612b()) {
                this.f8957h.m23738b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:104:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[PHI: r4
          0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: f */
        public final void m23614f() {
            int size;
            boolean z;
            Observer observer = this.f8950a;
            int iAddAndGet = 1;
            while (!m23611a()) {
                SimplePlainQueue simplePlainQueue = this.f8955f;
                int i = 0;
                if (simplePlainQueue != null) {
                    while (!m23611a()) {
                        Object objPoll = simplePlainQueue.poll();
                        if (objPoll != null) {
                            observer.onNext(objPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.f8956g;
                    SimplePlainQueue simplePlainQueue2 = this.f8955f;
                    InnerObserver[] innerObserverArr = (InnerObserver[]) this.f8959t.get();
                    int length = innerObserverArr.length;
                    if (this.f8953d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f8945L0.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                        this.f8957h.m23740d(this.f8950a);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.f8949Z);
                        for (int i2 = 0; i2 < length; i2++) {
                            if (m23611a()) {
                                return;
                            }
                            InnerObserver innerObserver = innerObserverArr[iMin];
                            SimpleQueue simpleQueue = innerObserver.f8941c;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        Object objPoll2 = simpleQueue.poll();
                                        if (objPoll2 == null) {
                                            z = innerObserver.f8940b;
                                            SimpleQueue simpleQueue2 = innerObserver.f8941c;
                                            if (z && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                                m23615g(innerObserver);
                                                i++;
                                            }
                                            iMin++;
                                            if (iMin == length) {
                                                iMin = 0;
                                            }
                                        } else {
                                            observer.onNext(objPoll2);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.m23404a(th);
                                        DisposableHelper.m23414a(innerObserver);
                                        this.f8957h.m23737a(th);
                                        if (m23611a()) {
                                            return;
                                        }
                                        m23615g(innerObserver);
                                        i++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                } while (!m23611a());
                                return;
                            }
                            z = innerObserver.f8940b;
                            SimpleQueue simpleQueue3 = innerObserver.f8941c;
                            if (z) {
                                m23615g(innerObserver);
                                i++;
                            }
                            iMin++;
                            if (iMin == length) {
                                iMin = 0;
                            }
                        }
                        this.f8949Z = iMin;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f8953d != Integer.MAX_VALUE) {
                        m23617i(i);
                    }
                } else if (this.f8953d != Integer.MAX_VALUE) {
                    m23617i(i);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m23615g(InnerObserver innerObserver) {
            AtomicReference atomicReference;
            InnerObserver[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                atomicReference = this.f8959t;
                innerObserverArr = (InnerObserver[]) atomicReference.get();
                int length = innerObserverArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = f8943N0;
                } else {
                    InnerObserver[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!tfe.m80660r(atomicReference, innerObserverArr, innerObserverArr2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public final void m23616h(ObservableSource observableSource) {
            boolean z;
            InnerObserver[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                z = false;
                if (!(observableSource instanceof Supplier)) {
                    this.f8948Y++;
                    InnerObserver innerObserver = new InnerObserver(this);
                    AtomicReference atomicReference = this.f8959t;
                    do {
                        innerObserverArr = (InnerObserver[]) atomicReference.get();
                        if (innerObserverArr == f8944O0) {
                            DisposableHelper.m23414a(innerObserver);
                            return;
                        }
                        int length = innerObserverArr.length;
                        innerObserverArr2 = new InnerObserver[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = innerObserver;
                    } while (!tfe.m80660r(atomicReference, innerObserverArr, innerObserverArr2));
                    observableSource.subscribe(innerObserver);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f8950a.onNext(obj);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            SimplePlainQueue spscLinkedArrayQueue = this.f8955f;
                            if (spscLinkedArrayQueue == null) {
                                spscLinkedArrayQueue = this.f8953d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.f8954e) : new SpscArrayQueue(this.f8953d);
                                this.f8955f = spscLinkedArrayQueue;
                            }
                            spscLinkedArrayQueue.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        m23614f();
                    }
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    this.f8957h.m23737a(th);
                    m23613c();
                }
                if (this.f8953d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        observableSource = (ObservableSource) this.f8945L0.poll();
                        if (observableSource == null) {
                            this.f8946M0--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            m23613c();
        }

        /* JADX INFO: renamed from: i */
        public final void m23617i(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.f8945L0.poll();
                        if (observableSource == null) {
                            this.f8946M0--;
                        } else {
                            m23616h(observableSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i = i2;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f8958i;
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f8956g) {
                return;
            }
            this.f8956g = true;
            m23613c();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f8956g) {
                RxJavaPlugins.m23782b(th);
            } else if (this.f8957h.m23737a(th)) {
                this.f8956g = true;
                m23613c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f8956g) {
                return;
            }
            try {
                Object objMo98394apply = this.f8951b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objMo98394apply;
                if (this.f8953d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.f8946M0;
                            if (i == this.f8953d) {
                                this.f8945L0.offer(observableSource);
                                return;
                            }
                            this.f8946M0 = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                m23616h(observableSource);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                this.f8947X.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f8947X, disposable)) {
                this.f8947X = disposable;
                this.f8950a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource observableSource, Function function, boolean z, int i, int i2) {
        super(observableSource);
        this.f8935b = function;
        this.f8936c = z;
        this.f8937d = i;
        this.f8938e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Function function = this.f8935b;
        ObservableSource observableSource = this.f8521a;
        if (ObservableScalarXMap.m23679b(observableSource, observer, function)) {
            return;
        }
        observableSource.subscribe(new MergeObserver(this.f8937d, this.f8938e, observer, this.f8935b, this.f8936c));
    }
}
