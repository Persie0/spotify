package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k2y {

    /* JADX INFO: renamed from: a */
    public final boolean f118700a;

    /* JADX INFO: renamed from: b */
    public final boolean f118701b;

    public k2y(boolean z, boolean z2) {
        this.f118700a = z;
        this.f118701b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2y)) {
            return false;
        }
        k2y k2yVar = (k2y) obj;
        return this.f118700a == k2yVar.f118700a && this.f118701b == k2yVar.f118701b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118701b) + (Boolean.hashCode(this.f118700a) * 31);
    }
}
