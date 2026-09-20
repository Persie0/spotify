package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public OpenHashSet f7210a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f7211b;

    public CompositeDisposable() {
    }

    /* JADX INFO: renamed from: h */
    public static void m23391h(OpenHashSet openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.f10270e) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.m23754f((Throwable) arrayList.get(0));
        }
    }

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
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f7211b) {
            synchronized (this) {
                try {
                    if (!this.f7211b) {
                        OpenHashSet openHashSet = this.f7210a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            this.f7210a = openHashSet;
                        }
                        openHashSet.m23768a(disposable);
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
        Object obj;
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f7211b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f7211b) {
                    return false;
                }
                OpenHashSet openHashSet = this.f7210a;
                if (openHashSet != null) {
                    Object[] objArr = openHashSet.f10270e;
                    int i = openHashSet.f10267b;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            openHashSet.m23769b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            openHashSet.m23769b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.f7211b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7211b) {
                    return;
                }
                this.f7211b = true;
                OpenHashSet openHashSet = this.f7210a;
                this.f7210a = null;
                m23391h(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m23395f(Disposable... disposableArr) {
        Objects.requireNonNull(disposableArr, "disposables is null");
        int i = 0;
        if (!this.f7211b) {
            synchronized (this) {
                try {
                    if (!this.f7211b) {
                        OpenHashSet openHashSet = this.f7210a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet(disposableArr.length + 1, 0);
                            this.f7210a = openHashSet;
                        }
                        int length = disposableArr.length;
                        while (i < length) {
                            Disposable disposable = disposableArr[i];
                            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
                            openHashSet.m23768a(disposable);
                            i++;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int length2 = disposableArr.length;
        while (i < length2) {
            disposableArr[i].dispose();
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23396g() {
        if (this.f7211b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7211b) {
                    return;
                }
                OpenHashSet openHashSet = this.f7210a;
                this.f7210a = null;
                m23391h(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m23397i() {
        if (this.f7211b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f7211b) {
                    return 0;
                }
                OpenHashSet openHashSet = this.f7210a;
                return openHashSet != null ? openHashSet.f10268c : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f7211b;
    }

    public CompositeDisposable(Disposable... disposableArr) {
        this.f7210a = new OpenHashSet(disposableArr.length + 1, 0);
        for (Disposable disposable : disposableArr) {
            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.f7210a.m23768a(disposable);
        }
    }
}
