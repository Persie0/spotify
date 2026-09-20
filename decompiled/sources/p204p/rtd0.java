package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rtd0 {

    /* JADX INFO: renamed from: a */
    public final y8t f202566a;

    /* JADX INFO: renamed from: b */
    public final y8t f202567b;

    public rtd0(y8t y8tVar, y8t y8tVar2) {
        this.f202566a = y8tVar;
        this.f202567b = y8tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtd0)) {
            return false;
        }
        rtd0 rtd0Var = (rtd0) obj;
        return wj50.m88271j(this.f202566a, rtd0Var.f202566a) && wj50.m88271j(this.f202567b, rtd0Var.f202567b);
    }

    public final int hashCode() {
        int iHashCode = this.f202566a.hashCode() * 31;
        y8t y8tVar = this.f202567b;
        return iHashCode + (y8tVar == null ? 0 : y8tVar.hashCode());
    }
}
