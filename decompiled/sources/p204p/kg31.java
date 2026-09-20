package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final String f122293a;

    /* JADX INFO: renamed from: b */
    public final iz50 f122294b;

    public kg31(String str, iz50 iz50Var) {
        this.f122293a = str;
        this.f122294b = iz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg31)) {
            return false;
        }
        kg31 kg31Var = (kg31) obj;
        return wj50.m88271j(this.f122293a, kg31Var.f122293a) && this.f122294b == kg31Var.f122294b;
    }

    public final int hashCode() {
        return this.f122294b.hashCode() + (this.f122293a.hashCode() * 31);
    }
}
