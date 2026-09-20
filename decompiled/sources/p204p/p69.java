package p204p;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class p69 extends r0w0 {

    /* JADX INFO: renamed from: f */
    public static final Object[] f174320f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static final o69[] f174321g = new o69[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f174322a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f174323b;

    /* JADX INFO: renamed from: c */
    public final Lock f174324c;

    /* JADX INFO: renamed from: d */
    public final Lock f174325d;

    /* JADX INFO: renamed from: e */
    public long f174326e;

    public p69() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f174324c = reentrantReadWriteLock.readLock();
        this.f174325d = reentrantReadWriteLock.writeLock();
        this.f174323b = new AtomicReference(f174321g);
        this.f174322a = new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static p69 m69191a(Object obj) {
        p69 p69Var = new p69();
        p69Var.f174322a.lazySet(obj);
        return p69Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.f174325d;
        lock.lock();
        this.f174326e++;
        this.f174322a.lazySet(obj);
        lock.unlock();
        for (o69 o69Var : (o69[]) this.f174323b.get()) {
            long j = this.f174326e;
            if (!o69Var.f162286g) {
                if (o69Var.f162285f) {
                    o69Var.test(obj);
                } else {
                    synchronized (o69Var) {
                        try {
                            if (!o69Var.f162286g) {
                                if (o69Var.f162287h != j) {
                                    if (o69Var.f162283d) {
                                        zk1 zk1Var = o69Var.f162284e;
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(3, (byte) 0);
                                            o69Var.f162284e = zk1Var;
                                        }
                                        zk1Var.m96276a(obj);
                                    } else {
                                        o69Var.f162282c = true;
                                        o69Var.f162285f = true;
                                        o69Var.test(obj);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69192c() {
        return this.f174322a.get() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m69193f(o69 o69Var) {
        o69[] o69VarArr;
        while (true) {
            AtomicReference atomicReference = this.f174323b;
            o69[] o69VarArr2 = (o69[]) atomicReference.get();
            int length = o69VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (o69VarArr2[i] == o69Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                o69VarArr = f174321g;
            } else {
                o69[] o69VarArr3 = new o69[length - 1];
                System.arraycopy(o69VarArr2, 0, o69VarArr3, 0, i);
                System.arraycopy(o69VarArr2, i + 1, o69VarArr3, i, (length - i) - 1);
                o69VarArr = o69VarArr3;
            }
            while (!atomicReference.compareAndSet(o69VarArr2, o69VarArr)) {
                if (atomicReference.get() != o69VarArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        o69[] o69VarArr;
        o69[] o69VarArr2;
        zk1 zk1Var;
        o69 o69Var = new o69(observer, this);
        observer.onSubscribe(o69Var);
        AtomicReference atomicReference = this.f174323b;
        do {
            o69VarArr = (o69[]) atomicReference.get();
            int length = o69VarArr.length;
            o69VarArr2 = new o69[length + 1];
            System.arraycopy(o69VarArr, 0, o69VarArr2, 0, length);
            o69VarArr2[length] = o69Var;
        } while (!tfe.m80660r(atomicReference, o69VarArr, o69VarArr2));
        if (o69Var.f162286g) {
            m69193f(o69Var);
            return;
        }
        if (o69Var.f162286g) {
            return;
        }
        synchronized (o69Var) {
            try {
                if (o69Var.f162286g) {
                    return;
                }
                if (o69Var.f162282c) {
                    return;
                }
                p69 p69Var = o69Var.f162281b;
                Lock lock = p69Var.f174324c;
                lock.lock();
                o69Var.f162287h = p69Var.f174326e;
                Object obj = p69Var.f174322a.get();
                lock.unlock();
                o69Var.f162283d = obj != null;
                o69Var.f162282c = true;
                if (obj != null) {
                    o69Var.test(obj);
                    while (!o69Var.f162286g) {
                        synchronized (o69Var) {
                            try {
                                zk1Var = o69Var.f162284e;
                                if (zk1Var == null) {
                                    o69Var.f162283d = false;
                                    return;
                                }
                                o69Var.f162284e = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        zk1Var.m96289p(o69Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
