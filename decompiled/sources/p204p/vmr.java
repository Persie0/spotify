package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vmr extends pnr {

    /* JADX INFO: renamed from: a */
    public final ppr f242911a;

    /* JADX INFO: renamed from: b */
    public final String f242912b;

    /* JADX INFO: renamed from: c */
    public final boolean f242913c;

    public vmr(ppr pprVar, String str, boolean z) {
        this.f242911a = pprVar;
        this.f242912b = str;
        this.f242913c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmr)) {
            return false;
        }
        vmr vmrVar = (vmr) obj;
        return wj50.m88271j(this.f242911a, vmrVar.f242911a) && wj50.m88271j(this.f242912b, vmrVar.f242912b) && this.f242913c == vmrVar.f242913c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242913c) + s571.m77243b(this.f242911a.hashCode() * 31, 31, this.f242912b);
    }
}
