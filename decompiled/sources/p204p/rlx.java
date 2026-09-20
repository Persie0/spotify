package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rlx {

    /* JADX INFO: renamed from: a */
    public final String f200387a;

    /* JADX INFO: renamed from: b */
    public final ae50 f200388b;

    public rlx(String str, ae50 ae50Var) {
        this.f200387a = str;
        this.f200388b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlx)) {
            return false;
        }
        rlx rlxVar = (rlx) obj;
        return this.f200387a.equals(rlxVar.f200387a) && this.f200388b.equals(rlxVar.f200388b);
    }

    public final int hashCode() {
        return this.f200388b.hashCode() + (this.f200387a.hashCode() * 31);
    }
}
