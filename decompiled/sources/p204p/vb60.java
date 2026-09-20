package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vb60 {

    /* JADX INFO: renamed from: a */
    public final boolean f239425a;

    public vb60(boolean z) {
        this.f239425a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb60) && this.f239425a == ((vb60) obj).f239425a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239425a);
    }
}
