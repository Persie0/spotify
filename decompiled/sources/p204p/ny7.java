package p204p;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class ny7 {

    /* JADX INFO: renamed from: a */
    public ue40 f159728a;

    /* JADX INFO: renamed from: b */
    public final ue40 f159729b = null;

    /* JADX INFO: renamed from: c */
    public final Size f159730c;

    /* JADX INFO: renamed from: d */
    public final int f159731d;

    /* JADX INFO: renamed from: e */
    public final int f159732e;

    /* JADX INFO: renamed from: f */
    public final boolean f159733f;

    /* JADX INFO: renamed from: g */
    public final nc0 f159734g;

    /* JADX INFO: renamed from: h */
    public final nc0 f159735h;

    public ny7(Size size, int i, int i2, boolean z, nc0 nc0Var, nc0 nc0Var2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f159730c = size;
        this.f159731d = i;
        this.f159732e = i2;
        this.f159733f = z;
        this.f159734g = nc0Var;
        this.f159735h = nc0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ny7)) {
            return false;
        }
        ny7 ny7Var = (ny7) obj;
        return this.f159730c.equals(ny7Var.f159730c) && this.f159731d == ny7Var.f159731d && this.f159732e == ny7Var.f159732e && this.f159733f == ny7Var.f159733f && this.f159734g.equals(ny7Var.f159734g) && this.f159735h.equals(ny7Var.f159735h);
    }

    public final int hashCode() {
        return ((((((((((((this.f159730c.hashCode() ^ 1000003) * 1000003) ^ this.f159731d) * 1000003) ^ this.f159732e) * 1000003) ^ (this.f159733f ? 1231 : 1237)) * 583896283) ^ 35) * 1000003) ^ this.f159734g.hashCode()) * 1000003) ^ this.f159735h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f159730c + ", inputFormat=" + this.f159731d + ", outputFormat=" + this.f159732e + ", virtualCamera=" + this.f159733f + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.f159734g + ", errorEdge=" + this.f159735h + "}";
    }
}
