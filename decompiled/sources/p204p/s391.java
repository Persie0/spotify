package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s391 {

    /* JADX INFO: renamed from: a */
    public final long f205243a;

    /* JADX INFO: renamed from: b */
    public final long f205244b;

    public s391(long j, long j2) {
        this.f205243a = j;
        this.f205244b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s391)) {
            return false;
        }
        s391 s391Var = (s391) obj;
        return this.f205243a == s391Var.f205243a && this.f205244b == s391Var.f205244b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205244b) + (Long.hashCode(this.f205243a) * 31);
    }
}
