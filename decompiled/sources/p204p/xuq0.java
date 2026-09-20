package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xuq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f266157a;

    /* JADX INFO: renamed from: b */
    public final String f266158b;

    public xuq0(String str, String str2) {
        this.f266157a = str;
        this.f266158b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuq0)) {
            return false;
        }
        xuq0 xuq0Var = (xuq0) obj;
        return wj50.m88271j(this.f266157a, xuq0Var.f266157a) && wj50.m88271j(this.f266158b, xuq0Var.f266158b);
    }

    public final int hashCode() {
        String str = this.f266157a;
        return this.f266158b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
