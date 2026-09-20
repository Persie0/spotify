package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ndd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f152734a;

    /* JADX INFO: renamed from: b */
    public final long f152735b;

    public ndd(String str, long j) {
        this.f152734a = str;
        this.f152735b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndd)) {
            return false;
        }
        ndd nddVar = (ndd) obj;
        return wj50.m88271j(this.f152734a, nddVar.f152734a) && this.f152735b == nddVar.f152735b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f152735b) + (this.f152734a.hashCode() * 31);
    }
}
