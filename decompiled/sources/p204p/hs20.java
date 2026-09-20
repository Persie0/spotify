package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hs20 {

    /* JADX INFO: renamed from: a */
    public final String f94586a;

    /* JADX INFO: renamed from: b */
    public final String f94587b;

    public hs20(String str, String str2) {
        this.f94586a = str;
        this.f94587b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs20)) {
            return false;
        }
        hs20 hs20Var = (hs20) obj;
        return wj50.m88271j(this.f94586a, hs20Var.f94586a) && wj50.m88271j(this.f94587b, hs20Var.f94587b);
    }

    public final int hashCode() {
        return this.f94587b.hashCode() + (this.f94586a.hashCode() * 31);
    }
}
