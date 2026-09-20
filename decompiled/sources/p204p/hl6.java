package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hl6 {

    /* JADX INFO: renamed from: a */
    public final String f92621a;

    /* JADX INFO: renamed from: b */
    public final String f92622b;

    public hl6(String str, String str2) {
        this.f92621a = str;
        this.f92622b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl6)) {
            return false;
        }
        hl6 hl6Var = (hl6) obj;
        return wj50.m88271j(this.f92621a, hl6Var.f92621a) && wj50.m88271j(this.f92622b, hl6Var.f92622b);
    }

    public final int hashCode() {
        int iHashCode = this.f92621a.hashCode() * 31;
        String str = this.f92622b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
