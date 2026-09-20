package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ixy {

    /* JADX INFO: renamed from: a */
    public final String f106786a;

    /* JADX INFO: renamed from: b */
    public final String f106787b;

    public ixy(String str, String str2) {
        this.f106786a = str;
        this.f106787b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixy)) {
            return false;
        }
        ixy ixyVar = (ixy) obj;
        return wj50.m88271j(this.f106786a, ixyVar.f106786a) && wj50.m88271j(this.f106787b, ixyVar.f106787b);
    }

    public final int hashCode() {
        return this.f106787b.hashCode() + (this.f106786a.hashCode() * 31);
    }
}
