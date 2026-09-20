package p204p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: p.n9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2156n9 implements u790 {

    /* JADX INFO: renamed from: d */
    public static final boolean f151666d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f151667e = Logger.getLogger(AbstractC2156n9.class.getName());

    /* JADX INFO: renamed from: f */
    public static final wjg1 f151668f;

    /* JADX INFO: renamed from: g */
    public static final Object f151669g;

    /* JADX INFO: renamed from: a */
    public volatile Object f151670a;

    /* JADX INFO: renamed from: b */
    public volatile C1971i9 f151671b;

    /* JADX INFO: renamed from: c */
    public volatile C2119m9 f151672c;

    static {
        wjg1 c2082l9;
        try {
            c2082l9 = new C2007j9(AtomicReferenceFieldUpdater.newUpdater(C2119m9.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2119m9.class, C2119m9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2156n9.class, C2119m9.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2156n9.class, C1971i9.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2156n9.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2082l9 = new C2082l9();
        }
        f151668f = c2082l9;
        if (th != null) {
            f151667e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f151669g = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m63861e(AbstractC2156n9 abstractC2156n9) {
        C1971i9 c1971i9;
        C1971i9 c1971i10;
        C1971i9 c1971i11 = null;
        while (true) {
            C2119m9 c2119m9 = abstractC2156n9.f151672c;
            if (f151668f.mo52722p(abstractC2156n9, c2119m9, C2119m9.f141177c)) {
                while (c2119m9 != null) {
                    Thread thread = c2119m9.f141178a;
                    if (thread != null) {
                        c2119m9.f141178a = null;
                        LockSupport.unpark(thread);
                    }
                    c2119m9 = c2119m9.f141179b;
                }
                abstractC2156n9.mo56933d();
                do {
                    c1971i9 = abstractC2156n9.f151671b;
                } while (!f151668f.mo52720n(abstractC2156n9, c1971i9, C1971i9.f99877d));
                while (true) {
                    c1971i10 = c1971i11;
                    c1971i11 = c1971i9;
                    if (c1971i11 == null) {
                        break;
                    }
                    c1971i9 = c1971i11.f99880c;
                    c1971i11.f99880c = c1971i10;
                }
                while (c1971i10 != null) {
                    c1971i11 = c1971i10.f99880c;
                    Runnable runnable = c1971i10.f99878a;
                    if (runnable instanceof RunnableC2044k9) {
                        RunnableC2044k9 runnableC2044k9 = (RunnableC2044k9) runnable;
                        abstractC2156n9 = runnableC2044k9.f120493a;
                        if (abstractC2156n9.f151670a == runnableC2044k9) {
                            if (f151668f.mo52721o(abstractC2156n9, runnableC2044k9, m63864h(runnableC2044k9.f120494b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m63862f(runnable, c1971i10.f99879b);
                    }
                    c1971i10 = c1971i11;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m63862f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f151667e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m63863g(Object obj) throws ExecutionException {
        if (obj instanceof C1852f9) {
            Throwable th = ((C1852f9) obj).f67132b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1929h9) {
            throw new ExecutionException(((C1929h9) obj).f88842a);
        }
        if (obj == f151669g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m63864h(u790 u790Var) {
        if (u790Var instanceof AbstractC2156n9) {
            Object obj = ((AbstractC2156n9) u790Var).f151670a;
            if (!(obj instanceof C1852f9)) {
                return obj;
            }
            C1852f9 c1852f9 = (C1852f9) obj;
            if (c1852f9.f67131a) {
                return c1852f9.f67132b != null ? new C1852f9(c1852f9.f67132b, false) : C1852f9.f67130d;
            }
            return obj;
        }
        boolean zIsCancelled = u790Var.isCancelled();
        if ((!f151666d) && zIsCancelled) {
            return C1852f9.f67130d;
        }
        try {
            Object objM63865i = m63865i(u790Var);
            return objM63865i == null ? f151669g : objM63865i;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C1852f9(e, false);
            }
            return new C1929h9(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + u790Var, e));
        } catch (ExecutionException e2) {
            return new C1929h9(e2.getCause());
        } catch (Throwable th) {
            return new C1929h9(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Object m63865i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        executor.getClass();
        C1971i9 c1971i9 = this.f151671b;
        C1971i9 c1971i10 = C1971i9.f99877d;
        if (c1971i9 != c1971i10) {
            C1971i9 c1971i11 = new C1971i9(runnable, executor);
            do {
                c1971i11.f99880c = c1971i9;
                if (f151668f.mo52720n(this, c1971i9, c1971i11)) {
                    return;
                } else {
                    c1971i9 = this.f151671b;
                }
            } while (c1971i9 != c1971i10);
        }
        m63862f(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final void m63866c(StringBuilder sb) {
        try {
            Object objM63865i = m63865i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM63865i == this ? "this future" : String.valueOf(objM63865i));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1852f9 c1852f9;
        Object obj = this.f151670a;
        if (!(obj == null) && !(obj instanceof RunnableC2044k9)) {
            return false;
        }
        if (f151666d) {
            c1852f9 = new C1852f9(new CancellationException("Future.cancel() was called."), z);
        } else {
            c1852f9 = z ? C1852f9.f67129c : C1852f9.f67130d;
        }
        AbstractC2156n9 abstractC2156n9 = this;
        boolean z2 = false;
        while (true) {
            if (f151668f.mo52721o(abstractC2156n9, obj, c1852f9)) {
                m63861e(abstractC2156n9);
                if (!(obj instanceof RunnableC2044k9)) {
                    break;
                }
                u790 u790Var = ((RunnableC2044k9) obj).f120494b;
                if (!(u790Var instanceof AbstractC2156n9)) {
                    u790Var.cancel(z);
                    break;
                }
                abstractC2156n9 = (AbstractC2156n9) u790Var;
                obj = abstractC2156n9.f151670a;
                if (!(obj == null) && !(obj instanceof RunnableC2044k9)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractC2156n9.f151670a;
                if (!(obj instanceof RunnableC2044k9)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        C2119m9 c2119m9 = C2119m9.f141177c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f151670a;
        if ((obj != null) && (!(obj instanceof RunnableC2044k9))) {
            return m63863g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2119m9 c2119m10 = this.f151672c;
            if (c2119m10 != c2119m9) {
                C2119m9 c2119m11 = new C2119m9();
                z = true;
                while (true) {
                    wjg1 wjg1Var = f151668f;
                    wjg1Var.mo52718A(c2119m11, c2119m10);
                    if (wjg1Var.mo52722p(this, c2119m10, c2119m11)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m63867k(c2119m11);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f151670a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC2044k9))) {
                                return m63863g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m63867k(c2119m11);
                        break;
                    }
                    c2119m10 = this.f151672c;
                    if (c2119m10 == c2119m9) {
                    }
                }
            }
            return m63863g(this.f151670a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.f151670a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof RunnableC2044k9))) {
                return m63863g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM77254m = s571.m77254m(j, "Waited ", " ");
        sbM77254m.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM77254m.toString();
        if (nanos + 1000 < 0) {
            String strM77250i = s571.m77250i(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strM77250i2 = strM77250i + jConvert + " " + lowerCase;
                if (z2) {
                    strM77250i2 = s571.m77250i(strM77250i2, ",");
                }
                strM77250i = s571.m77250i(strM77250i2, " ");
            }
            if (z2) {
                strM77250i = strM77250i + nanos2 + " nanoseconds ";
            }
            string3 = s571.m77250i(strM77250i, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(s571.m77250i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(klh.m56834f(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f151670a instanceof C1852f9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f151670a;
        return (!(obj instanceof RunnableC2044k9)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public String mo50171j() {
        Object obj = this.f151670a;
        if (obj instanceof RunnableC2044k9) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            u790 u790Var = ((RunnableC2044k9) obj).f120494b;
            return dq60.m36616p(u790Var == this ? "this future" : String.valueOf(u790Var), "]", sb);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: k */
    public final void m63867k(C2119m9 c2119m9) {
        c2119m9.f141178a = null;
        while (true) {
            C2119m9 c2119m10 = this.f151672c;
            if (c2119m10 == C2119m9.f141177c) {
                return;
            }
            C2119m9 c2119m11 = null;
            while (c2119m10 != null) {
                C2119m9 c2119m12 = c2119m10.f141179b;
                if (c2119m10.f141178a != null) {
                    c2119m11 = c2119m10;
                } else if (c2119m11 != null) {
                    c2119m11.f141179b = c2119m12;
                    if (c2119m11.f141178a == null) {
                    }
                } else if (!f151668f.mo52722p(this, c2119m10, c2119m12)) {
                }
                c2119m10 = c2119m12;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m63868l(Object obj) {
        if (obj == null) {
            obj = f151669g;
        }
        if (!f151668f.mo52721o(this, null, obj)) {
            return false;
        }
        m63861e(this);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m63869m(Throwable th) {
        th.getClass();
        if (!f151668f.mo52721o(this, null, new C1929h9(th))) {
            return false;
        }
        m63861e(this);
        return true;
    }

    public final String toString() {
        String strMo50171j;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f151670a instanceof C1852f9) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m63866c(sb);
        } else {
            try {
                strMo50171j = mo50171j();
            } catch (RuntimeException e) {
                strMo50171j = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo50171j != null && !strMo50171j.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo50171j);
                sb.append("]");
            } else if (isDone()) {
                m63866c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public void mo56933d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C2119m9 c2119m9 = C2119m9.f141177c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f151670a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2044k9))) {
                return m63863g(obj2);
            }
            C2119m9 c2119m10 = this.f151672c;
            if (c2119m10 != c2119m9) {
                C2119m9 c2119m11 = new C2119m9();
                do {
                    wjg1 wjg1Var = f151668f;
                    wjg1Var.mo52718A(c2119m11, c2119m10);
                    if (wjg1Var.mo52722p(this, c2119m10, c2119m11)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f151670a;
                            } else {
                                m63867k(c2119m11);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2044k9))));
                        return m63863g(obj);
                    }
                    c2119m10 = this.f151672c;
                } while (c2119m10 != c2119m9);
            }
            return m63863g(this.f151670a);
        }
        throw new InterruptedException();
    }
}
