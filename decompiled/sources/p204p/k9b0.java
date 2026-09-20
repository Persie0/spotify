package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k9b0 implements q9b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9b0 f120551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f120552c;

    public /* synthetic */ k9b0(r9b0 r9b0Var, float f, int i) {
        this.f120550a = i;
        this.f120551b = r9b0Var;
        this.f120552c = f;
    }

    @Override // p204p.q9b0
    public final void run() {
        switch (this.f120550a) {
            case 0:
                r9b0 r9b0Var = this.f120551b;
                u8b0 u8b0Var = r9b0Var.f196988a;
                float f = this.f120552c;
                if (u8b0Var != null) {
                    hab0 hab0Var = r9b0Var.f196990b;
                    hab0Var.m46929s(hab0Var.f89184t, eff0.m38735e(u8b0Var.f227893l, u8b0Var.f227894m, f));
                } else {
                    r9b0Var.f196998f.add(new k9b0(r9b0Var, f, 0));
                }
                break;
            default:
                r9b0 r9b0Var2 = this.f120551b;
                u8b0 u8b0Var2 = r9b0Var2.f196988a;
                float f2 = this.f120552c;
                if (u8b0Var2 != null) {
                    r9b0Var2.m75039t((int) eff0.m38735e(u8b0Var2.f227893l, u8b0Var2.f227894m, f2));
                } else {
                    r9b0Var2.f196998f.add(new k9b0(r9b0Var2, f2, 1));
                }
                break;
        }
    }
}
