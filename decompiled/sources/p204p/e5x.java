package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e5x {

    /* JADX INFO: renamed from: a */
    public final String f56488a;

    /* JADX INFO: renamed from: b */
    public final Long f56489b;

    public e5x(Long l, String str) {
        this.f56488a = str;
        this.f56489b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5x)) {
            return false;
        }
        e5x e5xVar = (e5x) obj;
        return wj50.m88271j(this.f56488a, e5xVar.f56488a) && wj50.m88271j(this.f56489b, e5xVar.f56489b);
    }

    public final int hashCode() {
        int iHashCode = this.f56488a.hashCode() * 31;
        Long l = this.f56489b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
