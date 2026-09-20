package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final boolean f114017a;

    public jn5(boolean z) {
        this.f114017a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn5) && this.f114017a == ((jn5) obj).f114017a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114017a);
    }
}
