package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hi80 {

    /* JADX INFO: renamed from: a */
    public final di80 f91738a;

    /* JADX INFO: renamed from: b */
    public final x18 f91739b;

    public hi80(di80 di80Var, x18 x18Var) {
        this.f91738a = di80Var;
        this.f91739b = x18Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi80)) {
            return false;
        }
        hi80 hi80Var = (hi80) obj;
        return wj50.m88271j(this.f91738a, hi80Var.f91738a) && wj50.m88271j(this.f91739b, hi80Var.f91739b);
    }

    public final int hashCode() {
        return this.f91739b.hashCode() + (this.f91738a.hashCode() * 31);
    }

    public /* synthetic */ hi80(di80 di80Var) {
        this(di80Var, x18.f257082h);
    }
}
