package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ndz0 {

    /* JADX INFO: renamed from: c */
    public static final ndz0 f152874c = new ndz0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f152875a;

    /* JADX INFO: renamed from: b */
    public final long f152876b;

    public ndz0(long j, long j2) {
        this.f152875a = j;
        this.f152876b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ndz0.class == obj.getClass()) {
            ndz0 ndz0Var = (ndz0) obj;
            if (this.f152875a == ndz0Var.f152875a && this.f152876b == ndz0Var.f152876b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f152875a) * 31) + ((int) this.f152876b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f152875a);
        sb.append(", position=");
        return ikc0.m50938j(this.f152876b, "]", sb);
    }
}
