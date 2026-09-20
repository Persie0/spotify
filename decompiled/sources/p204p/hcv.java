package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hcv implements jcv {

    /* JADX INFO: renamed from: a */
    public final boolean f89914a;

    public hcv(boolean z) {
        this.f89914a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcv) && this.f89914a == ((hcv) obj).f89914a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89914a);
    }
}
