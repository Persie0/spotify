package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dzb0 implements wyb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f54609a;

    /* JADX INFO: renamed from: b */
    public final boolean f54610b;

    /* JADX INFO: renamed from: c */
    public final boolean f54611c;

    public dzb0(boolean z, boolean z2, boolean z3) {
        this.f54609a = z;
        this.f54610b = z2;
        this.f54611c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzb0)) {
            return false;
        }
        dzb0 dzb0Var = (dzb0) obj;
        return this.f54609a == dzb0Var.f54609a && this.f54610b == dzb0Var.f54610b && this.f54611c == dzb0Var.f54611c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54611c) + s571.m77245d(Boolean.hashCode(this.f54609a) * 31, 31, this.f54610b);
    }
}
