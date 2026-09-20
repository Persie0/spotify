package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m7k {

    /* JADX INFO: renamed from: a */
    public final boolean f140794a;

    /* JADX INFO: renamed from: b */
    public final boolean f140795b;

    /* JADX INFO: renamed from: c */
    public final boolean f140796c;

    public m7k(boolean z, boolean z2, boolean z3) {
        this.f140794a = z;
        this.f140795b = z2;
        this.f140796c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7k)) {
            return false;
        }
        m7k m7kVar = (m7k) obj;
        return this.f140794a == m7kVar.f140794a && this.f140795b == m7kVar.f140795b && this.f140796c == m7kVar.f140796c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140796c) + s571.m77245d(Boolean.hashCode(this.f140794a) * 31, 31, this.f140795b);
    }
}
