package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ttc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f223575a;

    public ttc1(boolean z) {
        this.f223575a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttc1) && this.f223575a == ((ttc1) obj).f223575a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223575a);
    }
}
