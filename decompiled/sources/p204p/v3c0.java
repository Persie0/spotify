package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v3c0 {

    /* JADX INFO: renamed from: a */
    public final String f236825a;

    /* JADX INFO: renamed from: b */
    public final String f236826b;

    /* JADX INFO: renamed from: c */
    public final int f236827c;

    /* JADX INFO: renamed from: d */
    public final String f236828d;

    /* JADX INFO: renamed from: e */
    public final Integer f236829e;

    public v3c0(int i, Integer num, String str, String str2, String str3) {
        this.f236825a = str;
        this.f236826b = str2;
        this.f236827c = i;
        this.f236828d = str3;
        this.f236829e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3c0)) {
            return false;
        }
        v3c0 v3c0Var = (v3c0) obj;
        return this.f236825a.equals(v3c0Var.f236825a) && this.f236826b.equals(v3c0Var.f236826b) && this.f236827c == v3c0Var.f236827c && wj50.m88271j(this.f236828d, v3c0Var.f236828d) && wj50.m88271j(this.f236829e, v3c0Var.f236829e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f236827c, s571.m77243b(this.f236825a.hashCode() * 31, 31, this.f236826b), 31);
        String str = this.f236828d;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f236829e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
