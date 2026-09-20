package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yg80 {

    /* JADX INFO: renamed from: a */
    public final String f272512a;

    /* JADX INFO: renamed from: b */
    public final String f272513b;

    /* JADX INFO: renamed from: c */
    public final boolean f272514c;

    /* JADX INFO: renamed from: d */
    public final zg80 f272515d;

    public yg80(String str, String str2, boolean z, zg80 zg80Var) {
        this.f272512a = str;
        this.f272513b = str2;
        this.f272514c = z;
        this.f272515d = zg80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg80)) {
            return false;
        }
        yg80 yg80Var = (yg80) obj;
        return this.f272512a.equals(yg80Var.f272512a) && wj50.m88271j(this.f272513b, yg80Var.f272513b) && this.f272514c == yg80Var.f272514c && this.f272515d == yg80Var.f272515d;
    }

    public final int hashCode() {
        return this.f272515d.hashCode() + s571.m77245d((this.f272513b.hashCode() + (this.f272512a.hashCode() * 31)) * 961, 31, this.f272514c);
    }
}
