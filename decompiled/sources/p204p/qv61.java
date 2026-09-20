package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qv61 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ovp0 f192919d = new ovp0(7);

    /* JADX INFO: renamed from: a */
    public final mec0 f192920a;

    /* JADX INFO: renamed from: b */
    public final String f192921b;

    /* JADX INFO: renamed from: c */
    public final String f192922c;

    public qv61(mec0 mec0Var, String str, String str2) {
        this.f192920a = mec0Var;
        this.f192921b = str;
        this.f192922c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv61)) {
            return false;
        }
        qv61 qv61Var = (qv61) obj;
        return this.f192920a.equals(qv61Var.f192920a) && wj50.m88271j(this.f192921b, qv61Var.f192921b) && wj50.m88271j(this.f192922c, qv61Var.f192922c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f192919d;
    }

    public final int hashCode() {
        int iHashCode = this.f192920a.hashCode() * 31;
        String str = this.f192921b;
        return this.f192922c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
