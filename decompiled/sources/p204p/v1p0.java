package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v1p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f236432a;

    /* JADX INFO: renamed from: b */
    public final boolean f236433b;

    /* JADX INFO: renamed from: c */
    public final boolean f236434c;

    /* JADX INFO: renamed from: d */
    public final int f236435d;

    public v1p0(int i, boolean z, boolean z2, boolean z3) {
        this.f236432a = z;
        this.f236433b = z2;
        this.f236434c = z3;
        this.f236435d = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84484a(psj psjVar) {
        boolean z;
        if (!this.f236434c) {
            int iOrdinal = psjVar.ordinal();
            if (iOrdinal != 0) {
                z = iOrdinal != 1 ? false : this.f236432a;
            } else {
                z = this.f236433b;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1p0)) {
            return false;
        }
        v1p0 v1p0Var = (v1p0) obj;
        return this.f236432a == v1p0Var.f236432a && this.f236433b == v1p0Var.f236433b && this.f236434c == v1p0Var.f236434c && this.f236435d == v1p0Var.f236435d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236435d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f236432a) * 31, 31, this.f236433b), 31, this.f236434c);
    }
}
