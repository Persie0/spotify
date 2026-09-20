package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pfa0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f177016a;

    /* JADX INFO: renamed from: b */
    public final t3r f177017b;

    /* JADX INFO: renamed from: c */
    public final String f177018c;

    public pfa0(String str, t3r t3rVar, String str2) {
        this.f177016a = str;
        this.f177017b = t3rVar;
        this.f177018c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfa0)) {
            return false;
        }
        pfa0 pfa0Var = (pfa0) obj;
        return wj50.m88271j(this.f177016a, pfa0Var.f177016a) && wj50.m88271j(this.f177017b, pfa0Var.f177017b) && wj50.m88271j(this.f177018c, pfa0Var.f177018c);
    }

    public final int hashCode() {
        int iHashCode = (this.f177017b.hashCode() + (this.f177016a.hashCode() * 31)) * 31;
        String str = this.f177018c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
