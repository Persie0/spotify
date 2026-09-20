package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jce extends lce {

    /* JADX INFO: renamed from: a */
    public final long f111105a;

    public jce(long j) {
        this.f111105a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jce) && this.f111105a == ((jce) obj).f111105a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f111105a);
    }
}
