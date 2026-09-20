package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ffy0 implements jfy0 {

    /* JADX INFO: renamed from: a */
    public final String f69121a;

    /* JADX INFO: renamed from: b */
    public final yfy0 f69122b;

    public ffy0(String str, yfy0 yfy0Var) {
        this.f69121a = str;
        this.f69122b = yfy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffy0)) {
            return false;
        }
        ffy0 ffy0Var = (ffy0) obj;
        return wj50.m88271j(this.f69121a, ffy0Var.f69121a) && wj50.m88271j(this.f69122b, ffy0Var.f69122b);
    }

    public final int hashCode() {
        return this.f69122b.hashCode() + (this.f69121a.hashCode() * 31);
    }
}
