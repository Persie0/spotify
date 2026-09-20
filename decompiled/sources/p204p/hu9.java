package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f95349d = new ak0(11);

    /* JADX INFO: renamed from: a */
    public final mec0 f95350a;

    /* JADX INFO: renamed from: b */
    public final String f95351b;

    /* JADX INFO: renamed from: c */
    public final String f95352c;

    public hu9(mec0 mec0Var, String str, String str2) {
        this.f95350a = mec0Var;
        this.f95351b = str;
        this.f95352c = str2;
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
        if (!(obj instanceof hu9)) {
            return false;
        }
        hu9 hu9Var = (hu9) obj;
        return this.f95350a.equals(hu9Var.f95350a) && wj50.m88271j(this.f95351b, hu9Var.f95351b) && wj50.m88271j(this.f95352c, hu9Var.f95352c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f95349d;
    }

    public final int hashCode() {
        int iHashCode = this.f95350a.hashCode() * 31;
        String str = this.f95351b;
        return this.f95352c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
