package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class odb1 {

    /* JADX INFO: renamed from: a */
    public final String f164145a;

    /* JADX INFO: renamed from: b */
    public final boolean f164146b;

    /* JADX INFO: renamed from: c */
    public final boolean f164147c;

    /* JADX INFO: renamed from: d */
    public final boolean f164148d;

    /* JADX INFO: renamed from: e */
    public final boolean f164149e;

    /* JADX INFO: renamed from: f */
    public final boolean f164150f;

    public odb1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f164145a = str;
        this.f164146b = z;
        this.f164147c = z2;
        this.f164148d = z3;
        this.f164149e = z4;
        this.f164150f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odb1)) {
            return false;
        }
        odb1 odb1Var = (odb1) obj;
        return wj50.m88271j(this.f164145a, odb1Var.f164145a) && this.f164146b == odb1Var.f164146b && this.f164147c == odb1Var.f164147c && this.f164148d == odb1Var.f164148d && this.f164149e == odb1Var.f164149e && this.f164150f == odb1Var.f164150f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164150f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f164145a.hashCode() * 31, 31, this.f164146b), 31, this.f164147c), 31, this.f164148d), 31, this.f164149e);
    }
}
