package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d4r implements f4r {

    /* JADX INFO: renamed from: a */
    public final l4e1 f45232a;

    public d4r(l4e1 l4e1Var) {
        this.f45232a = l4e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4r) && wj50.m88271j(this.f45232a, ((d4r) obj).f45232a);
    }

    public final int hashCode() {
        return this.f45232a.hashCode();
    }
}
