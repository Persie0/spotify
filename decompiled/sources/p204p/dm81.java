package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dm81 implements vqt0 {

    /* JADX INFO: renamed from: a */
    public final kb81 f50475a;

    /* JADX INFO: renamed from: b */
    public final String f50476b;

    public dm81(kb81 kb81Var) {
        this.f50475a = kb81Var;
        this.f50476b = kb81Var.f121133a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm81) && this.f50475a.equals(((dm81) obj).f50475a);
    }

    @Override // p204p.vqt0
    public final String getId() {
        return this.f50476b;
    }

    public final int hashCode() {
        return this.f50475a.hashCode() * 31;
    }
}
