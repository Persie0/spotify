package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dl8 {

    /* JADX INFO: renamed from: a */
    public final long f50140a;

    public dl8(long j) {
        this.f50140a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl8)) {
            return false;
        }
        long j = ((dl8) obj).f50140a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f50140a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return edb.m38547C(1) + (Long.hashCode(this.f50140a) * 961);
    }
}
