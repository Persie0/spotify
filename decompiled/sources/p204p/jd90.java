package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jd90 implements ld90 {

    /* JADX INFO: renamed from: a */
    public final int f111303a;

    public jd90(int i) {
        this.f111303a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd90) && this.f111303a == ((jd90) obj).f111303a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111303a);
    }
}
