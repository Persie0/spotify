package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lj60 {

    /* JADX INFO: renamed from: a */
    public final String f133994a;

    /* JADX INFO: renamed from: b */
    public final String f133995b;

    public lj60(String str, String str2) {
        this.f133994a = str;
        this.f133995b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj60)) {
            return false;
        }
        lj60 lj60Var = (lj60) obj;
        return wj50.m88271j(this.f133994a, lj60Var.f133994a) && wj50.m88271j(this.f133995b, lj60Var.f133995b);
    }

    public final int hashCode() {
        return this.f133995b.hashCode() + (this.f133994a.hashCode() * 31);
    }
}
