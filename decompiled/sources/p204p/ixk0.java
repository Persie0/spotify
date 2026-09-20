package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ixk0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final b250 f106716a;

    public ixk0(b250 b250Var) {
        this.f106716a = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixk0) && this.f106716a.equals(((ixk0) obj).f106716a);
    }

    @Override // p204p.l630
    public final String getId() {
        return "offline-empty-banner";
    }

    public final int hashCode() {
        return this.f106716a.hashCode() + 1118119786;
    }
}
