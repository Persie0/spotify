package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class krq {

    /* JADX INFO: renamed from: a */
    public final v5m f125706a;

    /* JADX INFO: renamed from: b */
    public final wg61 f125707b;

    /* JADX INFO: renamed from: c */
    public final wg61 f125708c;

    /* JADX INFO: renamed from: d */
    public final wg61 f125709d;

    /* JADX INFO: renamed from: e */
    public final wg61 f125710e;

    public krq(v5m v5mVar, wg61 wg61Var, wg61 wg61Var2, wg61 wg61Var3, wg61 wg61Var4) {
        this.f125706a = v5mVar;
        this.f125707b = wg61Var;
        this.f125708c = wg61Var2;
        this.f125709d = wg61Var3;
        this.f125710e = wg61Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krq)) {
            return false;
        }
        krq krqVar = (krq) obj;
        return wj50.m88271j(this.f125706a, krqVar.f125706a) && this.f125707b.equals(krqVar.f125707b) && this.f125708c.equals(krqVar.f125708c) && this.f125709d.equals(krqVar.f125709d) && this.f125710e.equals(krqVar.f125710e);
    }

    public final int hashCode() {
        return this.f125710e.hashCode() + ((this.f125709d.hashCode() + ((this.f125708c.hashCode() + ((this.f125707b.hashCode() + (this.f125706a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
