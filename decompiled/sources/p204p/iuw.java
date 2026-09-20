package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iuw implements s2x {

    /* JADX INFO: renamed from: a */
    public final boolean f106046a;

    public iuw(boolean z) {
        this.f106046a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuw) && this.f106046a == ((iuw) obj).f106046a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106046a);
    }
}
