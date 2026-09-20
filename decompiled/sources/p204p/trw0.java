package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class trw0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f223140a;

    /* JADX INFO: renamed from: b */
    public final String f223141b;

    public trw0(String str, ro0 ro0Var) {
        this.f223140a = ro0Var;
        this.f223141b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trw0)) {
            return false;
        }
        trw0 trw0Var = (trw0) obj;
        return wj50.m88271j(this.f223140a, trw0Var.f223140a) && this.f223141b.equals(trw0Var.f223141b);
    }

    public final int hashCode() {
        return edb.m38547C(2) + s571.m77243b(this.f223140a.hashCode() * 31, 31, this.f223141b);
    }
}
