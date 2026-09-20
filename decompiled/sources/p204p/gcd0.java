package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gcd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jcd0 f78558b;

    public /* synthetic */ gcd0(jcd0 jcd0Var, int i) {
        this.f78557a = i;
        this.f78558b = jcd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78557a) {
            case 0:
                this.f78558b.f111081c.f176048a.clear();
                break;
            default:
                jcd0 jcd0Var = this.f78558b;
                cap0 cap0Var = jcd0Var.f111077G;
                if (cap0Var != null) {
                    jcd0Var.m52962x(cap0Var, x9p0.f259415c);
                }
                break;
        }
    }
}
