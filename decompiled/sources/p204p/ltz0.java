package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ltz0 implements ktz0, l5b {

    /* JADX INFO: renamed from: a */
    public final ktz0 f136935a;

    /* JADX INFO: renamed from: b */
    public final String f136936b;

    /* JADX INFO: renamed from: c */
    public final Set f136937c;

    public ltz0(ktz0 ktz0Var) {
        this.f136935a = ktz0Var;
        this.f136936b = ktz0Var.mo33226i() + '?';
        this.f136937c = xuf1.m92165d(ktz0Var);
    }

    @Override // p204p.l5b
    /* JADX INFO: renamed from: a */
    public final Set mo58213a() {
        return this.f136937c;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: b */
    public final boolean mo57365b() {
        return true;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: c */
    public final int mo33221c(String str) {
        return this.f136935a.mo33221c(str);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: d */
    public final boolean mo51606d() {
        return this.f136935a.mo51606d();
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: e */
    public final int mo33222e() {
        return this.f136935a.mo33222e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ltz0) {
            return wj50.m88271j(this.f136935a, ((ltz0) obj).f136935a);
        }
        return false;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: f */
    public final String mo33223f(int i) {
        return this.f136935a.mo33223f(i);
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: g */
    public final List mo33224g(int i) {
        return this.f136935a.mo33224g(i);
    }

    @Override // p204p.ktz0
    public final List getAnnotations() {
        return this.f136935a.getAnnotations();
    }

    @Override // p204p.ktz0
    public final k0e1 getKind() {
        return this.f136935a.getKind();
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: h */
    public final ktz0 mo33225h(int i) {
        return this.f136935a.mo33225h(i);
    }

    public final int hashCode() {
        return this.f136935a.hashCode() * 31;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: i */
    public final String mo33226i() {
        return this.f136936b;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: j */
    public final boolean mo33227j(int i) {
        return this.f136935a.mo33227j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f136935a);
        sb.append('?');
        return sb.toString();
    }
}
