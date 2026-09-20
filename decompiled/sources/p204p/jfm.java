package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jfm implements l630 {

    /* JADX INFO: renamed from: a */
    public final b250 f111937a;

    public jfm(b250 b250Var) {
        this.f111937a = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfm) && this.f111937a.equals(((jfm) obj).f111937a);
    }

    @Override // p204p.l630
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return this.f111937a.hashCode() + 1882756385;
    }
}
