package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ll20 {

    /* JADX INFO: renamed from: a */
    public final vwf f134515a;

    /* JADX INFO: renamed from: b */
    public final Integer f134516b;

    /* JADX INFO: renamed from: c */
    public final boolean f134517c;

    public ll20(vwf vwfVar, Integer num, boolean z) {
        this.f134515a = vwfVar;
        this.f134516b = num;
        this.f134517c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll20)) {
            return false;
        }
        ll20 ll20Var = (ll20) obj;
        return wj50.m88271j(this.f134515a, ll20Var.f134515a) && wj50.m88271j(this.f134516b, ll20Var.f134516b) && this.f134517c == ll20Var.f134517c;
    }

    public final int hashCode() {
        vwf vwfVar = this.f134515a;
        int iHashCode = (vwfVar == null ? 0 : vwfVar.hashCode()) * 31;
        Integer num = this.f134516b;
        return Boolean.hashCode(false) + s571.m77245d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 961, this.f134517c);
    }
}
