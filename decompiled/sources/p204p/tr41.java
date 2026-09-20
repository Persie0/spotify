package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0(with = xr41.class)
public final class tr41 {
    public static final sr41 Companion = new sr41();

    /* JADX INFO: renamed from: a */
    public final String f222966a;

    /* JADX INFO: renamed from: b */
    public final String f222967b;

    public tr41(String str, String str2) {
        this.f222966a = str;
        this.f222967b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr41)) {
            return false;
        }
        tr41 tr41Var = (tr41) obj;
        return wj50.m88271j(this.f222966a, tr41Var.f222966a) && wj50.m88271j(this.f222967b, tr41Var.f222967b);
    }

    public final int hashCode() {
        return this.f222967b.hashCode() + (this.f222966a.hashCode() * 31);
    }
}
