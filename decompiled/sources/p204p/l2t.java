package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l2t implements p2t {

    /* JADX INFO: renamed from: a */
    public final boolean f129073a;

    public l2t(boolean z) {
        this.f129073a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2t) && this.f129073a == ((l2t) obj).f129073a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129073a);
    }
}
