package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fmx0 extends cuk {
    @Override // p204p.fj50
    /* JADX INFO: renamed from: b */
    public final Object mo41796b(Object obj, float f) {
        if (wj50.m88271j(obj, kxf1.f127485a) || obj == null) {
            fmx0 fmx0Var = hmx0.f93097a;
            ngt0 ngt0VarM38673d = eem.m38673d(0.0f);
            obj = new fmx0(ngt0VarM38673d, ngt0VarM38673d, ngt0VarM38673d, ngt0VarM38673d);
        }
        if (!(obj instanceof fmx0)) {
            return null;
        }
        fmx0 fmx0Var2 = (fmx0) obj;
        fmx0 fmx0Var3 = hmx0.f93097a;
        return new fmx0(new gmx0(this.f42140a, fmx0Var2.f42140a, f), new gmx0(this.f42141b, fmx0Var2.f42141b, f), new gmx0(this.f42142c, fmx0Var2.f42142c, f), new gmx0(this.f42143d, fmx0Var2.f42143d, f));
    }

    @Override // p204p.cuk
    /* JADX INFO: renamed from: c */
    public final cuk mo33928c(fuk fukVar, fuk fukVar2, fuk fukVar3, fuk fukVar4) {
        return new fmx0(fukVar, fukVar2, fukVar3, fukVar4);
    }

    @Override // p204p.cuk
    /* JADX INFO: renamed from: e */
    public final ncg1 mo33929e(long j, float f, float f2, float f3, float f4, ko70 ko70Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new lyl0(q0f1.m71836j(0L, j));
        }
        tiv0 tiv0VarM71836j = q0f1.m71836j(0L, j);
        ko70 ko70Var2 = ko70.f124556a;
        float f5 = ko70Var == ko70Var2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        float f6 = ko70Var == ko70Var2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
        float f7 = ko70Var == ko70Var2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = ko70Var == ko70Var2 ? f4 : f3;
        return new myl0(q3d0.m72097g(tiv0VarM71836j, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmx0)) {
            return false;
        }
        fmx0 fmx0Var = (fmx0) obj;
        return wj50.m88271j(this.f42140a, fmx0Var.f42140a) && wj50.m88271j(this.f42141b, fmx0Var.f42141b) && wj50.m88271j(this.f42142c, fmx0Var.f42142c) && wj50.m88271j(this.f42143d, fmx0Var.f42143d);
    }

    public final int hashCode() {
        return this.f42143d.hashCode() + ((this.f42142c.hashCode() + ((this.f42141b.hashCode() + (this.f42140a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f42140a + ", topEnd = " + this.f42141b + ", bottomEnd = " + this.f42142c + ", bottomStart = " + this.f42143d + ')';
    }
}
