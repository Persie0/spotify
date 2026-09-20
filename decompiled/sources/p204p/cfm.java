package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cfm {

    /* JADX INFO: renamed from: a */
    public final String f37400a;

    /* JADX INFO: renamed from: b */
    public final String f37401b;

    /* JADX INFO: renamed from: c */
    public final akk f37402c;

    /* JADX INFO: renamed from: d */
    public final String f37403d;

    /* JADX INFO: renamed from: e */
    public final pbd f37404e;

    public cfm(String str, String str2, String str3, pbd pbdVar, akk akkVar) {
        this.f37400a = str;
        this.f37401b = str2;
        this.f37402c = akkVar;
        this.f37403d = str3;
        this.f37404e = pbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfm)) {
            return false;
        }
        cfm cfmVar = (cfm) obj;
        return wj50.m88271j(this.f37400a, cfmVar.f37400a) && wj50.m88271j(this.f37401b, cfmVar.f37401b) && wj50.m88271j(this.f37402c, cfmVar.f37402c) && wj50.m88271j(this.f37403d, cfmVar.f37403d) && wj50.m88271j(this.f37404e, cfmVar.f37404e);
    }

    public final int hashCode() {
        return this.f37404e.hashCode() + s571.m77243b((this.f37402c.hashCode() + s571.m77243b(this.f37400a.hashCode() * 31, 31, this.f37401b)) * 31, 31, this.f37403d);
    }
}
