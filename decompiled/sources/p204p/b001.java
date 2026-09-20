package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b001 implements e001 {

    /* JADX INFO: renamed from: a */
    public final int f21721a;

    /* JADX INFO: renamed from: b */
    public final String f21722b;

    public b001(int i, String str) {
        this.f21721a = i;
        this.f21722b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b001)) {
            return false;
        }
        b001 b001Var = (b001) obj;
        return this.f21721a == b001Var.f21721a && wj50.m88271j(this.f21722b, b001Var.f21722b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21721a) * 31;
        String str = this.f21722b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
