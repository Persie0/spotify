package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mm40 implements pm40 {

    /* JADX INFO: renamed from: a */
    public final int f145046a;

    /* JADX INFO: renamed from: b */
    public final String f145047b;

    public mm40(int i, String str) {
        this.f145046a = i;
        this.f145047b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm40)) {
            return false;
        }
        mm40 mm40Var = (mm40) obj;
        return this.f145046a == mm40Var.f145046a && wj50.m88271j(this.f145047b, mm40Var.f145047b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f145046a) * 31;
        String str = this.f145047b;
        return iM38547C + (str == null ? 0 : str.hashCode());
    }
}
