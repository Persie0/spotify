package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g5c0 extends n5c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f76642a;

    public g5c0(boolean z) {
        this.f76642a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5c0) && this.f76642a == ((g5c0) obj).f76642a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76642a);
    }
}
