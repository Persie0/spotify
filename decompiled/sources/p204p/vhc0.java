package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vhc0 implements ktz0 {

    /* JADX INFO: renamed from: a */
    public final String f241467a;

    /* JADX INFO: renamed from: b */
    public final ktz0 f241468b;

    /* JADX INFO: renamed from: c */
    public final ktz0 f241469c;

    public vhc0(String str, ktz0 ktz0Var, ktz0 ktz0Var2) {
        this.f241467a = str;
        this.f241468b = ktz0Var;
        this.f241469c = ktz0Var2;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: c */
    public final int mo33221c(String str) {
        Integer numM29807r0 = bm51.m29807r0(str);
        if (numM29807r0 != null) {
            return numM29807r0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: e */
    public final int mo33222e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhc0)) {
            return false;
        }
        vhc0 vhc0Var = (vhc0) obj;
        return wj50.m88271j(this.f241467a, vhc0Var.f241467a) && wj50.m88271j(this.f241468b, vhc0Var.f241468b) && wj50.m88271j(this.f241469c, vhc0Var.f241469c);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: f */
    public final String mo33223f(int i) {
        return String.valueOf(i);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: g */
    public final List mo33224g(int i) {
        if (i >= 0) {
            return lau.f131415a;
        }
        throw new IllegalArgumentException(dq60.m36616p(this.f241467a, " expects only non-negative indices", klh.m56838j(i, "Illegal index ", ", ")).toString());
    }

    @Override // p204p.ktz0
    public final k0e1 getKind() {
        return jn51.f114021z0;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: h */
    public final ktz0 mo33225h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(dq60.m36616p(this.f241467a, " expects only non-negative indices", klh.m56838j(i, "Illegal index ", ", ")).toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f241468b;
        }
        if (i2 == 1) {
            return this.f241469c;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f241469c.hashCode() + ((this.f241468b.hashCode() + (this.f241467a.hashCode() * 31)) * 31);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: i */
    public final String mo33226i() {
        return this.f241467a;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: j */
    public final boolean mo33227j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(dq60.m36616p(this.f241467a, " expects only non-negative indices", klh.m56838j(i, "Illegal index ", ", ")).toString());
    }

    public final String toString() {
        return this.f241467a + '(' + this.f241468b + ", " + this.f241469c + ')';
    }
}
