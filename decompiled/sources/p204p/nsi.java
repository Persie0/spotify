package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nsi {

    /* JADX INFO: renamed from: a */
    public final rsi f157824a;

    /* JADX INFO: renamed from: b */
    public final boolean f157825b;

    /* JADX INFO: renamed from: c */
    public final boolean f157826c;

    public nsi(rsi rsiVar, boolean z, boolean z2) {
        this.f157824a = rsiVar;
        this.f157825b = z;
        this.f157826c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsi)) {
            return false;
        }
        nsi nsiVar = (nsi) obj;
        return wj50.m88271j(this.f157824a, nsiVar.f157824a) && this.f157825b == nsiVar.f157825b && this.f157826c == nsiVar.f157826c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157826c) + s571.m77245d(this.f157824a.hashCode() * 31, 31, this.f157825b);
    }
}
