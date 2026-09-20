package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l3c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129290a;

    public l3c0(boolean z) {
        this.f129290a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3c0) && this.f129290a == ((l3c0) obj).f129290a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129290a);
    }
}
