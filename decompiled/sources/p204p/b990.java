package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b990 implements c990 {

    /* JADX INFO: renamed from: a */
    public final int f24804a;

    public b990(int i) {
        this.f24804a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b990) && this.f24804a == ((b990) obj).f24804a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24804a);
    }
}
