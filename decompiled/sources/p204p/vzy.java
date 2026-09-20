package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vzy {

    /* JADX INFO: renamed from: a */
    public final String f246589a;

    /* JADX INFO: renamed from: b */
    public final wfz f246590b;

    /* JADX INFO: renamed from: c */
    public final int f246591c;

    /* JADX INFO: renamed from: d */
    public final String f246592d;

    public vzy(String str, wfz wfzVar, int i, String str2) {
        this.f246589a = str;
        this.f246590b = wfzVar;
        this.f246591c = i;
        this.f246592d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzy)) {
            return false;
        }
        vzy vzyVar = (vzy) obj;
        return wj50.m88271j(this.f246589a, vzyVar.f246589a) && wj50.m88271j(this.f246590b, vzyVar.f246590b) && this.f246591c == vzyVar.f246591c && wj50.m88271j(this.f246592d, vzyVar.f246592d);
    }

    public final int hashCode() {
        return this.f246592d.hashCode() + mt60.m62800g(this.f246591c, (this.f246590b.hashCode() + (this.f246589a.hashCode() * 31)) * 31, 31);
    }
}
