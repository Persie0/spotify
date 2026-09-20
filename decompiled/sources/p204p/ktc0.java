package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ktc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final long f126241a;

    public ktc0(long j) {
        this.f126241a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktc0) && this.f126241a == ((ktc0) obj).f126241a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126241a);
    }
}
