package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class krh0 implements vrh0 {
    public static final jrh0 Companion = new jrh0();

    /* JADX INFO: renamed from: a */
    public final boolean f125652a;

    /* JADX INFO: renamed from: b */
    public final boolean f125653b;

    /* JADX INFO: renamed from: c */
    public final boolean f125654c;

    public /* synthetic */ krh0(int i, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, irh0.f104991a.getDescriptor());
            throw null;
        }
        this.f125652a = z;
        this.f125653b = z2;
        this.f125654c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krh0)) {
            return false;
        }
        krh0 krh0Var = (krh0) obj;
        return this.f125652a == krh0Var.f125652a && this.f125653b == krh0Var.f125653b && this.f125654c == krh0Var.f125654c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125654c) + s571.m77245d(Boolean.hashCode(this.f125652a) * 31, 31, this.f125653b);
    }

    public krh0(boolean z, boolean z2, boolean z3) {
        this.f125652a = z;
        this.f125653b = z2;
        this.f125654c = z3;
    }
}
