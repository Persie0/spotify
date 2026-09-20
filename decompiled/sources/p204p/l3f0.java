package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l3f0 extends r3f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129321a;

    public l3f0(boolean z) {
        this.f129321a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3f0) && this.f129321a == ((l3f0) obj).f129321a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129321a);
    }
}
