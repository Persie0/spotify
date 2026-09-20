package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final long f109302a;

    public j6e1(long j) {
        this.f109302a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6e1) && this.f109302a == ((j6e1) obj).f109302a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109302a);
    }
}
