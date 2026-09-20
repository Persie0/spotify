package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class iu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f105890d = new ak0(12);

    /* JADX INFO: renamed from: a */
    public final mec0 f105891a;

    /* JADX INFO: renamed from: b */
    public final String f105892b;

    /* JADX INFO: renamed from: c */
    public final String f105893c;

    public iu9(mec0 mec0Var, String str, String str2) {
        this.f105891a = mec0Var;
        this.f105892b = str;
        this.f105893c = str2;
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
        if (!(obj instanceof iu9)) {
            return false;
        }
        iu9 iu9Var = (iu9) obj;
        return this.f105891a.equals(iu9Var.f105891a) && wj50.m88271j(this.f105892b, iu9Var.f105892b) && wj50.m88271j(this.f105893c, iu9Var.f105893c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f105890d;
    }

    public final int hashCode() {
        int iHashCode = this.f105891a.hashCode() * 31;
        String str = this.f105892b;
        return this.f105893c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
