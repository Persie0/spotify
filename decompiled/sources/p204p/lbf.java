package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lbf implements b250 {

    /* JADX INFO: renamed from: a */
    public final b250 f131656a;

    /* JADX INFO: renamed from: b */
    public final b250 f131657b;

    public lbf(b250 b250Var, b250 b250Var2) {
        this.f131656a = b250Var;
        this.f131657b = b250Var2;
    }

    @Override // p204p.b250
    /* JADX INFO: renamed from: a */
    public final nlp mo27941a(a250 a250Var) {
        lbf lbfVar = this;
        while (true) {
            nlp nlpVarMo27941a = lbfVar.f131657b.mo27941a(a250Var);
            if (nlpVarMo27941a != null) {
                return nlpVarMo27941a;
            }
            b250 b250Var = lbfVar.f131656a;
            if (!(b250Var instanceof lbf)) {
                return b250Var.mo27941a(a250Var);
            }
            lbfVar = (lbf) b250Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58662b(b250 b250Var) {
        b250 b250Var2;
        b250 b250Var3 = this.f131656a;
        if (b250Var3 == b250Var || (b250Var2 = this.f131657b) == b250Var) {
            return true;
        }
        if ((b250Var3 instanceof lbf) && ((lbf) b250Var3).m58662b(b250Var)) {
            return true;
        }
        return (b250Var2 instanceof lbf) && ((lbf) b250Var2).m58662b(b250Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbf)) {
            return false;
        }
        lbf lbfVar = (lbf) obj;
        return wj50.m88271j(this.f131656a, lbfVar.f131656a) && wj50.m88271j(this.f131657b, lbfVar.f131657b);
    }

    public final int hashCode() {
        return this.f131657b.hashCode() + (this.f131656a.hashCode() * 31);
    }
}
