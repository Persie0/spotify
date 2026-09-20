package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wix0 {

    /* JADX INFO: renamed from: a */
    public final jl31 f251768a;

    /* JADX INFO: renamed from: b */
    public final v140 f251769b;

    /* JADX INFO: renamed from: c */
    public final v140 f251770c;

    public wix0(jl31 jl31Var, v140 v140Var, v140 v140Var2) {
        this.f251768a = jl31Var;
        this.f251769b = v140Var;
        this.f251770c = v140Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wix0)) {
            return false;
        }
        wix0 wix0Var = (wix0) obj;
        return wj50.m88271j(this.f251768a, wix0Var.f251768a) && wj50.m88271j(this.f251769b, wix0Var.f251769b) && wj50.m88271j(this.f251770c, wix0Var.f251770c);
    }

    public final int hashCode() {
        int iHashCode = (this.f251769b.hashCode() + (this.f251768a.f113477a.hashCode() * 31)) * 31;
        v140 v140Var = this.f251770c;
        return iHashCode + (v140Var == null ? 0 : v140Var.hashCode());
    }
}
