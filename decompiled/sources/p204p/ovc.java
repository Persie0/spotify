package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ovc {

    /* JADX INFO: renamed from: a */
    public final String f170466a;

    /* JADX INFO: renamed from: b */
    public final int f170467b;

    public ovc(String str, int i) {
        this.f170466a = str;
        this.f170467b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovc)) {
            return false;
        }
        ovc ovcVar = (ovc) obj;
        return wj50.m88271j(this.f170466a, ovcVar.f170466a) && this.f170467b == ovcVar.f170467b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f170467b) + (this.f170466a.hashCode() * 31);
    }
}
