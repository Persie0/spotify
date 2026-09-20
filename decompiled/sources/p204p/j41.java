package p204p;

/* JADX INFO: loaded from: classes18.dex */
public final class j41 {

    /* JADX INFO: renamed from: a */
    public final int f108541a;

    /* JADX INFO: renamed from: b */
    public final String f108542b;

    /* JADX INFO: renamed from: c */
    public final Integer f108543c;

    /* JADX INFO: renamed from: d */
    public final boolean f108544d;

    public j41(int i, String str, Integer num, boolean z) {
        this.f108541a = i;
        this.f108542b = str;
        this.f108543c = num;
        this.f108544d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j41)) {
            return false;
        }
        j41 j41Var = (j41) obj;
        return this.f108541a == j41Var.f108541a && wj50.m88271j(this.f108542b, j41Var.f108542b) && wj50.m88271j(this.f108543c, j41Var.f108543c) && this.f108544d == j41Var.f108544d;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f108541a) * 31;
        String str = this.f108542b;
        int iHashCode = (iM38547C + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f108543c;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.f108544d);
    }
}
