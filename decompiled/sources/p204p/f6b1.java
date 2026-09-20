package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f6b1 {

    /* JADX INFO: renamed from: a */
    public final String f66356a;

    /* JADX INFO: renamed from: b */
    public final String f66357b;

    /* JADX INFO: renamed from: c */
    public final String f66358c;

    /* JADX INFO: renamed from: d */
    public final String f66359d;

    public f6b1(String str, String str2, String str3, String str4) {
        this.f66356a = str;
        this.f66357b = str2;
        this.f66358c = str3;
        this.f66359d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6b1)) {
            return false;
        }
        f6b1 f6b1Var = (f6b1) obj;
        return wj50.m88271j(this.f66356a, f6b1Var.f66356a) && wj50.m88271j(this.f66357b, f6b1Var.f66357b) && wj50.m88271j(this.f66358c, f6b1Var.f66358c) && wj50.m88271j(this.f66359d, f6b1Var.f66359d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f66356a.hashCode() * 31, 31, this.f66357b), 31, this.f66358c);
        String str = this.f66359d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
