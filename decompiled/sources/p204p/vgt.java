package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vgt implements umt {

    /* JADX INFO: renamed from: a */
    public final String f241310a;

    /* JADX INFO: renamed from: b */
    public final int f241311b;

    public vgt(String str, int i) {
        this.f241310a = str;
        this.f241311b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgt)) {
            return false;
        }
        vgt vgtVar = (vgt) obj;
        return wj50.m88271j(this.f241310a, vgtVar.f241310a) && this.f241311b == vgtVar.f241311b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f241311b) + (this.f241310a.hashCode() * 31);
    }
}
