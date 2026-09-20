package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sfn0 {

    /* JADX INFO: renamed from: a */
    public final tfn0 f208619a;

    /* JADX INFO: renamed from: b */
    public final rfn0 f208620b;

    public sfn0(tfn0 tfn0Var, rfn0 rfn0Var) {
        this.f208619a = tfn0Var;
        this.f208620b = rfn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfn0)) {
            return false;
        }
        sfn0 sfn0Var = (sfn0) obj;
        return wj50.m88271j(this.f208619a, sfn0Var.f208619a) && wj50.m88271j(this.f208620b, sfn0Var.f208620b);
    }

    public final int hashCode() {
        return this.f208620b.hashCode() + (this.f208619a.hashCode() * 31);
    }
}
