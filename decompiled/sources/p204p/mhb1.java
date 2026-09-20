package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mhb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f143766a;

    public mhb1(boolean z) {
        this.f143766a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhb1) && this.f143766a == ((mhb1) obj).f143766a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143766a);
    }
}
