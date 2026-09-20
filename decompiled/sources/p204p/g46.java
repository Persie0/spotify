package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g46 {

    /* JADX INFO: renamed from: a */
    public final String f76352a;

    /* JADX INFO: renamed from: b */
    public final String f76353b;

    public g46(String str, String str2) {
        this.f76352a = str;
        this.f76353b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g46)) {
            return false;
        }
        g46 g46Var = (g46) obj;
        return wj50.m88271j(this.f76352a, g46Var.f76352a) && wj50.m88271j(this.f76353b, g46Var.f76353b);
    }

    public final int hashCode() {
        return this.f76353b.hashCode() + (this.f76352a.hashCode() * 31);
    }
}
