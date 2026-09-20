package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qkw0 {

    /* JADX INFO: renamed from: c */
    public static final qkw0 f189660c = new qkw0(0, false);

    /* JADX INFO: renamed from: a */
    public final int f189661a;

    /* JADX INFO: renamed from: b */
    public final boolean f189662b;

    public qkw0(int i, boolean z) {
        this.f189661a = i;
        this.f189662b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qkw0.class == obj.getClass()) {
            qkw0 qkw0Var = (qkw0) obj;
            if (this.f189661a == qkw0Var.f189661a && this.f189662b == qkw0Var.f189662b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f189661a << 1) + (this.f189662b ? 1 : 0);
    }
}
