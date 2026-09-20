package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tap0 {

    /* JADX INFO: renamed from: a */
    public final xam f218648a;

    /* JADX INFO: renamed from: b */
    public final String f218649b;

    public tap0(xam xamVar, String str) {
        this.f218648a = xamVar;
        this.f218649b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tap0)) {
            return false;
        }
        tap0 tap0Var = (tap0) obj;
        return wj50.m88271j(this.f218648a, tap0Var.f218648a) && wj50.m88271j(this.f218649b, tap0Var.f218649b);
    }

    public final int hashCode() {
        int iHashCode = this.f218648a.hashCode() * 31;
        String str = this.f218649b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
