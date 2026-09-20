package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gao0 {

    /* JADX INFO: renamed from: a */
    public final String f78083a;

    /* JADX INFO: renamed from: b */
    public final d850 f78084b;

    public gao0(String str, d850 d850Var) {
        this.f78083a = str;
        this.f78084b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gao0)) {
            return false;
        }
        gao0 gao0Var = (gao0) obj;
        return wj50.m88271j(this.f78083a, gao0Var.f78083a) && wj50.m88271j(this.f78084b, gao0Var.f78084b);
    }

    public final int hashCode() {
        return this.f78084b.hashCode() + (this.f78083a.hashCode() * 31);
    }
}
