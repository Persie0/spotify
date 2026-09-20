package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aba1 {

    /* JADX INFO: renamed from: a */
    public final String f14084a;

    /* JADX INFO: renamed from: b */
    public final String f14085b;

    public aba1(String str, String str2) {
        this.f14084a = str;
        this.f14085b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba1)) {
            return false;
        }
        aba1 aba1Var = (aba1) obj;
        return wj50.m88271j(this.f14084a, aba1Var.f14084a) && wj50.m88271j(this.f14085b, aba1Var.f14085b);
    }

    public final int hashCode() {
        return this.f14085b.hashCode() + (this.f14084a.hashCode() * 31);
    }
}
