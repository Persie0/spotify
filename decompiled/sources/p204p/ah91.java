package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ah91 {

    /* JADX INFO: renamed from: a */
    public final int f15645a;

    /* JADX INFO: renamed from: b */
    public final zg91 f15646b;

    /* JADX INFO: renamed from: c */
    public final Integer f15647c;

    public ah91(int i, zg91 zg91Var, Integer num) {
        this.f15645a = i;
        this.f15646b = zg91Var;
        this.f15647c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah91)) {
            return false;
        }
        ah91 ah91Var = (ah91) obj;
        return this.f15645a == ah91Var.f15645a && this.f15646b.equals(ah91Var.f15646b) && wj50.m88271j(this.f15647c, ah91Var.f15647c);
    }

    public final int hashCode() {
        int iHashCode = (this.f15646b.hashCode() + (Integer.hashCode(this.f15645a) * 31)) * 31;
        Integer num = this.f15647c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
