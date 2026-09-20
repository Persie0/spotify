package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kj20 {

    /* JADX INFO: renamed from: a */
    public final String f123204a;

    /* JADX INFO: renamed from: b */
    public final String f123205b;

    /* JADX INFO: renamed from: c */
    public final boolean f123206c;

    /* JADX INFO: renamed from: d */
    public final boolean f123207d;

    /* JADX INFO: renamed from: e */
    public final String f123208e;

    /* JADX INFO: renamed from: f */
    public final int f123209f;

    public kj20(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f123204a = str;
        this.f123205b = str2;
        this.f123206c = z;
        this.f123207d = z2;
        this.f123208e = str3;
        this.f123209f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj20)) {
            return false;
        }
        kj20 kj20Var = (kj20) obj;
        return wj50.m88271j(this.f123204a, kj20Var.f123204a) && wj50.m88271j(this.f123205b, kj20Var.f123205b) && this.f123206c == kj20Var.f123206c && this.f123207d == kj20Var.f123207d && wj50.m88271j(this.f123208e, kj20Var.f123208e) && this.f123209f == kj20Var.f123209f;
    }

    public final int hashCode() {
        String str = this.f123204a;
        return Integer.hashCode(this.f123209f) + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f123205b), 31, this.f123206c), 31, this.f123207d), 31, this.f123208e);
    }
}
