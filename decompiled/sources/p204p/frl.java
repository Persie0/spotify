package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class frl {

    /* JADX INFO: renamed from: a */
    public final brl f72499a;

    /* JADX INFO: renamed from: b */
    public final String f72500b;

    public frl(brl brlVar, String str) {
        this.f72499a = brlVar;
        this.f72500b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frl)) {
            return false;
        }
        frl frlVar = (frl) obj;
        return wj50.m88271j(this.f72499a, frlVar.f72499a) && wj50.m88271j(this.f72500b, frlVar.f72500b);
    }

    public final int hashCode() {
        int iHashCode = this.f72499a.hashCode() * 31;
        String str = this.f72500b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
