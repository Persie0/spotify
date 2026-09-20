package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class g1p0 {
    public static final f1p0 Companion = new f1p0();

    /* JADX INFO: renamed from: a */
    public final Boolean f75675a;

    /* JADX INFO: renamed from: b */
    public final Boolean f75676b;

    /* JADX INFO: renamed from: c */
    public final Boolean f75677c;

    public /* synthetic */ g1p0(int i, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f75675a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.f75676b = Boolean.FALSE;
        } else {
            this.f75676b = bool2;
        }
        if ((i & 4) == 0) {
            this.f75677c = Boolean.FALSE;
        } else {
            this.f75677c = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1p0)) {
            return false;
        }
        g1p0 g1p0Var = (g1p0) obj;
        return wj50.m88271j(this.f75675a, g1p0Var.f75675a) && wj50.m88271j(this.f75676b, g1p0Var.f75676b) && wj50.m88271j(this.f75677c, g1p0Var.f75677c);
    }

    public final int hashCode() {
        Boolean bool = this.f75675a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f75676b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f75677c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
