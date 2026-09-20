package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ed7 implements fd7 {

    /* JADX INFO: renamed from: a */
    public final long f58467a;

    public ed7(long j) {
        this.f58467a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed7) && this.f58467a == ((ed7) obj).f58467a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f58467a);
    }
}
