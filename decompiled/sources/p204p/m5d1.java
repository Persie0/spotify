package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f140190a;

    /* JADX INFO: renamed from: b */
    public final boolean f140191b;

    public m5d1(String str, boolean z) {
        this.f140190a = str;
        this.f140191b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5d1)) {
            return false;
        }
        m5d1 m5d1Var = (m5d1) obj;
        return wj50.m88271j(this.f140190a, m5d1Var.f140190a) && this.f140191b == m5d1Var.f140191b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140191b) + (this.f140190a.hashCode() * 31);
    }
}
