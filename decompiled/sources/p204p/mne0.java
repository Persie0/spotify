package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mne0 implements nne0 {

    /* JADX INFO: renamed from: a */
    public final long f145416a;

    public mne0(long j) {
        this.f145416a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mne0) && this.f145416a == ((mne0) obj).f145416a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145416a);
    }
}
