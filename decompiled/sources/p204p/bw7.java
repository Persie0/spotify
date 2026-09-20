package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bw7 {

    /* JADX INFO: renamed from: a */
    public final boolean f31569a;

    /* JADX INFO: renamed from: b */
    public final boolean f31570b;

    /* JADX INFO: renamed from: c */
    public final boolean f31571c;

    public /* synthetic */ bw7() {
        this(false, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw7)) {
            return false;
        }
        bw7 bw7Var = (bw7) obj;
        return this.f31569a == bw7Var.f31569a && this.f31570b == bw7Var.f31570b && this.f31571c == bw7Var.f31571c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31571c) + s571.m77245d(Boolean.hashCode(this.f31569a) * 31, 31, this.f31570b);
    }

    public bw7(boolean z, boolean z2, boolean z3) {
        this.f31569a = z;
        this.f31570b = z2;
        this.f31571c = z3;
    }
}
