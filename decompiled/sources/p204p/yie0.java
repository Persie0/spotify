package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yie0 {

    /* JADX INFO: renamed from: a */
    public final String f273099a;

    /* JADX INFO: renamed from: b */
    public final String f273100b;

    /* JADX INFO: renamed from: c */
    public final String f273101c;

    public yie0(String str, String str2, int i, String str3) {
        str3 = (i & 64) != 0 ? null : str3;
        this.f273099a = str;
        this.f273100b = str2;
        this.f273101c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m93736a() {
        return this.f273101c;
    }

    /* JADX INFO: renamed from: b */
    public final String m93737b() {
        return this.f273099a;
    }

    /* JADX INFO: renamed from: c */
    public final String m93738c() {
        return this.f273100b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yie0)) {
            return false;
        }
        yie0 yie0Var = (yie0) obj;
        return wj50.m88271j(this.f273099a, yie0Var.f273099a) && wj50.m88271j(this.f273100b, yie0Var.f273100b) && wj50.m88271j(this.f273101c, yie0Var.f273101c);
    }

    public final int hashCode() {
        String str = this.f273099a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273100b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 28629151;
        String str3 = this.f273101c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
