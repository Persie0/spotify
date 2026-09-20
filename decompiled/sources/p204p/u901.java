package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final db01 f228053a;

    public u901(db01 db01Var) {
        this.f228053a = db01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u901) && wj50.m88271j(this.f228053a, ((u901) obj).f228053a);
    }

    public final int hashCode() {
        return this.f228053a.hashCode();
    }
}
