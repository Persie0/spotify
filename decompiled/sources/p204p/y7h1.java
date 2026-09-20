package p204p;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y7h1 extends Task {

    /* JADX INFO: renamed from: a */
    public final Object f270085a = new Object();

    /* JADX INFO: renamed from: b */
    public final u6l0 f270086b = new u6l0(2);

    /* JADX INFO: renamed from: c */
    public boolean f270087c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f270088d;

    /* JADX INFO: renamed from: e */
    public Object f270089e;

    /* JADX INFO: renamed from: f */
    public Exception f270090f;

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: a */
    public final y7h1 mo1509a(Executor executor, k7l0 k7l0Var) {
        this.f270086b.m82451b(new d8g1(executor, k7l0Var));
        m92999t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: b */
    public final y7h1 mo1510b(r7l0 r7l0Var) {
        this.f270086b.m82451b(new d8g1(gv61.f84648a, r7l0Var));
        m92999t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: c */
    public final y7h1 mo1511c(Executor executor, oal0 oal0Var) {
        this.f270086b.m82451b(new d8g1(executor, oal0Var));
        m92999t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: d */
    public final y7h1 mo1512d(Executor executor, kdl0 kdl0Var) {
        this.f270086b.m82451b(new d8g1(executor, kdl0Var));
        m92999t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: e */
    public final y7h1 mo1513e(Executor executor, gbk gbkVar) {
        y7h1 y7h1Var = new y7h1();
        this.f270086b.m82451b(new krf1(executor, gbkVar, y7h1Var, 1));
        m92999t();
        return y7h1Var;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: f */
    public final Exception mo1514f() {
        Exception exc;
        synchronized (this.f270085a) {
            exc = this.f270090f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: g */
    public final Object mo1515g() {
        Object obj;
        synchronized (this.f270085a) {
            try {
                ig31.m50508z("Task is not yet complete", this.f270087c);
                if (this.f270088d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f270090f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f270089e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: h */
    public final Object mo1516h(Class cls) {
        Object obj;
        synchronized (this.f270085a) {
            try {
                ig31.m50508z("Task is not yet complete", this.f270087c);
                if (this.f270088d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (cls.isInstance(this.f270090f)) {
                    throw ((Throwable) cls.cast(this.f270090f));
                }
                Exception exc = this.f270090f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f270089e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: i */
    public final boolean mo1517i() {
        boolean z;
        synchronized (this.f270085a) {
            z = this.f270087c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: j */
    public final boolean mo1518j() {
        boolean z;
        synchronized (this.f270085a) {
            try {
                z = false;
                if (this.f270087c && !this.f270088d && this.f270090f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: k */
    public final y7h1 mo1519k(Executor executor, cy51 cy51Var) {
        y7h1 y7h1Var = new y7h1();
        this.f270086b.m82451b(new d8g1(executor, cy51Var, y7h1Var));
        m92999t();
        return y7h1Var;
    }

    /* JADX INFO: renamed from: l */
    public final y7h1 m92991l(Executor executor, r7l0 r7l0Var) {
        this.f270086b.m82451b(new d8g1(executor, r7l0Var));
        m92999t();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final y7h1 m92992m(oal0 oal0Var) {
        mo1511c(gv61.f84648a, oal0Var);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final y7h1 m92993n(kdl0 kdl0Var) {
        mo1512d(gv61.f84648a, kdl0Var);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final y7h1 m92994o(Executor executor, gbk gbkVar) {
        y7h1 y7h1Var = new y7h1();
        this.f270086b.m82451b(new krf1(executor, gbkVar, y7h1Var, 0));
        m92999t();
        return y7h1Var;
    }

    /* JADX INFO: renamed from: p */
    public final void m92995p(Exception exc) {
        ig31.m50507y(exc, "Exception must not be null");
        synchronized (this.f270085a) {
            if (this.f270087c) {
                throw DuplicateTaskCompletionException.m1508a(this);
            }
            this.f270087c = true;
            this.f270090f = exc;
        }
        this.f270086b.m82452c(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m92996q(Object obj) {
        synchronized (this.f270085a) {
            if (this.f270087c) {
                throw DuplicateTaskCompletionException.m1508a(this);
            }
            this.f270087c = true;
            this.f270089e = obj;
        }
        this.f270086b.m82452c(this);
    }

    /* JADX INFO: renamed from: r */
    public final void m92997r() {
        synchronized (this.f270085a) {
            try {
                if (this.f270087c) {
                    return;
                }
                this.f270087c = true;
                this.f270088d = true;
                this.f270086b.m82452c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m92998s(Object obj) {
        synchronized (this.f270085a) {
            try {
                if (this.f270087c) {
                    return false;
                }
                this.f270087c = true;
                this.f270089e = obj;
                this.f270086b.m82452c(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m92999t() {
        synchronized (this.f270085a) {
            try {
                if (this.f270087c) {
                    this.f270086b.m82452c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
