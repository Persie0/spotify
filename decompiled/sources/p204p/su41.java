package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class su41 {

    /* JADX INFO: renamed from: a */
    public final String f214002a;

    /* JADX INFO: renamed from: b */
    public final String f214003b;

    /* JADX INFO: renamed from: c */
    public final String f214004c;

    /* JADX INFO: renamed from: d */
    public final boolean f214005d;

    /* JADX INFO: renamed from: e */
    public final String f214006e;

    /* JADX INFO: renamed from: f */
    public final boolean f214007f;

    public /* synthetic */ su41() {
        this("", null, "", null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su41)) {
            return false;
        }
        su41 su41Var = (su41) obj;
        return wj50.m88271j(this.f214002a, su41Var.f214002a) && wj50.m88271j(this.f214003b, su41Var.f214003b) && wj50.m88271j(this.f214004c, su41Var.f214004c) && this.f214005d == su41Var.f214005d && wj50.m88271j(this.f214006e, su41Var.f214006e) && this.f214007f == su41Var.f214007f;
    }

    public final int hashCode() {
        int iHashCode = this.f214002a.hashCode() * 31;
        String str = this.f214003b;
        int iM77245d = s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f214004c), 31, this.f214005d);
        String str2 = this.f214006e;
        return Boolean.hashCode(this.f214007f) + ((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public su41(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f214002a = str;
        this.f214003b = str2;
        this.f214004c = str3;
        this.f214005d = z;
        this.f214006e = str4;
        this.f214007f = z2;
    }
}
