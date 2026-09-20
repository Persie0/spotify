package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wkp0 implements ykp0 {

    /* JADX INFO: renamed from: a */
    public final clp0 f252275a;

    /* JADX INFO: renamed from: b */
    public final clp0 f252276b;

    public wkp0(clp0 clp0Var, clp0 clp0Var2) {
        this.f252275a = clp0Var;
        this.f252276b = clp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkp0)) {
            return false;
        }
        wkp0 wkp0Var = (wkp0) obj;
        return wj50.m88271j(this.f252275a, wkp0Var.f252275a) && wj50.m88271j(this.f252276b, wkp0Var.f252276b);
    }

    @Override // p204p.ykp0
    public final clp0 getSender() {
        return this.f252275a;
    }

    public final int hashCode() {
        return this.f252276b.hashCode() + (this.f252275a.hashCode() * 31);
    }
}
