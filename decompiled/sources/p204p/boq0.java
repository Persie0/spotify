package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class boq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29239a;

    public boq0(boolean z) {
        this.f29239a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boq0) && this.f29239a == ((boq0) obj).f29239a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29239a);
    }
}
