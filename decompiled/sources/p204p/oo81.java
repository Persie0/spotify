package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oo81 {

    /* JADX INFO: renamed from: a */
    public final long f167514a;

    public oo81(long j) {
        this.f167514a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo81)) {
            return false;
        }
        long j = ((oo81) obj).f167514a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f167514a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f167514a);
    }
}
