package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class paf0 {

    /* JADX INFO: renamed from: a */
    public final qho f175522a;

    /* JADX INFO: renamed from: b */
    public final qho f175523b;

    public paf0(qho qhoVar, qho qhoVar2) {
        this.f175522a = qhoVar;
        this.f175523b = qhoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paf0)) {
            return false;
        }
        paf0 paf0Var = (paf0) obj;
        return wj50.m88271j(this.f175522a, paf0Var.f175522a) && wj50.m88271j(this.f175523b, paf0Var.f175523b);
    }

    public final int hashCode() {
        return this.f175523b.hashCode() + (this.f175522a.hashCode() * 31);
    }
}
