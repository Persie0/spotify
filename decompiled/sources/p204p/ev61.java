package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ev61 {

    /* JADX INFO: renamed from: a */
    public final y7h1 f63172a = new y7h1();

    public ev61() {
    }

    /* JADX INFO: renamed from: a */
    public final void m40096a(Exception exc) {
        this.f63172a.m92995p(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m40097b(Object obj) {
        this.f63172a.m92996q(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m40098c(Exception exc) {
        y7h1 y7h1Var = this.f63172a;
        y7h1Var.getClass();
        ig31.m50507y(exc, "Exception must not be null");
        synchronized (y7h1Var.f270085a) {
            try {
                if (y7h1Var.f270087c) {
                    return false;
                }
                y7h1Var.f270087c = true;
                y7h1Var.f270090f = exc;
                y7h1Var.f270086b.m82452c(y7h1Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m40099d(Object obj) {
        this.f63172a.m92998s(obj);
    }

    public ev61(c4d1 c4d1Var) {
        c4d1 c4d1Var2 = new c4d1(this, 18);
        ((y7h1) c4d1Var.f33927b).mo1512d(gv61.f84648a, new c4d1(c4d1Var2, 8));
    }
}
