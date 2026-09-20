package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zt3 {

    /* JADX INFO: renamed from: a */
    public final boolean f286047a;

    public zt3(boolean z) {
        this.f286047a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt3) && this.f286047a == ((zt3) obj).f286047a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286047a);
    }
}
