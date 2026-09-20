package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o010 {

    /* JADX INFO: renamed from: a */
    public final boolean f160207a;

    /* JADX INFO: renamed from: b */
    public final String f160208b;

    /* JADX INFO: renamed from: c */
    public final k590 f160209c;

    /* JADX INFO: renamed from: d */
    public final boolean f160210d;

    public o010(boolean z, String str, k590 k590Var, boolean z2) {
        this.f160207a = z;
        this.f160208b = str;
        this.f160209c = k590Var;
        this.f160210d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static o010 m65970a(o010 o010Var, boolean z, String str, k590 k590Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = o010Var.f160207a;
        }
        if ((i & 2) != 0) {
            str = o010Var.f160208b;
        }
        if ((i & 4) != 0) {
            k590Var = o010Var.f160209c;
        }
        if ((i & 8) != 0) {
            z2 = o010Var.f160210d;
        }
        o010Var.getClass();
        return new o010(z, str, k590Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o010)) {
            return false;
        }
        o010 o010Var = (o010) obj;
        return this.f160207a == o010Var.f160207a && wj50.m88271j(this.f160208b, o010Var.f160208b) && this.f160209c == o010Var.f160209c && this.f160210d == o010Var.f160210d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f160207a) * 31;
        String str = this.f160208b;
        return Boolean.hashCode(this.f160210d) + ((this.f160209c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
