package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g31 {

    /* JADX INFO: renamed from: a */
    public final float f76062a;

    /* JADX INFO: renamed from: b */
    public final float f76063b;

    public g31(float f, float f2) {
        this.f76062a = f;
        this.f76063b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float m43418a() {
        return this.f76063b;
    }

    /* JADX INFO: renamed from: b */
    public final float m43419b() {
        return this.f76062a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        g31 g31Var = (g31) obj;
        return Float.compare(this.f76062a, g31Var.f76062a) == 0 && Float.compare(this.f76063b, g31Var.f76063b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f76063b) + (Float.hashCode(this.f76062a) * 31);
    }
}
