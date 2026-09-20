package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ltw implements o2x {

    /* JADX INFO: renamed from: a */
    public final boolean f136872a;

    public ltw(boolean z) {
        this.f136872a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltw) && this.f136872a == ((ltw) obj).f136872a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136872a);
    }
}
