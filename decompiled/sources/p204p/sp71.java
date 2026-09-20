package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sp71 {

    /* JADX INFO: renamed from: a */
    public final wwu f212762a;

    /* JADX INFO: renamed from: b */
    public final boolean f212763b;

    public sp71(wwu wwuVar, boolean z) {
        this.f212762a = wwuVar;
        this.f212763b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp71)) {
            return false;
        }
        sp71 sp71Var = (sp71) obj;
        return wj50.m88271j(this.f212762a, sp71Var.f212762a) && this.f212763b == sp71Var.f212763b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212763b) + (this.f212762a.hashCode() * 31);
    }
}
