package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y460 implements a560 {

    /* JADX INFO: renamed from: a */
    public final String f269081a;

    /* JADX INFO: renamed from: b */
    public final boolean f269082b;

    /* JADX INFO: renamed from: c */
    public final boolean f269083c;

    /* JADX INFO: renamed from: d */
    public final boolean f269084d;

    public y460(String str, boolean z, boolean z2, boolean z3) {
        this.f269081a = str;
        this.f269082b = z;
        this.f269083c = z2;
        this.f269084d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y460)) {
            return false;
        }
        y460 y460Var = (y460) obj;
        return wj50.m88271j(this.f269081a, y460Var.f269081a) && this.f269082b == y460Var.f269082b && this.f269083c == y460Var.f269083c && this.f269084d == y460Var.f269084d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269084d) + s571.m77245d(s571.m77245d(this.f269081a.hashCode() * 31, 31, this.f269082b), 31, this.f269083c);
    }
}
