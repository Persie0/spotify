package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rfa0 {

    /* JADX INFO: renamed from: a */
    public final String f198557a;

    /* JADX INFO: renamed from: b */
    public final kga0 f198558b;

    /* JADX INFO: renamed from: c */
    public final String f198559c;

    public rfa0(String str, kga0 kga0Var, String str2) {
        this.f198557a = str;
        this.f198558b = kga0Var;
        this.f198559c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfa0)) {
            return false;
        }
        rfa0 rfa0Var = (rfa0) obj;
        return wj50.m88271j(this.f198557a, rfa0Var.f198557a) && wj50.m88271j(this.f198558b, rfa0Var.f198558b) && wj50.m88271j(this.f198559c, rfa0Var.f198559c);
    }

    public final int hashCode() {
        int iHashCode = (this.f198558b.hashCode() + (this.f198557a.hashCode() * 31)) * 31;
        String str = this.f198559c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
