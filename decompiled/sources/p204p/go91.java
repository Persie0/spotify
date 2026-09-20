package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class go91 {

    /* JADX INFO: renamed from: a */
    public final bo91 f82918a;

    /* JADX INFO: renamed from: b */
    public final be60 f82919b;

    public go91(bo91 bo91Var, be60 be60Var) {
        this.f82918a = bo91Var;
        this.f82919b = be60Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go91)) {
            return false;
        }
        go91 go91Var = (go91) obj;
        return wj50.m88271j(go91Var.f82918a, this.f82918a) && wj50.m88271j(go91Var.f82919b, this.f82919b);
    }

    public final int hashCode() {
        int iHashCode = this.f82918a.hashCode();
        return this.f82919b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f82918a + ", typeAttr=" + this.f82919b + ')';
    }
}
