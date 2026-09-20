package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d2w0 implements f2w0 {

    /* JADX INFO: renamed from: a */
    public final String f44682a;

    /* JADX INFO: renamed from: b */
    public final String f44683b;

    public d2w0(String str, String str2) {
        this.f44682a = str;
        this.f44683b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2w0)) {
            return false;
        }
        d2w0 d2w0Var = (d2w0) obj;
        return wj50.m88271j(this.f44682a, d2w0Var.f44682a) && wj50.m88271j(this.f44683b, d2w0Var.f44683b);
    }

    public final int hashCode() {
        String str = this.f44682a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44683b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
