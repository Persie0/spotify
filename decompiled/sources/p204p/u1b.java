package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u1b {

    /* JADX INFO: renamed from: a */
    public final long f225738a;

    /* JADX INFO: renamed from: b */
    public final long f225739b;

    public u1b(long j, long j2) {
        this.f225738a = j;
        this.f225739b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1b)) {
            return false;
        }
        u1b u1bVar = (u1b) obj;
        return this.f225738a == u1bVar.f225738a && this.f225739b == u1bVar.f225739b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f225739b) + (Long.hashCode(this.f225738a) * 31);
    }
}
