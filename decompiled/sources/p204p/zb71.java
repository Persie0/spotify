package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zb71 {

    /* JADX INFO: renamed from: a */
    public final float f281274a;

    /* JADX INFO: renamed from: b */
    public final int f281275b;

    public zb71(float f, int i) {
        this.f281274a = f;
        this.f281275b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb71)) {
            return false;
        }
        zb71 zb71Var = (zb71) obj;
        return ybs.m93301b(this.f281274a, zb71Var.f281274a) && this.f281275b == zb71Var.f281275b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281275b) + (Float.hashCode(this.f281274a) * 31);
    }
}
