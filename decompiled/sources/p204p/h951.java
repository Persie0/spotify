package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h951 extends j951 {

    /* JADX INFO: renamed from: a */
    public final long f88881a;

    public h951(long j) {
        this.f88881a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h951) && this.f88881a == ((h951) obj).f88881a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88881a);
    }
}
