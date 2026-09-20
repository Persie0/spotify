package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class air0 {

    /* JADX INFO: renamed from: a */
    public final int f16084a;

    /* JADX INFO: renamed from: b */
    public final Integer f16085b;

    public air0(int i, Integer num) {
        this.f16084a = i;
        this.f16085b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof air0)) {
            return false;
        }
        air0 air0Var = (air0) obj;
        return this.f16084a == air0Var.f16084a && wj50.m88271j(this.f16085b, air0Var.f16085b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16084a) * 31;
        Integer num = this.f16085b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
