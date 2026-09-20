package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m2t implements p2t {

    /* JADX INFO: renamed from: a */
    public final boolean f139459a;

    /* JADX INFO: renamed from: b */
    public final boolean f139460b;

    public m2t(boolean z, boolean z2) {
        this.f139459a = z;
        this.f139460b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2t)) {
            return false;
        }
        m2t m2tVar = (m2t) obj;
        return this.f139459a == m2tVar.f139459a && this.f139460b == m2tVar.f139460b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139460b) + (Boolean.hashCode(this.f139459a) * 31);
    }
}
