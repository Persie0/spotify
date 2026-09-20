package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cna0 {

    /* JADX INFO: renamed from: a */
    public final String f39929a;

    /* JADX INFO: renamed from: b */
    public final rma0 f39930b;

    /* JADX INFO: renamed from: c */
    public final String f39931c;

    /* JADX INFO: renamed from: d */
    public final String f39932d;

    public /* synthetic */ cna0() {
        this("", nma0.f155391a, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cna0)) {
            return false;
        }
        cna0 cna0Var = (cna0) obj;
        return wj50.m88271j(this.f39929a, cna0Var.f39929a) && wj50.m88271j(this.f39930b, cna0Var.f39930b) && wj50.m88271j(this.f39931c, cna0Var.f39931c) && wj50.m88271j(this.f39932d, cna0Var.f39932d);
    }

    public final int hashCode() {
        int iHashCode = (this.f39930b.hashCode() + (this.f39929a.hashCode() * 31)) * 31;
        String str = this.f39931c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39932d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public cna0(String str, rma0 rma0Var, String str2, String str3) {
        this.f39929a = str;
        this.f39930b = rma0Var;
        this.f39931c = str2;
        this.f39932d = str3;
    }
}
