package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r7w {

    /* JADX INFO: renamed from: a */
    public final String f196656a;

    /* JADX INFO: renamed from: b */
    public final String f196657b;

    /* JADX INFO: renamed from: c */
    public final String f196658c;

    /* JADX INFO: renamed from: d */
    public final String f196659d;

    /* JADX INFO: renamed from: e */
    public final String f196660e;

    /* JADX INFO: renamed from: f */
    public final boolean f196661f;

    /* JADX INFO: renamed from: g */
    public final pi1 f196662g;

    /* JADX INFO: renamed from: h */
    public final u9r0 f196663h;

    /* JADX INFO: renamed from: i */
    public final qsj f196664i;

    public r7w(String str, String str2, String str3, String str4, String str5, boolean z, pi1 pi1Var, u9r0 u9r0Var, qsj qsjVar) {
        this.f196656a = str;
        this.f196657b = str2;
        this.f196658c = str3;
        this.f196659d = str4;
        this.f196660e = str5;
        this.f196661f = z;
        this.f196662g = pi1Var;
        this.f196663h = u9r0Var;
        this.f196664i = qsjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7w)) {
            return false;
        }
        r7w r7wVar = (r7w) obj;
        return wj50.m88271j(this.f196656a, r7wVar.f196656a) && wj50.m88271j(this.f196657b, r7wVar.f196657b) && wj50.m88271j(this.f196658c, r7wVar.f196658c) && wj50.m88271j(this.f196659d, r7wVar.f196659d) && wj50.m88271j(this.f196660e, r7wVar.f196660e) && this.f196661f == r7wVar.f196661f && wj50.m88271j(this.f196662g, r7wVar.f196662g) && wj50.m88271j(this.f196663h, r7wVar.f196663h) && this.f196664i == r7wVar.f196664i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f196656a.hashCode() * 31, 31, this.f196657b), 31, this.f196658c), 31, this.f196659d);
        String str = this.f196660e;
        return this.f196664i.hashCode() + ((this.f196663h.hashCode() + ((this.f196662g.hashCode() + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f196661f)) * 31)) * 31);
    }
}
