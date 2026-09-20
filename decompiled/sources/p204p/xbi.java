package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xbi implements jci {

    /* JADX INFO: renamed from: a */
    public final j2d0 f259919a;

    public xbi(j2d0 j2d0Var) {
        this.f259919a = j2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbi) && wj50.m88271j(this.f259919a, ((xbi) obj).f259919a);
    }

    public final int hashCode() {
        return this.f259919a.hashCode();
    }
}
