package p204p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p.y9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC2605y9 extends inz implements Runnable {

    /* JADX INFO: renamed from: e */
    public u790 f270452e;

    /* JADX INFO: renamed from: f */
    public Object f270453f;

    public AbstractRunnableC2605y9(u790 u790Var, Object obj) {
        u790Var.getClass();
        this.f270452e = u790Var;
        this.f270453f = obj;
    }

    /* JADX INFO: renamed from: y */
    public static C2564x9 m93136y(u790 u790Var, qh00 qh00Var, Executor executor) {
        C2564x9 c2564x9 = new C2564x9(u790Var, qh00Var);
        u790Var.mo28322a(c2564x9, n0e1.m63405M(executor, c2564x9));
        return c2564x9;
    }

    /* JADX INFO: renamed from: z */
    public static C2525w9 m93137z(u790 u790Var, hm6 hm6Var, Executor executor) {
        executor.getClass();
        C2525w9 c2525w9 = new C2525w9(u790Var, hm6Var);
        u790Var.mo28322a(c2525w9, n0e1.m63405M(executor, c2525w9));
        return c2525w9;
    }

    /* JADX INFO: renamed from: A */
    public abstract Object mo87478A(Object obj, Object obj2);

    /* JADX INFO: renamed from: B */
    public abstract void mo87479B(Object obj);

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: l */
    public final void mo28325l() {
        u790 u790Var = this.f270452e;
        if ((u790Var != null) & isCancelled()) {
            u790Var.cancel(m28333x());
        }
        this.f270452e = null;
        this.f270453f = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u790 u790Var = this.f270452e;
        Object obj = this.f270453f;
        if ((isCancelled() | (u790Var == null)) || (obj == null)) {
            return;
        }
        this.f270452e = null;
        if (u790Var.isCancelled()) {
            m28332w(u790Var);
            return;
        }
        try {
            try {
                Object objMo87478A = mo87478A(obj, vgg1.m85481v(u790Var));
                this.f270453f = null;
                mo87479B(objMo87478A);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m28331v(th);
                } finally {
                    this.f270453f = null;
                }
            }
        } catch (Error e) {
            m28331v(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m28331v(e2.getCause());
        } catch (Exception e3) {
            m28331v(e3);
        }
    }

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: s */
    public final String mo28328s() {
        String str;
        u790 u790Var = this.f270452e;
        Object obj = this.f270453f;
        String strMo28328s = super.mo28328s();
        if (u790Var != null) {
            str = "inputFuture=[" + u790Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo28328s != null) {
                return s571.m77250i(str, strMo28328s);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }
}
