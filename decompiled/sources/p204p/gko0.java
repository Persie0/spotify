package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gko0 {

    /* JADX INFO: renamed from: a */
    public final String f80873a;

    /* JADX INFO: renamed from: b */
    public final String f80874b;

    /* JADX INFO: renamed from: c */
    public final long f80875c;

    /* JADX INFO: renamed from: d */
    public final long f80876d;

    /* JADX INFO: renamed from: e */
    public final String f80877e;

    public gko0(long j, long j2, String str, String str2, String str3) {
        this.f80873a = str;
        this.f80874b = str2;
        this.f80875c = j;
        this.f80876d = j2;
        this.f80877e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gko0)) {
            return false;
        }
        gko0 gko0Var = (gko0) obj;
        return wj50.m88271j(this.f80873a, gko0Var.f80873a) && wj50.m88271j(this.f80874b, gko0Var.f80874b) && this.f80875c == gko0Var.f80875c && this.f80876d == gko0Var.f80876d && wj50.m88271j(this.f80877e, gko0Var.f80877e);
    }

    public final int hashCode() {
        return this.f80877e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f80873a.hashCode() * 31, 31, this.f80874b), this.f80875c, 31), this.f80876d, 31);
    }
}
