package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ww00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f255653d = new ak0(23);

    /* JADX INFO: renamed from: a */
    public final mec0 f255654a;

    /* JADX INFO: renamed from: b */
    public final String f255655b;

    /* JADX INFO: renamed from: c */
    public final String f255656c;

    public ww00(mec0 mec0Var, String str, String str2) {
        this.f255654a = mec0Var;
        this.f255655b = str;
        this.f255656c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww00)) {
            return false;
        }
        ww00 ww00Var = (ww00) obj;
        return this.f255654a.equals(ww00Var.f255654a) && wj50.m88271j(this.f255655b, ww00Var.f255655b) && wj50.m88271j(this.f255656c, ww00Var.f255656c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f255653d;
    }

    public final int hashCode() {
        int iHashCode = this.f255654a.hashCode() * 31;
        String str = this.f255655b;
        return this.f255656c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
