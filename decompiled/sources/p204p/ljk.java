package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ljk implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f134096d = new ak0(20);

    /* JADX INFO: renamed from: a */
    public final mec0 f134097a;

    /* JADX INFO: renamed from: b */
    public final String f134098b;

    /* JADX INFO: renamed from: c */
    public final String f134099c;

    public ljk(mec0 mec0Var, String str, String str2) {
        this.f134097a = mec0Var;
        this.f134098b = str;
        this.f134099c = str2;
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
        if (!(obj instanceof ljk)) {
            return false;
        }
        ljk ljkVar = (ljk) obj;
        return this.f134097a.equals(ljkVar.f134097a) && wj50.m88271j(this.f134098b, ljkVar.f134098b) && wj50.m88271j(this.f134099c, ljkVar.f134099c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f134096d;
    }

    public final int hashCode() {
        int iHashCode = this.f134097a.hashCode() * 31;
        String str = this.f134098b;
        return this.f134099c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
