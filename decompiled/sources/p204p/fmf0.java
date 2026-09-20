package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fmf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f71037a;

    /* JADX INFO: renamed from: b */
    public final emf0 f71038b;

    /* JADX INFO: renamed from: c */
    public final b791 f71039c;

    /* JADX INFO: renamed from: d */
    public final b791 f71040d;

    public fmf0(b791 b791Var, emf0 emf0Var, b791 b791Var2, b791 b791Var3) {
        this.f71037a = b791Var;
        this.f71038b = emf0Var;
        this.f71039c = b791Var2;
        this.f71040d = b791Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmf0)) {
            return false;
        }
        fmf0 fmf0Var = (fmf0) obj;
        return wj50.m88271j(this.f71037a, fmf0Var.f71037a) && wj50.m88271j(this.f71038b, fmf0Var.f71038b) && wj50.m88271j(this.f71039c, fmf0Var.f71039c) && wj50.m88271j(this.f71040d, fmf0Var.f71040d);
    }

    public final int hashCode() {
        b791 b791Var = this.f71037a;
        int iHashCode = (this.f71038b.hashCode() + ((b791Var == null ? 0 : b791Var.hashCode()) * 31)) * 31;
        b791 b791Var2 = this.f71039c;
        return this.f71040d.hashCode() + ((iHashCode + (b791Var2 != null ? b791Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        b791 b791Var = this.f71037a;
        String strM28367g = b791Var != null ? b791Var.m28367g() : null;
        b791 b791Var2 = this.f71039c;
        String strM28367g2 = b791Var2 != null ? b791Var2.m28367g() : null;
        String strM28367g3 = this.f71040d.m28367g();
        StringBuilder sbM38573v = edb.m38573v("SaveTransition(transition=", strM28367g, ", storedTransition=", strM28367g2, ", autoTransition=");
        sbM38573v.append(strM28367g3);
        sbM38573v.append(", destination=");
        sbM38573v.append(this.f71038b);
        sbM38573v.append(")");
        return sbM38573v.toString();
    }
}
