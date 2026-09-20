package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bbb1 implements dbb1 {

    /* JADX INFO: renamed from: a */
    public final String f25530a;

    /* JADX INFO: renamed from: b */
    public final long f25531b;

    public bbb1(String str, long j) {
        this.f25530a = str;
        this.f25531b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbb1)) {
            return false;
        }
        bbb1 bbb1Var = (bbb1) obj;
        return wj50.m88271j(this.f25530a, bbb1Var.f25530a) && this.f25531b == bbb1Var.f25531b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25531b) + (this.f25530a.hashCode() * 31);
    }
}
