package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w90 {

    /* JADX INFO: renamed from: a */
    public final String f249043a;

    /* JADX INFO: renamed from: b */
    public final String f249044b;

    /* JADX INFO: renamed from: c */
    public final xx61 f249045c;

    /* JADX INFO: renamed from: d */
    public final String f249046d;

    public w90(String str, String str2, xx61 xx61Var, String str3) {
        this.f249043a = str;
        this.f249044b = str2;
        this.f249045c = xx61Var;
        this.f249046d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return wj50.m88271j(this.f249043a, w90Var.f249043a) && wj50.m88271j(this.f249044b, w90Var.f249044b) && this.f249045c == w90Var.f249045c && wj50.m88271j(this.f249046d, w90Var.f249046d);
    }

    public final int hashCode() {
        int iHashCode = (this.f249045c.hashCode() + s571.m77243b(this.f249043a.hashCode() * 31, 31, this.f249044b)) * 31;
        String str = this.f249046d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
