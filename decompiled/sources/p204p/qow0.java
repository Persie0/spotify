package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qow0 implements row0 {

    /* JADX INFO: renamed from: a */
    public final String f191074a;

    /* JADX INFO: renamed from: b */
    public final String f191075b;

    /* JADX INFO: renamed from: c */
    public final String f191076c;

    public qow0(String str, String str2, String str3) {
        this.f191074a = str;
        this.f191075b = str2;
        this.f191076c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qow0)) {
            return false;
        }
        qow0 qow0Var = (qow0) obj;
        return wj50.m88271j(this.f191074a, qow0Var.f191074a) && wj50.m88271j(this.f191075b, qow0Var.f191075b) && wj50.m88271j(this.f191076c, qow0Var.f191076c);
    }

    public final int hashCode() {
        return this.f191076c.hashCode() + s571.m77243b(this.f191074a.hashCode() * 31, 31, this.f191075b);
    }
}
