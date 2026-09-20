package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class akt {

    /* JADX INFO: renamed from: a */
    public final boolean f16641a;

    /* JADX INFO: renamed from: b */
    public final String f16642b;

    public akt(boolean z, String str) {
        this.f16641a = z;
        this.f16642b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akt)) {
            return false;
        }
        akt aktVar = (akt) obj;
        return this.f16641a == aktVar.f16641a && wj50.m88271j(this.f16642b, aktVar.f16642b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f16641a) * 31;
        String str = this.f16642b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
