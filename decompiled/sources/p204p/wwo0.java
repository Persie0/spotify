package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wwo0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f255803a;

    /* JADX INFO: renamed from: b */
    public final rhj f255804b;

    /* JADX INFO: renamed from: c */
    public final boolean f255805c;

    public wwo0(Boolean bool, rhj rhjVar, boolean z) {
        this.f255803a = bool;
        this.f255804b = rhjVar;
        this.f255805c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwo0)) {
            return false;
        }
        wwo0 wwo0Var = (wwo0) obj;
        return wj50.m88271j(this.f255803a, wwo0Var.f255803a) && this.f255804b == wwo0Var.f255804b && this.f255805c == wwo0Var.f255805c;
    }

    public final int hashCode() {
        Boolean bool = this.f255803a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        rhj rhjVar = this.f255804b;
        return Boolean.hashCode(this.f255805c) + ((iHashCode + (rhjVar != null ? rhjVar.hashCode() : 0)) * 31);
    }
}
