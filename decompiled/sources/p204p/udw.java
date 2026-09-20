package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class udw {

    /* JADX INFO: renamed from: a */
    public final vdw f229339a;

    /* JADX INFO: renamed from: b */
    public final sdw f229340b;

    public udw(vdw vdwVar, sdw sdwVar, int i) {
        sdwVar = (i & 4) != 0 ? null : sdwVar;
        this.f229339a = vdwVar;
        this.f229340b = sdwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udw)) {
            return false;
        }
        udw udwVar = (udw) obj;
        return this.f229339a == udwVar.f229339a && wj50.m88271j(this.f229340b, udwVar.f229340b);
    }

    public final int hashCode() {
        int iHashCode = this.f229339a.hashCode() * 961;
        sdw sdwVar = this.f229340b;
        return iHashCode + (sdwVar == null ? 0 : sdwVar.hashCode());
    }
}
