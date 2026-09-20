package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final boolean f262229a;

    public xjs0(boolean z) {
        this.f262229a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjs0) && this.f262229a == ((xjs0) obj).f262229a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262229a);
    }
}
