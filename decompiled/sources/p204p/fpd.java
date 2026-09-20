package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fpd implements jpd {

    /* JADX INFO: renamed from: a */
    public final boolean f71823a;

    public fpd(boolean z) {
        this.f71823a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpd) && this.f71823a == ((fpd) obj).f71823a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71823a);
    }
}
