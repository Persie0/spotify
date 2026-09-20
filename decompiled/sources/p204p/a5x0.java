package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a5x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12640a;

    /* JADX INFO: renamed from: b */
    public final boolean f12641b;

    public a5x0(boolean z, boolean z2) {
        this.f12640a = z;
        this.f12641b = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24821a(int i) {
        return (i == 1 && this.f12640a) || (i == 2 && this.f12641b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5x0)) {
            return false;
        }
        a5x0 a5x0Var = (a5x0) obj;
        return this.f12640a == a5x0Var.f12640a && this.f12641b == a5x0Var.f12641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12641b) + (Boolean.hashCode(this.f12640a) * 31);
    }
}
