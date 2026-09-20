package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class slx0 implements ulx0 {

    /* JADX INFO: renamed from: a */
    public final long f210513a;

    public slx0(long j) {
        this.f210513a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slx0) && this.f210513a == ((slx0) obj).f210513a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f210513a);
    }
}
