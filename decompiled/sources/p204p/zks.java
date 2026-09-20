package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zks {

    /* JADX INFO: renamed from: a */
    public final int f283840a;

    /* JADX INFO: renamed from: b */
    public final int f283841b;

    public zks(int i, int i2) {
        this.f283840a = i;
        this.f283841b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m96339a() {
        return this.f283840a;
    }

    /* JADX INFO: renamed from: b */
    public final int m96340b() {
        return this.f283841b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zks)) {
            return false;
        }
        zks zksVar = (zks) obj;
        return this.f283840a == zksVar.f283840a && this.f283841b == zksVar.f283841b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f283841b) + (edb.m38547C(this.f283840a) * 31);
    }
}
