package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zpw0 {

    /* JADX INFO: renamed from: a */
    public final String f285244a;

    /* JADX INFO: renamed from: b */
    public final boolean f285245b;

    public zpw0(String str, boolean z) {
        this.f285244a = str;
        this.f285245b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpw0)) {
            return false;
        }
        zpw0 zpw0Var = (zpw0) obj;
        return wj50.m88271j(this.f285244a, zpw0Var.f285244a) && this.f285245b == zpw0Var.f285245b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285245b) + (this.f285244a.hashCode() * 31);
    }
}
