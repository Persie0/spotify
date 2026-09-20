package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xu0 {

    /* JADX INFO: renamed from: a */
    public final String f265963a;

    /* JADX INFO: renamed from: b */
    public final boolean f265964b;

    public xu0(String str, boolean z) {
        this.f265963a = str;
        this.f265964b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return wj50.m88271j(this.f265963a, xu0Var.f265963a) && this.f265964b == xu0Var.f265964b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265964b) + (this.f265963a.hashCode() * 31);
    }
}
