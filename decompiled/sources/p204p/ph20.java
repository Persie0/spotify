package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ph20 implements rh20 {

    /* JADX INFO: renamed from: a */
    public final long f177446a;

    /* JADX INFO: renamed from: b */
    public final long f177447b;

    /* JADX INFO: renamed from: c */
    public final boolean f177448c;

    public ph20(int i, long j, long j2) {
        this.f177446a = (i & 1) != 0 ? 0L : j;
        this.f177447b = j2;
        this.f177448c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph20)) {
            return false;
        }
        ph20 ph20Var = (ph20) obj;
        return this.f177446a == ph20Var.f177446a && this.f177447b == ph20Var.f177447b && this.f177448c == ph20Var.f177448c;
    }

    public final int hashCode() {
        return s571.m77245d(dq60.m36605e(Long.hashCode(this.f177446a) * 31, this.f177447b, 31), 31, this.f177448c);
    }
}
