package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uun0 implements xun0 {

    /* JADX INFO: renamed from: a */
    public final String f234224a;

    /* JADX INFO: renamed from: b */
    public final long f234225b;

    public uun0(String str, long j) {
        this.f234224a = str;
        this.f234225b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uun0)) {
            return false;
        }
        uun0 uun0Var = (uun0) obj;
        return wj50.m88271j(this.f234224a, uun0Var.f234224a) && this.f234225b == uun0Var.f234225b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f234225b) + (this.f234224a.hashCode() * 31);
    }
}
