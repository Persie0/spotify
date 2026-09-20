package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f140939a;

    /* JADX INFO: renamed from: b */
    public final boolean f140940b;

    public m88(int i, boolean z) {
        this.f140939a = i;
        this.f140940b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m88)) {
            return false;
        }
        m88 m88Var = (m88) obj;
        return this.f140939a == m88Var.f140939a && this.f140940b == m88Var.f140940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140940b) + (Integer.hashCode(this.f140939a) * 31);
    }
}
