package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gii0 {

    /* JADX INFO: renamed from: a */
    public final String f80196a;

    /* JADX INFO: renamed from: b */
    public final String f80197b;

    public gii0(String str, String str2) {
        this.f80196a = str;
        this.f80197b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gii0)) {
            return false;
        }
        gii0 gii0Var = (gii0) obj;
        return wj50.m88271j(this.f80196a, gii0Var.f80196a) && wj50.m88271j(this.f80197b, gii0Var.f80197b);
    }

    public final int hashCode() {
        return this.f80197b.hashCode() + (this.f80196a.hashCode() * 31);
    }
}
