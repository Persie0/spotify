package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class skd0 {

    /* JADX INFO: renamed from: a */
    public final li80 f210079a;

    public skd0(li80 li80Var) {
        this.f210079a = li80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skd0) && this.f210079a.equals(((skd0) obj).f210079a);
    }

    public final int hashCode() {
        return this.f210079a.hashCode() + (Integer.hashCode(10) * 31);
    }
}
