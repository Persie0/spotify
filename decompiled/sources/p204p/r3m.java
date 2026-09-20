package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r3m implements u3m {

    /* JADX INFO: renamed from: a */
    public final boolean f195520a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1895gf f195521b;

    /* JADX INFO: renamed from: c */
    public final boolean f195522c;

    public r3m(boolean z, AbstractC1895gf abstractC1895gf, boolean z2) {
        this.f195520a = z;
        this.f195521b = abstractC1895gf;
        this.f195522c = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74676a() {
        return this.f195522c;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1895gf m74677b() {
        return this.f195521b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3m)) {
            return false;
        }
        r3m r3mVar = (r3m) obj;
        return this.f195520a == r3mVar.f195520a && wj50.m88271j(this.f195521b, r3mVar.f195521b) && this.f195522c == r3mVar.f195522c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195522c) + ((this.f195521b.hashCode() + (Boolean.hashCode(this.f195520a) * 31)) * 31);
    }
}
