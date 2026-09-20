package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kxl extends lxl {

    /* JADX INFO: renamed from: a */
    public final String f127521a;

    public kxl(String str) {
        this.f127521a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxl) && wj50.m88271j(this.f127521a, ((kxl) obj).f127521a);
    }

    public final int hashCode() {
        String str = this.f127521a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
