package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class st51 {

    /* JADX INFO: renamed from: a */
    public final String f213820a;

    /* JADX INFO: renamed from: b */
    public final String f213821b;

    public st51(String str, String str2) {
        this.f213820a = str;
        this.f213821b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st51)) {
            return false;
        }
        st51 st51Var = (st51) obj;
        return wj50.m88271j(this.f213820a, st51Var.f213820a) && wj50.m88271j(this.f213821b, st51Var.f213821b);
    }

    public final int hashCode() {
        return this.f213821b.hashCode() + (this.f213820a.hashCode() * 31);
    }
}
