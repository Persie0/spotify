package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e1z0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f55282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ npm0 f55283c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh00 f55284d;

    public /* synthetic */ e1z0(boolean z, npm0 npm0Var, eh00 eh00Var, int i) {
        this.f55281a = i;
        this.f55282b = z;
        this.f55283c = npm0Var;
        this.f55284d = eh00Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f55281a) {
            case 0:
                if (((Boolean) obj).booleanValue() && this.f55282b && !this.f55283c.f157031a) {
                    this.f55284d.invoke();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() && this.f55282b) {
                    npm0 npm0Var = this.f55283c;
                    if (!npm0Var.f157031a && npm0Var.f157032b == null) {
                        this.f55284d.invoke();
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
