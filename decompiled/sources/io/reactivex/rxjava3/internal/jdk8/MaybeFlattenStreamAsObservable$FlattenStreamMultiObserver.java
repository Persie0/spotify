package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import p204p.ikc0;

/* JADX INFO: loaded from: classes11.dex */
final class MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueDisposable<R> implements MaybeObserver<T>, SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public final Observer f7278a;

    /* JADX INFO: renamed from: b */
    public final Function f7279b;

    /* JADX INFO: renamed from: c */
    public Disposable f7280c;

    /* JADX INFO: renamed from: d */
    public volatile Iterator f7281d;

    /* JADX INFO: renamed from: e */
    public Stream f7282e;

    /* JADX INFO: renamed from: f */
    public boolean f7283f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f7284g;

    /* JADX INFO: renamed from: h */
    public boolean f7285h;

    public MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver(Observer observer, Function function) {
        this.f7278a = observer;
        this.f7279b = function;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        this.f7285h = true;
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m23455b() {
        if (getAndIncrement() != 0) {
            return;
        }
        Observer observer = this.f7278a;
        Iterator it = this.f7281d;
        int iAddAndGet = 1;
        while (true) {
            if (this.f7284g) {
                clear();
            } else if (this.f7285h) {
                observer.onNext(null);
                observer.onComplete();
            } else {
                try {
                    Object next = it.next();
                    if (!this.f7284g) {
                        observer.onNext(next);
                        if (!this.f7284g) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.f7284g && !zHasNext) {
                                    observer.onComplete();
                                    this.f7284g = true;
                                }
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                observer.onError(th);
                                this.f7284g = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    observer.onError(th2);
                    this.f7284g = true;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        this.f7281d = null;
        Stream stream = this.f7282e;
        this.f7282e = null;
        if (stream != null) {
            try {
                ikc0.m50943o(stream);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f7284g = true;
        this.f7280c.dispose();
        if (this.f7285h) {
            return;
        }
        m23455b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7284g;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        Iterator it = this.f7281d;
        if (it == null) {
            return true;
        }
        if (!this.f7283f || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        this.f7278a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f7278a.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f7280c, disposable)) {
            this.f7280c = disposable;
            this.f7278a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        try {
            Object objMo98394apply = this.f7279b.mo98394apply(obj);
            Objects.requireNonNull(objMo98394apply, "The mapper returned a null Stream");
            Stream stream = (Stream) objMo98394apply;
            Iterator<T> it = stream.iterator();
            if (it.hasNext()) {
                this.f7281d = it;
                this.f7282e = stream;
                m23455b();
            } else {
                this.f7278a.onComplete();
                try {
                    ikc0.m50943o(stream);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            this.f7278a.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        Iterator it = this.f7281d;
        if (it == null) {
            return null;
        }
        if (!this.f7283f) {
            this.f7283f = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
    }
}
