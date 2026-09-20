package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ws0 {

    /* JADX INFO: renamed from: a */
    public final boolean f254472a;

    public ws0(boolean z) {
        this.f254472a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws0) && this.f254472a == ((ws0) obj).f254472a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.f254472a) * 31);
    }
}
