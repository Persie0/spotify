package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uq91 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final byte f232950a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return wj50.m88282u(this.f232950a & 255, ((uq91) obj).f232950a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uq91) {
            return this.f232950a == ((uq91) obj).f232950a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f232950a);
    }

    public final String toString() {
        return String.valueOf(this.f232950a & 255);
    }
}
