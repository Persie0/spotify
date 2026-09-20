package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq4 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ar4 f243868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p471 f243869c;

    public /* synthetic */ vq4(ar4 ar4Var, p471 p471Var, int i) {
        this.f243867a = i;
        this.f243868b = ar4Var;
        this.f243869c = p471Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f243867a) {
            case 0:
                ar4 ar4Var = this.f243868b;
                uq4 uq4Var = ar4Var.f18935f;
                mo4 mo4Var = new mo4(this.f243869c, 1);
                rlv0 rlv0Var = new rlv0();
                ar4Var.f18934e.m61344d("dataBuilder", uq4Var, new C2570xf(1, rlv0Var, mo4Var));
                Object obj = rlv0Var.f200373a;
                if (obj != null) {
                    return (o471) obj;
                }
                wj50.m88260d0("result");
                throw null;
            case 1:
                ar4 ar4Var2 = this.f243868b;
                uq4 uq4Var2 = ar4Var2.f18936g;
                vq4 vq4Var = new vq4(ar4Var2, this.f243869c, 2);
                rlv0 rlv0Var2 = new rlv0();
                ar4Var2.f18934e.m61344d("positioner", uq4Var2, new C2570xf(1, rlv0Var2, vq4Var));
                Object obj2 = rlv0Var2.f200373a;
                if (obj2 != null) {
                    return (tiv0) obj2;
                }
                wj50.m88260d0("result");
                throw null;
            default:
                Object objInvoke = this.f243868b.f18932c.invoke();
                if (!((jo70) objInvoke).mo30016a()) {
                    objInvoke = null;
                }
                jo70 jo70Var = (jo70) objInvoke;
                return jo70Var == null ? tiv0.f220750e : this.f243869c.mo40750r0(jo70Var).m80941m(jo70Var.mo30006K(0L));
        }
    }
}
