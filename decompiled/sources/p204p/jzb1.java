package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jzb1 {

    /* JADX INFO: renamed from: a */
    public final String f117676a;

    /* JADX INFO: renamed from: b */
    public final long f117677b;

    public jzb1(String str, long j) {
        this.f117676a = str;
        this.f117677b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzb1)) {
            return false;
        }
        jzb1 jzb1Var = (jzb1) obj;
        return wj50.m88271j(this.f117676a, jzb1Var.f117676a) && this.f117677b == jzb1Var.f117677b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f117677b) + (this.f117676a.hashCode() * 31);
    }
}
