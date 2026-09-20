package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i6w {

    /* JADX INFO: renamed from: a */
    public final String f99339a;

    /* JADX INFO: renamed from: b */
    public final String f99340b;

    /* JADX INFO: renamed from: c */
    public final long f99341c;

    /* JADX INFO: renamed from: d */
    public final z650 f99342d;

    public i6w(String str, String str2, long j, z650 z650Var) {
        this.f99339a = str;
        this.f99340b = str2;
        this.f99341c = j;
        this.f99342d = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6w)) {
            return false;
        }
        i6w i6wVar = (i6w) obj;
        return wj50.m88271j(this.f99339a, i6wVar.f99339a) && wj50.m88271j(this.f99340b, i6wVar.f99340b) && this.f99341c == i6wVar.f99341c && wj50.m88271j(this.f99342d, i6wVar.f99342d);
    }

    public final int hashCode() {
        int iHashCode = this.f99339a.hashCode() * 31;
        String str = this.f99340b;
        int iM36605e = dq60.m36605e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f99341c, 31);
        z650 z650Var = this.f99342d;
        return iM36605e + (z650Var != null ? z650Var.f279709a.hashCode() : 0);
    }
}
