package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i85 {

    /* JADX INFO: renamed from: a */
    public final bza f99694a;

    /* JADX INFO: renamed from: b */
    public final mza f99695b;

    public i85(bza bzaVar, mza mzaVar) {
        this.f99694a = bzaVar;
        this.f99695b = mzaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i85)) {
            return false;
        }
        i85 i85Var = (i85) obj;
        return wj50.m88271j(this.f99694a, i85Var.f99694a) && wj50.m88271j(this.f99695b, i85Var.f99695b);
    }

    public final int hashCode() {
        return this.f99695b.hashCode() + (this.f99694a.hashCode() * 31);
    }
}
