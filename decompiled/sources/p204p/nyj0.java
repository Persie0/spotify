package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nyj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f159821a;

    /* JADX INFO: renamed from: b */
    public final String f159822b;

    public nyj0(boolean z, String str) {
        this.f159821a = z;
        this.f159822b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyj0)) {
            return false;
        }
        nyj0 nyj0Var = (nyj0) obj;
        return this.f159821a == nyj0Var.f159821a && wj50.m88271j(this.f159822b, nyj0Var.f159822b);
    }

    public final int hashCode() {
        return this.f159822b.hashCode() + (Boolean.hashCode(this.f159821a) * 31);
    }
}
