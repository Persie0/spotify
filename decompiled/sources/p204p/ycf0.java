package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ycf0 implements adf0 {

    /* JADX INFO: renamed from: a */
    public final long f271483a;

    public ycf0(long j) {
        this.f271483a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycf0) && this.f271483a == ((ycf0) obj).f271483a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f271483a);
    }
}
