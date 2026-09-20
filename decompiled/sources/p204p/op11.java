package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class op11 {

    /* JADX INFO: renamed from: a */
    public final String f167735a;

    /* JADX INFO: renamed from: b */
    public final String f167736b;

    public op11(String str, String str2) {
        this.f167735a = str;
        this.f167736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op11)) {
            return false;
        }
        op11 op11Var = (op11) obj;
        return wj50.m88271j(this.f167735a, op11Var.f167735a) && wj50.m88271j(this.f167736b, op11Var.f167736b);
    }

    public final int hashCode() {
        int iHashCode = this.f167735a.hashCode() * 31;
        String str = this.f167736b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
