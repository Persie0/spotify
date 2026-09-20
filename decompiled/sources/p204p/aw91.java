package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aw91 {

    /* JADX INFO: renamed from: a */
    public final String f20439a;

    /* JADX INFO: renamed from: b */
    public final int f20440b;

    public aw91(String str, int i) {
        this.f20439a = str;
        this.f20440b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw91)) {
            return false;
        }
        aw91 aw91Var = (aw91) obj;
        return wj50.m88271j(this.f20439a, aw91Var.f20439a) && this.f20440b == aw91Var.f20440b;
    }

    public final int hashCode() {
        String str = this.f20439a;
        return Integer.hashCode(this.f20440b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
