package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pdx extends cdx {

    /* JADX INFO: renamed from: a */
    public final d8z0 f176556a;

    public pdx(d8z0 d8z0Var) {
        this.f176556a = d8z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdx) && wj50.m88271j(this.f176556a, ((pdx) obj).f176556a);
    }

    public final int hashCode() {
        return this.f176556a.hashCode();
    }
}
