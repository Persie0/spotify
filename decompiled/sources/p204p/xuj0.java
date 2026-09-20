package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xuj0 {

    /* JADX INFO: renamed from: a */
    public final String f266123a;

    /* JADX INFO: renamed from: b */
    public final wuj0 f266124b;

    /* JADX INFO: renamed from: c */
    public final tuj0 f266125c;

    public xuj0(String str, wuj0 wuj0Var, tuj0 tuj0Var) {
        this.f266123a = str;
        this.f266124b = wuj0Var;
        this.f266125c = tuj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuj0)) {
            return false;
        }
        xuj0 xuj0Var = (xuj0) obj;
        return wj50.m88271j(this.f266123a, xuj0Var.f266123a) && wj50.m88271j(this.f266124b, xuj0Var.f266124b) && wj50.m88271j(this.f266125c, xuj0Var.f266125c);
    }

    public final int hashCode() {
        return this.f266125c.hashCode() + ((this.f266124b.hashCode() + (this.f266123a.hashCode() * 31)) * 31);
    }
}
