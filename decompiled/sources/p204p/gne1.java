package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gne1 {

    /* JADX INFO: renamed from: a */
    public final kb01 f82698a;

    /* JADX INFO: renamed from: b */
    public final kb01 f82699b;

    /* JADX INFO: renamed from: c */
    public final kb01 f82700c;

    public gne1(kb01 kb01Var, kb01 kb01Var2, kb01 kb01Var3) {
        this.f82698a = kb01Var;
        this.f82699b = kb01Var2;
        this.f82700c = kb01Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gne1)) {
            return false;
        }
        gne1 gne1Var = (gne1) obj;
        return wj50.m88271j(this.f82698a, gne1Var.f82698a) && wj50.m88271j(this.f82699b, gne1Var.f82699b) && wj50.m88271j(this.f82700c, gne1Var.f82700c);
    }

    public final int hashCode() {
        return this.f82700c.hashCode() + ((this.f82699b.hashCode() + (this.f82698a.hashCode() * 31)) * 31);
    }
}
