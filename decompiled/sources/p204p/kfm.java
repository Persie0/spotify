package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kfm implements moa {

    /* JADX INFO: renamed from: a */
    public final rq91 f122184a;

    public kfm(rq91 rq91Var) {
        this.f122184a = rq91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfm) && this.f122184a.equals(((kfm) obj).f122184a);
    }

    @Override // p204p.moa
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122184a.f201781b) + 1882756385;
    }
}
