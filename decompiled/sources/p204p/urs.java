package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class urs implements vrs {

    /* JADX INFO: renamed from: a */
    public final cg9 f233450a;

    public urs(cg9 cg9Var) {
        this.f233450a = cg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urs) && this.f233450a == ((urs) obj).f233450a;
    }

    public final int hashCode() {
        return this.f233450a.hashCode();
    }
}
