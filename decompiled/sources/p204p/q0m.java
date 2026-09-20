package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q0m {

    /* JADX INFO: renamed from: a */
    public final String f184022a;

    /* JADX INFO: renamed from: b */
    public final String f184023b;

    /* JADX INFO: renamed from: c */
    public final String f184024c;

    /* JADX INFO: renamed from: d */
    public final String f184025d;

    /* JADX INFO: renamed from: e */
    public final String f184026e;

    public q0m(String str, String str2, String str3, String str4, String str5) {
        this.f184022a = str;
        this.f184023b = str2;
        this.f184024c = str3;
        this.f184025d = str4;
        this.f184026e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0m)) {
            return false;
        }
        q0m q0mVar = (q0m) obj;
        return wj50.m88271j(this.f184022a, q0mVar.f184022a) && wj50.m88271j(this.f184023b, q0mVar.f184023b) && wj50.m88271j(this.f184024c, q0mVar.f184024c) && wj50.m88271j(this.f184025d, q0mVar.f184025d) && wj50.m88271j(this.f184026e, q0mVar.f184026e);
    }

    public final int hashCode() {
        return this.f184026e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f184022a.hashCode() * 31, 31, this.f184023b), 31, this.f184024c), 31, this.f184025d);
    }
}
