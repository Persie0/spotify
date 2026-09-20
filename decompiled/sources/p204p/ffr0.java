package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ffr0 implements jfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f69078a;

    public ffr0(boolean z) {
        this.f69078a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffr0) && this.f69078a == ((ffr0) obj).f69078a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69078a);
    }
}
