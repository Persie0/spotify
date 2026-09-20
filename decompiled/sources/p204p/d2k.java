package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d2k {

    /* JADX INFO: renamed from: a */
    public final int f44574a;

    /* JADX INFO: renamed from: b */
    public final boolean f44575b;

    public d2k(int i, boolean z) {
        this.f44574a = i;
        this.f44575b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2k)) {
            return false;
        }
        d2k d2kVar = (d2k) obj;
        return this.f44574a == d2kVar.f44574a && this.f44575b == d2kVar.f44575b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44575b) + (Integer.hashCode(this.f44574a) * 31);
    }
}
