package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nra1 {

    /* JADX INFO: renamed from: a */
    public final String f157482a;

    /* JADX INFO: renamed from: b */
    public final String f157483b;

    public nra1(String str, String str2) {
        this.f157482a = str;
        this.f157483b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nra1)) {
            return false;
        }
        nra1 nra1Var = (nra1) obj;
        return wj50.m88271j(this.f157482a, nra1Var.f157482a) && wj50.m88271j(this.f157483b, nra1Var.f157483b);
    }

    public final int hashCode() {
        return this.f157483b.hashCode() + (this.f157482a.hashCode() * 31);
    }
}
