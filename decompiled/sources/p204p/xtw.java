package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xtw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f265935a;

    /* JADX INFO: renamed from: b */
    public final Throwable f265936b;

    /* JADX INFO: renamed from: c */
    public final String f265937c;

    public xtw(int i, String str, String str2, Throwable th) {
        th = (i & 2) != 0 ? null : th;
        str2 = (i & 4) != 0 ? null : str2;
        this.f265935a = str;
        this.f265936b = th;
        this.f265937c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtw)) {
            return false;
        }
        xtw xtwVar = (xtw) obj;
        return wj50.m88271j(this.f265935a, xtwVar.f265935a) && wj50.m88271j(this.f265936b, xtwVar.f265936b) && wj50.m88271j(this.f265937c, xtwVar.f265937c);
    }

    public final int hashCode() {
        int iHashCode = this.f265935a.hashCode() * 31;
        Throwable th = this.f265936b;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.f265937c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
