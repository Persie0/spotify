package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kl91 {

    /* JADX INFO: renamed from: a */
    public final String f123845a;

    /* JADX INFO: renamed from: b */
    public final int f123846b;

    public kl91(String str, int i) {
        this.f123845a = str;
        this.f123846b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl91)) {
            return false;
        }
        kl91 kl91Var = (kl91) obj;
        return wj50.m88271j(this.f123845a, kl91Var.f123845a) && this.f123846b == kl91Var.f123846b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f123846b) + (this.f123845a.hashCode() * 31);
    }
}
