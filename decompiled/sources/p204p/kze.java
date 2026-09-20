package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kze {

    /* JADX INFO: renamed from: a */
    public final lwb1 f128093a;

    public kze(lwb1 lwb1Var) {
        this.f128093a = lwb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kze) && this.f128093a.equals(((kze) obj).f128093a);
    }

    public final int hashCode() {
        return this.f128093a.hashCode();
    }
}
