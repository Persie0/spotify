package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xl91 {

    /* JADX INFO: renamed from: c */
    public static final wwf f263070c = crs.m33745b(m191.f138883Q0);

    /* JADX INFO: renamed from: a */
    public final String f263071a;

    /* JADX INFO: renamed from: b */
    public final boolean f263072b;

    public xl91(String str, boolean z) {
        this.f263071a = str;
        this.f263072b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl91)) {
            return false;
        }
        xl91 xl91Var = (xl91) obj;
        return wj50.m88271j(this.f263071a, xl91Var.f263071a) && this.f263072b == xl91Var.f263072b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263072b) + (this.f263071a.hashCode() * 31);
    }
}
