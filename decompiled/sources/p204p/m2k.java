package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m2k {

    /* JADX INFO: renamed from: a */
    public final String f139368a;

    /* JADX INFO: renamed from: b */
    public final fiz f139369b;

    /* JADX INFO: renamed from: c */
    public final z6k f139370c;

    /* JADX INFO: renamed from: d */
    public final boolean f139371d;

    /* JADX INFO: renamed from: e */
    public final eh00 f139372e;

    /* JADX INFO: renamed from: f */
    public final eh00 f139373f;

    public m2k(String str, fiz fizVar, z6k z6kVar, boolean z, eh00 eh00Var, eh00 eh00Var2) {
        this.f139368a = str;
        this.f139369b = fizVar;
        this.f139370c = z6kVar;
        this.f139371d = z;
        this.f139372e = eh00Var;
        this.f139373f = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2k)) {
            return false;
        }
        m2k m2kVar = (m2k) obj;
        return wj50.m88271j(this.f139368a, m2kVar.f139368a) && wj50.m88271j(this.f139369b, m2kVar.f139369b) && wj50.m88271j(this.f139370c, m2kVar.f139370c) && this.f139371d == m2kVar.f139371d && wj50.m88271j(this.f139372e, m2kVar.f139372e) && wj50.m88271j(this.f139373f, m2kVar.f139373f);
    }

    public final int hashCode() {
        int iHashCode = (this.f139369b.hashCode() + (this.f139368a.hashCode() * 31)) * 31;
        z6k z6kVar = this.f139370c;
        return this.f139373f.hashCode() + p1v.m68853j(s571.m77245d((iHashCode + (z6kVar == null ? 0 : z6kVar.hashCode())) * 31, 31, this.f139371d), this.f139372e, 31);
    }
}
