package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p6x0 extends y6x0 {

    /* JADX INFO: renamed from: a */
    public final String f174516a;

    /* JADX INFO: renamed from: b */
    public final String f174517b;

    public p6x0(String str, String str2) {
        this.f174516a = str;
        this.f174517b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6x0)) {
            return false;
        }
        p6x0 p6x0Var = (p6x0) obj;
        return wj50.m88271j(this.f174516a, p6x0Var.f174516a) && wj50.m88271j(this.f174517b, p6x0Var.f174517b);
    }

    public final int hashCode() {
        return this.f174517b.hashCode() + (this.f174516a.hashCode() * 31);
    }
}
