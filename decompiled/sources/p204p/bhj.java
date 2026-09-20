package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bhj extends chj {

    /* JADX INFO: renamed from: a */
    public final lhj f27195a;

    /* JADX INFO: renamed from: b */
    public final String f27196b;

    /* JADX INFO: renamed from: c */
    public final b250 f27197c;

    public bhj(lhj lhjVar, String str, b250 b250Var) {
        this.f27195a = lhjVar;
        this.f27196b = str;
        this.f27197c = b250Var;
    }

    @Override // p204p.chj
    /* JADX INFO: renamed from: a */
    public final lhj mo25988a() {
        return this.f27195a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj)) {
            return false;
        }
        bhj bhjVar = (bhj) obj;
        return wj50.m88271j(this.f27195a, bhjVar.f27195a) && wj50.m88271j(this.f27196b, bhjVar.f27196b) && wj50.m88271j(this.f27197c, bhjVar.f27197c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f27196b;
    }

    public final int hashCode() {
        return this.f27197c.hashCode() + s571.m77243b(this.f27195a.hashCode() * 31, 31, this.f27196b);
    }
}
