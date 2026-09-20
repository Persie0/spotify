package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rtw implements b3x {

    /* JADX INFO: renamed from: a */
    public final String f202696a;

    /* JADX INFO: renamed from: b */
    public final d850 f202697b;

    public rtw(String str, d850 d850Var) {
        this.f202696a = str;
        this.f202697b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtw)) {
            return false;
        }
        rtw rtwVar = (rtw) obj;
        return wj50.m88271j(this.f202696a, rtwVar.f202696a) && wj50.m88271j(this.f202697b, rtwVar.f202697b);
    }

    public final int hashCode() {
        return this.f202697b.hashCode() + (this.f202696a.hashCode() * 31);
    }
}
