package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ass implements css {

    /* JADX INFO: renamed from: a */
    public final long f19495a;

    public ass(long j) {
        this.f19495a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ass) && this.f19495a == ((ass) obj).f19495a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19495a);
    }
}
