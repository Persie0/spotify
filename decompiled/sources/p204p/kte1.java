package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kte1 {

    /* JADX INFO: renamed from: a */
    public final int f126253a;

    /* JADX INFO: renamed from: b */
    public final String f126254b;

    public kte1(int i, String str) {
        this.f126253a = i;
        this.f126254b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kte1)) {
            return false;
        }
        kte1 kte1Var = (kte1) obj;
        return this.f126253a == kte1Var.f126253a && wj50.m88271j(this.f126254b, kte1Var.f126254b);
    }

    public final int hashCode() {
        return this.f126254b.hashCode() + (Integer.hashCode(this.f126253a) * 31);
    }
}
