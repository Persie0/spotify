package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z0z implements c1z {

    /* JADX INFO: renamed from: a */
    public final String f278187a;

    /* JADX INFO: renamed from: b */
    public final boolean f278188b;

    public z0z(String str, boolean z) {
        this.f278187a = str;
        this.f278188b = z;
    }

    @Override // p204p.c1z
    /* JADX INFO: renamed from: a */
    public final boolean mo24468a() {
        return this.f278188b;
    }

    @Override // p204p.c1z
    /* JADX INFO: renamed from: b */
    public final int mo24469b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0z)) {
            return false;
        }
        z0z z0zVar = (z0z) obj;
        return wj50.m88271j(this.f278187a, z0zVar.f278187a) && this.f278188b == z0zVar.f278188b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278188b) + (this.f278187a.hashCode() * 31);
    }
}
