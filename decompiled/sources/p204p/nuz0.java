package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nuz0 {

    /* JADX INFO: renamed from: a */
    public final String f158744a;

    /* JADX INFO: renamed from: b */
    public final int f158745b;

    public nuz0(String str, int i) {
        this.f158744a = str;
        this.f158745b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuz0)) {
            return false;
        }
        nuz0 nuz0Var = (nuz0) obj;
        return wj50.m88271j(this.f158744a, nuz0Var.f158744a) && this.f158745b == nuz0Var.f158745b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f158745b) + (this.f158744a.hashCode() * 31);
    }
}
