package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c0o0 implements g0o0 {

    /* JADX INFO: renamed from: a */
    public final int f32834a;

    /* JADX INFO: renamed from: b */
    public final char f32835b;

    public c0o0(char c, int i) {
        this.f32834a = i;
        this.f32835b = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0o0)) {
            return false;
        }
        c0o0 c0o0Var = (c0o0) obj;
        return this.f32834a == c0o0Var.f32834a && this.f32835b == c0o0Var.f32835b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f32835b) + (Integer.hashCode(this.f32834a) * 31);
    }
}
