package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u97 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f228085a;

    public u97(boolean z) {
        this.f228085a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u97) && this.f228085a == ((u97) obj).f228085a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f228085a);
    }
}
