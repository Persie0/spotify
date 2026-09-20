package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i891 {

    /* JADX INFO: renamed from: a */
    public final int f99747a;

    /* JADX INFO: renamed from: b */
    public final zzq0 f99748b;

    /* JADX INFO: renamed from: c */
    public final zzq0 f99749c;

    public i891(int i, zzq0 zzq0Var, zzq0 zzq0Var2) {
        this.f99747a = i;
        this.f99748b = zzq0Var;
        this.f99749c = zzq0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final zzq0 m49941a() {
        return this.f99748b;
    }

    /* JADX INFO: renamed from: b */
    public final zzq0 m49942b() {
        return this.f99749c;
    }

    /* JADX INFO: renamed from: c */
    public final int m49943c() {
        return this.f99747a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i891)) {
            return false;
        }
        i891 i891Var = (i891) obj;
        return this.f99747a == i891Var.f99747a && wj50.m88271j(this.f99748b, i891Var.f99748b) && wj50.m88271j(this.f99749c, i891Var.f99749c);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f99747a) * 31;
        zzq0 zzq0Var = this.f99748b;
        int iHashCode = (iM38547C + (zzq0Var == null ? 0 : zzq0Var.hashCode())) * 31;
        zzq0 zzq0Var2 = this.f99749c;
        return iHashCode + (zzq0Var2 != null ? zzq0Var2.hashCode() : 0);
    }
}
