package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hcf extends lcf {

    /* JADX INFO: renamed from: a */
    public final String f89783a;

    public hcf(String str) {
        str.getClass();
        this.f89783a = str;
    }

    @Override // p204p.lcf
    /* JADX INFO: renamed from: e */
    public final Object mo47109e(wh00 wh00Var, wh00 wh00Var2) {
        return wh00Var2.mo98394apply(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcf) {
            return ((hcf) obj).f89783a.equals(this.f89783a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final String m47110g() {
        return this.f89783a;
    }

    public final int hashCode() {
        return this.f89783a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("Failure{reasons="), this.f89783a, '}');
    }
}
