package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kqx {

    /* JADX INFO: renamed from: a */
    public final tl11 f125470a;

    /* JADX INFO: renamed from: b */
    public final int f125471b;

    public kqx(tl11 tl11Var, int i) {
        this.f125470a = tl11Var;
        this.f125471b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqx)) {
            return false;
        }
        kqx kqxVar = (kqx) obj;
        return wj50.m88271j(this.f125470a, kqxVar.f125470a) && this.f125471b == kqxVar.f125471b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f125471b) + (this.f125470a.hashCode() * 31);
    }
}
