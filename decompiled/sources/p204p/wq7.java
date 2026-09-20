package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wq7 {

    /* JADX INFO: renamed from: a */
    public final vq7 f253937a;

    /* JADX INFO: renamed from: b */
    public final er7 f253938b;

    public wq7(vq7 vq7Var, er7 er7Var) {
        this.f253937a = vq7Var;
        this.f253938b = er7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq7)) {
            return false;
        }
        wq7 wq7Var = (wq7) obj;
        return wj50.m88271j(this.f253937a, wq7Var.f253937a) && wj50.m88271j(this.f253938b, wq7Var.f253938b);
    }

    public final int hashCode() {
        vq7 vq7Var = this.f253937a;
        return this.f253938b.hashCode() + ((vq7Var == null ? 0 : vq7Var.hashCode()) * 31);
    }
}
