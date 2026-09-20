package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ldw {

    /* JADX INFO: renamed from: a */
    public final String f132358a;

    /* JADX INFO: renamed from: b */
    public final String f132359b;

    /* JADX INFO: renamed from: c */
    public final String f132360c;

    /* JADX INFO: renamed from: d */
    public final rcm0 f132361d;

    /* JADX INFO: renamed from: e */
    public final mxg1 f132362e;

    public ldw(String str, String str2, String str3, rcm0 rcm0Var, mxg1 mxg1Var) {
        this.f132358a = str;
        this.f132359b = str2;
        this.f132360c = str3;
        this.f132361d = rcm0Var;
        this.f132362e = mxg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldw)) {
            return false;
        }
        ldw ldwVar = (ldw) obj;
        return wj50.m88271j(this.f132358a, ldwVar.f132358a) && wj50.m88271j(this.f132359b, ldwVar.f132359b) && wj50.m88271j(this.f132360c, ldwVar.f132360c) && wj50.m88271j(this.f132361d, ldwVar.f132361d) && wj50.m88271j(this.f132362e, ldwVar.f132362e);
    }

    public final int hashCode() {
        return this.f132362e.hashCode() + yds.m93483m(this.f132361d, s571.m77243b(s571.m77243b(this.f132358a.hashCode() * 31, 31, this.f132359b), 31, this.f132360c), 31);
    }
}
