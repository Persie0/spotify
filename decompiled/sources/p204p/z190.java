package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z190 {

    /* JADX INFO: renamed from: a */
    public final bv41 f278263a;

    /* JADX INFO: renamed from: b */
    public final r9k f278264b;

    /* JADX INFO: renamed from: c */
    public final y190 f278265c;

    public z190(bv41 bv41Var, r9k r9kVar, y190 y190Var) {
        this.f278263a = bv41Var;
        this.f278264b = r9kVar;
        this.f278265c = y190Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z190)) {
            return false;
        }
        z190 z190Var = (z190) obj;
        return this.f278263a == z190Var.f278263a && wj50.m88271j(this.f278264b, z190Var.f278264b) && wj50.m88271j(this.f278265c, z190Var.f278265c);
    }

    public final int hashCode() {
        return this.f278265c.hashCode() + ((this.f278264b.hashCode() + (this.f278263a.hashCode() * 31)) * 31);
    }
}
