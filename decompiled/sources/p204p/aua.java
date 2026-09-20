package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class aua {

    /* JADX INFO: renamed from: a */
    public final boolean f19897a;

    /* JADX INFO: renamed from: b */
    public final boolean f19898b;

    /* JADX INFO: renamed from: c */
    public final boolean f19899c;

    public aua(boolean z, boolean z2, boolean z3) {
        this.f19897a = z;
        this.f19898b = z2;
        this.f19899c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aua)) {
            return false;
        }
        aua auaVar = (aua) obj;
        return this.f19897a == auaVar.f19897a && this.f19898b == auaVar.f19898b && this.f19899c == auaVar.f19899c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19899c) + s571.m77245d(Boolean.hashCode(this.f19897a) * 31, 31, this.f19898b);
    }
}
