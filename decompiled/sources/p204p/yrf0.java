package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yrf0 {

    /* JADX INFO: renamed from: a */
    public final hz80 f275468a;

    /* JADX INFO: renamed from: b */
    public final boolean f275469b;

    /* JADX INFO: renamed from: c */
    public final String f275470c;

    /* JADX INFO: renamed from: d */
    public final String f275471d;

    public yrf0(hz80 hz80Var, boolean z, String str, String str2) {
        this.f275468a = hz80Var;
        this.f275469b = z;
        this.f275470c = str;
        this.f275471d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrf0)) {
            return false;
        }
        yrf0 yrf0Var = (yrf0) obj;
        return wj50.m88271j(this.f275468a, yrf0Var.f275468a) && this.f275469b == yrf0Var.f275469b && wj50.m88271j(this.f275470c, yrf0Var.f275470c) && wj50.m88271j(this.f275471d, yrf0Var.f275471d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f275468a.hashCode() * 31, 31, this.f275469b);
        String str = this.f275470c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f275471d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
