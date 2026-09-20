package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d760 implements e760 {

    /* JADX INFO: renamed from: a */
    public final int f46002a;

    /* JADX INFO: renamed from: b */
    public final String f46003b;

    public d760(int i, String str) {
        this.f46002a = i;
        this.f46003b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m35184a() {
        return this.f46002a;
    }

    /* JADX INFO: renamed from: b */
    public final String m35185b() {
        return this.f46003b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d760)) {
            return false;
        }
        d760 d760Var = (d760) obj;
        return this.f46002a == d760Var.f46002a && wj50.m88271j(this.f46003b, d760Var.f46003b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f46002a) * 31;
        String str = this.f46003b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
