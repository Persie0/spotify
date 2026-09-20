package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ww6 {

    /* JADX INFO: renamed from: a */
    public final long f255705a;

    /* JADX INFO: renamed from: b */
    public final boolean f255706b;

    public /* synthetic */ ww6() {
        this(0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww6)) {
            return false;
        }
        ww6 ww6Var = (ww6) obj;
        return this.f255705a == ww6Var.f255705a && this.f255706b == ww6Var.f255706b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255706b) + (Long.hashCode(this.f255705a) * 31);
    }

    public ww6(long j, boolean z) {
        this.f255705a = j;
        this.f255706b = z;
    }
}
