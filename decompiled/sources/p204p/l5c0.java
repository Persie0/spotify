package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129872a;

    public l5c0(boolean z) {
        this.f129872a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5c0) && this.f129872a == ((l5c0) obj).f129872a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129872a);
    }
}
