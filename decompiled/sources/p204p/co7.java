package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class co7 implements do7 {

    /* JADX INFO: renamed from: a */
    public final long f40196a;

    public co7(long j) {
        this.f40196a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co7) && this.f40196a == ((co7) obj).f40196a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40196a);
    }
}
