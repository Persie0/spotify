package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ud0 {

    /* JADX INFO: renamed from: a */
    public final long f229152a;

    public ud0(long j) {
        this.f229152a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud0) && this.f229152a == ((ud0) obj).f229152a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f229152a);
    }
}
