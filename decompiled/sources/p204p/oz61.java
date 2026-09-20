package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oz61 {

    /* JADX INFO: renamed from: a */
    public final int f172138a;

    /* JADX INFO: renamed from: b */
    public final int f172139b;

    /* JADX INFO: renamed from: c */
    public final boolean f172140c;

    public /* synthetic */ oz61(int i, int i2) {
        this(i, i2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz61)) {
            return false;
        }
        oz61 oz61Var = (oz61) obj;
        return this.f172138a == oz61Var.f172138a && this.f172139b == oz61Var.f172139b && this.f172140c == oz61Var.f172140c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172140c) + mt60.m62800g(this.f172139b, Integer.hashCode(this.f172138a) * 31, 31);
    }

    public oz61(int i, int i2, boolean z) {
        this.f172138a = i;
        this.f172139b = i2;
        this.f172140c = z;
    }
}
