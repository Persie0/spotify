package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y150 {

    /* JADX INFO: renamed from: a */
    public final String f268177a;

    /* JADX INFO: renamed from: b */
    public final String f268178b;

    public y150(String str, String str2) {
        this.f268177a = str;
        this.f268178b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y150)) {
            return false;
        }
        y150 y150Var = (y150) obj;
        return wj50.m88271j(this.f268177a, y150Var.f268177a) && wj50.m88271j(this.f268178b, y150Var.f268178b);
    }

    public final int hashCode() {
        int iHashCode = this.f268177a.hashCode() * 31;
        String str = this.f268178b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
