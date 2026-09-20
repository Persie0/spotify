package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sl71 {

    /* JADX INFO: renamed from: a */
    public final String f210315a;

    /* JADX INFO: renamed from: b */
    public final String f210316b;

    public sl71(String str, String str2) {
        this.f210315a = str;
        this.f210316b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m78442a() {
        return this.f210315a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl71)) {
            return false;
        }
        sl71 sl71Var = (sl71) obj;
        return wj50.m88271j(this.f210315a, sl71Var.f210315a) && wj50.m88271j(this.f210316b, sl71Var.f210316b);
    }

    public final int hashCode() {
        return this.f210316b.hashCode() + (this.f210315a.hashCode() * 31);
    }
}
