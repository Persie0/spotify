package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hz9 {

    /* JADX INFO: renamed from: a */
    public final String f96838a;

    /* JADX INFO: renamed from: b */
    public final boolean f96839b;

    public hz9(String str, boolean z) {
        this.f96838a = str;
        this.f96839b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz9)) {
            return false;
        }
        hz9 hz9Var = (hz9) obj;
        return wj50.m88271j(this.f96838a, hz9Var.f96838a) && this.f96839b == hz9Var.f96839b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96839b) + (this.f96838a.hashCode() * 31);
    }
}
