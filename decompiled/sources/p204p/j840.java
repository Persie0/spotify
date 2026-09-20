package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j840 implements l840 {

    /* JADX INFO: renamed from: a */
    public final z840 f109789a;

    /* JADX INFO: renamed from: b */
    public final String f109790b;

    public j840(z840 z840Var, String str) {
        this.f109789a = z840Var;
        this.f109790b = str;
    }

    @Override // p204p.l840
    /* JADX INFO: renamed from: a */
    public final String mo43945a() {
        return this.f109790b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j840)) {
            return false;
        }
        j840 j840Var = (j840) obj;
        return wj50.m88271j(this.f109789a, j840Var.f109789a) && wj50.m88271j(this.f109790b, j840Var.f109790b);
    }

    public final int hashCode() {
        return this.f109790b.hashCode() + (this.f109789a.hashCode() * 31);
    }
}
