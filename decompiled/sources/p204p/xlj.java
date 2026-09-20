package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xlj implements zlj {

    /* JADX INFO: renamed from: a */
    public final int f263156a;

    /* JADX INFO: renamed from: b */
    public final dsf f263157b;

    public xlj(int i, dsf dsfVar) {
        this.f263156a = i;
        this.f263157b = dsfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlj)) {
            return false;
        }
        xlj xljVar = (xlj) obj;
        return this.f263156a == xljVar.f263156a && this.f263157b.equals(xljVar.f263157b);
    }

    public final int hashCode() {
        return this.f263157b.hashCode() + (edb.m38547C(this.f263156a) * 31);
    }
}
