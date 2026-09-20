package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eer0 implements ktz0 {

    /* JADX INFO: renamed from: a */
    public final String f58843a;

    /* JADX INFO: renamed from: b */
    public final aer0 f58844b;

    public eer0(String str, aer0 aer0Var) {
        this.f58843a = str;
        this.f58844b = aer0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m38703a() {
        throw new IllegalStateException(dq60.m36616p(this.f58843a, " does not have elements", new StringBuilder("Primitive descriptor ")));
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: c */
    public final int mo33221c(String str) {
        m38703a();
        throw null;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: e */
    public final int mo33222e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eer0)) {
            return false;
        }
        eer0 eer0Var = (eer0) obj;
        return wj50.m88271j(this.f58843a, eer0Var.f58843a) && wj50.m88271j(this.f58844b, eer0Var.f58844b);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: f */
    public final String mo33223f(int i) {
        m38703a();
        throw null;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: g */
    public final List mo33224g(int i) {
        m38703a();
        throw null;
    }

    @Override // p204p.ktz0
    public final k0e1 getKind() {
        return this.f58844b;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: h */
    public final ktz0 mo33225h(int i) {
        m38703a();
        throw null;
    }

    public final int hashCode() {
        return (this.f58844b.hashCode() * 31) + this.f58843a.hashCode();
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: i */
    public final String mo33226i() {
        return this.f58843a;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: j */
    public final boolean mo33227j(int i) {
        m38703a();
        throw null;
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("PrimitiveDescriptor("), this.f58843a, ')');
    }
}
