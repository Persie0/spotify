package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f146092a;

    public mpt0(int i) {
        this.f146092a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpt0) && this.f146092a == ((mpt0) obj).f146092a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146092a);
    }
}
