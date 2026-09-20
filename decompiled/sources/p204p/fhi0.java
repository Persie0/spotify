package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fhi0 {

    /* JADX INFO: renamed from: a */
    public final String f69666a;

    /* JADX INFO: renamed from: b */
    public final String f69667b;

    /* JADX INFO: renamed from: c */
    public final String f69668c;

    /* JADX INFO: renamed from: d */
    public final String f69669d;

    /* JADX INFO: renamed from: e */
    public final boolean f69670e;

    public fhi0(String str, String str2, String str3, String str4, boolean z) {
        this.f69666a = str;
        this.f69667b = str2;
        this.f69668c = str3;
        this.f69669d = str4;
        this.f69670e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhi0)) {
            return false;
        }
        fhi0 fhi0Var = (fhi0) obj;
        return wj50.m88271j(this.f69666a, fhi0Var.f69666a) && wj50.m88271j(this.f69667b, fhi0Var.f69667b) && wj50.m88271j(this.f69668c, fhi0Var.f69668c) && wj50.m88271j(this.f69669d, fhi0Var.f69669d) && this.f69670e == fhi0Var.f69670e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f69666a.hashCode() * 31, 31, this.f69667b);
        String str = this.f69668c;
        return Boolean.hashCode(this.f69670e) + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69669d);
    }
}
