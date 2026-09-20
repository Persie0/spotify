package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hk5 implements kk5 {

    /* JADX INFO: renamed from: a */
    public final String f92350a;

    /* JADX INFO: renamed from: b */
    public final long f92351b;

    public hk5(String str, long j) {
        this.f92350a = str;
        this.f92351b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk5)) {
            return false;
        }
        hk5 hk5Var = (hk5) obj;
        return wj50.m88271j(this.f92350a, hk5Var.f92350a) && this.f92351b == hk5Var.f92351b;
    }

    @Override // p204p.kk5
    public final String getMessage() {
        return this.f92350a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f92351b) + (this.f92350a.hashCode() * 31);
    }
}
