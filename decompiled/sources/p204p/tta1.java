package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tta1 implements vta1 {

    /* JADX INFO: renamed from: a */
    public final long f223566a;

    public tta1(long j) {
        this.f223566a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tta1) && nu71.m65679c(this.f223566a, ((tta1) obj).f223566a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f223566a);
    }
}
