package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class amw0 {

    /* JADX INFO: renamed from: a */
    public final String f17210a;

    /* JADX INFO: renamed from: b */
    public final boolean f17211b;

    /* JADX INFO: renamed from: c */
    public final int f17212c;

    /* JADX INFO: renamed from: d */
    public final int f17213d;

    public amw0(String str, int i, int i2, boolean z) {
        this.f17210a = str;
        this.f17211b = z;
        this.f17212c = i;
        this.f17213d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amw0)) {
            return false;
        }
        amw0 amw0Var = (amw0) obj;
        return wj50.m88271j(this.f17210a, amw0Var.f17210a) && this.f17211b == amw0Var.f17211b && this.f17212c == amw0Var.f17212c && this.f17213d == amw0Var.f17213d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f17213d) + f710.m40938f(this.f17212c, s571.m77245d(this.f17210a.hashCode() * 31, 31, this.f17211b), 31);
    }
}
