package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f192947a;

    /* JADX INFO: renamed from: b */
    public final d850 f192948b;

    public qv90(String str, d850 d850Var) {
        this.f192947a = str;
        this.f192948b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv90)) {
            return false;
        }
        qv90 qv90Var = (qv90) obj;
        return wj50.m88271j(this.f192947a, qv90Var.f192947a) && wj50.m88271j(this.f192948b, qv90Var.f192948b);
    }

    public final int hashCode() {
        int iHashCode = this.f192947a.hashCode() * 31;
        d850 d850Var = this.f192948b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
