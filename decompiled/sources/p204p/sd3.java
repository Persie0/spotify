package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sd3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final wr31 f207869j;

    /* JADX INFO: renamed from: k */
    public final ns31 f207870k;

    public sd3(wr31 wr31Var, ns31 ns31Var) {
        this.f207869j = wr31Var;
        this.f207870k = ns31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return this.f207869j == sd3Var.f207869j && wj50.m88271j(this.f207870k, sd3Var.f207870k);
    }

    public final int hashCode() {
        return this.f207870k.hashCode() + (this.f207869j.hashCode() * 31);
    }
}
