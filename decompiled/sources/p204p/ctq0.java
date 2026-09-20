package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ctq0 {

    /* JADX INFO: renamed from: a */
    public final String f41960a;

    /* JADX INFO: renamed from: b */
    public final String f41961b;

    /* JADX INFO: renamed from: c */
    public final int f41962c;

    /* JADX INFO: renamed from: d */
    public final int f41963d;

    public ctq0(int i, String str, int i2, String str2) {
        this.f41960a = str;
        this.f41961b = str2;
        this.f41962c = i;
        this.f41963d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctq0)) {
            return false;
        }
        ctq0 ctq0Var = (ctq0) obj;
        return this.f41960a.equals(ctq0Var.f41960a) && wj50.m88271j(this.f41961b, ctq0Var.f41961b) && this.f41962c == ctq0Var.f41962c && this.f41963d == ctq0Var.f41963d;
    }

    public final int hashCode() {
        int iHashCode = this.f41960a.hashCode() * 31;
        String str = this.f41961b;
        return edb.m38547C(this.f41963d) + f710.m40938f(this.f41962c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
