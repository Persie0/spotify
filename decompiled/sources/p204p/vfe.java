package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vfe {

    /* JADX INFO: renamed from: a */
    public final y400 f240966a;

    /* JADX INFO: renamed from: b */
    public final y400 f240967b;

    /* JADX INFO: renamed from: c */
    public final boolean f240968c;

    static {
        new uc5(3);
    }

    public vfe(y400 y400Var, y400 y400Var2, boolean z) {
        this.f240966a = y400Var;
        this.f240967b = y400Var2;
        this.f240968c = z;
        y400Var2.f269048a.m95303c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m85353c(y400 y400Var) {
        String str = y400Var.f269048a.f279080a;
        return wl51.m88497u0(str, '/') ? dq60.m36608h('`', "`", str) : str;
    }

    /* JADX INFO: renamed from: a */
    public final y400 m85354a() {
        y400 y400Var = this.f240966a;
        boolean zM95303c = y400Var.f269048a.m95303c();
        y400 y400Var2 = this.f240967b;
        if (zM95303c) {
            return y400Var2;
        }
        return new y400(y400Var.f269048a.f279080a + '.' + y400Var2.f269048a.f279080a);
    }

    /* JADX INFO: renamed from: b */
    public final String m85355b() {
        y400 y400Var = this.f240966a;
        boolean zM95303c = y400Var.f269048a.m95303c();
        y400 y400Var2 = this.f240967b;
        if (zM95303c) {
            return m85353c(y400Var2);
        }
        return y400Var.f269048a.f279080a.replace('.', '/') + "/" + m85353c(y400Var2);
    }

    /* JADX INFO: renamed from: d */
    public final vfe m85356d(qti0 qti0Var) {
        return new vfe(this.f240966a, this.f240967b.m92785a(qti0Var), this.f240968c);
    }

    /* JADX INFO: renamed from: e */
    public final vfe m85357e() {
        y400 y400VarM92786b = this.f240967b.m92786b();
        if (y400VarM92786b.f269048a.m95303c()) {
            return null;
        }
        return new vfe(this.f240966a, y400VarM92786b, this.f240968c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfe)) {
            return false;
        }
        vfe vfeVar = (vfe) obj;
        return wj50.m88271j(this.f240966a, vfeVar.f240966a) && wj50.m88271j(this.f240967b, vfeVar.f240967b) && this.f240968c == vfeVar.f240968c;
    }

    /* JADX INFO: renamed from: f */
    public final qti0 m85358f() {
        return this.f240967b.f269048a.m95306g();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m85359g() {
        return !this.f240967b.m92786b().f269048a.m95303c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240968c) + ((this.f240967b.hashCode() + (this.f240966a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.f240966a.f269048a.m95303c()) {
            return m85355b();
        }
        return "/" + m85355b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vfe(y400 y400Var, qti0 qti0Var) {
        this(y400Var, jfg1.m53199v(qti0Var), false);
        y400 y400Var2 = y400.f269047c;
    }
}
