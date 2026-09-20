package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kfe {

    /* JADX INFO: renamed from: a */
    public final pui0 f122144a;

    /* JADX INFO: renamed from: b */
    public final zzs0 f122145b;

    /* JADX INFO: renamed from: c */
    public final pf9 f122146c;

    /* JADX INFO: renamed from: d */
    public final du31 f122147d;

    public kfe(pui0 pui0Var, zzs0 zzs0Var, pf9 pf9Var, du31 du31Var) {
        this.f122144a = pui0Var;
        this.f122145b = zzs0Var;
        this.f122146c = pf9Var;
        this.f122147d = du31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfe)) {
            return false;
        }
        kfe kfeVar = (kfe) obj;
        return wj50.m88271j(this.f122144a, kfeVar.f122144a) && wj50.m88271j(this.f122145b, kfeVar.f122145b) && wj50.m88271j(this.f122146c, kfeVar.f122146c) && wj50.m88271j(this.f122147d, kfeVar.f122147d);
    }

    public final int hashCode() {
        return this.f122147d.hashCode() + ((this.f122146c.hashCode() + ((this.f122145b.hashCode() + (this.f122144a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f122144a + ", classProto=" + this.f122145b + ", metadataVersion=" + this.f122146c + ", sourceElement=" + this.f122147d + ')';
    }
}
