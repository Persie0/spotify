package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iu40 {

    /* JADX INFO: renamed from: a */
    public final String f105858a;

    /* JADX INFO: renamed from: b */
    public final String f105859b;

    public iu40(String str, String str2) {
        this.f105858a = str;
        this.f105859b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu40)) {
            return false;
        }
        iu40 iu40Var = (iu40) obj;
        return wj50.m88271j(this.f105858a, iu40Var.f105858a) && wj50.m88271j(this.f105859b, iu40Var.f105859b);
    }

    public final int hashCode() {
        return this.f105859b.hashCode() + (this.f105858a.hashCode() * 31);
    }
}
