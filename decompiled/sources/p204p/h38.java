package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h38 {

    /* JADX INFO: renamed from: a */
    public final String f87157a;

    /* JADX INFO: renamed from: b */
    public final String f87158b;

    /* JADX INFO: renamed from: c */
    public final boolean f87159c;

    public h38(String str, String str2, boolean z) {
        this.f87157a = str;
        this.f87158b = str2;
        this.f87159c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h38)) {
            return false;
        }
        h38 h38Var = (h38) obj;
        return wj50.m88271j(this.f87157a, h38Var.f87157a) && wj50.m88271j(this.f87158b, h38Var.f87158b) && this.f87159c == h38Var.f87159c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87159c) + s571.m77243b(this.f87157a.hashCode() * 31, 31, this.f87158b);
    }
}
