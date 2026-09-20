package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w10 {

    /* JADX INFO: renamed from: a */
    public final String f246909a;

    /* JADX INFO: renamed from: b */
    public final t10 f246910b;

    /* JADX INFO: renamed from: c */
    public final int f246911c;

    public w10(String str, t10 t10Var, int i) {
        this.f246909a = str;
        this.f246910b = t10Var;
        this.f246911c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        if (!wj50.m88271j(this.f246909a, w10Var.f246909a) || !wj50.m88271j(this.f246910b, w10Var.f246910b)) {
            return false;
        }
        int i = w10Var.f246911c;
        int i2 = this.f246911c;
        if (i2 == 0) {
            return i == 0;
        }
        return i != 0 && i2 == i;
    }

    public final int hashCode() {
        int iHashCode = this.f246909a.hashCode() * 31;
        t10 t10Var = this.f246910b;
        int iHashCode2 = (iHashCode + (t10Var == null ? 0 : Boolean.hashCode(t10Var.f216046a))) * 31;
        int i = this.f246911c;
        return iHashCode2 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
