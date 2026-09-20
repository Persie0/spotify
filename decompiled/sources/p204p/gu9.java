package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f84410d = new ak0(10);

    /* JADX INFO: renamed from: a */
    public final mec0 f84411a;

    /* JADX INFO: renamed from: b */
    public final String f84412b;

    /* JADX INFO: renamed from: c */
    public final String f84413c;

    public gu9(mec0 mec0Var, String str, String str2) {
        this.f84411a = mec0Var;
        this.f84412b = str;
        this.f84413c = str2;
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
        if (!(obj instanceof gu9)) {
            return false;
        }
        gu9 gu9Var = (gu9) obj;
        return this.f84411a.equals(gu9Var.f84411a) && wj50.m88271j(this.f84412b, gu9Var.f84412b) && wj50.m88271j(this.f84413c, gu9Var.f84413c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f84410d;
    }

    public final int hashCode() {
        int iHashCode = this.f84411a.hashCode() * 31;
        String str = this.f84412b;
        return this.f84413c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
