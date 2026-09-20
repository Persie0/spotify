package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kri0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125657a;

    /* JADX INFO: renamed from: b */
    public final boolean f125658b;

    /* JADX INFO: renamed from: c */
    public final boolean f125659c;

    public kri0(boolean z, boolean z2, boolean z3) {
        this.f125657a = z;
        this.f125658b = z2;
        this.f125659c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kri0)) {
            return false;
        }
        kri0 kri0Var = (kri0) obj;
        return this.f125657a == kri0Var.f125657a && this.f125658b == kri0Var.f125658b && this.f125659c == kri0Var.f125659c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125659c) + s571.m77245d(Boolean.hashCode(this.f125657a) * 31, 31, this.f125658b);
    }
}
