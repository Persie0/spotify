package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iiu0 implements jiu0 {

    /* JADX INFO: renamed from: a */
    public final String f102632a;

    /* JADX INFO: renamed from: b */
    public final String f102633b;

    /* JADX INFO: renamed from: c */
    public final String f102634c;

    public iiu0(String str, String str2, String str3) {
        this.f102632a = str;
        this.f102633b = str2;
        this.f102634c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiu0)) {
            return false;
        }
        iiu0 iiu0Var = (iiu0) obj;
        return wj50.m88271j(this.f102632a, iiu0Var.f102632a) && wj50.m88271j(this.f102633b, iiu0Var.f102633b) && wj50.m88271j(this.f102634c, iiu0Var.f102634c);
    }

    public final int hashCode() {
        return this.f102634c.hashCode() + s571.m77243b(this.f102632a.hashCode() * 31, 31, this.f102633b);
    }
}
