package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class br81 {

    /* JADX INFO: renamed from: d */
    public static final br81 f30015d = new br81(new ar81());

    /* JADX INFO: renamed from: e */
    public static final String f30016e;

    /* JADX INFO: renamed from: f */
    public static final String f30017f;

    /* JADX INFO: renamed from: g */
    public static final String f30018g;

    /* JADX INFO: renamed from: a */
    public final int f30019a;

    /* JADX INFO: renamed from: b */
    public final boolean f30020b;

    /* JADX INFO: renamed from: c */
    public final boolean f30021c;

    static {
        String str = h0b1.f86200a;
        f30016e = Integer.toString(1, 36);
        f30017f = Integer.toString(2, 36);
        f30018g = Integer.toString(3, 36);
    }

    public br81(ar81 ar81Var) {
        this.f30019a = ar81Var.f18976a;
        this.f30020b = ar81Var.f18977b;
        this.f30021c = ar81Var.f18978c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && br81.class == obj.getClass()) {
            br81 br81Var = (br81) obj;
            if (this.f30019a == br81Var.f30019a && this.f30020b == br81Var.f30020b && this.f30021c == br81Var.f30021c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f30019a + 31) * 31) + (this.f30020b ? 1 : 0)) * 31) + (this.f30021c ? 1 : 0);
    }
}
