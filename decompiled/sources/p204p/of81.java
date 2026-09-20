package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class of81 {

    /* JADX INFO: renamed from: a */
    public final String f164674a;

    /* JADX INFO: renamed from: b */
    public final String f164675b;

    public of81(String str, String str2) {
        this.f164674a = str;
        this.f164675b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of81)) {
            return false;
        }
        of81 of81Var = (of81) obj;
        return wj50.m88271j(this.f164674a, of81Var.f164674a) && wj50.m88271j(this.f164675b, of81Var.f164675b);
    }

    public final int hashCode() {
        return this.f164675b.hashCode() + (this.f164674a.hashCode() * 31);
    }
}
