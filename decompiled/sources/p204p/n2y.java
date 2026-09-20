package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n2y {

    /* JADX INFO: renamed from: a */
    public final int f149867a;

    /* JADX INFO: renamed from: b */
    public final boolean f149868b;

    /* JADX INFO: renamed from: c */
    public final boolean f149869c;

    public n2y(int i, boolean z, boolean z2) {
        this.f149867a = i;
        this.f149868b = z;
        this.f149869c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2y)) {
            return false;
        }
        n2y n2yVar = (n2y) obj;
        return this.f149867a == n2yVar.f149867a && this.f149868b == n2yVar.f149868b && this.f149869c == n2yVar.f149869c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149869c) + s571.m77245d(edb.m38547C(this.f149867a) * 31, 31, this.f149868b);
    }
}
