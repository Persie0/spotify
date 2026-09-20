package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xri {

    /* JADX INFO: renamed from: a */
    public final wri f265349a;

    /* JADX INFO: renamed from: b */
    public final rqi f265350b;

    public xri(wri wriVar, rqi rqiVar) {
        this.f265349a = wriVar;
        this.f265350b = rqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xri)) {
            return false;
        }
        xri xriVar = (xri) obj;
        return wj50.m88271j(this.f265349a, xriVar.f265349a) && wj50.m88271j(this.f265350b, xriVar.f265350b);
    }

    public final int hashCode() {
        return this.f265350b.hashCode() + (this.f265349a.hashCode() * 31);
    }
}
