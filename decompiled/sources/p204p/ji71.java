package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ji71 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final long f112684a;

    public ji71(long j) {
        this.f112684a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ji71.class == obj.getClass() && this.f112684a == ((ji71) obj).f112684a;
    }

    public final int hashCode() {
        return kgg1.m56352o(this.f112684a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f112684a;
    }
}
