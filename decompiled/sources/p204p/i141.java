package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final boolean f97387a;

    public i141(boolean z) {
        this.f97387a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i141) && this.f97387a == ((i141) obj).f97387a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97387a);
    }
}
