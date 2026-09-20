package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pu10 {

    /* JADX INFO: renamed from: a */
    public final int f181301a;

    /* JADX INFO: renamed from: b */
    public final String f181302b;

    /* JADX INFO: renamed from: c */
    public final String f181303c;

    public pu10(int i, String str, String str2) {
        this.f181301a = i;
        this.f181302b = str;
        this.f181303c = str2;
    }

    /* JADX INFO: renamed from: a */
    public static pu10 m71054a(pu10 pu10Var, int i) {
        String str = pu10Var.f181302b;
        String str2 = pu10Var.f181303c;
        pu10Var.getClass();
        return new pu10(i, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final String m71055b() {
        return this.f181303c;
    }

    /* JADX INFO: renamed from: c */
    public final int m71056c() {
        return this.f181301a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu10)) {
            return false;
        }
        pu10 pu10Var = (pu10) obj;
        return this.f181301a == pu10Var.f181301a && this.f181302b.equals(pu10Var.f181302b) && this.f181303c.equals(pu10Var.f181303c);
    }

    public final int hashCode() {
        return this.f181303c.hashCode() + s571.m77243b(edb.m38547C(this.f181301a) * 31, 31, this.f181302b);
    }
}
