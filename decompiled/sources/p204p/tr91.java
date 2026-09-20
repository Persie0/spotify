package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tr91 {

    /* JADX INFO: renamed from: a */
    public final String f223014a;

    /* JADX INFO: renamed from: b */
    public final String f223015b;

    /* JADX INFO: renamed from: c */
    public final String f223016c;

    /* JADX INFO: renamed from: d */
    public final String f223017d;

    public tr91(String str, String str2, String str3, String str4) {
        this.f223014a = str;
        this.f223015b = str2;
        this.f223016c = str3;
        this.f223017d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr91)) {
            return false;
        }
        tr91 tr91Var = (tr91) obj;
        return wj50.m88271j(this.f223014a, tr91Var.f223014a) && wj50.m88271j(this.f223015b, tr91Var.f223015b) && wj50.m88271j(this.f223016c, tr91Var.f223016c) && wj50.m88271j(this.f223017d, tr91Var.f223017d);
    }

    public final int hashCode() {
        return this.f223017d.hashCode() + s571.m77243b(s571.m77243b(this.f223014a.hashCode() * 31, 31, this.f223015b), 31, this.f223016c);
    }
}
