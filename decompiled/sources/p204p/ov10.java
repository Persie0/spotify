package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ov10 {

    /* JADX INFO: renamed from: a */
    public final String f170393a;

    /* JADX INFO: renamed from: b */
    public final boolean f170394b;

    public ov10(String str, boolean z) {
        this.f170393a = str;
        this.f170394b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov10)) {
            return false;
        }
        ov10 ov10Var = (ov10) obj;
        return wj50.m88271j(this.f170393a, ov10Var.f170393a) && this.f170394b == ov10Var.f170394b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170394b) + (this.f170393a.hashCode() * 31);
    }
}
