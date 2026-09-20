package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ex00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f63638d = new dx00(0);

    /* JADX INFO: renamed from: a */
    public final mec0 f63639a;

    /* JADX INFO: renamed from: b */
    public final String f63640b;

    /* JADX INFO: renamed from: c */
    public final String f63641c;

    public ex00(mec0 mec0Var, String str, String str2) {
        this.f63639a = mec0Var;
        this.f63640b = str;
        this.f63641c = str2;
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
        if (!(obj instanceof ex00)) {
            return false;
        }
        ex00 ex00Var = (ex00) obj;
        return this.f63639a.equals(ex00Var.f63639a) && wj50.m88271j(this.f63640b, ex00Var.f63640b) && wj50.m88271j(this.f63641c, ex00Var.f63641c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f63638d;
    }

    public final int hashCode() {
        int iHashCode = this.f63639a.hashCode() * 31;
        String str = this.f63640b;
        return this.f63641c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
