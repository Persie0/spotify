package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ei81 extends ii81 {

    /* JADX INFO: renamed from: a */
    public final String f59815a;

    /* JADX INFO: renamed from: b */
    public final int f59816b;

    /* JADX INFO: renamed from: c */
    public final String f59817c;

    public ei81(String str, int i, String str2) {
        this.f59815a = str;
        this.f59816b = i;
        this.f59817c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei81)) {
            return false;
        }
        ei81 ei81Var = (ei81) obj;
        return wj50.m88271j(this.f59815a, ei81Var.f59815a) && this.f59816b == ei81Var.f59816b && wj50.m88271j(this.f59817c, ei81Var.f59817c);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f59816b, this.f59815a.hashCode() * 31, 31);
        String str = this.f59817c;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
