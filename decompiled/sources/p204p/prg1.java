package p204p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class prg1 implements dsf1 {

    /* JADX INFO: renamed from: d */
    public static final boolean f180600d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f180601e = Logger.getLogger(prg1.class.getName());

    /* JADX INFO: renamed from: f */
    public static final uqe1 f180602f;

    /* JADX INFO: renamed from: g */
    public static final Object f180603g;

    /* JADX INFO: renamed from: a */
    public volatile Object f180604a;

    /* JADX INFO: renamed from: b */
    public volatile c8g1 f180605b;

    /* JADX INFO: renamed from: c */
    public volatile ung1 f180606c;

    static {
        uqe1 xkg1Var;
        try {
            xkg1Var = new ueg1(AtomicReferenceFieldUpdater.newUpdater(ung1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ung1.class, ung1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(prg1.class, ung1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(prg1.class, c8g1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(prg1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            xkg1Var = new xkg1();
        }
        Throwable th2 = th;
        f180602f = xkg1Var;
        if (th2 != null) {
            f180601e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f180603g = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m70713d(prg1 prg1Var) {
        ung1 ung1Var;
        uqe1 uqe1Var;
        c8g1 c8g1Var;
        c8g1 c8g1Var2;
        c8g1 c8g1Var3;
        do {
            ung1Var = prg1Var.f180606c;
            uqe1Var = f180602f;
        } while (!uqe1Var.mo82904u(prg1Var, ung1Var, ung1.f232169c));
        while (true) {
            c8g1Var = null;
            if (ung1Var == null) {
                break;
            }
            Thread thread = ung1Var.f232170a;
            if (thread != null) {
                ung1Var.f232170a = null;
                LockSupport.unpark(thread);
            }
            ung1Var = ung1Var.f232171b;
        }
        do {
            c8g1Var2 = prg1Var.f180605b;
        } while (!uqe1Var.mo82902s(prg1Var, c8g1Var2, c8g1.f35213d));
        while (true) {
            c8g1Var3 = c8g1Var;
            c8g1Var = c8g1Var2;
            if (c8g1Var == null) {
                break;
            }
            c8g1Var2 = c8g1Var.f35216c;
            c8g1Var.f35216c = c8g1Var3;
        }
        while (c8g1Var3 != null) {
            Runnable runnable = c8g1Var3.f35214a;
            c8g1 c8g1Var4 = c8g1Var3.f35216c;
            m70714f(runnable, c8g1Var3.f35215b);
            c8g1Var3 = c8g1Var4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m70714f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f180601e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", edb.m38566o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Object m70715h(Object obj) throws ExecutionException {
        if (obj instanceof ewf1) {
            Throwable th = ((ewf1) obj).f63543a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p4g1) {
            throw new ExecutionException(((p4g1) obj).f173920a);
        }
        if (obj == f180603g) {
            return null;
        }
        return obj;
    }

    @Override // p204p.dsf1
    /* JADX INFO: renamed from: b */
    public final void mo36769b(Runnable runnable, Executor executor) {
        executor.getClass();
        c8g1 c8g1Var = this.f180605b;
        c8g1 c8g1Var2 = c8g1.f35213d;
        if (c8g1Var != c8g1Var2) {
            c8g1 c8g1Var3 = new c8g1(runnable, executor);
            do {
                c8g1Var3.f35216c = c8g1Var;
                if (f180602f.mo82902s(this, c8g1Var, c8g1Var3)) {
                    return;
                } else {
                    c8g1Var = this.f180605b;
                }
            } while (c8g1Var != c8g1Var2);
        }
        m70714f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public String mo63453c() {
        if (this instanceof ScheduledFuture) {
            return edb.m38562k(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ewf1 ewf1Var;
        Object obj = this.f180604a;
        if (obj != null) {
            return false;
        }
        if (f180600d) {
            ewf1Var = new ewf1(new CancellationException("Future.cancel() was called."));
        } else {
            ewf1Var = z ? ewf1.f63541b : ewf1.f63542c;
        }
        if (!f180602f.mo82903t(this, obj, ewf1Var)) {
            return false;
        }
        m70713d(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m70716e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX INFO: renamed from: g */
    public final void m70717g(ung1 ung1Var) {
        ung1Var.f232170a = null;
        while (true) {
            ung1 ung1Var2 = this.f180606c;
            if (ung1Var2 != ung1.f232169c) {
                ung1 ung1Var3 = null;
                while (ung1Var2 != null) {
                    ung1 ung1Var4 = ung1Var2.f232171b;
                    if (ung1Var2.f232170a != null) {
                        ung1Var3 = ung1Var2;
                    } else if (ung1Var3 != null) {
                        ung1Var3.f232171b = ung1Var4;
                        if (ung1Var3.f232170a == null) {
                        }
                    } else if (!f180602f.mo82904u(this, ung1Var2, ung1Var4)) {
                    }
                    ung1Var2 = ung1Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f180604a;
        if (obj2 != null) {
            return m70715h(obj2);
        }
        ung1 ung1Var = this.f180606c;
        ung1 ung1Var2 = ung1.f232169c;
        if (ung1Var != ung1Var2) {
            ung1 ung1Var3 = new ung1();
            do {
                uqe1 uqe1Var = f180602f;
                uqe1Var.mo82900q(ung1Var3, ung1Var);
                if (uqe1Var.mo82904u(this, ung1Var, ung1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m70717g(ung1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f180604a;
                    } while (obj == null);
                    return m70715h(obj);
                }
                ung1Var = this.f180606c;
            } while (ung1Var != ung1Var2);
        }
        return m70715h(this.f180604a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f180604a instanceof ewf1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f180604a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f180604a instanceof ewf1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m70716e(sb);
        } else {
            try {
                strConcat = mo63453c();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                m70716e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f180604a;
            if (obj != null) {
                return m70715h(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                ung1 ung1Var = this.f180606c;
                ung1 ung1Var2 = ung1.f232169c;
                if (ung1Var != ung1Var2) {
                    ung1 ung1Var3 = new ung1();
                    while (true) {
                        uqe1 uqe1Var = f180602f;
                        uqe1Var.mo82900q(ung1Var3, ung1Var);
                        if (uqe1Var.mo82904u(this, ung1Var, ung1Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f180604a;
                                    if (obj2 != null) {
                                        return m70715h(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m70717g(ung1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m70717g(ung1Var3);
                            break;
                        }
                        ung1Var = this.f180606c;
                        if (ung1Var == ung1Var2) {
                        }
                    }
                }
                return m70715h(this.f180604a);
            }
            while (nanos > 0) {
                Object obj3 = this.f180604a;
                if (obj3 != null) {
                    return m70715h(obj3);
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
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                boolean z = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(klh.m56834f(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
