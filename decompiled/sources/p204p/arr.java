package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class arr implements ojb1 {

    /* JADX INFO: renamed from: a */
    public final ro0 f19131a;

    /* JADX INFO: renamed from: b */
    public final boolean f19132b;

    public arr(ro0 ro0Var, boolean z) {
        this.f19131a = ro0Var;
        this.f19132b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arr)) {
            return false;
        }
        arr arrVar = (arr) obj;
        return wj50.m88271j(this.f19131a, arrVar.f19131a) && this.f19132b == arrVar.f19132b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19132b) + (this.f19131a.hashCode() * 31);
    }
}
