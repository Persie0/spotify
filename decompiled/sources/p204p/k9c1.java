package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k9c1 {

    /* JADX INFO: renamed from: d */
    public static final k9c1 f120559d = new k9c1(0, 0);

    /* JADX INFO: renamed from: e */
    public static final String f120560e;

    /* JADX INFO: renamed from: f */
    public static final String f120561f;

    /* JADX INFO: renamed from: g */
    public static final String f120562g;

    /* JADX INFO: renamed from: a */
    public final int f120563a;

    /* JADX INFO: renamed from: b */
    public final int f120564b;

    /* JADX INFO: renamed from: c */
    public final float f120565c;

    static {
        String str = h0b1.f86200a;
        f120560e = Integer.toString(0, 36);
        f120561f = Integer.toString(1, 36);
        f120562g = Integer.toString(3, 36);
    }

    public k9c1(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k9c1) {
            k9c1 k9c1Var = (k9c1) obj;
            if (this.f120563a == k9c1Var.f120563a && this.f120564b == k9c1Var.f120564b && this.f120565c == k9c1Var.f120565c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f120565c) + ((((217 + this.f120563a) * 31) + this.f120564b) * 31);
    }

    public k9c1(int i, int i2, float f) {
        this.f120563a = i;
        this.f120564b = i2;
        this.f120565c = f;
    }
}
