package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cbi implements gbi {

    /* JADX INFO: renamed from: a */
    public final j2d0 f36135a;

    public cbi(j2d0 j2d0Var) {
        this.f36135a = j2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbi) && wj50.m88271j(this.f36135a, ((cbi) obj).f36135a);
    }

    public final int hashCode() {
        return this.f36135a.hashCode();
    }
}
