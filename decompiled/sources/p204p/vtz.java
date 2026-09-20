package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vtz {

    /* JADX INFO: renamed from: a */
    public final AbstractC1895gf f244794a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1895gf f244795b;

    public vtz() {
        ugu uguVar = ugu.f230259c;
        wgu wguVar = wgu.f251150c;
        this.f244794a = uguVar;
        this.f244795b = wguVar;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1895gf m86403a() {
        return this.f244795b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1895gf m86404b() {
        return this.f244794a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtz)) {
            return false;
        }
        vtz vtzVar = (vtz) obj;
        return wj50.m88271j(this.f244794a, vtzVar.f244794a) && wj50.m88271j(this.f244795b, vtzVar.f244795b);
    }

    public final int hashCode() {
        return (this.f244795b.hashCode() + (this.f244794a.hashCode() * 31)) * 31;
    }
}
