package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final boolean f91303a;

    /* JADX INFO: renamed from: b */
    public final boolean f91304b;

    public hh8(boolean z, boolean z2) {
        this.f91303a = z;
        this.f91304b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh8)) {
            return false;
        }
        hh8 hh8Var = (hh8) obj;
        return this.f91303a == hh8Var.f91303a && this.f91304b == hh8Var.f91304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91304b) + (Boolean.hashCode(this.f91303a) * 31);
    }
}
