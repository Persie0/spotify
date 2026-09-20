package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l8s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8s0 f130928b;

    public /* synthetic */ l8s0(s8s0 s8s0Var, int i) {
        this.f130927a = i;
        this.f130928b = s8s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f130927a) {
            case 0:
                this.f130928b.m77529D();
                break;
            case 1:
                s8s0 s8s0Var = this.f130928b;
                if (!s8s0Var.f206774s1) {
                    whd0 whd0Var = s8s0Var.f206735R0;
                    whd0Var.getClass();
                    whd0Var.mo26776d(s8s0Var);
                }
                break;
            default:
                this.f130928b.f206768m1 = true;
                break;
        }
    }
}
