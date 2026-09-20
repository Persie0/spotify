package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zll {

    /* JADX INFO: renamed from: a */
    public final String f284028a;

    /* JADX INFO: renamed from: b */
    public final String f284029b;

    public zll(String str, String str2) {
        this.f284028a = str;
        this.f284029b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zll)) {
            return false;
        }
        zll zllVar = (zll) obj;
        return wj50.m88271j(this.f284028a, zllVar.f284028a) && wj50.m88271j(this.f284029b, zllVar.f284029b);
    }

    public final int hashCode() {
        return this.f284029b.hashCode() + (this.f284028a.hashCode() * 31);
    }
}
