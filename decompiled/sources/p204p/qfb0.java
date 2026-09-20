package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qfb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f188164a;

    public qfb0(boolean z) {
        this.f188164a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfb0) && this.f188164a == ((qfb0) obj).f188164a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188164a);
    }
}
