package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vt10 {

    /* JADX INFO: renamed from: a */
    public final String f244529a;

    /* JADX INFO: renamed from: b */
    public final String f244530b;

    /* JADX INFO: renamed from: c */
    public final int f244531c;

    public vt10(String str, String str2, int i) {
        this.f244529a = str;
        this.f244530b = str2;
        this.f244531c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt10)) {
            return false;
        }
        vt10 vt10Var = (vt10) obj;
        return wj50.m88271j(this.f244529a, vt10Var.f244529a) && wj50.m88271j(this.f244530b, vt10Var.f244530b) && this.f244531c == vt10Var.f244531c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f244531c) + s571.m77243b(this.f244529a.hashCode() * 31, 31, this.f244530b);
    }
}
