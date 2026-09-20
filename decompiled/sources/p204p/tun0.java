package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tun0 implements xun0 {

    /* JADX INFO: renamed from: a */
    public final String f223884a;

    /* JADX INFO: renamed from: b */
    public final long f223885b;

    public tun0(String str, long j) {
        this.f223884a = str;
        this.f223885b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tun0)) {
            return false;
        }
        tun0 tun0Var = (tun0) obj;
        return wj50.m88271j(this.f223884a, tun0Var.f223884a) && this.f223885b == tun0Var.f223885b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223885b) + (this.f223884a.hashCode() * 31);
    }
}
