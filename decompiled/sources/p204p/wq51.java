package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wq51 {

    /* JADX INFO: renamed from: a */
    public static final ccs f253934a;

    static {
        float f = 40;
        float f2 = 10;
        f253934a = new ccs(f2, f, f2, f);
    }

    /* JADX INFO: renamed from: a */
    public static final fxh0 m88734a(eh00 eh00Var, fxh0 fxh0Var, boolean z, boolean z2) {
        if (!z || !yq51.f275156a) {
            return fxh0Var;
        }
        if (z2) {
            fxh0Var = fxh0Var.mo34315F(new zq51(f253934a));
        }
        return fxh0Var.mo34315F(new vq51(eh00Var));
    }
}
