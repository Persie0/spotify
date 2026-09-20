package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pua0 {

    /* JADX INFO: renamed from: a */
    public final String f181395a;

    /* JADX INFO: renamed from: b */
    public final kg7 f181396b;

    /* JADX INFO: renamed from: c */
    public final w0b0 f181397c;

    /* JADX INFO: renamed from: d */
    public final rk7 f181398d;

    public pua0(String str, kg7 kg7Var, w0b0 w0b0Var, rk7 rk7Var) {
        this.f181395a = str;
        this.f181396b = kg7Var;
        this.f181397c = w0b0Var;
        this.f181398d = rk7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pua0)) {
            return false;
        }
        pua0 pua0Var = (pua0) obj;
        return wj50.m88271j(this.f181395a, pua0Var.f181395a) && wj50.m88271j(this.f181396b, pua0Var.f181396b) && wj50.m88271j(this.f181397c, pua0Var.f181397c) && this.f181398d == pua0Var.f181398d;
    }

    public final int hashCode() {
        int iHashCode = (this.f181396b.hashCode() + (this.f181395a.hashCode() * 31)) * 31;
        w0b0 w0b0Var = this.f181397c;
        int iHashCode2 = (iHashCode + (w0b0Var == null ? 0 : w0b0Var.hashCode())) * 31;
        rk7 rk7Var = this.f181398d;
        return iHashCode2 + (rk7Var != null ? rk7Var.hashCode() : 0);
    }
}
