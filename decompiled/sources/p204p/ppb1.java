package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ppb1 {

    /* JADX INFO: renamed from: a */
    public final int f180004a;

    /* JADX INFO: renamed from: b */
    public final int f180005b;

    public ppb1(int i, int i2) {
        this.f180004a = i;
        this.f180005b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppb1)) {
            return false;
        }
        ppb1 ppb1Var = (ppb1) obj;
        return this.f180004a == ppb1Var.f180004a && this.f180005b == ppb1Var.f180005b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180005b) + (Integer.hashCode(this.f180004a) * 31);
    }
}
