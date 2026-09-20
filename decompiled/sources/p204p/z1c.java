package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z1c implements i2c {

    /* JADX INFO: renamed from: a */
    public final String f278276a;

    /* JADX INFO: renamed from: b */
    public final fq01 f278277b;

    /* JADX INFO: renamed from: c */
    public final ccl0 f278278c;

    /* JADX INFO: renamed from: d */
    public final ho01 f278279d;

    /* JADX INFO: renamed from: e */
    public final int f278280e;

    public z1c(String str, fq01 fq01Var, ccl0 ccl0Var, ho01 ho01Var, int i) {
        this.f278276a = str;
        this.f278277b = fq01Var;
        this.f278278c = ccl0Var;
        this.f278279d = ho01Var;
        this.f278280e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1c)) {
            return false;
        }
        z1c z1cVar = (z1c) obj;
        return wj50.m88271j(this.f278276a, z1cVar.f278276a) && wj50.m88271j(this.f278277b, z1cVar.f278277b) && wj50.m88271j(this.f278278c, z1cVar.f278278c) && wj50.m88271j(this.f278279d, z1cVar.f278279d) && this.f278280e == z1cVar.f278280e;
    }

    public final int hashCode() {
        int iHashCode = (this.f278277b.hashCode() + (this.f278276a.hashCode() * 31)) * 31;
        ccl0 ccl0Var = this.f278278c;
        return Integer.hashCode(this.f278280e) + ((this.f278279d.hashCode() + ((iHashCode + (ccl0Var == null ? 0 : ccl0Var.hashCode())) * 31)) * 31);
    }
}
