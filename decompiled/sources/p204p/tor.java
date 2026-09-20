package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tor extends uor {

    /* JADX INFO: renamed from: a */
    public final udd1 f222313a;

    public tor(udd1 udd1Var) {
        this.f222313a = udd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tor) && wj50.m88271j(this.f222313a, ((tor) obj).f222313a);
    }

    public final int hashCode() {
        return this.f222313a.hashCode();
    }
}
