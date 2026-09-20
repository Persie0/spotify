package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ar90 extends hr90 {

    /* JADX INFO: renamed from: a */
    public final boolean f18983a;

    public ar90(boolean z) {
        this.f18983a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar90) && this.f18983a == ((ar90) obj).f18983a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18983a);
    }
}
