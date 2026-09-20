package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fvb extends kvb {

    /* JADX INFO: renamed from: a */
    public final String f73748a;

    /* JADX INFO: renamed from: b */
    public final evb f73749b;

    /* JADX INFO: renamed from: c */
    public final String f73750c;

    public fvb(String str, evb evbVar, String str2) {
        this.f73748a = str;
        this.f73749b = evbVar;
        this.f73750c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvb)) {
            return false;
        }
        fvb fvbVar = (fvb) obj;
        return wj50.m88271j(this.f73748a, fvbVar.f73748a) && wj50.m88271j(this.f73749b, fvbVar.f73749b) && wj50.m88271j(this.f73750c, fvbVar.f73750c);
    }

    public final int hashCode() {
        return this.f73750c.hashCode() + ((this.f73749b.hashCode() + (this.f73748a.hashCode() * 31)) * 31);
    }
}
