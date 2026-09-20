package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x84 {

    /* JADX INFO: renamed from: a */
    public final boolean f259044a;

    /* JADX INFO: renamed from: b */
    public final boolean f259045b;

    /* JADX INFO: renamed from: c */
    public final boolean f259046c;

    public x84(boolean z, boolean z2, boolean z3) {
        this.f259044a = z;
        this.f259045b = z2;
        this.f259046c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x84)) {
            return false;
        }
        x84 x84Var = (x84) obj;
        return this.f259044a == x84Var.f259044a && this.f259045b == x84Var.f259045b && this.f259046c == x84Var.f259046c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259046c) + s571.m77245d(Boolean.hashCode(this.f259044a) * 31, 31, this.f259045b);
    }
}
