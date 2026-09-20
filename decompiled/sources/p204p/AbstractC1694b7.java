package p204p;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: renamed from: p.b7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1694b7<V> extends tf50 implements u790 {

    /* JADX INFO: renamed from: a */
    static final boolean f24079a;

    /* JADX INFO: renamed from: b */
    static final cx70 f24080b;

    /* JADX INFO: renamed from: c */
    private static final a f24081c;

    /* JADX INFO: renamed from: d */
    private static final Object f24082d;
    private volatile d listeners;
    private volatile Object value;
    private volatile k waiters;

    /* JADX INFO: renamed from: p.b7$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo28334a(AbstractC1694b7 abstractC1694b7, d dVar, d dVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo28335b(AbstractC1694b7 abstractC1694b7, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo28336c(AbstractC1694b7 abstractC1694b7, k kVar, k kVar2);

        /* JADX INFO: renamed from: d */
        public abstract d mo28337d(AbstractC1694b7 abstractC1694b7, d dVar);

        /* JADX INFO: renamed from: e */
        public abstract k mo28338e(AbstractC1694b7 abstractC1694b7, k kVar);

        /* JADX INFO: renamed from: f */
        public abstract void mo28339f(k kVar, k kVar2);

        /* JADX INFO: renamed from: g */
        public abstract void mo28340g(k kVar, Thread thread);
    }

    /* JADX INFO: renamed from: p.b7$b */
    public static final class b {

        /* JADX INFO: renamed from: c */
        static final b f24083c;

        /* JADX INFO: renamed from: d */
        static final b f24084d;

        /* JADX INFO: renamed from: a */
        final boolean f24085a;

        /* JADX INFO: renamed from: b */
        final Throwable f24086b;

        static {
            if (AbstractC1694b7.f24079a) {
                f24084d = null;
                f24083c = null;
            } else {
                f24084d = new b(null, false);
                f24083c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z) {
            this.f24085a = z;
            this.f24086b = th;
        }
    }

    /* JADX INFO: renamed from: p.b7$c */
    public static final class c {

        /* JADX INFO: renamed from: b */
        static final c f24087b = new c(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        final Throwable f24088a;

        /* JADX INFO: renamed from: p.b7$c$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.f24088a = th;
        }
    }

    /* JADX INFO: renamed from: p.b7$e */
    public static final class e extends a {

        /* JADX INFO: renamed from: a */
        final AtomicReferenceFieldUpdater<k, Thread> f24092a;

        /* JADX INFO: renamed from: b */
        final AtomicReferenceFieldUpdater<k, k> f24093b;

        /* JADX INFO: renamed from: c */
        final AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, k> f24094c;

        /* JADX INFO: renamed from: d */
        final AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, d> f24095d;

        /* JADX INFO: renamed from: e */
        final AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, Object> f24096e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f24092a = atomicReferenceFieldUpdater;
            this.f24093b = atomicReferenceFieldUpdater2;
            this.f24094c = atomicReferenceFieldUpdater3;
            this.f24095d = atomicReferenceFieldUpdater4;
            this.f24096e = atomicReferenceFieldUpdater5;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: a */
        public final boolean mo28334a(AbstractC1694b7 abstractC1694b7, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, d> atomicReferenceFieldUpdater = this.f24095d;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1694b7, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractC1694b7) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: b */
        public final boolean mo28335b(AbstractC1694b7 abstractC1694b7, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, Object> atomicReferenceFieldUpdater = this.f24096e;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1694b7, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(abstractC1694b7) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: c */
        public final boolean mo28336c(AbstractC1694b7 abstractC1694b7, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super AbstractC1694b7<?>, k> atomicReferenceFieldUpdater = this.f24094c;
            while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1694b7, kVar, kVar2)) {
                if (atomicReferenceFieldUpdater.get(abstractC1694b7) != kVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: d */
        public final d mo28337d(AbstractC1694b7 abstractC1694b7, d dVar) {
            return this.f24095d.getAndSet(abstractC1694b7, dVar);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: e */
        public final k mo28338e(AbstractC1694b7 abstractC1694b7, k kVar) {
            return this.f24094c.getAndSet(abstractC1694b7, kVar);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: f */
        public final void mo28339f(k kVar, k kVar2) {
            this.f24093b.lazySet(kVar, kVar2);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: g */
        public final void mo28340g(k kVar, Thread thread) {
            this.f24092a.lazySet(kVar, thread);
        }
    }

    /* JADX INFO: renamed from: p.b7$f */
    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        final AbstractC1694b7<V> f24097a;

        /* JADX INFO: renamed from: b */
        final u790 f24098b;

        public f(AbstractC1694b7 abstractC1694b7, u790 u790Var) {
            this.f24097a = abstractC1694b7;
            this.f24098b = u790Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((AbstractC1694b7) this.f24097a).value != this) {
                return;
            }
            if (AbstractC1694b7.f24081c.mo28335b(this.f24097a, this, AbstractC1694b7.m28321q(this.f24098b))) {
                AbstractC1694b7.m28318n(this.f24097a, false);
            }
        }
    }

    /* JADX INFO: renamed from: p.b7$g */
    public static final class g extends a {
        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: a */
        public final boolean mo28334a(AbstractC1694b7 abstractC1694b7, d dVar, d dVar2) {
            synchronized (abstractC1694b7) {
                try {
                    if (abstractC1694b7.listeners != dVar) {
                        return false;
                    }
                    abstractC1694b7.listeners = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: b */
        public final boolean mo28335b(AbstractC1694b7 abstractC1694b7, Object obj, Object obj2) {
            synchronized (abstractC1694b7) {
                try {
                    if (abstractC1694b7.value != obj) {
                        return false;
                    }
                    abstractC1694b7.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: c */
        public final boolean mo28336c(AbstractC1694b7 abstractC1694b7, k kVar, k kVar2) {
            synchronized (abstractC1694b7) {
                try {
                    if (abstractC1694b7.waiters != kVar) {
                        return false;
                    }
                    abstractC1694b7.waiters = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: d */
        public final d mo28337d(AbstractC1694b7 abstractC1694b7, d dVar) {
            d dVar2;
            synchronized (abstractC1694b7) {
                try {
                    dVar2 = abstractC1694b7.listeners;
                    if (dVar2 != dVar) {
                        abstractC1694b7.listeners = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: e */
        public final k mo28338e(AbstractC1694b7 abstractC1694b7, k kVar) {
            k kVar2;
            synchronized (abstractC1694b7) {
                try {
                    kVar2 = abstractC1694b7.waiters;
                    if (kVar2 != kVar) {
                        abstractC1694b7.waiters = kVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar2;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: f */
        public final void mo28339f(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: g */
        public final void mo28340g(k kVar, Thread thread) {
            kVar.thread = thread;
        }
    }

    /* JADX INFO: renamed from: p.b7$h */
    public interface h<V> extends u790 {
    }

    /* JADX INFO: renamed from: p.b7$i */
    public static abstract class i<V> extends AbstractC1694b7<V> implements h<V> {
    }

    /* JADX INFO: renamed from: p.b7$j */
    public static final class j extends a {

        /* JADX INFO: renamed from: a */
        static final Unsafe f24099a;

        /* JADX INFO: renamed from: b */
        static final long f24100b;

        /* JADX INFO: renamed from: c */
        static final long f24101c;

        /* JADX INFO: renamed from: d */
        static final long f24102d;

        /* JADX INFO: renamed from: e */
        static final long f24103e;

        /* JADX INFO: renamed from: f */
        static final long f24104f;

        /* JADX INFO: renamed from: p.b7$j$a */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            /* JADX INFO: renamed from: a */
            public static Unsafe m28341a() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return m28341a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f24101c = unsafe.objectFieldOffset(AbstractC1694b7.class.getDeclaredField("waiters"));
                f24100b = unsafe.objectFieldOffset(AbstractC1694b7.class.getDeclaredField("listeners"));
                f24102d = unsafe.objectFieldOffset(AbstractC1694b7.class.getDeclaredField("value"));
                f24103e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                f24104f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                f24099a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: a */
        public final boolean mo28334a(AbstractC1694b7 abstractC1694b7, d dVar, d dVar2) {
            return AbstractC1731c7.m31591a(f24099a, abstractC1694b7, f24100b, dVar, dVar2);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: b */
        public final boolean mo28335b(AbstractC1694b7 abstractC1694b7, Object obj, Object obj2) {
            return AbstractC1731c7.m31591a(f24099a, abstractC1694b7, f24102d, obj, obj2);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: c */
        public final boolean mo28336c(AbstractC1694b7 abstractC1694b7, k kVar, k kVar2) {
            return AbstractC1731c7.m31591a(f24099a, abstractC1694b7, f24101c, kVar, kVar2);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: d */
        public final d mo28337d(AbstractC1694b7 abstractC1694b7, d dVar) {
            d dVar2;
            do {
                dVar2 = abstractC1694b7.listeners;
                if (dVar == dVar2) {
                    break;
                }
            } while (!mo28334a(abstractC1694b7, dVar2, dVar));
            return dVar2;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: e */
        public final k mo28338e(AbstractC1694b7 abstractC1694b7, k kVar) {
            k kVar2;
            do {
                kVar2 = abstractC1694b7.waiters;
                if (kVar == kVar2) {
                    break;
                }
            } while (!mo28336c(abstractC1694b7, kVar2, kVar));
            return kVar2;
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: f */
        public final void mo28339f(k kVar, k kVar2) {
            f24099a.putObject(kVar, f24104f, kVar2);
        }

        @Override // p204p.AbstractC1694b7.a
        /* JADX INFO: renamed from: g */
        public final void mo28340g(k kVar, Thread thread) {
            f24099a.putObject(kVar, f24103e, thread);
        }
    }

    /* JADX INFO: renamed from: p.b7$k */
    public static final class k {

        /* JADX INFO: renamed from: a */
        static final k f24105a = new k();
        volatile k next;
        volatile Thread thread;

        public k() {
            AbstractC1694b7.f24081c.mo28340g(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f24079a = z;
        f24080b = new cx70(AbstractC1694b7.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694b7.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694b7.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694b7.class, Object.class, "value"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        f24081c = gVar;
        if (th2 != null) {
            cx70 cx70Var = f24080b;
            Logger loggerM34241a = cx70Var.m34241a();
            Level level = Level.SEVERE;
            loggerM34241a.log(level, "UnsafeAtomicHelper is broken!", th);
            cx70Var.m34241a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f24082d = new Object();
    }

    /* JADX INFO: renamed from: n */
    public static void m28318n(AbstractC1694b7 abstractC1694b7, boolean z) {
        d dVar = null;
        while (true) {
            abstractC1694b7.getClass();
            for (k kVarMo28338e = f24081c.mo28338e(abstractC1694b7, k.f24105a); kVarMo28338e != null; kVarMo28338e = kVarMo28338e.next) {
                Thread thread = kVarMo28338e.thread;
                if (thread != null) {
                    kVarMo28338e.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractC1694b7.mo28327r();
                z = false;
            }
            abstractC1694b7.mo28325l();
            d dVar2 = dVar;
            d dVarMo28337d = f24081c.mo28337d(abstractC1694b7, d.f24089c);
            d dVar3 = dVar2;
            while (dVarMo28337d != null) {
                d dVar4 = dVarMo28337d.next;
                dVarMo28337d.next = dVar3;
                dVar3 = dVarMo28337d;
                dVarMo28337d = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.next;
                Runnable runnable = dVar3.f24090a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    abstractC1694b7 = fVar.f24097a;
                    if (abstractC1694b7.value == fVar) {
                        if (f24081c.mo28335b(abstractC1694b7, fVar, m28321q(fVar.f24098b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.f24091b;
                    Objects.requireNonNull(executor);
                    m28319o(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m28319o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f24080b.m34241a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object m28320p(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f24086b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f24088a);
        }
        if (obj == f24082d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static Object m28321q(u790 u790Var) {
        Object obj;
        Throwable thMo28323c;
        if (u790Var instanceof h) {
            Object bVar = ((AbstractC1694b7) u790Var).value;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.f24085a) {
                    bVar = bVar2.f24086b != null ? new b(bVar2.f24086b, false) : b.f24084d;
                }
            }
            Objects.requireNonNull(bVar);
            return bVar;
        }
        if ((u790Var instanceof tf50) && (thMo28323c = ((tf50) u790Var).mo28323c()) != null) {
            return new c(thMo28323c);
        }
        boolean zIsCancelled = u790Var.isCancelled();
        if ((!f24079a) && zIsCancelled) {
            b bVar3 = b.f24084d;
            Objects.requireNonNull(bVar3);
            return bVar3;
        }
        try {
            try {
                u790 u790Var2 = u790Var;
                boolean z = false;
                while (true) {
                    try {
                        obj = u790Var2.get();
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
                if (!zIsCancelled) {
                    return obj == null ? f24082d : obj;
                }
                return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + u790Var), false);
            } catch (Error e2) {
                e = e2;
                return new c(e);
            }
        } catch (Error | Exception e3) {
            e = e3;
            return new c(e);
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new b(e4, false);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + u790Var, e4));
        } catch (ExecutionException e5) {
            if (!zIsCancelled) {
                return new c(e5.getCause());
            }
            return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + u790Var, e5), false);
        }
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public void mo28322a(Runnable runnable, Executor executor) {
        d dVar;
        c95.m31848n(executor, "Executor was null.");
        if (!isDone() && (dVar = this.listeners) != d.f24089c) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (f24081c.mo28334a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.f24089c);
        }
        m28319o(runnable, executor);
    }

    @Override // p204p.tf50
    /* JADX INFO: renamed from: c */
    public final Throwable mo28323c() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof c) {
            return ((c) obj).f24088a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f24079a) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z);
        } else {
            bVar = z ? b.f24083c : b.f24084d;
            Objects.requireNonNull(bVar);
        }
        AbstractC1694b7<V> abstractC1694b7 = this;
        boolean z2 = false;
        while (true) {
            if (f24081c.mo28335b(abstractC1694b7, obj, bVar)) {
                m28318n(abstractC1694b7, z);
                if (obj instanceof f) {
                    u790 u790Var = ((f) obj).f24098b;
                    if (u790Var instanceof h) {
                        abstractC1694b7 = (AbstractC1694b7) u790Var;
                        obj = abstractC1694b7.value;
                        if ((obj == null) | (obj instanceof f)) {
                            z2 = true;
                        }
                    } else {
                        u790Var.cancel(z);
                    }
                }
                return true;
            }
            obj = abstractC1694b7.value;
            if (!(obj instanceof f)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof f))) {
            return m28320p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.waiters;
            if (kVar != k.f24105a) {
                k kVar2 = new k();
                while (true) {
                    f24081c.mo28339f(kVar2, kVar);
                    if (f24081c.mo28336c(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m28329t(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return m28320p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m28329t(kVar2);
                        break;
                    }
                    kVar = this.waiters;
                    if (kVar == k.f24105a) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return m28320p(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return m28320p(obj4);
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
        StringBuilder sbM77254m = s571.m77254m(j2, "Waited ", " ");
        sbM77254m.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM77254m.toString();
        if (nanos + 1000 < 0) {
            String strM77250i = s571.m77250i(string3, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM77250i2 = strM77250i + jConvert + " " + lowerCase;
                if (z) {
                    strM77250i2 = s571.m77250i(strM77250i2, ",");
                }
                strM77250i = s571.m77250i(strM77250i2, " ");
            }
            if (z) {
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
    public boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX INFO: renamed from: k */
    public final void m28324k(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
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
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m28326m(v, sb);
        sb.append("]");
    }

    /* JADX INFO: renamed from: m */
    public final void m28326m(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public String mo28328s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: t */
    public final void m28329t(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 == k.f24105a) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.next;
                if (kVar2.thread != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.next = kVar4;
                    if (kVar3.thread == null) {
                    }
                } else if (!f24081c.mo28336c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strMo28328s;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m28324k(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                u790 u790Var = ((f) obj).f24098b;
                try {
                    if (u790Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(u790Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo28328s = mo28328s();
                    if (kgg1.m56363z(strMo28328s)) {
                        strMo28328s = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strMo28328s = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strMo28328s != null) {
                    sb.append(", info=[");
                    sb.append(strMo28328s);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m28324k(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m28330u(Object obj) {
        if (obj == null) {
            obj = f24082d;
        }
        if (!f24081c.mo28335b(this, null, obj)) {
            return false;
        }
        m28318n(this, false);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m28331v(Throwable th) {
        th.getClass();
        if (!f24081c.mo28335b(this, null, new c(th))) {
            return false;
        }
        m28318n(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX INFO: renamed from: w */
    public boolean m28332w(u790 u790Var) {
        c cVar;
        u790Var.getClass();
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof b) {
                u790Var.cancel(((b) obj).f24085a);
            }
        } else if (u790Var.isDone()) {
            if (f24081c.mo28335b(this, null, m28321q(u790Var))) {
                m28318n(this, false);
                return true;
            }
        } else {
            f fVar = new f(this, u790Var);
            if (f24081c.mo28335b(this, null, fVar)) {
                try {
                    u790Var.mo28322a(fVar, ckr.f39074a);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.f24087b;
                    }
                    f24081c.mo28335b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof b) {
                u790Var.cancel(((b) obj).f24085a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m28333x() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f24085a;
    }

    /* JADX INFO: renamed from: p.b7$d */
    public static final class d {

        /* JADX INFO: renamed from: c */
        static final d f24089c = new d();

        /* JADX INFO: renamed from: a */
        final Runnable f24090a;

        /* JADX INFO: renamed from: b */
        final Executor f24091b;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.f24090a = runnable;
            this.f24091b = executor;
        }

        public d() {
            this.f24090a = null;
            this.f24091b = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo28325l() {
    }

    /* JADX INFO: renamed from: r */
    public void mo28327r() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return m28320p(obj2);
            }
            k kVar = this.waiters;
            if (kVar != k.f24105a) {
                k kVar2 = new k();
                do {
                    f24081c.mo28339f(kVar2, kVar);
                    if (f24081c.mo28336c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m28329t(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return m28320p(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != k.f24105a);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return m28320p(obj3);
        }
        throw new InterruptedException();
    }
}
