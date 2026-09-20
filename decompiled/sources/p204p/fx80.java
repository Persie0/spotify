package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fx80 implements ktz0 {

    /* JADX INFO: renamed from: a */
    public final ktz0 f74290a;

    public fx80(ktz0 ktz0Var) {
        this.f74290a = ktz0Var;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: c */
    public final int mo33221c(String str) {
        Integer numM29807r0 = bm51.m29807r0(str);
        if (numM29807r0 != null) {
            return numM29807r0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: e */
    public final int mo33222e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx80)) {
            return false;
        }
        fx80 fx80Var = (fx80) obj;
        return wj50.m88271j(this.f74290a, fx80Var.f74290a) && wj50.m88271j(mo33226i(), fx80Var.mo33226i());
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
        StringBuilder sbM56838j = klh.m56838j(i, "Illegal index ", ", ");
        sbM56838j.append(mo33226i());
        sbM56838j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM56838j.toString().toString());
    }

    @Override // p204p.ktz0
    public final k0e1 getKind() {
        return in51.f103871A0;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: h */
    public final ktz0 mo33225h(int i) {
        if (i >= 0) {
            return this.f74290a;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Illegal index ", ", ");
        sbM56838j.append(mo33226i());
        sbM56838j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM56838j.toString().toString());
    }

    public final int hashCode() {
        return mo33226i().hashCode() + (this.f74290a.hashCode() * 31);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: j */
    public final boolean mo33227j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Illegal index ", ", ");
        sbM56838j.append(mo33226i());
        sbM56838j.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM56838j.toString().toString());
    }

    public final String toString() {
        return mo33226i() + '(' + this.f74290a + ')';
    }
}
