package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dl31 implements ktx {

    /* JADX INFO: renamed from: a */
    public final long f50110a;

    /* JADX INFO: renamed from: b */
    public final long f50111b;

    public dl31(long j, long j2) {
        this.f50110a = j;
        this.f50111b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl31)) {
            return false;
        }
        dl31 dl31Var = (dl31) obj;
        return this.f50110a == dl31Var.f50110a && this.f50111b == dl31Var.f50111b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50111b) + (Long.hashCode(this.f50110a) * 31);
    }
}
