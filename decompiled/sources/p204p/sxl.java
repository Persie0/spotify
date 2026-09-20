package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sxl extends txl {

    /* JADX INFO: renamed from: a */
    public final String f214909a;

    public sxl(String str) {
        this.f214909a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxl) && wj50.m88271j(this.f214909a, ((sxl) obj).f214909a);
    }

    public final int hashCode() {
        String str = this.f214909a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
