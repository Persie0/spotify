package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cde0 implements fde0 {

    /* JADX INFO: renamed from: a */
    public final String f36878a;

    /* JADX INFO: renamed from: b */
    public final boolean f36879b;

    public cde0(String str, boolean z) {
        this.f36878a = str;
        this.f36879b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cde0)) {
            return false;
        }
        cde0 cde0Var = (cde0) obj;
        return wj50.m88271j(this.f36878a, cde0Var.f36878a) && this.f36879b == cde0Var.f36879b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36879b) + (this.f36878a.hashCode() * 31);
    }
}
