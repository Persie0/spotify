package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final String f258680a;

    /* JADX INFO: renamed from: b */
    public final boolean f258681b;

    public x6i(String str, boolean z) {
        this.f258680a = str;
        this.f258681b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6i)) {
            return false;
        }
        x6i x6iVar = (x6i) obj;
        return wj50.m88271j(this.f258680a, x6iVar.f258680a) && this.f258681b == x6iVar.f258681b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258681b) + (this.f258680a.hashCode() * 31);
    }
}
