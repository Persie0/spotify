package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ebq {

    /* JADX INFO: renamed from: a */
    public final Object f58112a;

    /* JADX INFO: renamed from: b */
    public final long f58113b;

    public ebq(long j, Object obj) {
        this.f58112a = obj;
        this.f58113b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebq)) {
            return false;
        }
        ebq ebqVar = (ebq) obj;
        return wj50.m88271j(this.f58112a, ebqVar.f58112a) && this.f58113b == ebqVar.f58113b;
    }

    public final int hashCode() {
        Object obj = this.f58112a;
        return Long.hashCode(this.f58113b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
