package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ilm0 {

    /* JADX INFO: renamed from: a */
    public final float f103432a;

    /* JADX INFO: renamed from: b */
    public final boolean f103433b;

    /* JADX INFO: renamed from: c */
    public final boolean f103434c;

    public /* synthetic */ ilm0(float f, int i) {
        this(f, (i & 2) != 0, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilm0)) {
            return false;
        }
        ilm0 ilm0Var = (ilm0) obj;
        return Float.compare(this.f103432a, ilm0Var.f103432a) == 0 && this.f103433b == ilm0Var.f103433b && this.f103434c == ilm0Var.f103434c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103434c) + s571.m77245d(Float.hashCode(this.f103432a) * 31, 31, this.f103433b);
    }

    public ilm0(float f, boolean z, boolean z2) {
        this.f103432a = f;
        this.f103433b = z;
        this.f103434c = z2;
    }
}
