package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t0d0 {

    /* JADX INFO: renamed from: a */
    public final zo2 f215846a;

    /* JADX INFO: renamed from: b */
    public final gpo f215847b;

    /* JADX INFO: renamed from: c */
    public final String f215848c;

    public t0d0(zo2 zo2Var, gpo gpoVar, String str) {
        this.f215846a = zo2Var;
        this.f215847b = gpoVar;
        this.f215848c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0d0)) {
            return false;
        }
        t0d0 t0d0Var = (t0d0) obj;
        return this.f215846a.equals(t0d0Var.f215846a) && this.f215847b.equals(t0d0Var.f215847b) && wj50.m88271j(this.f215848c, t0d0Var.f215848c);
    }

    public final int hashCode() {
        return this.f215848c.hashCode() + ((this.f215847b.hashCode() + (this.f215846a.hashCode() * 31)) * 31);
    }
}
