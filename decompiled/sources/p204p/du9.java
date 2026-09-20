package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class du9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f53014d = new ak0(7);

    /* JADX INFO: renamed from: a */
    public final mec0 f53015a;

    /* JADX INFO: renamed from: b */
    public final String f53016b;

    /* JADX INFO: renamed from: c */
    public final String f53017c;

    public du9(mec0 mec0Var, String str, String str2) {
        this.f53015a = mec0Var;
        this.f53016b = str;
        this.f53017c = str2;
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
        if (!(obj instanceof du9)) {
            return false;
        }
        du9 du9Var = (du9) obj;
        return this.f53015a.equals(du9Var.f53015a) && wj50.m88271j(this.f53016b, du9Var.f53016b) && wj50.m88271j(this.f53017c, du9Var.f53017c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f53014d;
    }

    public final int hashCode() {
        int iHashCode = this.f53015a.hashCode() * 31;
        String str = this.f53016b;
        return this.f53017c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
