package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dj2 {

    /* JADX INFO: renamed from: a */
    public final boolean f49531a;

    /* JADX INFO: renamed from: b */
    public final boolean f49532b;

    public dj2(boolean z, boolean z2) {
        this.f49531a = z;
        this.f49532b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2)) {
            return false;
        }
        dj2 dj2Var = (dj2) obj;
        return this.f49531a == dj2Var.f49531a && this.f49532b == dj2Var.f49532b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49532b) + (Boolean.hashCode(this.f49531a) * 31);
    }
}
