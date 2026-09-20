package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f130619a;

    public l7b0(boolean z) {
        this.f130619a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7b0) && this.f130619a == ((l7b0) obj).f130619a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130619a);
    }
}
