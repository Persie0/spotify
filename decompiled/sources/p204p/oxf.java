package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oxf {

    /* JADX INFO: renamed from: a */
    public final ovf f170972a;

    /* JADX INFO: renamed from: b */
    public final int f170973b;

    /* JADX INFO: renamed from: c */
    public final Object f170974c;

    public oxf(ovf ovfVar, int i, Object obj) {
        this.f170972a = ovfVar;
        this.f170973b = i;
        this.f170974c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxf)) {
            return false;
        }
        oxf oxfVar = (oxf) obj;
        return wj50.m88271j(this.f170972a, oxfVar.f170972a) && this.f170973b == oxfVar.f170973b && wj50.m88271j(this.f170974c, oxfVar.f170974c);
    }

    public final int hashCode() {
        return this.f170974c.hashCode() + mt60.m62800g(this.f170973b, this.f170972a.hashCode() * 31, 31);
    }
}
