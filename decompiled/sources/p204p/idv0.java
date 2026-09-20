package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class idv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f101249a;

    /* JADX INFO: renamed from: b */
    public final String f101250b;

    public idv0(String str, String str2) {
        this.f101249a = str;
        this.f101250b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idv0)) {
            return false;
        }
        idv0 idv0Var = (idv0) obj;
        return wj50.m88271j(this.f101249a, idv0Var.f101249a) && wj50.m88271j(this.f101250b, idv0Var.f101250b);
    }

    public final int hashCode() {
        return this.f101250b.hashCode() + (this.f101249a.hashCode() * 31);
    }
}
