package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hqp0 {

    /* JADX INFO: renamed from: a */
    public final String f94235a;

    /* JADX INFO: renamed from: b */
    public final String f94236b;

    /* JADX INFO: renamed from: c */
    public final String f94237c;

    /* JADX INFO: renamed from: d */
    public final boolean f94238d;

    public hqp0(String str, String str2, String str3, boolean z) {
        this.f94235a = str;
        this.f94236b = str2;
        this.f94237c = str3;
        this.f94238d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqp0)) {
            return false;
        }
        hqp0 hqp0Var = (hqp0) obj;
        return wj50.m88271j(this.f94235a, hqp0Var.f94235a) && wj50.m88271j(this.f94236b, hqp0Var.f94236b) && wj50.m88271j(this.f94237c, hqp0Var.f94237c) && this.f94238d == hqp0Var.f94238d;
    }

    public final int hashCode() {
        int iHashCode = this.f94235a.hashCode() * 31;
        String str = this.f94236b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94237c;
        return Boolean.hashCode(this.f94238d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
