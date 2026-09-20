package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s9k implements Comparable {

    /* JADX INFO: renamed from: a */
    public final gf41 f206966a;

    public s9k(String str) {
        this.f206966a = (str == null || str.length() == 0) ? null : new gf41(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gf41 gf41Var = ((s9k) obj).f206966a;
        gf41 gf41Var2 = this.f206966a;
        if (gf41Var2 == null && gf41Var == null) {
            return 0;
        }
        if (gf41Var2 == null) {
            return -1;
        }
        if (gf41Var == null) {
            return 1;
        }
        return gf41Var2.compareTo(gf41Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s9k) {
            gf41 gf41Var = ((s9k) obj).f206966a;
            if (gf41Var != null ? gf41Var.m44579i(this.f206966a) : false) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        gf41 gf41Var = this.f206966a;
        if (gf41Var == null || (str = gf41Var.f79272e) == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        gf41 gf41Var = this.f206966a;
        String string = gf41Var != null ? gf41Var.toString() : null;
        return (string == null || string.length() == 0) ? "<empty>" : string;
    }
}
