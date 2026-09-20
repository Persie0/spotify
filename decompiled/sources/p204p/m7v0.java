package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m7v0 {

    /* JADX INFO: renamed from: a */
    public final String f140846a;

    /* JADX INFO: renamed from: b */
    public final String f140847b;

    /* JADX INFO: renamed from: c */
    public final un20 f140848c;

    /* JADX INFO: renamed from: d */
    public final String f140849d;

    /* JADX INFO: renamed from: e */
    public final boolean f140850e;

    public m7v0(String str, String str2, un20 un20Var, String str3, boolean z) {
        this.f140846a = str;
        this.f140847b = str2;
        this.f140848c = un20Var;
        this.f140849d = str3;
        this.f140850e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7v0)) {
            return false;
        }
        m7v0 m7v0Var = (m7v0) obj;
        return wj50.m88271j(this.f140846a, m7v0Var.f140846a) && wj50.m88271j(this.f140847b, m7v0Var.f140847b) && wj50.m88271j(this.f140848c, m7v0Var.f140848c) && wj50.m88271j(this.f140849d, m7v0Var.f140849d) && this.f140850e == m7v0Var.f140850e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f140846a.hashCode() * 31, 31, this.f140847b);
        un20 un20Var = this.f140848c;
        return Boolean.hashCode(this.f140850e) + s571.m77243b((iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f140849d);
    }
}
