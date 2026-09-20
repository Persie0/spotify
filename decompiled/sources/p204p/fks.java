package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fks {

    /* JADX INFO: renamed from: a */
    public final String f70614a;

    /* JADX INFO: renamed from: b */
    public final Long f70615b;

    public fks(Long l, String str) {
        this.f70614a = str;
        this.f70615b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fks)) {
            return false;
        }
        fks fksVar = (fks) obj;
        return wj50.m88271j(this.f70614a, fksVar.f70614a) && wj50.m88271j(this.f70615b, fksVar.f70615b);
    }

    public final int hashCode() {
        int iHashCode = this.f70614a.hashCode() * 31;
        Long l = this.f70615b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
