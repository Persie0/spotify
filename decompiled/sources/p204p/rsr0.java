package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rsr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f202395a;

    /* JADX INFO: renamed from: b */
    public final boolean f202396b;

    /* JADX INFO: renamed from: c */
    public final boolean f202397c;

    /* JADX INFO: renamed from: d */
    public final boolean f202398d;

    public rsr0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f202395a = z;
        this.f202396b = z2;
        this.f202397c = z3;
        this.f202398d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsr0)) {
            return false;
        }
        rsr0 rsr0Var = (rsr0) obj;
        return this.f202395a == rsr0Var.f202395a && this.f202396b == rsr0Var.f202396b && this.f202397c == rsr0Var.f202397c && this.f202398d == rsr0Var.f202398d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202398d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f202395a) * 31, 31, this.f202396b), 31, this.f202397c);
    }
}
