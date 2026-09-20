package p204p;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p.c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC1730c6 extends inz implements Runnable {

    /* JADX INFO: renamed from: e */
    public u790 f34319e;

    /* JADX INFO: renamed from: f */
    public Class f34320f;

    /* JADX INFO: renamed from: g */
    public Object f34321g;

    public AbstractRunnableC1730c6(u790 u790Var, Class cls, Object obj) {
        u790Var.getClass();
        this.f34319e = u790Var;
        this.f34320f = cls;
        this.f34321g = obj;
    }

    /* JADX INFO: renamed from: y */
    public static C1693b6 m31496y(C2564x9 c2564x9, qh00 qh00Var, Executor executor) {
        C1693b6 c1693b6 = new C1693b6(c2564x9, Throwable.class, qh00Var);
        c2564x9.mo28322a(c1693b6, n0e1.m63405M(executor, c1693b6));
        return c1693b6;
    }

    /* JADX INFO: renamed from: z */
    public static C1656a6 m31497z(u790 u790Var, Class cls, hm6 hm6Var, Executor executor) {
        C1656a6 c1656a6 = new C1656a6(u790Var, cls, hm6Var);
        u790Var.mo28322a(c1656a6, n0e1.m63405M(executor, c1656a6));
        return c1656a6;
    }

    /* JADX INFO: renamed from: A */
    public abstract Object mo24824A(Object obj, Throwable th);

    /* JADX INFO: renamed from: B */
    public abstract void mo24825B(Object obj);

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: l */
    public final void mo28325l() {
        u790 u790Var = this.f34319e;
        if ((u790Var != null) & isCancelled()) {
            u790Var.cancel(m28333x());
        }
        this.f34319e = null;
        this.f34320f = null;
        this.f34321g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM85481v;
        u790 u790Var = this.f34319e;
        Class cls = this.f34320f;
        Object obj = this.f34321g;
        if (((obj == null) || ((u790Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f34319e = null;
        try {
            th = u790Var instanceof tf50 ? ((tf50) u790Var).mo28323c() : null;
            objM85481v = th == null ? vgg1.m85481v(u790Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + u790Var.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m28330u(objM85481v);
            return;
        }
        if (!cls.isInstance(th)) {
            m28332w(u790Var);
            return;
        }
        try {
            Object objMo24824A = mo24824A(obj, th);
            this.f34320f = null;
            this.f34321g = null;
            mo24825B(objMo24824A);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m28331v(th2);
            } finally {
                this.f34320f = null;
                this.f34321g = null;
            }
        }
    }

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: s */
    public final String mo28328s() {
        String str;
        u790 u790Var = this.f34319e;
        Class cls = this.f34320f;
        Object obj = this.f34321g;
        String strMo28328s = super.mo28328s();
        if (u790Var != null) {
            str = "inputFuture=[" + u790Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo28328s != null) {
                return s571.m77250i(str, strMo28328s);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }
}
