package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public final SpscLinkedArrayQueue f10437a;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10439c;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10441e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f10442f;

    /* JADX INFO: renamed from: g */
    public Throwable f10443g;

    /* JADX INFO: renamed from: t */
    public boolean f10446t;

    /* JADX INFO: renamed from: d */
    public final boolean f10440d = true;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10438b = new AtomicReference();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f10444h = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final BasicIntQueueDisposable f10445i = new UnicastQueueDisposable();

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            UnicastSubject.this.f10446t = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            UnicastSubject.this.f10437a.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (UnicastSubject.this.f10441e) {
                return;
            }
            UnicastSubject.this.f10441e = true;
            UnicastSubject.this.m23813g();
            UnicastSubject.this.f10438b.lazySet(null);
            if (UnicastSubject.this.f10445i.getAndIncrement() == 0) {
                UnicastSubject.this.f10438b.lazySet(null);
                UnicastSubject unicastSubject = UnicastSubject.this;
                if (unicastSubject.f10446t) {
                    return;
                }
                unicastSubject.f10437a.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return UnicastSubject.this.f10441e;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return UnicastSubject.this.f10437a.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return UnicastSubject.this.f10437a.poll();
        }
    }

    public UnicastSubject(int i, Runnable runnable) {
        this.f10437a = new SpscLinkedArrayQueue(i);
        this.f10439c = new AtomicReference(runnable);
    }

    /* JADX INFO: renamed from: f */
    public static UnicastSubject m23812f(int i, Runnable runnable) {
        ObjectHelper.m23450a(i, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new UnicastSubject(i, runnable);
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    /* JADX INFO: renamed from: a */
    public final boolean mo23797a() {
        return this.f10438b.get() != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m23813g() {
        AtomicReference atomicReference = this.f10439c;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m23814h() {
        Observer observer;
        Throwable th;
        if (this.f10445i.getAndIncrement() != 0) {
            return;
        }
        Observer observer2 = (Observer) this.f10438b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == 0) {
            iAddAndGet2 = this.f10445i.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                observer = observer2;
                return;
            } else {
                observer = observer2;
                observer = (Observer) this.f10438b.get();
            }
        }
        observer = observer2;
        if (this.f10446t) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f10437a;
            boolean z = this.f10440d;
            while (!this.f10441e) {
                boolean z2 = this.f10442f;
                if (!z && z2 && (th = this.f10443g) != null) {
                    this.f10438b.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                observer.onNext(null);
                if (z2) {
                    this.f10438b.lazySet(null);
                    Throwable th2 = this.f10443g;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f10445i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f10438b.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f10437a;
        boolean z3 = this.f10440d;
        boolean z4 = true;
        int iAddAndGet3 = 1;
        while (!this.f10441e) {
            boolean z5 = this.f10442f;
            Object objPoll = this.f10437a.poll();
            boolean z6 = objPoll == null;
            if (z5) {
                if (!z3 && z4) {
                    Throwable th3 = this.f10443g;
                    if (th3 != null) {
                        this.f10438b.lazySet(null);
                        spscLinkedArrayQueue2.clear();
                        observer.onError(th3);
                        return;
                    }
                    z4 = false;
                }
                if (z6) {
                    this.f10438b.lazySet(null);
                    Throwable th4 = this.f10443g;
                    if (th4 != null) {
                        observer.onError(th4);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z6) {
                iAddAndGet3 = this.f10445i.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(objPoll);
            }
        }
        this.f10438b.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f10442f || this.f10441e) {
            return;
        }
        this.f10442f = true;
        m23813g();
        m23814h();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (this.f10442f || this.f10441e) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10443g = th;
        this.f10442f = true;
        m23813g();
        m23814h();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10442f || this.f10441e) {
            return;
        }
        this.f10437a.offer(obj);
        m23814h();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10442f || this.f10441e) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        if (this.f10444h.get() || !this.f10444h.compareAndSet(false, true)) {
            EmptyDisposable.m23421c(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.f10445i);
        this.f10438b.lazySet(observer);
        if (this.f10441e) {
            this.f10438b.lazySet(null);
        } else {
            m23814h();
        }
    }
}
