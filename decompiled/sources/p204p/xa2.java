package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xa2 implements hb2 {

    /* JADX INFO: renamed from: a */
    public final boolean f259511a;

    public xa2(boolean z) {
        this.f259511a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa2) && this.f259511a == ((xa2) obj).f259511a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259511a);
    }
}
