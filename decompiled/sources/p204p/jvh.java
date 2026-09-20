package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jvh {

    /* JADX INFO: renamed from: a */
    public final String f116355a;

    /* JADX INFO: renamed from: b */
    public final d850 f116356b;

    public jvh(String str, d850 d850Var) {
        this.f116355a = str;
        this.f116356b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvh)) {
            return false;
        }
        jvh jvhVar = (jvh) obj;
        return wj50.m88271j(this.f116355a, jvhVar.f116355a) && wj50.m88271j(this.f116356b, jvhVar.f116356b);
    }

    public final int hashCode() {
        int iHashCode = this.f116355a.hashCode() * 31;
        d850 d850Var = this.f116356b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
