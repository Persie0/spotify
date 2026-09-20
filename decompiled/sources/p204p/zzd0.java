package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zzd0 {

    /* JADX INFO: renamed from: a */
    public final r1y f287953a;

    /* JADX INFO: renamed from: b */
    public final nzd0 f287954b;

    public zzd0(r1y r1yVar, nzd0 nzd0Var) {
        this.f287953a = r1yVar;
        this.f287954b = nzd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd0)) {
            return false;
        }
        zzd0 zzd0Var = (zzd0) obj;
        return wj50.m88271j(this.f287953a, zzd0Var.f287953a) && wj50.m88271j(this.f287954b, zzd0Var.f287954b);
    }

    public final int hashCode() {
        return this.f287954b.hashCode() + (this.f287953a.hashCode() * 31);
    }
}
