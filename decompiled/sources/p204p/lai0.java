package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lai0 {

    /* JADX INFO: renamed from: a */
    public final String f131347a;

    /* JADX INFO: renamed from: b */
    public final int f131348b;

    public lai0(String str, int i) {
        this.f131347a = str;
        this.f131348b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lai0)) {
            return false;
        }
        lai0 lai0Var = (lai0) obj;
        return wj50.m88271j(this.f131347a, lai0Var.f131347a) && this.f131348b == lai0Var.f131348b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131348b) + (this.f131347a.hashCode() * 31);
    }
}
