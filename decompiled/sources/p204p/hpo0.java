package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hpo0 {

    /* JADX INFO: renamed from: a */
    public final gpo0 f93822a;

    /* JADX INFO: renamed from: b */
    public final boolean f93823b;

    public /* synthetic */ hpo0(gpo0 gpo0Var, int i) {
        this((i & 1) != 0 ? dpo0.f51377a : gpo0Var, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpo0)) {
            return false;
        }
        hpo0 hpo0Var = (hpo0) obj;
        return wj50.m88271j(this.f93822a, hpo0Var.f93822a) && this.f93823b == hpo0Var.f93823b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93823b) + (this.f93822a.hashCode() * 31);
    }

    public hpo0(gpo0 gpo0Var, boolean z) {
        this.f93822a = gpo0Var;
        this.f93823b = z;
    }
}
