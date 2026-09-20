package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r4c implements pa90 {

    /* JADX INFO: renamed from: a */
    public final Exception f195714a;

    public r4c(Exception exc) {
        this.f195714a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4c) && this.f195714a.equals(((r4c) obj).f195714a);
    }

    public final int hashCode() {
        return this.f195714a.hashCode();
    }
}
