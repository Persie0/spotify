package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f248214a;

    /* JADX INFO: renamed from: b */
    public final String f248215b;

    /* JADX INFO: renamed from: c */
    public final String f248216c;

    /* JADX INFO: renamed from: d */
    public final String f248217d;

    public w5z0(String str, String str2, String str3, String str4) {
        this.f248214a = str;
        this.f248215b = str2;
        this.f248216c = str3;
        this.f248217d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5z0)) {
            return false;
        }
        w5z0 w5z0Var = (w5z0) obj;
        return wj50.m88271j(this.f248214a, w5z0Var.f248214a) && wj50.m88271j(this.f248215b, w5z0Var.f248215b) && wj50.m88271j(this.f248216c, w5z0Var.f248216c) && wj50.m88271j(this.f248217d, w5z0Var.f248217d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f248214a.hashCode() * 31, 31, this.f248215b);
        String str = this.f248216c;
        return this.f248217d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
