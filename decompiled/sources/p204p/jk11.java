package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jk11 {

    /* JADX INFO: renamed from: a */
    public final String f113178a;

    /* JADX INFO: renamed from: b */
    public final String f113179b;

    /* JADX INFO: renamed from: c */
    public final String f113180c;

    /* JADX INFO: renamed from: d */
    public final String f113181d;

    /* JADX INFO: renamed from: e */
    public final String f113182e;

    public jk11(String str, String str2, String str3, String str4, String str5) {
        this.f113178a = str;
        this.f113179b = str2;
        this.f113180c = str3;
        this.f113181d = str4;
        this.f113182e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk11)) {
            return false;
        }
        jk11 jk11Var = (jk11) obj;
        return wj50.m88271j(this.f113178a, jk11Var.f113178a) && wj50.m88271j(this.f113179b, jk11Var.f113179b) && wj50.m88271j(this.f113180c, jk11Var.f113180c) && wj50.m88271j(this.f113181d, jk11Var.f113181d) && wj50.m88271j(this.f113182e, jk11Var.f113182e);
    }

    public final int hashCode() {
        return this.f113182e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f113178a.hashCode() * 31, 31, this.f113179b), 31, this.f113180c), 31, this.f113181d);
    }
}
