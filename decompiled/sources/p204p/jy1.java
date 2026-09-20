package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jy1 implements ky1 {

    /* JADX INFO: renamed from: a */
    public final int f117266a;

    public jy1(int i) {
        this.f117266a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy1) && this.f117266a == ((jy1) obj).f117266a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117266a);
    }
}
