package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jj31 implements mj31 {

    /* JADX INFO: renamed from: a */
    public final String f112877a;

    /* JADX INFO: renamed from: b */
    public final vj60 f112878b;

    /* JADX INFO: renamed from: c */
    public final boolean f112879c;

    public jj31(String str, vj60 vj60Var, boolean z) {
        this.f112877a = str;
        this.f112878b = vj60Var;
        this.f112879c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj31)) {
            return false;
        }
        jj31 jj31Var = (jj31) obj;
        return wj50.m88271j(this.f112877a, jj31Var.f112877a) && wj50.m88271j(this.f112878b, jj31Var.f112878b) && this.f112879c == jj31Var.f112879c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112879c) + ((this.f112878b.hashCode() + (this.f112877a.hashCode() * 31)) * 31);
    }
}
