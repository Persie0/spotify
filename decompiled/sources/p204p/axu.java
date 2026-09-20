package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class axu implements dxu {

    /* JADX INFO: renamed from: a */
    public final wwu f20999a;

    /* JADX INFO: renamed from: b */
    public final wwu f21000b;

    public axu(wwu wwuVar, wwu wwuVar2) {
        this.f20999a = wwuVar;
        this.f21000b = wwuVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axu)) {
            return false;
        }
        axu axuVar = (axu) obj;
        return wj50.m88271j(this.f20999a, axuVar.f20999a) && wj50.m88271j(this.f21000b, axuVar.f21000b);
    }

    public final int hashCode() {
        wwu wwuVar = this.f20999a;
        int iHashCode = (wwuVar == null ? 0 : wwuVar.hashCode()) * 31;
        wwu wwuVar2 = this.f21000b;
        return iHashCode + (wwuVar2 != null ? wwuVar2.hashCode() : 0);
    }
}
