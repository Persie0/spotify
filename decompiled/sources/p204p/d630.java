package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d630 {

    /* JADX INFO: renamed from: a */
    public final e630 f45557a;

    /* JADX INFO: renamed from: b */
    public Long f45558b = null;

    /* JADX INFO: renamed from: c */
    public Long f45559c = null;

    public d630(e630 e630Var) {
        this.f45557a = e630Var;
    }

    /* JADX INFO: renamed from: a */
    public final e630 m35048a() {
        return this.f45557a;
    }

    /* JADX INFO: renamed from: b */
    public final Long m35049b() {
        return this.f45559c;
    }

    /* JADX INFO: renamed from: c */
    public final Long m35050c() {
        return this.f45558b;
    }

    /* JADX INFO: renamed from: d */
    public final void m35051d(Long l) {
        this.f45559c = l;
    }

    /* JADX INFO: renamed from: e */
    public final void m35052e(Long l) {
        this.f45558b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d630)) {
            return false;
        }
        d630 d630Var = (d630) obj;
        return wj50.m88271j(this.f45557a, d630Var.f45557a) && wj50.m88271j(this.f45558b, d630Var.f45558b) && wj50.m88271j(this.f45559c, d630Var.f45559c);
    }

    public final int hashCode() {
        int iHashCode = this.f45557a.hashCode() * 31;
        Long l = this.f45558b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f45559c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
