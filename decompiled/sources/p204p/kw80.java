package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kw80 implements qw80 {

    /* JADX INFO: renamed from: a */
    public final int f127026a;

    /* JADX INFO: renamed from: b */
    public final lw80 f127027b;

    public kw80(int i, lw80 lw80Var) {
        this.f127026a = i;
        this.f127027b = lw80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw80)) {
            return false;
        }
        kw80 kw80Var = (kw80) obj;
        return this.f127026a == kw80Var.f127026a && wj50.m88271j(this.f127027b, kw80Var.f127027b);
    }

    public final int hashCode() {
        return this.f127027b.hashCode() + (Integer.hashCode(this.f127026a) * 31);
    }
}
