package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wf00 {

    /* JADX INFO: renamed from: a */
    public final boolean f250651a;

    public wf00(boolean z) {
        this.f250651a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf00) && this.f250651a == ((wf00) obj).f250651a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250651a);
    }
}
