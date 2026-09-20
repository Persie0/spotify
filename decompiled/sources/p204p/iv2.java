package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class iv2 {

    /* JADX INFO: renamed from: a */
    public final wls0 f106071a;

    /* JADX INFO: renamed from: b */
    public final String f106072b;

    /* JADX INFO: renamed from: c */
    public final boolean f106073c;

    public iv2(wls0 wls0Var, String str, boolean z) {
        this.f106071a = wls0Var;
        this.f106072b = str;
        this.f106073c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv2)) {
            return false;
        }
        iv2 iv2Var = (iv2) obj;
        return wj50.m88271j(this.f106071a, iv2Var.f106071a) && wj50.m88271j(this.f106072b, iv2Var.f106072b) && this.f106073c == iv2Var.f106073c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106073c) + s571.m77243b(this.f106071a.hashCode() * 31, 31, this.f106072b);
    }
}
