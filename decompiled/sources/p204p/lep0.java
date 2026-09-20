package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lep0 {

    /* JADX INFO: renamed from: a */
    public final String f132653a;

    /* JADX INFO: renamed from: b */
    public final String f132654b;

    public lep0(String str, String str2) {
        this.f132653a = str;
        this.f132654b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m58810a() {
        return this.f132653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lep0)) {
            return false;
        }
        lep0 lep0Var = (lep0) obj;
        return wj50.m88271j(this.f132653a, lep0Var.f132653a) && wj50.m88271j(this.f132654b, lep0Var.f132654b);
    }

    public final int hashCode() {
        return this.f132654b.hashCode() + (this.f132653a.hashCode() * 31);
    }
}
