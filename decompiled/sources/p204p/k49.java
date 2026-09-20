package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k49 {

    /* JADX INFO: renamed from: a */
    public final Object f119137a;

    /* JADX INFO: renamed from: b */
    public final Object f119138b;

    public k49(Object obj, Object obj2) {
        this.f119137a = obj;
        this.f119138b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m55358a() {
        return this.f119138b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k49)) {
            return false;
        }
        k49 k49Var = (k49) obj;
        return wj50.m88271j(this.f119137a, k49Var.f119137a) && wj50.m88271j(this.f119138b, k49Var.f119138b);
    }

    public final int hashCode() {
        Object obj = this.f119137a;
        return this.f119138b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
