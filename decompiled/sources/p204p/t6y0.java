package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t6y0 {

    /* JADX INFO: renamed from: a */
    public final int f217650a;

    /* JADX INFO: renamed from: b */
    public final float f217651b;

    public /* synthetic */ t6y0() {
        this(1, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6y0)) {
            return false;
        }
        t6y0 t6y0Var = (t6y0) obj;
        return this.f217650a == t6y0Var.f217650a && Float.compare(this.f217651b, t6y0Var.f217651b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f217651b) + (edb.m38547C(this.f217650a) * 31);
    }

    public t6y0(int i, float f) {
        this.f217650a = i;
        this.f217651b = f;
    }
}
