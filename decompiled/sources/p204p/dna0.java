package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dna0 {

    /* JADX INFO: renamed from: a */
    public final String f50715a;

    /* JADX INFO: renamed from: b */
    public final ina0 f50716b;

    /* JADX INFO: renamed from: c */
    public final rma0 f50717c;

    public dna0(String str, ina0 ina0Var, rma0 rma0Var) {
        this.f50715a = str;
        this.f50716b = ina0Var;
        this.f50717c = rma0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dna0)) {
            return false;
        }
        dna0 dna0Var = (dna0) obj;
        return wj50.m88271j(this.f50715a, dna0Var.f50715a) && wj50.m88271j(this.f50716b, dna0Var.f50716b) && wj50.m88271j(this.f50717c, dna0Var.f50717c);
    }

    public final int hashCode() {
        return this.f50717c.hashCode() + ((this.f50716b.hashCode() + (this.f50715a.hashCode() * 31)) * 31);
    }
}
