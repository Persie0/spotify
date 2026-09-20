package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class add implements qdd {

    /* JADX INFO: renamed from: a */
    public final boolean f14603a;

    public add(boolean z) {
        this.f14603a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof add) && this.f14603a == ((add) obj).f14603a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14603a);
    }
}
