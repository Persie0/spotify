package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g9b1 {

    /* JADX INFO: renamed from: a */
    public final String f77724a;

    /* JADX INFO: renamed from: b */
    public final String f77725b;

    public g9b1(String str, String str2) {
        this.f77724a = str;
        this.f77725b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9b1)) {
            return false;
        }
        g9b1 g9b1Var = (g9b1) obj;
        return wj50.m88271j(this.f77724a, g9b1Var.f77724a) && wj50.m88271j(this.f77725b, g9b1Var.f77725b);
    }

    public final int hashCode() {
        return this.f77725b.hashCode() + (this.f77724a.hashCode() * 31);
    }
}
