package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fz60 {

    /* JADX INFO: renamed from: e */
    public static final fz60 f74919e = new fz60(null, null, null, null, 63);

    /* JADX INFO: renamed from: a */
    public final gh00 f74920a;

    /* JADX INFO: renamed from: b */
    public final gh00 f74921b;

    /* JADX INFO: renamed from: c */
    public final gh00 f74922c;

    /* JADX INFO: renamed from: d */
    public final gh00 f74923d;

    public fz60(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, gh00 gh00Var4, int i) {
        gh00Var = (i & 1) != 0 ? null : gh00Var;
        gh00Var2 = (i & 4) != 0 ? null : gh00Var2;
        gh00Var3 = (i & 16) != 0 ? null : gh00Var3;
        gh00Var4 = (i & 32) != 0 ? null : gh00Var4;
        this.f74920a = gh00Var;
        this.f74921b = gh00Var2;
        this.f74922c = gh00Var3;
        this.f74923d = gh00Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz60)) {
            return false;
        }
        fz60 fz60Var = (fz60) obj;
        return this.f74920a == fz60Var.f74920a && this.f74921b == fz60Var.f74921b && this.f74922c == fz60Var.f74922c && this.f74923d == fz60Var.f74923d;
    }

    public final int hashCode() {
        gh00 gh00Var = this.f74920a;
        int iHashCode = (gh00Var != null ? gh00Var.hashCode() : 0) * 961;
        gh00 gh00Var2 = this.f74921b;
        int iHashCode2 = (iHashCode + (gh00Var2 != null ? gh00Var2.hashCode() : 0)) * 961;
        gh00 gh00Var3 = this.f74922c;
        int iHashCode3 = (iHashCode2 + (gh00Var3 != null ? gh00Var3.hashCode() : 0)) * 31;
        gh00 gh00Var4 = this.f74923d;
        return iHashCode3 + (gh00Var4 != null ? gh00Var4.hashCode() : 0);
    }
}
