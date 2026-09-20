package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class khy {

    /* JADX INFO: renamed from: a */
    public final String f122737a;

    /* JADX INFO: renamed from: b */
    public final zgy f122738b;

    /* JADX INFO: renamed from: c */
    public final long f122739c;

    /* JADX INFO: renamed from: d */
    public final ghy f122740d;

    public khy(String str, zgy zgyVar, long j, ghy ghyVar) {
        this.f122737a = str;
        this.f122738b = zgyVar;
        this.f122739c = j;
        this.f122740d = ghyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khy)) {
            return false;
        }
        khy khyVar = (khy) obj;
        return wj50.m88271j(this.f122737a, khyVar.f122737a) && wj50.m88271j(this.f122738b, khyVar.f122738b) && this.f122739c == khyVar.f122739c && wj50.m88271j(this.f122740d, khyVar.f122740d);
    }

    public final int hashCode() {
        return this.f122740d.hashCode() + dq60.m36605e((this.f122738b.hashCode() + (this.f122737a.hashCode() * 31)) * 31, this.f122739c, 31);
    }
}
