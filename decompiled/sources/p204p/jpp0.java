package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jpp0 implements lpp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f114703a;

    public jpp0(boolean z) {
        this.f114703a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpp0) && this.f114703a == ((jpp0) obj).f114703a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114703a);
    }
}
