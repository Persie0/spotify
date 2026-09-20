package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f88650a;

    /* JADX INFO: renamed from: b */
    public final boolean f88651b;

    public h88(int i, boolean z) {
        this.f88650a = i;
        this.f88651b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h88)) {
            return false;
        }
        h88 h88Var = (h88) obj;
        return this.f88650a == h88Var.f88650a && this.f88651b == h88Var.f88651b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88651b) + (Integer.hashCode(this.f88650a) * 31);
    }
}
