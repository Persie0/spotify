package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class izt0 {

    /* JADX INFO: renamed from: a */
    public final String f107287a;

    /* JADX INFO: renamed from: b */
    public final String f107288b;

    /* JADX INFO: renamed from: c */
    public final gh00 f107289c;

    public izt0(String str, String str2, gh00 gh00Var) {
        this.f107287a = str;
        this.f107288b = str2;
        this.f107289c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izt0)) {
            return false;
        }
        izt0 izt0Var = (izt0) obj;
        return wj50.m88271j(this.f107287a, izt0Var.f107287a) && wj50.m88271j(this.f107288b, izt0Var.f107288b) && wj50.m88271j(this.f107289c, izt0Var.f107289c);
    }

    public final int hashCode() {
        int iHashCode = this.f107287a.hashCode() * 31;
        String str = this.f107288b;
        return this.f107289c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
