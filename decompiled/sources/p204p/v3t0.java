package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class v3t0 {

    /* JADX INFO: renamed from: a */
    public final cz70 f236936a;

    public v3t0(eh00 eh00Var) {
        this.f236936a = new cz70(eh00Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract c4t0 mo30068a(Object obj);

    /* JADX INFO: renamed from: b */
    public n3b1 mo67798b() {
        return this.f236936a;
    }

    /* JADX INFO: renamed from: c */
    public final n3b1 m84627c(c4t0 c4t0Var, n3b1 n3b1Var) {
        tns tnsVar;
        n3b1 n3b1Var2 = null;
        n3b1Var2 = null;
        n3b1Var2 = null;
        n3b1Var2 = null;
        n3b1Var2 = null;
        n3b1Var2 = null;
        if (n3b1Var instanceof tns) {
            if (c4t0Var.f34008d) {
                tnsVar = (tns) n3b1Var;
                tnsVar.f222071a.setValue(c4t0Var.m31449a());
            }
        } else if (n3b1Var instanceof cz41) {
            if ((c4t0Var.f34006b || c4t0Var.f34009e != null) && !c4t0Var.f34008d) {
                cz41 cz41Var = (cz41) n3b1Var;
                if (wj50.m88271j(c4t0Var.m31449a(), cz41Var.f43472a)) {
                    n3b1Var2 = cz41Var;
                }
            }
        } else if (n3b1Var instanceof pth) {
            c4t0Var.getClass();
        }
        if (n3b1Var2 != null) {
            n3b1Var2 = tnsVar;
            return n3b1Var2;
        }
        if (!c4t0Var.f34008d) {
            n3b1Var2 = tnsVar;
            return new cz41(c4t0Var.m31449a());
        }
        Object obj = c4t0Var.f34009e;
        cb31 cb31Var = c4t0Var.f34007c;
        if (cb31Var == null) {
            n3b1Var2 = tnsVar;
            cb31Var = tjr0.f220989Q0;
        }
        n3b1Var2 = tnsVar;
        return new tns(sam.m77644A(obj, cb31Var));
    }
}
