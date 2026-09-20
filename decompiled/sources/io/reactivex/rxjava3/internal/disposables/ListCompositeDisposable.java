package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public LinkedList f7223a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f7224b;

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: a */
    public final boolean mo23392a(Disposable disposable) {
        if (!mo23394c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: b */
    public final boolean mo23393b(Disposable disposable) {
        if (!this.f7224b) {
            synchronized (this) {
                try {
                    if (!this.f7224b) {
                        LinkedList linkedList = this.f7223a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f7223a = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: c */
    public final boolean mo23394c(Disposable disposable) {
        if (this.f7224b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f7224b) {
                    return false;
                }
                LinkedList linkedList = this.f7223a;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.f7224b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7224b) {
                    return;
                }
                this.f7224b = true;
                LinkedList linkedList = this.f7223a;
                ArrayList arrayList = null;
                this.f7223a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.m23754f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7224b;
    }
}
