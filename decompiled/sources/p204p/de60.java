package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class de60 {

    /* JADX INFO: renamed from: f */
    public static final de60 f47973f = new de60(null, false);

    /* JADX INFO: renamed from: a */
    public final klk0 f47974a;

    /* JADX INFO: renamed from: b */
    public final doi0 f47975b;

    /* JADX INFO: renamed from: c */
    public final boolean f47976c;

    /* JADX INFO: renamed from: d */
    public final boolean f47977d;

    /* JADX INFO: renamed from: e */
    public final boolean f47978e;

    public de60(klk0 klk0Var, doi0 doi0Var, boolean z, boolean z2, boolean z3) {
        this.f47974a = klk0Var;
        this.f47975b = doi0Var;
        this.f47976c = z;
        this.f47977d = z2;
        this.f47978e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de60)) {
            return false;
        }
        de60 de60Var = (de60) obj;
        return this.f47974a == de60Var.f47974a && this.f47975b == de60Var.f47975b && this.f47976c == de60Var.f47976c && this.f47977d == de60Var.f47977d && this.f47978e == de60Var.f47978e;
    }

    public final int hashCode() {
        klk0 klk0Var = this.f47974a;
        int iHashCode = (klk0Var == null ? 0 : klk0Var.hashCode()) * 31;
        doi0 doi0Var = this.f47975b;
        return Boolean.hashCode(this.f47978e) + s571.m77245d(s571.m77245d((iHashCode + (doi0Var != null ? doi0Var.hashCode() : 0)) * 31, 31, this.f47976c), 31, this.f47977d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.f47974a);
        sb.append(", mutability=");
        sb.append(this.f47975b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f47976c);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.f47977d);
        sb.append(", isMutabilityQualifierForWarning=");
        return s571.m77253l(sb, this.f47978e, ')');
    }

    public /* synthetic */ de60(klk0 klk0Var, boolean z) {
        this(klk0Var, null, z, false, false);
    }
}
