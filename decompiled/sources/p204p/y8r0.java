package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y8r0 {

    /* JADX INFO: renamed from: a */
    public final int f270360a;

    /* JADX INFO: renamed from: b */
    public final boolean f270361b;

    /* JADX INFO: renamed from: c */
    public final boolean f270362c;

    public y8r0(int i, boolean z, boolean z2) {
        this.f270360a = i;
        this.f270361b = z;
        this.f270362c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8r0)) {
            return false;
        }
        y8r0 y8r0Var = (y8r0) obj;
        return this.f270360a == y8r0Var.f270360a && this.f270361b == y8r0Var.f270361b && this.f270362c == y8r0Var.f270362c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270362c) + s571.m77245d(Integer.hashCode(this.f270360a) * 31, 31, this.f270361b);
    }
}
