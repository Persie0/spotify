package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vrt0 {

    /* JADX INFO: renamed from: a */
    public final String f244246a;

    /* JADX INFO: renamed from: b */
    public final Integer f244247b;

    /* JADX INFO: renamed from: c */
    public final boolean f244248c;

    public vrt0(Integer num, String str, boolean z) {
        this.f244246a = str;
        this.f244247b = num;
        this.f244248c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrt0)) {
            return false;
        }
        vrt0 vrt0Var = (vrt0) obj;
        return wj50.m88271j(this.f244246a, vrt0Var.f244246a) && wj50.m88271j(this.f244247b, vrt0Var.f244247b) && this.f244248c == vrt0Var.f244248c;
    }

    public final int hashCode() {
        int iHashCode = this.f244246a.hashCode() * 31;
        Integer num = this.f244247b;
        return Boolean.hashCode(this.f244248c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public /* synthetic */ vrt0(String str) {
        this(null, str, true);
    }
}
