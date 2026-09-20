package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f99731a;

    /* JADX INFO: renamed from: b */
    public final boolean f99732b;

    public i88(int i, boolean z) {
        this.f99731a = i;
        this.f99732b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i88)) {
            return false;
        }
        i88 i88Var = (i88) obj;
        return this.f99731a == i88Var.f99731a && this.f99732b == i88Var.f99732b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99732b) + (Integer.hashCode(this.f99731a) * 31);
    }
}
