package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j7a {

    /* JADX INFO: renamed from: a */
    public final String f109542a;

    /* JADX INFO: renamed from: b */
    public final String f109543b;

    /* JADX INFO: renamed from: c */
    public final String f109544c;

    /* JADX INFO: renamed from: d */
    public final String f109545d;

    /* JADX INFO: renamed from: e */
    public final String f109546e;

    public j7a(String str, String str2, String str3, String str4, String str5) {
        this.f109542a = str;
        this.f109543b = str2;
        this.f109544c = str3;
        this.f109545d = str4;
        this.f109546e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7a)) {
            return false;
        }
        j7a j7aVar = (j7a) obj;
        return wj50.m88271j(this.f109542a, j7aVar.f109542a) && wj50.m88271j(this.f109543b, j7aVar.f109543b) && wj50.m88271j(this.f109544c, j7aVar.f109544c) && wj50.m88271j(this.f109545d, j7aVar.f109545d) && wj50.m88271j(this.f109546e, j7aVar.f109546e);
    }

    public final int hashCode() {
        return this.f109546e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f109542a.hashCode() * 31, 31, this.f109543b), 31, this.f109544c), 31, this.f109545d);
    }
}
