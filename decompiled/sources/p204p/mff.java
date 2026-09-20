package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mff extends sff {

    /* JADX INFO: renamed from: a */
    public final boolean f143063a;

    public mff(boolean z) {
        this.f143063a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mff) && this.f143063a == ((mff) obj).f143063a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143063a);
    }
}
