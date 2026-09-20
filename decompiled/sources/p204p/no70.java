package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class no70 {

    /* JADX INFO: renamed from: a */
    public final int f156612a;

    /* JADX INFO: renamed from: b */
    public final int f156613b;

    /* JADX INFO: renamed from: c */
    public final boolean f156614c;

    public no70(int i, int i2, boolean z) {
        this.f156612a = i;
        this.f156613b = i2;
        this.f156614c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no70)) {
            return false;
        }
        no70 no70Var = (no70) obj;
        return this.f156612a == no70Var.f156612a && this.f156613b == no70Var.f156613b && this.f156614c == no70Var.f156614c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156614c) + mt60.m62800g(this.f156613b, Integer.hashCode(this.f156612a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f156612a);
        sb.append(", end=");
        sb.append(this.f156613b);
        sb.append(", isRtl=");
        return s571.m77253l(sb, this.f156614c, ')');
    }
}
