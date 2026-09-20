package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yy90 {

    /* JADX INFO: renamed from: a */
    public final String f277443a;

    /* JADX INFO: renamed from: b */
    public final String f277444b;

    /* JADX INFO: renamed from: c */
    public final String f277445c;

    /* JADX INFO: renamed from: d */
    public final boolean f277446d;

    public yy90(String str, String str2, String str3, boolean z) {
        this.f277443a = str;
        this.f277444b = str2;
        this.f277445c = str3;
        this.f277446d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy90)) {
            return false;
        }
        yy90 yy90Var = (yy90) obj;
        return wj50.m88271j(this.f277443a, yy90Var.f277443a) && wj50.m88271j(this.f277444b, yy90Var.f277444b) && wj50.m88271j(this.f277445c, yy90Var.f277445c) && this.f277446d == yy90Var.f277446d;
    }

    public final int hashCode() {
        int iHashCode = this.f277443a.hashCode() * 31;
        String str = this.f277444b;
        return Boolean.hashCode(this.f277446d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f277445c);
    }
}
