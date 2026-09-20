package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class msi {

    /* JADX INFO: renamed from: a */
    public final boolean f146816a;

    /* JADX INFO: renamed from: b */
    public final boolean f146817b;

    public msi(boolean z, boolean z2) {
        this.f146816a = z;
        this.f146817b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msi)) {
            return false;
        }
        msi msiVar = (msi) obj;
        return this.f146816a == msiVar.f146816a && this.f146817b == msiVar.f146817b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146817b) + (Boolean.hashCode(this.f146816a) * 31);
    }
}
