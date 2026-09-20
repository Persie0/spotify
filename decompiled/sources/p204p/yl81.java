package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yl81 {

    /* JADX INFO: renamed from: a */
    public final String f273939a;

    /* JADX INFO: renamed from: b */
    public final long f273940b;

    /* JADX INFO: renamed from: c */
    public final long f273941c;

    public yl81(long j, String str, long j2) {
        this.f273939a = str;
        this.f273940b = j;
        this.f273941c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl81)) {
            return false;
        }
        yl81 yl81Var = (yl81) obj;
        return wj50.m88271j(this.f273939a, yl81Var.f273939a) && this.f273940b == yl81Var.f273940b && this.f273941c == yl81Var.f273941c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f273941c) + dq60.m36605e(this.f273939a.hashCode() * 31, this.f273940b, 31);
    }
}
