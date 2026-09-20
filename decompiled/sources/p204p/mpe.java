package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mpe extends rpe {

    /* JADX INFO: renamed from: a */
    public final boolean f145994a;

    public mpe(boolean z) {
        this.f145994a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpe) && this.f145994a == ((mpe) obj).f145994a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145994a);
    }
}
