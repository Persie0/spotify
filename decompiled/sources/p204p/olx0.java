package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class olx0 implements ulx0 {

    /* JADX INFO: renamed from: a */
    public final ftw0 f166940a;

    /* JADX INFO: renamed from: b */
    public final long f166941b;

    public olx0(ftw0 ftw0Var, long j) {
        this.f166940a = ftw0Var;
        this.f166941b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olx0)) {
            return false;
        }
        olx0 olx0Var = (olx0) obj;
        return wj50.m88271j(this.f166940a, olx0Var.f166940a) && this.f166941b == olx0Var.f166941b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f166941b) + (this.f166940a.hashCode() * 31);
    }
}
