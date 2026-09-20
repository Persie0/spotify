package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yu20 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f276261a;

    /* JADX INFO: renamed from: b */
    public final String f276262b;

    /* JADX INFO: renamed from: c */
    public final int f276263c;

    /* JADX INFO: renamed from: d */
    public final int f276264d;

    public yu20(String str, int i, int i2, boolean z) {
        this.f276261a = z;
        this.f276262b = str;
        this.f276263c = i;
        this.f276264d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu20)) {
            return false;
        }
        yu20 yu20Var = (yu20) obj;
        return this.f276261a == yu20Var.f276261a && wj50.m88271j(this.f276262b, yu20Var.f276262b) && this.f276263c == yu20Var.f276263c && this.f276264d == yu20Var.f276264d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276264d) + mt60.m62800g(this.f276263c, s571.m77243b(Boolean.hashCode(this.f276261a) * 31, 31, this.f276262b), 31);
    }
}
