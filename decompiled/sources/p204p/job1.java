package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class job1 {

    /* JADX INFO: renamed from: a */
    public final long f114384a;

    public job1(long j) {
        this.f114384a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof job1) && this.f114384a == ((job1) obj).f114384a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f114384a);
    }
}
