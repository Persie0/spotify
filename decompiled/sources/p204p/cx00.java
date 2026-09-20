package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cx00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f42877d = new ak0(29);

    /* JADX INFO: renamed from: a */
    public final mec0 f42878a;

    /* JADX INFO: renamed from: b */
    public final String f42879b;

    /* JADX INFO: renamed from: c */
    public final String f42880c;

    public cx00(mec0 mec0Var, String str, String str2) {
        this.f42878a = mec0Var;
        this.f42879b = str;
        this.f42880c = str2;
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
        if (!(obj instanceof cx00)) {
            return false;
        }
        cx00 cx00Var = (cx00) obj;
        return this.f42878a.equals(cx00Var.f42878a) && wj50.m88271j(this.f42879b, cx00Var.f42879b) && wj50.m88271j(this.f42880c, cx00Var.f42880c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f42877d;
    }

    public final int hashCode() {
        int iHashCode = this.f42878a.hashCode() * 31;
        String str = this.f42879b;
        return this.f42880c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
