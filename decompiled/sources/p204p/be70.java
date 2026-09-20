package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class be70 {

    /* JADX INFO: renamed from: c */
    public static final wwf f26295c = crs.m33745b(sd70.f207917W0);

    /* JADX INFO: renamed from: a */
    public final int f26296a;

    /* JADX INFO: renamed from: b */
    public final Boolean f26297b;

    public be70(int i, int i2) {
        Boolean bool = (i2 & 4) != 0 ? null : Boolean.TRUE;
        this.f26296a = i;
        this.f26297b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be70)) {
            return false;
        }
        be70 be70Var = (be70) obj;
        return this.f26296a == be70Var.f26296a && wj50.m88271j(this.f26297b, be70Var.f26297b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f26296a) * 961;
        Boolean bool = this.f26297b;
        return (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
    }
}
