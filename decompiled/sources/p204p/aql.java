package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aql {

    /* JADX INFO: renamed from: a */
    public final String f18272a;

    /* JADX INFO: renamed from: b */
    public final ypl f18273b;

    public aql(String str, ypl yplVar) {
        this.f18272a = str;
        this.f18273b = yplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aql)) {
            return false;
        }
        aql aqlVar = (aql) obj;
        return wj50.m88271j(this.f18272a, aqlVar.f18272a) && wj50.m88271j(this.f18273b, aqlVar.f18273b);
    }

    public final int hashCode() {
        int iHashCode = this.f18272a.hashCode() * 31;
        ypl yplVar = this.f18273b;
        return iHashCode + (yplVar == null ? 0 : yplVar.hashCode());
    }
}
