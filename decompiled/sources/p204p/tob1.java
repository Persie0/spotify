package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tob1 extends wob1 {

    /* JADX INFO: renamed from: a */
    public final int f222222a;

    /* JADX INFO: renamed from: b */
    public final String f222223b;

    public tob1(int i, String str) {
        this.f222222a = i;
        this.f222223b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tob1)) {
            return false;
        }
        tob1 tob1Var = (tob1) obj;
        return this.f222222a == tob1Var.f222222a && wj50.m88271j(this.f222223b, tob1Var.f222223b);
    }

    public final int hashCode() {
        return this.f222223b.hashCode() + (Integer.hashCode(this.f222222a) * 31);
    }
}
