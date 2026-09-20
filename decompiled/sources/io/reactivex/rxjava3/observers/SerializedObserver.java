package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f10282a;

    /* JADX INFO: renamed from: b */
    public Disposable f10283b;

    /* JADX INFO: renamed from: c */
    public boolean f10284c;

    /* JADX INFO: renamed from: d */
    public AppendOnlyLinkedArrayList f10285d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10286e;

    public SerializedObserver(Observer observer) {
        this.f10282a = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f10286e = true;
        this.f10283b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f10283b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (this.f10286e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f10286e) {
                    return;
                }
                if (!this.f10284c) {
                    this.f10286e = true;
                    this.f10284c = true;
                    this.f10282a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10285d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f10285d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m23735b(NotificationLite.f10261a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (this.f10286e) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f10286e) {
                    if (this.f10284c) {
                        this.f10286e = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10285d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f10285d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f10245a[0] = NotificationLite.m23763e(th);
                        return;
                    }
                    this.f10286e = true;
                    this.f10284c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.m23782b(th);
                } else {
                    this.f10282a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.f10286e) {
            return;
        }
        if (obj == null) {
            this.f10283b.dispose();
            onError(ExceptionHelper.m23750b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f10286e) {
                    return;
                }
                if (this.f10284c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f10285d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.f10285d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.m23735b(obj);
                    return;
                }
                this.f10284c = true;
                this.f10282a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.f10285d;
                            if (appendOnlyLinkedArrayList2 == null) {
                                this.f10284c = false;
                                return;
                            }
                            this.f10285d = null;
                            Observer observer = this.f10282a;
                            for (Object[] objArr2 = appendOnlyLinkedArrayList2.f10245a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (NotificationLite.m23761c(observer, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.m23419h(this.f10283b, disposable)) {
            this.f10283b = disposable;
            this.f10282a.onSubscribe(this);
        }
    }
}
