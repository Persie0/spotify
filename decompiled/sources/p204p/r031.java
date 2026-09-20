package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r031 extends t031 {

    /* JADX INFO: renamed from: a */
    public final String f194375a;

    /* JADX INFO: renamed from: b */
    public final int f194376b;

    public r031(String str, int i) {
        this.f194375a = str;
        this.f194376b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r031)) {
            return false;
        }
        r031 r031Var = (r031) obj;
        return wj50.m88271j(this.f194375a, r031Var.f194375a) && this.f194376b == r031Var.f194376b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f194376b) + (this.f194375a.hashCode() * 31);
    }
}
