package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k3k {

    /* JADX INFO: renamed from: a */
    public final voc1 f118921a;

    /* JADX INFO: renamed from: b */
    public final zam0 f118922b;

    /* JADX INFO: renamed from: c */
    public final z6k f118923c;

    /* JADX INFO: renamed from: d */
    public final String f118924d;

    /* JADX INFO: renamed from: e */
    public final boolean f118925e;

    public k3k(voc1 voc1Var, zam0 zam0Var, z6k z6kVar, String str, boolean z) {
        this.f118921a = voc1Var;
        this.f118922b = zam0Var;
        this.f118923c = z6kVar;
        this.f118924d = str;
        this.f118925e = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m55268a() {
        return this.f118924d;
    }

    /* JADX INFO: renamed from: b */
    public final zam0 m55269b() {
        return this.f118922b;
    }

    /* JADX INFO: renamed from: c */
    public final voc1 m55270c() {
        return this.f118921a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3k)) {
            return false;
        }
        k3k k3kVar = (k3k) obj;
        return wj50.m88271j(this.f118921a, k3kVar.f118921a) && wj50.m88271j(this.f118922b, k3kVar.f118922b) && wj50.m88271j(this.f118923c, k3kVar.f118923c) && wj50.m88271j(this.f118924d, k3kVar.f118924d) && this.f118925e == k3kVar.f118925e;
    }

    public final int hashCode() {
        int iHashCode = (this.f118922b.hashCode() + (this.f118921a.f243453a.hashCode() * 31)) * 31;
        z6k z6kVar = this.f118923c;
        int iHashCode2 = (iHashCode + (z6kVar == null ? 0 : z6kVar.hashCode())) * 31;
        String str = this.f118924d;
        return Boolean.hashCode(this.f118925e) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
