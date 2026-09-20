package p204p;

import androidx.compose.p002ui.graphics.Brush;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class wg01 {

    /* JADX INFO: renamed from: a */
    public final float f250937a;

    /* JADX INFO: renamed from: b */
    public final float f250938b;

    /* JADX INFO: renamed from: c */
    public final long f250939c;

    /* JADX INFO: renamed from: d */
    public final int f250940d;

    /* JADX INFO: renamed from: e */
    public final long f250941e;

    /* JADX INFO: renamed from: f */
    public final Brush f250942f;

    /* JADX INFO: renamed from: g */
    public final float f250943g;

    public wg01(float f, float f2, long j, long j2, Brush brush, float f3, int i) {
        this.f250937a = f;
        this.f250938b = f2;
        this.f250939c = j;
        this.f250940d = i;
        if (brush instanceof pk31) {
            this.f250941e = ((pk31) brush).f178375a;
            this.f250942f = null;
        } else {
            this.f250941e = j2;
            this.f250942f = brush;
        }
        this.f250943g = n0e1.m63436m(f3, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final float m87997a() {
        return this.f250943g;
    }

    /* JADX INFO: renamed from: b */
    public final int m87998b() {
        return this.f250940d;
    }

    /* JADX INFO: renamed from: c */
    public final Brush m87999c() {
        return this.f250942f;
    }

    /* JADX INFO: renamed from: d */
    public final long m88000d() {
        return this.f250941e;
    }

    /* JADX INFO: renamed from: e */
    public final long m88001e() {
        return this.f250939c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg01) {
            wg01 wg01Var = (wg01) obj;
            if (ybs.m93301b(this.f250937a, wg01Var.f250937a) && ybs.m93301b(this.f250938b, wg01Var.f250938b) && this.f250939c == wg01Var.f250939c && this.f250943g == wg01Var.f250943g && this.f250940d == wg01Var.f250940d) {
                long j = wg01Var.f250941e;
                int i = n6f.f150872l;
                if (as91.m27074b(this.f250941e, j) && wj50.m88271j(this.f250942f, wg01Var.f250942f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final float m88002f() {
        return this.f250937a;
    }

    /* JADX INFO: renamed from: g */
    public final float m88003g() {
        return this.f250938b;
    }

    /* JADX INFO: renamed from: h */
    public final wg01 m88004h() {
        return new wg01(this.f250937a, n6f.f150870j, this.f250938b, this.f250939c, this.f250943g, this.f250940d, 0);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f250940d, AbstractC0000a.m8g(dq60.m36605e(AbstractC0000a.m8g(Float.hashCode(this.f250937a) * 31, 31, this.f250938b), this.f250939c, 31), 31, this.f250943g), 31);
        int i = n6f.f150872l;
        int iM36605e = dq60.m36605e(iM62800g, this.f250941e, 31);
        Brush brush = this.f250942f;
        return iM36605e + (brush != null ? brush.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        pi9.m70086k(this.f250937a, sb, ", spread=");
        pi9.m70086k(this.f250938b, sb, ", offset=");
        sb.append((Object) acs.m25484c(this.f250939c));
        sb.append(", alpha=");
        sb.append(this.f250943g);
        sb.append(", blendMode=");
        sb.append((Object) ftg1.m42639E(this.f250940d));
        sb.append(", color=");
        y8a0.m93103h(this.f250941e, ", brush=", sb);
        sb.append(this.f250942f);
        sb.append(')');
        return sb.toString();
    }

    public wg01(float f, long j, float f2, long j2, float f3, int i, int i2) {
        this(f, f2, j2, j == 16 ? n6f.f150862b : j, (Brush) null, f3, i);
    }

    public wg01(float f, long j, float f2, long j2, float f3, int i) {
        this(f, j, (i & 4) != 0 ? 0 : f2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 1.0f : f3, 3, 0);
    }
}
