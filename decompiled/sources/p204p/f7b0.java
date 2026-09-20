package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f66636a;

    public f7b0(boolean z) {
        this.f66636a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7b0) && this.f66636a == ((f7b0) obj).f66636a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66636a);
    }
}
