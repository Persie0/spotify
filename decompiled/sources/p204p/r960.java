package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r960 implements v960 {

    /* JADX INFO: renamed from: a */
    public final String f196923a;

    /* JADX INFO: renamed from: b */
    public final String f196924b;

    public r960(String str, String str2) {
        this.f196923a = str;
        this.f196924b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r960)) {
            return false;
        }
        r960 r960Var = (r960) obj;
        return wj50.m88271j(this.f196923a, r960Var.f196923a) && wj50.m88271j(this.f196924b, r960Var.f196924b);
    }

    public final int hashCode() {
        int iHashCode = this.f196923a.hashCode() * 31;
        String str = this.f196924b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
