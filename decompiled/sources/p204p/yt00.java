package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yt00 implements du00 {

    /* JADX INFO: renamed from: a */
    public final as00 f275918a;

    /* JADX INFO: renamed from: b */
    public final boolean f275919b;

    public yt00(as00 as00Var, boolean z) {
        this.f275918a = as00Var;
        this.f275919b = z;
    }

    /* JADX INFO: renamed from: a */
    public final as00 m94579a() {
        return this.f275918a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94580b() {
        return this.f275919b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt00)) {
            return false;
        }
        yt00 yt00Var = (yt00) obj;
        return wj50.m88271j(this.f275918a, yt00Var.f275918a) && this.f275919b == yt00Var.f275919b;
    }

    public final int hashCode() {
        as00 as00Var = this.f275918a;
        return Boolean.hashCode(this.f275919b) + ((as00Var == null ? 0 : as00Var.hashCode()) * 31);
    }
}
