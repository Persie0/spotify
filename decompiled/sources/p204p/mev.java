package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mev {

    /* JADX INFO: renamed from: a */
    public final boolean f142840a;

    /* JADX INFO: renamed from: b */
    public final boolean f142841b;

    public mev(boolean z, boolean z2) {
        this.f142840a = z;
        this.f142841b = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61595a() {
        return this.f142841b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m61596b() {
        return this.f142840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mev)) {
            return false;
        }
        mev mevVar = (mev) obj;
        return this.f142840a == mevVar.f142840a && this.f142841b == mevVar.f142841b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142841b) + (Boolean.hashCode(this.f142840a) * 31);
    }
}
