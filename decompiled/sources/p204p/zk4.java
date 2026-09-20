package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zk4 {

    /* JADX INFO: renamed from: a */
    public final int f283631a;

    /* JADX INFO: renamed from: b */
    public final boolean f283632b;

    /* JADX INFO: renamed from: c */
    public final boolean f283633c;

    public zk4(int i, boolean z, boolean z2) {
        this.f283631a = i;
        this.f283632b = z;
        this.f283633c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk4)) {
            return false;
        }
        zk4 zk4Var = (zk4) obj;
        return this.f283631a == zk4Var.f283631a && this.f283632b == zk4Var.f283632b && this.f283633c == zk4Var.f283633c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283633c) + s571.m77245d(Integer.hashCode(this.f283631a) * 31, 31, this.f283632b);
    }
}
