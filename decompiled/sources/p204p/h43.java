package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h43 {

    /* JADX INFO: renamed from: a */
    public final boolean f87401a;

    /* JADX INFO: renamed from: b */
    public final waz0 f87402b;

    public h43(boolean z, waz0 waz0Var, int i) {
        z = (i & 1) != 0 ? false : z;
        waz0Var = (i & 2) != 0 ? null : waz0Var;
        this.f87401a = z;
        this.f87402b = waz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h43)) {
            return false;
        }
        h43 h43Var = (h43) obj;
        return this.f87401a == h43Var.f87401a && wj50.m88271j(this.f87402b, h43Var.f87402b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f87401a) * 31;
        waz0 waz0Var = this.f87402b;
        return iHashCode + (waz0Var == null ? 0 : waz0Var.hashCode());
    }
}
