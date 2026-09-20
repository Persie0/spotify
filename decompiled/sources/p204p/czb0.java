package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class czb0 implements wyb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f43517a;

    /* JADX INFO: renamed from: b */
    public final boolean f43518b;

    /* JADX INFO: renamed from: c */
    public final boolean f43519c;

    public czb0(boolean z, boolean z2, boolean z3) {
        this.f43517a = z;
        this.f43518b = z2;
        this.f43519c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czb0)) {
            return false;
        }
        czb0 czb0Var = (czb0) obj;
        return this.f43517a == czb0Var.f43517a && this.f43518b == czb0Var.f43518b && this.f43519c == czb0Var.f43519c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43519c) + s571.m77245d(Boolean.hashCode(this.f43517a) * 31, 31, this.f43518b);
    }
}
