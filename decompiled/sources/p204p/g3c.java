package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g3c extends h3c {

    /* JADX INFO: renamed from: a */
    public final String f76166a;

    /* JADX INFO: renamed from: b */
    public final String f76167b;

    /* JADX INFO: renamed from: c */
    public final String f76168c;

    /* JADX INFO: renamed from: d */
    public final String f76169d;

    public g3c(String str, String str2, String str3, String str4) {
        this.f76166a = str;
        this.f76167b = str2;
        this.f76168c = str3;
        this.f76169d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3c)) {
            return false;
        }
        g3c g3cVar = (g3c) obj;
        return wj50.m88271j(this.f76166a, g3cVar.f76166a) && wj50.m88271j(this.f76167b, g3cVar.f76167b) && wj50.m88271j(this.f76168c, g3cVar.f76168c) && wj50.m88271j(this.f76169d, g3cVar.f76169d);
    }

    public final int hashCode() {
        return this.f76169d.hashCode() + s571.m77243b(s571.m77243b(this.f76166a.hashCode() * 31, 31, this.f76167b), 31, this.f76168c);
    }
}
