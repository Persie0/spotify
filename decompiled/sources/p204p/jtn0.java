package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jtn0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f115927d = new dx00(8);

    /* JADX INFO: renamed from: a */
    public final mec0 f115928a;

    /* JADX INFO: renamed from: b */
    public final String f115929b;

    /* JADX INFO: renamed from: c */
    public final String f115930c;

    public jtn0(mec0 mec0Var, String str, String str2) {
        this.f115928a = mec0Var;
        this.f115929b = str;
        this.f115930c = str2;
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
        if (!(obj instanceof jtn0)) {
            return false;
        }
        jtn0 jtn0Var = (jtn0) obj;
        return this.f115928a.equals(jtn0Var.f115928a) && wj50.m88271j(this.f115929b, jtn0Var.f115929b) && wj50.m88271j(this.f115930c, jtn0Var.f115930c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f115927d;
    }

    public final int hashCode() {
        int iHashCode = this.f115928a.hashCode() * 31;
        String str = this.f115929b;
        return this.f115930c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
