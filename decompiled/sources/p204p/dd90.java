package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dd90 {

    /* JADX INFO: renamed from: a */
    public final String f47749a;

    /* JADX INFO: renamed from: b */
    public final String f47750b;

    public dd90(String str, String str2) {
        this.f47749a = str;
        this.f47750b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd90)) {
            return false;
        }
        dd90 dd90Var = (dd90) obj;
        return wj50.m88271j(this.f47749a, dd90Var.f47749a) && wj50.m88271j(this.f47750b, dd90Var.f47750b);
    }

    public final int hashCode() {
        return this.f47750b.hashCode() + (this.f47749a.hashCode() * 31);
    }
}
