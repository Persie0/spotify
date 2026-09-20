package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u3b1 {

    /* JADX INFO: renamed from: a */
    public final Enum f226315a;

    /* JADX WARN: Multi-variable type inference failed */
    public u3b1(x3b1 x3b1Var) {
        this.f226315a = (Enum) x3b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3b1) && this.f226315a.equals(((u3b1) obj).f226315a);
    }

    public final int hashCode() {
        return this.f226315a.hashCode();
    }
}
