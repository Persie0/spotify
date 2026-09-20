package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h5s0 {

    /* JADX INFO: renamed from: a */
    public final String f87895a;

    /* JADX INFO: renamed from: b */
    public final float f87896b;

    public h5s0(String str, float f) {
        this.f87895a = str;
        this.f87896b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5s0)) {
            return false;
        }
        h5s0 h5s0Var = (h5s0) obj;
        return wj50.m88271j(this.f87895a, h5s0Var.f87895a) && ybs.m93301b(this.f87896b, h5s0Var.f87896b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f87896b) + (this.f87895a.hashCode() * 31);
    }
}
