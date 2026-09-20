package p204p;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class p18 {

    /* JADX INFO: renamed from: a */
    public final EGLSurface f172970a;

    /* JADX INFO: renamed from: b */
    public final int f172971b;

    /* JADX INFO: renamed from: c */
    public final int f172972c;

    public p18(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f172970a = eGLSurface;
        this.f172971b = i;
        this.f172972c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p18) {
            p18 p18Var = (p18) obj;
            if (this.f172970a.equals(p18Var.f172970a) && this.f172971b == p18Var.f172971b && this.f172972c == p18Var.f172972c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f172970a.hashCode() ^ 1000003) * 1000003) ^ this.f172971b) * 1000003) ^ this.f172972c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f172970a);
        sb.append(", width=");
        sb.append(this.f172971b);
        sb.append(", height=");
        return klh.m56832d(this.f172972c, "}", sb);
    }
}
