package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eq81 {

    /* JADX INFO: renamed from: a */
    public final aq81 f61813a;

    public eq81(aq81 aq81Var) {
        this.f61813a = aq81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq81) && this.f61813a == ((eq81) obj).f61813a;
    }

    public final int hashCode() {
        return this.f61813a.hashCode();
    }
}
