package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hs91 {

    /* JADX INFO: renamed from: a */
    public final String f94641a;

    /* JADX INFO: renamed from: b */
    public final String f94642b;

    public hs91(String str, String str2) {
        this.f94641a = str;
        this.f94642b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs91)) {
            return false;
        }
        hs91 hs91Var = (hs91) obj;
        return wj50.m88271j(this.f94641a, hs91Var.f94641a) && wj50.m88271j(this.f94642b, hs91Var.f94642b);
    }

    public final int hashCode() {
        return this.f94642b.hashCode() + (this.f94641a.hashCode() * 31);
    }
}
