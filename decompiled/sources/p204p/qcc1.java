package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qcc1 {

    /* JADX INFO: renamed from: a */
    public final String f187305a;

    /* JADX INFO: renamed from: b */
    public final k7i0 f187306b;

    public qcc1(String str, k7i0 k7i0Var) {
        this.f187305a = str;
        this.f187306b = k7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcc1)) {
            return false;
        }
        qcc1 qcc1Var = (qcc1) obj;
        return wj50.m88271j(this.f187305a, qcc1Var.f187305a) && wj50.m88271j(this.f187306b, qcc1Var.f187306b);
    }

    public final int hashCode() {
        return this.f187306b.hashCode() + (this.f187305a.hashCode() * 31);
    }
}
