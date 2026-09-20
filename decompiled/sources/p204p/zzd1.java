package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zzd1 {

    /* JADX INFO: renamed from: a */
    public final String f287955a;

    /* JADX INFO: renamed from: b */
    public final ern0 f287956b;

    public zzd1(String str, ern0 ern0Var) {
        this.f287955a = str;
        this.f287956b = ern0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd1)) {
            return false;
        }
        zzd1 zzd1Var = (zzd1) obj;
        return wj50.m88271j(this.f287955a, zzd1Var.f287955a) && wj50.m88271j(this.f287956b, zzd1Var.f287956b);
    }

    public final int hashCode() {
        return this.f287956b.hashCode() + (this.f287955a.hashCode() * 31);
    }
}
