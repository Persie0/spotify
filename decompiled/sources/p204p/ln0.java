package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ln0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final String f135062a;

    /* JADX INFO: renamed from: b */
    public final kqy f135063b;

    /* JADX INFO: renamed from: c */
    public final pqm0 f135064c;

    public ln0(String str, kqy kqyVar, pqm0 pqm0Var) {
        this.f135062a = str;
        this.f135063b = kqyVar;
        this.f135064c = pqm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln0)) {
            return false;
        }
        ln0 ln0Var = (ln0) obj;
        return wj50.m88271j(this.f135062a, ln0Var.f135062a) && wj50.m88271j(this.f135063b, ln0Var.f135063b) && wj50.m88271j(this.f135064c, ln0Var.f135064c);
    }

    public final int hashCode() {
        return this.f135064c.hashCode() + ((this.f135063b.hashCode() + (this.f135062a.hashCode() * 31)) * 31);
    }
}
