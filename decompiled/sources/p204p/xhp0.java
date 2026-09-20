package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xhp0 implements bip0 {

    /* JADX INFO: renamed from: a */
    public final String f261690a;

    /* JADX INFO: renamed from: b */
    public final String f261691b;

    /* JADX INFO: renamed from: c */
    public final String f261692c;

    public xhp0(String str, String str2, String str3) {
        this.f261690a = str;
        this.f261691b = str2;
        this.f261692c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhp0)) {
            return false;
        }
        xhp0 xhp0Var = (xhp0) obj;
        return wj50.m88271j(this.f261690a, xhp0Var.f261690a) && wj50.m88271j(this.f261691b, xhp0Var.f261691b) && wj50.m88271j(this.f261692c, xhp0Var.f261692c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f261690a.hashCode() * 31, 31, this.f261691b);
        String str = this.f261692c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
