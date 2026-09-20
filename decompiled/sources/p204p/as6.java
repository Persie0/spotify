package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class as6 {

    /* JADX INFO: renamed from: a */
    public final String f19311a;

    /* JADX INFO: renamed from: b */
    public final boolean f19312b;

    /* JADX INFO: renamed from: c */
    public final int f19313c;

    public as6(String str, boolean z, int i) {
        this.f19311a = str;
        this.f19312b = z;
        this.f19313c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as6)) {
            return false;
        }
        as6 as6Var = (as6) obj;
        return this.f19311a.equals(as6Var.f19311a) && this.f19312b == as6Var.f19312b && this.f19313c == as6Var.f19313c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f19313c) + s571.m77245d(this.f19311a.hashCode() * 31, 31, this.f19312b);
    }
}
