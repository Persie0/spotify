package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tqi {

    /* JADX INFO: renamed from: a */
    public final api f222818a;

    /* JADX INFO: renamed from: b */
    public final Boolean f222819b;

    public tqi(api apiVar, Boolean bool) {
        this.f222818a = apiVar;
        this.f222819b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqi)) {
            return false;
        }
        tqi tqiVar = (tqi) obj;
        return wj50.m88271j(this.f222818a, tqiVar.f222818a) && wj50.m88271j(this.f222819b, tqiVar.f222819b);
    }

    public final int hashCode() {
        api apiVar = this.f222818a;
        int iHashCode = (apiVar == null ? 0 : apiVar.hashCode()) * 31;
        Boolean bool = this.f222819b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
