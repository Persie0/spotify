package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p3g0 implements r3g0 {

    /* JADX INFO: renamed from: a */
    public final boolean f173650a;

    public p3g0(boolean z) {
        this.f173650a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3g0) && this.f173650a == ((p3g0) obj).f173650a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173650a);
    }
}
