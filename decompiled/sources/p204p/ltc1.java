package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ltc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f136750a;

    public ltc1(boolean z) {
        this.f136750a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltc1) && this.f136750a == ((ltc1) obj).f136750a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136750a);
    }
}
