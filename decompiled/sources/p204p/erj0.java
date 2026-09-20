package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class erj0 {

    /* JADX INFO: renamed from: a */
    public final ock f62140a;

    /* JADX INFO: renamed from: b */
    public final iol f62141b;

    /* JADX INFO: renamed from: c */
    public final String f62142c;

    public erj0(ock ockVar, iol iolVar, String str) {
        this.f62140a = ockVar;
        this.f62141b = iolVar;
        this.f62142c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erj0)) {
            return false;
        }
        erj0 erj0Var = (erj0) obj;
        return this.f62140a.equals(erj0Var.f62140a) && this.f62141b.equals(erj0Var.f62141b) && wj50.m88271j(this.f62142c, erj0Var.f62142c);
    }

    public final int hashCode() {
        int iHashCode = (this.f62141b.hashCode() + (this.f62140a.hashCode() * 31)) * 31;
        String str = this.f62142c;
        return Boolean.hashCode(true) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }
}
