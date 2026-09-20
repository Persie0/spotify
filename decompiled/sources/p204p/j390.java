package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j390 {

    /* JADX INFO: renamed from: a */
    public final int f108318a;

    /* JADX INFO: renamed from: b */
    public final boolean f108319b;

    /* JADX INFO: renamed from: c */
    public final boolean f108320c;

    public j390(int i, boolean z, boolean z2) {
        this.f108318a = i;
        this.f108319b = z;
        this.f108320c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j390)) {
            return false;
        }
        j390 j390Var = (j390) obj;
        return this.f108318a == j390Var.f108318a && this.f108319b == j390Var.f108319b && this.f108320c == j390Var.f108320c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108320c) + s571.m77245d(mt60.m62800g(this.f108318a, Integer.hashCode(0) * 31, 31), 31, this.f108319b);
    }
}
