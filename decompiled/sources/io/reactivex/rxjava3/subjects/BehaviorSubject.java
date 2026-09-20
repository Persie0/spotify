package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p204p.ei6;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class BehaviorSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: g */
    public static final BehaviorDisposable[] f10379g = new BehaviorDisposable[0];

    /* JADX INFO: renamed from: h */
    public static final BehaviorDisposable[] f10380h = new BehaviorDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10381a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10382b;

    /* JADX INFO: renamed from: c */
    public final Lock f10383c;

    /* JADX INFO: renamed from: d */
    public final Lock f10384d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f10385e;

    /* JADX INFO: renamed from: f */
    public long f10386f;

    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final Observer f10387a;

        /* JADX INFO: renamed from: b */
        public final BehaviorSubject f10388b;

        /* JADX INFO: renamed from: c */
        public boolean f10389c;

        /* JADX INFO: renamed from: d */
        public boolean f10390d;

        /* JADX INFO: renamed from: e */
        public AppendOnlyLinkedArrayList f10391e;

        /* JADX INFO: renamed from: f */
        public boolean f10392f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f10393g;

        /* JADX INFO: renamed from: h */
        public long f10394h;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.f10387a = observer;
            this.f10388b = behaviorSubject;
        }

        /* JADX INFO: renamed from: a */
        public final void m23800a(long j, Object obj) {
            if (this.f10393g) {
                return;
            }
            if (!this.f10392f) {
                synchronized (this) {
                    try {
                        if (this.f10393g) {
                            return;
                        }
                        if (this.f10394h == j) {
                            return;
                        }
                        if (this.f10390d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10391e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f10391e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m23735b(obj);
                            return;
                        }
                        this.f10389c = true;
                        this.f10392f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f10393g) {
                return;
            }
            this.f10393g = true;
            this.f10388b.m23799i(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10393g;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return this.f10393g || NotificationLite.m23759a(this.f10387a, obj);
        }
    }

    public BehaviorSubject(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10383c = reentrantReadWriteLock.readLock();
        this.f10384d = reentrantReadWriteLock.writeLock();
        this.f10382b = new AtomicReference(f10379g);
        this.f10381a = new AtomicReference(obj);
        this.f10385e = new AtomicReference();
    }

    /* JADX INFO: renamed from: f */
    public static BehaviorSubject m23795f() {
        return new BehaviorSubject(null);
    }

    /* JADX INFO: renamed from: g */
    public static BehaviorSubject m23796g(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new BehaviorSubject(obj);
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    /* JADX INFO: renamed from: a */
    public final boolean mo23797a() {
        return ((BehaviorDisposable[]) this.f10382b.get()).length != 0;
    }

    /* JADX INFO: renamed from: h */
    public final Object m23798h() {
        Object obj = this.f10381a.get();
        if (NotificationLite.m23765g(obj) || NotificationLite.m23766h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m23799i(BehaviorDisposable behaviorDisposable) {
        BehaviorDisposable[] behaviorDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f10382b;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr2[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr = f10379g;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr2, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr2, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr = behaviorDisposableArr3;
            }
            while (!atomicReference.compareAndSet(behaviorDisposableArr2, behaviorDisposableArr)) {
                if (atomicReference.get() != behaviorDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (ei6.m39079p(this.f10385e, ExceptionHelper.f10258a)) {
            Lock lock = this.f10384d;
            lock.lock();
            this.f10386f++;
            AtomicReference atomicReference = this.f10381a;
            NotificationLite notificationLite = NotificationLite.f10261a;
            atomicReference.lazySet(notificationLite);
            lock.unlock();
            for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f10382b.getAndSet(f10380h)) {
                behaviorDisposable.m23800a(this.f10386f, notificationLite);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (!ei6.m39080q(this.f10385e, th)) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        Object objM23763e = NotificationLite.m23763e(th);
        Lock lock = this.f10384d;
        lock.lock();
        this.f10386f++;
        this.f10381a.lazySet((Serializable) objM23763e);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f10382b.getAndSet(f10380h)) {
            behaviorDisposable.m23800a(this.f10386f, objM23763e);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10385e.get() != null) {
            return;
        }
        Lock lock = this.f10384d;
        lock.lock();
        this.f10386f++;
        this.f10381a.lazySet(obj);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.f10382b.get()) {
            behaviorDisposable.m23800a(this.f10386f, obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10385e.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        BehaviorDisposable[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.onSubscribe(behaviorDisposable);
        AtomicReference atomicReference = this.f10382b;
        do {
            behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == f10380h) {
                Throwable th = (Throwable) this.f10385e.get();
                if (th == ExceptionHelper.f10258a) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!tfe.m80660r(atomicReference, behaviorDisposableArr, behaviorDisposableArr2));
        if (behaviorDisposable.f10393g) {
            m23799i(behaviorDisposable);
            return;
        }
        if (behaviorDisposable.f10393g) {
            return;
        }
        synchronized (behaviorDisposable) {
            try {
                if (behaviorDisposable.f10393g) {
                    return;
                }
                if (behaviorDisposable.f10389c) {
                    return;
                }
                BehaviorSubject behaviorSubject = behaviorDisposable.f10388b;
                Lock lock = behaviorSubject.f10383c;
                lock.lock();
                behaviorDisposable.f10394h = behaviorSubject.f10386f;
                Object obj = behaviorSubject.f10381a.get();
                lock.unlock();
                behaviorDisposable.f10390d = obj != null;
                behaviorDisposable.f10389c = true;
                if (obj == null || behaviorDisposable.test(obj)) {
                    return;
                }
                while (!behaviorDisposable.f10393g) {
                    synchronized (behaviorDisposable) {
                        try {
                            appendOnlyLinkedArrayList = behaviorDisposable.f10391e;
                            if (appendOnlyLinkedArrayList == null) {
                                behaviorDisposable.f10390d = false;
                                return;
                            }
                            behaviorDisposable.f10391e = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    appendOnlyLinkedArrayList.m23736c(behaviorDisposable);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
