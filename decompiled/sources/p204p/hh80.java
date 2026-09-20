package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hh80 implements jh80 {

    /* JADX INFO: renamed from: a */
    public final boolean f91305a;

    public hh80(boolean z) {
        this.f91305a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh80) && this.f91305a == ((hh80) obj).f91305a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91305a);
    }
}
