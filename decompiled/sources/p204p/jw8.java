package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jw8 extends kw8 {

    /* JADX INFO: renamed from: a */
    public final int f116604a;

    public jw8(int i) {
        this.f116604a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw8) && this.f116604a == ((jw8) obj).f116604a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116604a);
    }
}
