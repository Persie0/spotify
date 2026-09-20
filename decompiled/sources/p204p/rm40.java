package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rm40 implements sm40 {

    /* JADX INFO: renamed from: a */
    public final scy0 f200433a;

    public rm40(scy0 scy0Var) {
        this.f200433a = scy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm40) && wj50.m88271j(this.f200433a, ((rm40) obj).f200433a);
    }

    public final int hashCode() {
        return this.f200433a.hashCode();
    }
}
