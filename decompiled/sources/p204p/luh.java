package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class luh implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f137090a;

    /* JADX INFO: renamed from: b */
    public final String f137091b;

    /* JADX INFO: renamed from: c */
    public final vfi f137092c;

    public luh(String str, String str2, vfi vfiVar) {
        this.f137090a = str;
        this.f137091b = str2;
        this.f137092c = vfiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luh)) {
            return false;
        }
        luh luhVar = (luh) obj;
        return wj50.m88271j(this.f137090a, luhVar.f137090a) && wj50.m88271j(this.f137091b, luhVar.f137091b) && wj50.m88271j(this.f137092c, luhVar.f137092c);
    }

    public final int hashCode() {
        return this.f137092c.hashCode() + s571.m77243b(this.f137090a.hashCode() * 31, 31, this.f137091b);
    }
}
