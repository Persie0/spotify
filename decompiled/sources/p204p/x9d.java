package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f259325a;

    /* JADX INFO: renamed from: b */
    public final long f259326b;

    public x9d(String str, long j) {
        this.f259325a = str;
        this.f259326b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9d)) {
            return false;
        }
        x9d x9dVar = (x9d) obj;
        return wj50.m88271j(this.f259325a, x9dVar.f259325a) && this.f259326b == x9dVar.f259326b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f259326b) + (this.f259325a.hashCode() * 31);
    }
}
