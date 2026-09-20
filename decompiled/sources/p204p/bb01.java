package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bb01 implements db01 {

    /* JADX INFO: renamed from: a */
    public final int f25376a;

    public bb01(int i) {
        this.f25376a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb01) && this.f25376a == ((bb01) obj).f25376a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25376a);
    }
}
