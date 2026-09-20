package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dh4 {

    /* JADX INFO: renamed from: a */
    public final boolean f48975a;

    /* JADX INFO: renamed from: b */
    public final boolean f48976b;

    public dh4(boolean z, boolean z2) {
        this.f48975a = z;
        this.f48976b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh4)) {
            return false;
        }
        dh4 dh4Var = (dh4) obj;
        return this.f48975a == dh4Var.f48975a && this.f48976b == dh4Var.f48976b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48976b) + (Boolean.hashCode(this.f48975a) * 31);
    }
}
