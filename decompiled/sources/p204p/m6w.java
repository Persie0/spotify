package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m6w extends mwg1 {

    /* JADX INFO: renamed from: b */
    public final int f140581b;

    public m6w(int i) {
        this.f140581b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6w) && this.f140581b == ((m6w) obj).f140581b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140581b) + (Integer.hashCode(0) * 31);
    }

    /* JADX INFO: renamed from: x */
    public final int m61032x() {
        return this.f140581b;
    }
}
