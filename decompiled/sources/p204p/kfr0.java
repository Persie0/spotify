package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kfr0 {

    /* JADX INFO: renamed from: a */
    public final r6m0 f122217a;

    /* JADX INFO: renamed from: b */
    public final String f122218b;

    /* JADX INFO: renamed from: c */
    public final boolean f122219c;

    public kfr0(r6m0 r6m0Var, String str, boolean z) {
        this.f122217a = r6m0Var;
        this.f122218b = str;
        this.f122219c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfr0)) {
            return false;
        }
        kfr0 kfr0Var = (kfr0) obj;
        return this.f122217a == kfr0Var.f122217a && wj50.m88271j(this.f122218b, kfr0Var.f122218b) && this.f122219c == kfr0Var.f122219c;
    }

    public final int hashCode() {
        int iHashCode = this.f122217a.hashCode() * 31;
        String str = this.f122218b;
        return Boolean.hashCode(this.f122219c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
