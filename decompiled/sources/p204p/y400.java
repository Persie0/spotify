package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y400 {

    /* JADX INFO: renamed from: c */
    public static final y400 f269047c = new y400("");

    /* JADX INFO: renamed from: a */
    public final z400 f269048a;

    /* JADX INFO: renamed from: b */
    public transient y400 f269049b;

    public y400(String str) {
        this.f269048a = new z400(str, this);
    }

    /* JADX INFO: renamed from: a */
    public final y400 m92785a(qti0 qti0Var) {
        return new y400(this.f269048a.m95301a(qti0Var), this);
    }

    /* JADX INFO: renamed from: b */
    public final y400 m92786b() {
        y400 y400Var = this.f269049b;
        if (y400Var != null) {
            return y400Var;
        }
        z400 z400Var = this.f269048a;
        if (z400Var.m95303c()) {
            throw new IllegalStateException("root");
        }
        y400 y400Var2 = new y400(z400Var.m95305e());
        this.f269049b = y400Var2;
        return y400Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y400) {
            return wj50.m88271j(this.f269048a, ((y400) obj).f269048a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f269048a.f279080a.hashCode();
    }

    public final String toString() {
        return this.f269048a.toString();
    }

    public y400(z400 z400Var) {
        this.f269048a = z400Var;
    }

    public y400(z400 z400Var, y400 y400Var) {
        this.f269048a = z400Var;
        this.f269049b = y400Var;
    }
}
