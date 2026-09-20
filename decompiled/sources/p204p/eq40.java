package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class eq40 implements pjb1 {

    /* JADX INFO: renamed from: a */
    public final ro0 f61776a;

    public eq40(ro0 ro0Var) {
        this.f61776a = ro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq40) && wj50.m88271j(this.f61776a, ((eq40) obj).f61776a);
    }

    public final int hashCode() {
        return this.f61776a.hashCode();
    }
}
