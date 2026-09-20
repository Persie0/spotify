package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wd11 {

    /* JADX INFO: renamed from: a */
    public final td11 f250190a;

    /* JADX INFO: renamed from: b */
    public final String f250191b;

    /* JADX INFO: renamed from: c */
    public final int f250192c;

    public /* synthetic */ wd11(td11 td11Var) {
        this(td11Var, null, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd11)) {
            return false;
        }
        wd11 wd11Var = (wd11) obj;
        return wj50.m88271j(this.f250190a, wd11Var.f250190a) && wj50.m88271j(this.f250191b, wd11Var.f250191b) && this.f250192c == wd11Var.f250192c;
    }

    public final int hashCode() {
        int iHashCode = this.f250190a.hashCode() * 31;
        String str = this.f250191b;
        return edb.m38547C(this.f250192c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public wd11(td11 td11Var, String str, int i) {
        this.f250190a = td11Var;
        this.f250191b = str;
        this.f250192c = i;
    }
}
