package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iek0 {

    /* JADX INFO: renamed from: a */
    public final float f101432a;

    public iek0(float f) {
        this.f101432a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iek0) && ybs.m93301b(this.f101432a, ((iek0) obj).f101432a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f101432a);
    }
}
