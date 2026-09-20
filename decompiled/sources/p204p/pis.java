package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pis {

    /* JADX INFO: renamed from: a */
    public final String f178008a;

    /* JADX INFO: renamed from: b */
    public final long f178009b;

    /* JADX INFO: renamed from: c */
    public final long f178010c;

    /* JADX INFO: renamed from: d */
    public final q8x f178011d;

    public pis(String str, long j, long j2, q8x q8xVar) {
        this.f178008a = str;
        this.f178009b = j;
        this.f178010c = j2;
        this.f178011d = q8xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pis.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pis pisVar = (pis) obj;
        return this.f178011d == pisVar.f178011d && wj50.m88271j(this.f178008a, pisVar.f178008a) && this.f178009b == pisVar.f178009b && this.f178010c == pisVar.f178010c;
    }

    public final int hashCode() {
        return this.f178011d.hashCode() + (((((this.f178008a.hashCode() * 31) + ((int) this.f178009b)) * 31) + ((int) this.f178010c)) * 31);
    }
}
