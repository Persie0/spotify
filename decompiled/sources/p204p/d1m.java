package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d1m {

    /* JADX INFO: renamed from: a */
    public final String f44311a;

    /* JADX INFO: renamed from: b */
    public final String f44312b;

    /* JADX INFO: renamed from: c */
    public final String f44313c;

    /* JADX INFO: renamed from: d */
    public final String f44314d;

    /* JADX INFO: renamed from: e */
    public final String f44315e;

    public d1m(String str, String str2, String str3, String str4, String str5) {
        this.f44311a = str;
        this.f44312b = str2;
        this.f44313c = str3;
        this.f44314d = str4;
        this.f44315e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1m)) {
            return false;
        }
        d1m d1mVar = (d1m) obj;
        return wj50.m88271j(this.f44311a, d1mVar.f44311a) && wj50.m88271j(this.f44312b, d1mVar.f44312b) && wj50.m88271j(this.f44313c, d1mVar.f44313c) && wj50.m88271j(this.f44314d, d1mVar.f44314d) && wj50.m88271j(this.f44315e, d1mVar.f44315e);
    }

    public final int hashCode() {
        return this.f44315e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f44311a.hashCode() * 31, 31, this.f44312b), 31, this.f44313c), 31, this.f44314d);
    }
}
