package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tss {

    /* JADX INFO: renamed from: a */
    public final boolean f223426a;

    /* JADX INFO: renamed from: b */
    public final boolean f223427b;

    public tss(boolean z, boolean z2) {
        this.f223426a = z;
        this.f223427b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tss)) {
            return false;
        }
        tss tssVar = (tss) obj;
        return this.f223426a == tssVar.f223426a && this.f223427b == tssVar.f223427b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223427b) + (Boolean.hashCode(this.f223426a) * 31);
    }
}
