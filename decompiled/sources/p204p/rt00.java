package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rt00 {

    /* JADX INFO: renamed from: a */
    public final su00 f202459a;

    /* JADX INFO: renamed from: b */
    public final String f202460b;

    /* JADX INFO: renamed from: c */
    public final boolean f202461c;

    public rt00(su00 su00Var, String str, boolean z) {
        this.f202459a = su00Var;
        this.f202460b = str;
        this.f202461c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt00)) {
            return false;
        }
        rt00 rt00Var = (rt00) obj;
        return wj50.m88271j(this.f202459a, rt00Var.f202459a) && wj50.m88271j(this.f202460b, rt00Var.f202460b) && this.f202461c == rt00Var.f202461c;
    }

    public final int hashCode() {
        su00 su00Var = this.f202459a;
        int iHashCode = (su00Var == null ? 0 : su00Var.hashCode()) * 31;
        String str = this.f202460b;
        return Boolean.hashCode(this.f202461c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
