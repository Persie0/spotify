package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sji {

    /* JADX INFO: renamed from: a */
    public final String f209852a;

    /* JADX INFO: renamed from: b */
    public final String f209853b;

    /* JADX INFO: renamed from: c */
    public final String f209854c;

    public sji(String str, String str2, String str3) {
        this.f209852a = str;
        this.f209853b = str2;
        this.f209854c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sji)) {
            return false;
        }
        sji sjiVar = (sji) obj;
        return wj50.m88271j(this.f209852a, sjiVar.f209852a) && wj50.m88271j(this.f209853b, sjiVar.f209853b) && wj50.m88271j(this.f209854c, sjiVar.f209854c);
    }

    public final int hashCode() {
        return this.f209854c.hashCode() + s571.m77243b(this.f209852a.hashCode() * 31, 31, this.f209853b);
    }
}
