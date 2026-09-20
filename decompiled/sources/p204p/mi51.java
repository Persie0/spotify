package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mi51 implements ri51 {

    /* JADX INFO: renamed from: a */
    public final ni51 f143943a;

    public mi51(ni51 ni51Var) {
        this.f143943a = ni51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi51) && wj50.m88271j(this.f143943a, ((mi51) obj).f143943a);
    }

    public final int hashCode() {
        return this.f143943a.hashCode();
    }
}
