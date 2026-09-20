package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xdw {

    /* JADX INFO: renamed from: a */
    public final String f260558a;

    /* JADX INFO: renamed from: b */
    public final String f260559b;

    /* JADX INFO: renamed from: c */
    public final String f260560c;

    public xdw(String str, String str2, String str3) {
        this.f260558a = str;
        this.f260559b = str2;
        this.f260560c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdw)) {
            return false;
        }
        xdw xdwVar = (xdw) obj;
        return wj50.m88271j(this.f260558a, xdwVar.f260558a) && wj50.m88271j(this.f260559b, xdwVar.f260559b) && wj50.m88271j(this.f260560c, xdwVar.f260560c);
    }

    public final int hashCode() {
        return this.f260560c.hashCode() + s571.m77243b(this.f260558a.hashCode() * 31, 31, this.f260559b);
    }
}
