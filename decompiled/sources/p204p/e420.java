package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e420 implements i420 {

    /* JADX INFO: renamed from: a */
    public final Throwable f55927a;

    public e420(Throwable th) {
        this.f55927a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e420) && wj50.m88271j(this.f55927a, ((e420) obj).f55927a);
    }

    public final int hashCode() {
        return this.f55927a.hashCode();
    }
}
