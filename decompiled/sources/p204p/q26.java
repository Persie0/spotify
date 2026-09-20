package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q26 implements u26 {

    /* JADX INFO: renamed from: a */
    public final long f184505a;

    public q26(long j) {
        this.f184505a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q26) && this.f184505a == ((q26) obj).f184505a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f184505a);
    }
}
