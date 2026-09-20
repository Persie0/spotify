package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jdn0 implements g3u {

    /* JADX INFO: renamed from: a */
    public final boolean f111374a;

    public jdn0(boolean z) {
        this.f111374a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdn0) && this.f111374a == ((jdn0) obj).f111374a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111374a);
    }
}
