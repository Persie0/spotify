package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lj71 implements mj71 {

    /* JADX INFO: renamed from: a */
    public final String f134002a;

    /* JADX INFO: renamed from: b */
    public final String f134003b;

    public lj71(String str, String str2) {
        this.f134002a = str;
        this.f134003b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj71)) {
            return false;
        }
        lj71 lj71Var = (lj71) obj;
        return wj50.m88271j(this.f134002a, lj71Var.f134002a) && wj50.m88271j(this.f134003b, lj71Var.f134003b);
    }

    public final int hashCode() {
        return this.f134003b.hashCode() + (this.f134002a.hashCode() * 31);
    }
}
