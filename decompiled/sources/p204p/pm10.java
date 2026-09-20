package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pm10 extends rm10 {

    /* JADX INFO: renamed from: a */
    public final long f178859a;

    public pm10(long j) {
        this.f178859a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm10) && this.f178859a == ((pm10) obj).f178859a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f178859a);
    }

    public /* synthetic */ pm10() {
        this(0L);
    }
}
