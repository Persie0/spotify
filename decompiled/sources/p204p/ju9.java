package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ju9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f116052d = new ak0(13);

    /* JADX INFO: renamed from: a */
    public final mec0 f116053a;

    /* JADX INFO: renamed from: b */
    public final String f116054b;

    /* JADX INFO: renamed from: c */
    public final String f116055c;

    public ju9(mec0 mec0Var, String str, String str2) {
        this.f116053a = mec0Var;
        this.f116054b = str;
        this.f116055c = str2;
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
        if (!(obj instanceof ju9)) {
            return false;
        }
        ju9 ju9Var = (ju9) obj;
        return this.f116053a.equals(ju9Var.f116053a) && wj50.m88271j(this.f116054b, ju9Var.f116054b) && wj50.m88271j(this.f116055c, ju9Var.f116055c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f116052d;
    }

    public final int hashCode() {
        int iHashCode = this.f116053a.hashCode() * 31;
        String str = this.f116054b;
        return this.f116055c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
