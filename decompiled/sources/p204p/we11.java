package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class we11 implements ze11 {

    /* JADX INFO: renamed from: a */
    public final long f250406a;

    /* JADX INFO: renamed from: b */
    public final int f250407b;

    public we11(int i, long j) {
        this.f250406a = j;
        this.f250407b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we11)) {
            return false;
        }
        we11 we11Var = (we11) obj;
        return this.f250406a == we11Var.f250406a && this.f250407b == we11Var.f250407b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f250407b) + (Long.hashCode(this.f250406a) * 31);
    }
}
