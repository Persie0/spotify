package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pb8 implements sb8 {

    /* JADX INFO: renamed from: a */
    public final long f175733a;

    public pb8(long j) {
        this.f175733a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb8) && this.f175733a == ((pb8) obj).f175733a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f175733a);
    }
}
