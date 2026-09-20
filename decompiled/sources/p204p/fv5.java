package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f73675a;

    /* JADX INFO: renamed from: b */
    public final boolean f73676b;

    /* JADX INFO: renamed from: c */
    public final String f73677c;

    public fv5(String str, String str2, boolean z) {
        this.f73675a = str;
        this.f73676b = z;
        this.f73677c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv5)) {
            return false;
        }
        fv5 fv5Var = (fv5) obj;
        return wj50.m88271j(this.f73675a, fv5Var.f73675a) && this.f73676b == fv5Var.f73676b && wj50.m88271j(this.f73677c, fv5Var.f73677c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f73675a.hashCode() * 31, 31, this.f73676b);
        String str = this.f73677c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
