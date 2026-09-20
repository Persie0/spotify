package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m1b0 {

    /* JADX INFO: renamed from: a */
    public final String f138921a;

    /* JADX INFO: renamed from: b */
    public final String f138922b;

    public m1b0(String str, String str2) {
        this.f138921a = str;
        this.f138922b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1b0)) {
            return false;
        }
        m1b0 m1b0Var = (m1b0) obj;
        return wj50.m88271j(this.f138921a, m1b0Var.f138921a) && wj50.m88271j(this.f138922b, m1b0Var.f138922b);
    }

    public final int hashCode() {
        return this.f138922b.hashCode() + (this.f138921a.hashCode() * 31);
    }
}
