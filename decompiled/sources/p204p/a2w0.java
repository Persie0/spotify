package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a2w0 implements f2w0 {

    /* JADX INFO: renamed from: a */
    public final String f11734a;

    /* JADX INFO: renamed from: b */
    public final String f11735b;

    public a2w0(String str, String str2) {
        this.f11734a = str;
        this.f11735b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2w0)) {
            return false;
        }
        a2w0 a2w0Var = (a2w0) obj;
        return wj50.m88271j(this.f11734a, a2w0Var.f11734a) && wj50.m88271j(this.f11735b, a2w0Var.f11735b);
    }

    public final int hashCode() {
        String str = this.f11734a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11735b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
