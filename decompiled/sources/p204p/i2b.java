package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i2b {

    /* JADX INFO: renamed from: a */
    public final String f97788a;

    /* JADX INFO: renamed from: b */
    public final String f97789b;

    /* JADX INFO: renamed from: c */
    public final String f97790c;

    public i2b(String str, String str2, String str3) {
        this.f97788a = str;
        this.f97789b = str2;
        this.f97790c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2b)) {
            return false;
        }
        i2b i2bVar = (i2b) obj;
        return wj50.m88271j(this.f97788a, i2bVar.f97788a) && wj50.m88271j(this.f97789b, i2bVar.f97789b) && wj50.m88271j(this.f97790c, i2bVar.f97790c);
    }

    public final int hashCode() {
        return this.f97790c.hashCode() + s571.m77243b(this.f97788a.hashCode() * 31, 31, this.f97789b);
    }
}
