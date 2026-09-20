package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jet0 {

    /* JADX INFO: renamed from: a */
    public final pwj0 f111659a;

    /* JADX INFO: renamed from: b */
    public final wet0 f111660b;

    public jet0(pwj0 pwj0Var, wet0 wet0Var) {
        this.f111659a = pwj0Var;
        this.f111660b = wet0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m53108a(int i) {
        pwj0 pwj0Var = this.f111659a;
        try {
            this.f111660b.m87909b(i);
        } finally {
            pwj0Var.f182068b.cancel(null, i);
        }
    }
}
