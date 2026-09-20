package p204p;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d8h1 extends l8h1 {
    /* JADX INFO: renamed from: F */
    public static Object m35270F(Object obj) throws ExecutionException {
        if (obj instanceof a8h1) {
            Throwable th = ((a8h1) obj).f13300b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b8h1) {
            throw new ExecutionException(((b8h1) obj).f24590a);
        }
        if (obj == l8h1.f130870Z) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: I */
    public static Object m35271I(d8h1 d8h1Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = d8h1Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: J */
    public static void m35272J(d8h1 d8h1Var) {
        d8h1Var.getClass();
        for (k8h1 k8h1VarMo38106M = l8h1.f130869N0.mo38106M(d8h1Var); k8h1VarMo38106M != null; k8h1VarMo38106M = k8h1VarMo38106M.f120372b) {
            Thread thread = k8h1VarMo38106M.f120371a;
            if (thread != null) {
                k8h1VarMo38106M.f120371a = null;
                LockSupport.unpark(thread);
            }
        }
        d8h1Var.mo35274G();
        c8h1 c8h1VarMo38107N = l8h1.f130869N0.mo38107N(d8h1Var);
        c8h1 c8h1Var = null;
        while (c8h1VarMo38107N != null) {
            c8h1 c8h1Var2 = c8h1VarMo38107N.f35223c;
            c8h1VarMo38107N.f35223c = c8h1Var;
            c8h1Var = c8h1VarMo38107N;
            c8h1VarMo38107N = c8h1Var2;
        }
        while (c8h1Var != null) {
            Runnable runnable = c8h1Var.f35221a;
            c8h1 c8h1Var3 = c8h1Var.f35223c;
            Objects.requireNonNull(runnable);
            Executor executor = c8h1Var.f35222b;
            Objects.requireNonNull(executor);
            m35273L(runnable, executor);
            c8h1Var = c8h1Var3;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m35273L(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerM96765a = l8h1.f130867L0.m96765a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerM96765a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", klh.m56837i(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract String mo35275H();

    /* JADX INFO: renamed from: K */
    public final void m35276K(StringBuilder sb) {
        try {
            Object objM35271I = m35271I(this);
            sb.append("SUCCESS, result=[");
            if (objM35271I == null) {
                sb.append("null");
            } else if (objM35271I == this) {
                sb.append("this future");
            } else {
                sb.append(objM35271I.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM35271I)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        c8h1 c8h1Var;
        c8h1 c8h1Var2 = c8h1.f35220d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c8h1Var = this.f130871X) != c8h1Var2) {
            c8h1 c8h1Var3 = new c8h1(runnable, executor);
            do {
                c8h1Var3.f35223c = c8h1Var;
                if (l8h1.f130869N0.mo38105L(this, c8h1Var, c8h1Var3)) {
                    return;
                } else {
                    c8h1Var = this.f130871X;
                }
            } while (c8h1Var != c8h1Var2);
        }
        m35273L(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        a8h1 a8h1Var;
        Object obj = this.f130873t;
        if (obj != null) {
            return false;
        }
        if (l8h1.f130868M0) {
            a8h1Var = new a8h1(new CancellationException("Future.cancel() was called."), z);
        } else {
            a8h1Var = z ? a8h1.f13297c : a8h1.f13298d;
            Objects.requireNonNull(a8h1Var);
        }
        if (!l8h1.f130869N0.mo38108O(this, obj, a8h1Var)) {
            return false;
        }
        m35272J(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        k8h1 k8h1Var = k8h1.f120370c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f130873t;
        if (obj2 != null) {
            return m35270F(obj2);
        }
        k8h1 k8h1Var2 = this.f130872Y;
        if (k8h1Var2 != k8h1Var) {
            k8h1 k8h1Var3 = new k8h1();
            do {
                wvf1 wvf1Var = l8h1.f130869N0;
                wvf1Var.mo38103J(k8h1Var3, k8h1Var2);
                if (wvf1Var.mo38104K(this, k8h1Var2, k8h1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m58473E(k8h1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f130873t;
                    } while (obj == null);
                    return m35270F(obj);
                }
                k8h1Var2 = this.f130872Y;
            } while (k8h1Var2 != k8h1Var);
        }
        Object obj3 = this.f130873t;
        Objects.requireNonNull(obj3);
        return m35270F(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f130873t instanceof a8h1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f130873t != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f130873t instanceof a8h1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m35276K(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strConcat = mo35275H();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m35276K(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        k8h1 k8h1Var = k8h1.f120370c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f130873t;
            if (obj != null) {
                return m35270F(obj);
            }
            long j3 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k8h1 k8h1Var2 = this.f130872Y;
                if (k8h1Var2 != k8h1Var) {
                    k8h1 k8h1Var3 = new k8h1();
                    while (true) {
                        wvf1 wvf1Var = l8h1.f130869N0;
                        wvf1Var.mo38103J(k8h1Var3, k8h1Var2);
                        if (wvf1Var.mo38104K(this, k8h1Var2, k8h1Var3)) {
                            j2 = j3;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f130873t;
                                    if (obj2 != null) {
                                        return m35270F(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m58473E(k8h1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m58473E(k8h1Var3);
                            break;
                        }
                        long j4 = j3;
                        k8h1Var2 = this.f130872Y;
                        if (k8h1Var2 != k8h1Var) {
                            j3 = j4;
                        }
                    }
                }
                Object obj3 = this.f130873t;
                Objects.requireNonNull(obj3);
                return m35270F(obj3);
            }
            j2 = 0;
            while (nanos > j2) {
                Object obj4 = this.f130873t;
                if (obj4 != null) {
                    return m35270F(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < j2) {
                String strConcat = string3.concat(" (plus ");
                long j5 = -nanos;
                long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(jConvert);
                boolean z = jConvert == j2 || nanos2 > 1000;
                if (jConvert > j2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    sb2.append(strConcat);
                    sb2.append(jConvert);
                    sb2.append(" ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb3.append(strConcat);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(dq60.m36618r(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }

    /* JADX INFO: renamed from: G */
    public void mo35274G() {
    }
}
