package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z271 {

    /* JADX INFO: renamed from: a */
    public final v140 f278508a;

    /* JADX INFO: renamed from: b */
    public final erc1 f278509b;

    /* JADX INFO: renamed from: c */
    public final boolean f278510c;

    public z271(v140 v140Var, erc1 erc1Var, boolean z) {
        this.f278508a = v140Var;
        this.f278509b = erc1Var;
        this.f278510c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z271)) {
            return false;
        }
        z271 z271Var = (z271) obj;
        return wj50.m88271j(this.f278508a, z271Var.f278508a) && wj50.m88271j(this.f278509b, z271Var.f278509b) && this.f278510c == z271Var.f278510c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278510c) + ((this.f278509b.hashCode() + (this.f278508a.hashCode() * 31)) * 31);
    }
}
