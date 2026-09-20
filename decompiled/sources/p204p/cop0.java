package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cop0 {

    /* JADX INFO: renamed from: a */
    public final String f40320a;

    /* JADX INFO: renamed from: b */
    public final String f40321b;

    /* JADX INFO: renamed from: c */
    public final String f40322c;

    /* JADX INFO: renamed from: d */
    public final String f40323d;

    /* JADX INFO: renamed from: e */
    public final boolean f40324e;

    /* JADX INFO: renamed from: f */
    public final Integer f40325f;

    /* JADX INFO: renamed from: g */
    public final boolean f40326g;

    public cop0(Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f40320a = str;
        this.f40321b = str2;
        this.f40322c = str3;
        this.f40323d = str4;
        this.f40324e = z;
        this.f40325f = num;
        this.f40326g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cop0)) {
            return false;
        }
        cop0 cop0Var = (cop0) obj;
        return wj50.m88271j(this.f40320a, cop0Var.f40320a) && wj50.m88271j(this.f40321b, cop0Var.f40321b) && wj50.m88271j(this.f40322c, cop0Var.f40322c) && wj50.m88271j(this.f40323d, cop0Var.f40323d) && this.f40324e == cop0Var.f40324e && wj50.m88271j(this.f40325f, cop0Var.f40325f) && this.f40326g == cop0Var.f40326g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f40320a.hashCode() * 31, 31, this.f40321b), 31, this.f40322c);
        String str = this.f40323d;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f40324e);
        Integer num = this.f40325f;
        return Boolean.hashCode(this.f40326g) + ((iM77245d + (num != null ? num.hashCode() : 0)) * 31);
    }
}
