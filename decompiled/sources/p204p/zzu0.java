package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu0 {

    /* JADX INFO: renamed from: a */
    public final int f288114a;

    /* JADX INFO: renamed from: b */
    public final String f288115b;

    public zzu0(int i, String str) {
        this.f288114a = i;
        this.f288115b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzu0)) {
            return false;
        }
        zzu0 zzu0Var = (zzu0) obj;
        return this.f288114a == zzu0Var.f288114a && wj50.m88271j(this.f288115b, zzu0Var.f288115b);
    }

    public final int hashCode() {
        return this.f288115b.hashCode() + (Integer.hashCode(this.f288114a) * 31);
    }
}
