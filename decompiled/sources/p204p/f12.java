package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f12 {

    /* JADX INFO: renamed from: a */
    public final String f64765a;

    /* JADX INFO: renamed from: b */
    public final String f64766b;

    public f12(String str, String str2) {
        this.f64765a = str;
        this.f64766b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f12)) {
            return false;
        }
        f12 f12Var = (f12) obj;
        return wj50.m88271j(this.f64765a, f12Var.f64765a) && wj50.m88271j(this.f64766b, f12Var.f64766b);
    }

    public final int hashCode() {
        return this.f64766b.hashCode() + (this.f64765a.hashCode() * 31);
    }
}
