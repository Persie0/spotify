package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vi8 {

    /* JADX INFO: renamed from: a */
    public final String f241639a;

    /* JADX INFO: renamed from: b */
    public final String f241640b;

    /* JADX INFO: renamed from: c */
    public final String f241641c;

    public vi8(String str, String str2, String str3) {
        this.f241639a = str;
        this.f241640b = str2;
        this.f241641c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi8)) {
            return false;
        }
        vi8 vi8Var = (vi8) obj;
        return wj50.m88271j(this.f241639a, vi8Var.f241639a) && wj50.m88271j(this.f241640b, vi8Var.f241640b) && wj50.m88271j(this.f241641c, vi8Var.f241641c);
    }

    public final int hashCode() {
        String str = this.f241639a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f241640b);
        String str2 = this.f241641c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
