package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h3y {

    /* JADX INFO: renamed from: a */
    public final Object f87355a;

    /* JADX INFO: renamed from: b */
    public final Object f87356b;

    public h3y(Object obj, Object obj2) {
        this.f87355a = obj;
        this.f87356b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3y)) {
            return false;
        }
        h3y h3yVar = (h3y) obj;
        return wj50.m88271j(this.f87355a, h3yVar.f87355a) && wj50.m88271j(this.f87356b, h3yVar.f87356b);
    }

    public final int hashCode() {
        Object obj = this.f87355a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f87356b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
