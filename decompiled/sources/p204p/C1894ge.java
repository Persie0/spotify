package p204p;

/* JADX INFO: renamed from: p.ge */
/* JADX INFO: loaded from: classes.dex */
public final class C1894ge {

    /* JADX INFO: renamed from: a */
    public C1857fe f78977a = null;

    /* JADX INFO: renamed from: b */
    public C1857fe f78978b = null;

    /* JADX INFO: renamed from: c */
    public C1857fe f78979c = null;

    /* JADX INFO: renamed from: d */
    public C1857fe f78980d = null;

    /* JADX INFO: renamed from: e */
    public C1857fe f78981e = null;

    /* JADX INFO: renamed from: f */
    public C1857fe f78982f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894ge)) {
            return false;
        }
        C1894ge c1894ge = (C1894ge) obj;
        return wj50.m88271j(this.f78977a, c1894ge.f78977a) && wj50.m88271j(this.f78978b, c1894ge.f78978b) && wj50.m88271j(this.f78979c, c1894ge.f78979c) && wj50.m88271j(this.f78980d, c1894ge.f78980d) && wj50.m88271j(this.f78981e, c1894ge.f78981e) && wj50.m88271j(this.f78982f, c1894ge.f78982f);
    }

    public final int hashCode() {
        C1857fe c1857fe = this.f78977a;
        int iHashCode = (c1857fe == null ? 0 : c1857fe.hashCode()) * 31;
        C1857fe c1857fe2 = this.f78978b;
        int iHashCode2 = (iHashCode + (c1857fe2 == null ? 0 : c1857fe2.hashCode())) * 31;
        C1857fe c1857fe3 = this.f78979c;
        int iHashCode3 = (iHashCode2 + (c1857fe3 == null ? 0 : c1857fe3.hashCode())) * 31;
        C1857fe c1857fe4 = this.f78980d;
        int iHashCode4 = (iHashCode3 + (c1857fe4 == null ? 0 : c1857fe4.hashCode())) * 31;
        C1857fe c1857fe5 = this.f78981e;
        int iHashCode5 = (iHashCode4 + (c1857fe5 == null ? 0 : c1857fe5.hashCode())) * 31;
        C1857fe c1857fe6 = this.f78982f;
        return iHashCode5 + (c1857fe6 != null ? c1857fe6.hashCode() : 0);
    }
}
