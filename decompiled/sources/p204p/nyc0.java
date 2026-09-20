package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nyc0 implements uyc0 {

    /* JADX INFO: renamed from: a */
    public final zo2 f159778a;

    /* JADX INFO: renamed from: b */
    public final String f159779b;

    public nyc0(zo2 zo2Var, String str) {
        this.f159778a = zo2Var;
        this.f159779b = str;
    }

    /* JADX INFO: renamed from: a */
    public static nyc0 m65871a(nyc0 nyc0Var, zo2 zo2Var, String str, int i) {
        if ((i & 4) != 0) {
            str = nyc0Var.f159779b;
        }
        return new nyc0(zo2Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyc0)) {
            return false;
        }
        nyc0 nyc0Var = (nyc0) obj;
        return wj50.m88271j(this.f159778a, nyc0Var.f159778a) && wj50.m88271j(this.f159779b, nyc0Var.f159779b);
    }

    public final int hashCode() {
        int iHashCode = this.f159778a.hashCode() * 961;
        String str = this.f159779b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
