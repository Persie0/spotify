package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dnv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f50883a;

    /* JADX INFO: renamed from: b */
    public final boolean f50884b;

    public dnv0(boolean z, boolean z2) {
        this.f50883a = z;
        this.f50884b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnv0)) {
            return false;
        }
        dnv0 dnv0Var = (dnv0) obj;
        return this.f50883a == dnv0Var.f50883a && this.f50884b == dnv0Var.f50884b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50884b) + (Boolean.hashCode(this.f50883a) * 31);
    }
}
