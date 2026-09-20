package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o3o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f161417a;

    /* JADX INFO: renamed from: b */
    public final boolean f161418b;

    /* JADX INFO: renamed from: c */
    public final boolean f161419c;

    public o3o0(boolean z, boolean z2, boolean z3) {
        this.f161417a = z;
        this.f161418b = z2;
        this.f161419c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3o0)) {
            return false;
        }
        o3o0 o3o0Var = (o3o0) obj;
        return this.f161417a == o3o0Var.f161417a && this.f161418b == o3o0Var.f161418b && this.f161419c == o3o0Var.f161419c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161419c) + s571.m77245d(Boolean.hashCode(this.f161417a) * 31, 31, this.f161418b);
    }
}
