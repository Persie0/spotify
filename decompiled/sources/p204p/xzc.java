package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xzc {

    /* JADX INFO: renamed from: a */
    public final wzc f267578a;

    /* JADX INFO: renamed from: b */
    public final int f267579b;

    public xzc(wzc wzcVar, int i) {
        this.f267578a = wzcVar;
        this.f267579b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzc)) {
            return false;
        }
        xzc xzcVar = (xzc) obj;
        return wj50.m88271j(this.f267578a, xzcVar.f267578a) && this.f267579b == xzcVar.f267579b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267579b) + (this.f267578a.hashCode() * 31);
    }
}
