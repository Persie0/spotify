package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tte1 implements vte1 {

    /* JADX INFO: renamed from: a */
    public final int f223582a;

    /* JADX INFO: renamed from: b */
    public final String f223583b;

    public tte1(int i, String str) {
        this.f223582a = i;
        this.f223583b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tte1)) {
            return false;
        }
        tte1 tte1Var = (tte1) obj;
        return this.f223582a == tte1Var.f223582a && wj50.m88271j(this.f223583b, tte1Var.f223583b);
    }

    public final int hashCode() {
        return this.f223583b.hashCode() + (Integer.hashCode(this.f223582a) * 31);
    }
}
