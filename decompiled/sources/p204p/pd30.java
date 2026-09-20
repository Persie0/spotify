package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final ro0 f176341a;

    public pd30(ro0 ro0Var) {
        this.f176341a = ro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd30) && wj50.m88271j(this.f176341a, ((pd30) obj).f176341a);
    }

    public final int hashCode() {
        return edb.m38547C(9) + (this.f176341a.hashCode() * 31);
    }
}
