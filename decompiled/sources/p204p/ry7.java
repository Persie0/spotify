package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ry7 extends zuf {

    /* JADX INFO: renamed from: a */
    public final x08 f203826a;

    public ry7(x08 x08Var) {
        yuf yufVar = yuf.f276337a;
        this.f203826a = x08Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zuf)) {
            return false;
        }
        if (!this.f203826a.equals(((ry7) ((zuf) obj)).f203826a)) {
            return false;
        }
        Object obj2 = yuf.f276337a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f203826a.hashCode() ^ 1000003) * 1000003) ^ yuf.f276337a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f203826a + ", productIdOrigin=" + yuf.f276337a + "}";
    }
}
