package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vhx implements fz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f241563a;

    /* JADX INFO: renamed from: b */
    public final cix f241564b;

    public vhx(boolean z, aix aixVar) {
        this.f241563a = z;
        this.f241564b = aixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhx)) {
            return false;
        }
        vhx vhxVar = (vhx) obj;
        return this.f241563a == vhxVar.f241563a && wj50.m88271j(this.f241564b, vhxVar.f241564b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f241563a) * 31;
        cix cixVar = this.f241564b;
        return iHashCode + (cixVar == null ? 0 : cixVar.hashCode());
    }
}
