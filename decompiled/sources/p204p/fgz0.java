package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fgz0 {

    /* JADX INFO: renamed from: a */
    public final String f69482a;

    /* JADX INFO: renamed from: b */
    public final String f69483b;

    /* JADX INFO: renamed from: c */
    public final int f69484c;

    public fgz0(String str, String str2, int i) {
        this.f69482a = str;
        this.f69483b = str2;
        this.f69484c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgz0)) {
            return false;
        }
        fgz0 fgz0Var = (fgz0) obj;
        return wj50.m88271j(this.f69482a, fgz0Var.f69482a) && wj50.m88271j(this.f69483b, fgz0Var.f69483b) && this.f69484c == fgz0Var.f69484c;
    }

    public final int hashCode() {
        int iHashCode = this.f69482a.hashCode() * 31;
        String str = this.f69483b;
        return edb.m38547C(this.f69484c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
