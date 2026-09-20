package p204p;

import androidx.p004xr.runtime.math.Quaternion;
import androidx.p004xr.runtime.math.Vector3;

/* JADX INFO: loaded from: classes3.dex */
public final class fit0 {
    /* JADX INFO: renamed from: a */
    public static float m41771a(Quaternion quaternion, Quaternion quaternion2) {
        return (quaternion2.getW() * quaternion.getW()) + (quaternion2.getZ() * quaternion.getZ()) + (quaternion2.getY() * quaternion.getY()) + (quaternion2.getX() * quaternion.getX());
    }

    /* JADX INFO: renamed from: b */
    public static Quaternion m41772b(Vector3 vector3, float f) {
        double d = f * 0.017453292f * 0.5f;
        return new Quaternion(vector3.toNormalized().getX() * ((float) Math.sin(d)), vector3.toNormalized().getY() * ((float) Math.sin(d)), vector3.toNormalized().getZ() * ((float) Math.sin(d)), (float) Math.cos(d));
    }

    /* JADX INFO: renamed from: c */
    public static Quaternion m41773c(Vector3 vector3, Vector3 vector4) {
        Vector3 normalized = vector3.toNormalized();
        Vector3 vector3Cross = vector4.toNormalized().cross(normalized);
        if ((vector3Cross.getZ() * vector3Cross.getZ()) + (vector3Cross.getY() * vector3Cross.getY()) + (vector3Cross.getX() * vector3Cross.getX()) < 1.0E-6f) {
            vector3Cross = (Math.abs(normalized.getY()) < 0.999f ? Vector3.f1455Up : Vector3.Right).cross(normalized);
        }
        Vector3 normalized2 = vector3Cross.toNormalized();
        Vector3 normalized3 = normalized.cross(normalized2).toNormalized();
        float x = normalized2.getX();
        float y = normalized2.getY();
        float z = normalized2.getZ();
        float x2 = normalized3.getX();
        float y2 = normalized3.getY();
        float z2 = normalized3.getZ();
        float x3 = normalized.getX();
        float y3 = normalized.getY();
        float z3 = normalized.getZ();
        float f = x + y2 + z3;
        if (f > 0.0f) {
            float fSqrt = 0.5f / ((float) Math.sqrt(f + 1.0f));
            return new Quaternion((z2 - y3) * fSqrt, (x3 - z) * fSqrt, (y - x2) * fSqrt, 0.25f / fSqrt);
        }
        if (x > y2 && x > z3) {
            float fSqrt2 = ((float) Math.sqrt(((x + 1.0f) - y2) - z3)) * 2.0f;
            return new Quaternion(0.25f * fSqrt2, (y + x2) / fSqrt2, (z + x3) / fSqrt2, (z2 - y3) / fSqrt2);
        }
        if (y2 > z3) {
            float fSqrt3 = ((float) Math.sqrt(((y2 + 1.0f) - x) - z3)) * 2.0f;
            return new Quaternion((y + x2) / fSqrt3, 0.25f * fSqrt3, (z2 + y3) / fSqrt3, (x3 - z) / fSqrt3);
        }
        float fSqrt4 = ((float) Math.sqrt(((z3 + 1.0f) - x) - y2)) * 2.0f;
        return new Quaternion((z + x3) / fSqrt4, (z2 + y3) / fSqrt4, 0.25f * fSqrt4, (y - x2) / fSqrt4);
    }

    /* JADX INFO: renamed from: d */
    public static Quaternion m41774d(Quaternion quaternion, Quaternion quaternion2, float f) {
        return new Quaternion(bga.m29068K(quaternion.getX(), quaternion2.getX(), f), bga.m29068K(quaternion.getY(), quaternion2.getY(), f), bga.m29068K(quaternion.getZ(), quaternion2.getZ(), f), bga.m29068K(quaternion.getW(), quaternion2.getW(), f));
    }

    /* JADX INFO: renamed from: e */
    public static Quaternion m41775e(Quaternion quaternion, Quaternion quaternion2, float f) {
        float w = (quaternion2.getW() * quaternion.getW()) + (quaternion2.getZ() * quaternion.getZ()) + (quaternion2.getY() * quaternion.getY()) + (quaternion2.getX() * quaternion.getX());
        if (w < 0.0f) {
            w = -w;
            quaternion2 = new Quaternion(-quaternion2.getX(), -quaternion2.getY(), -quaternion2.getZ(), -quaternion2.getW());
        }
        if (w > 0.9995f) {
            return m41774d(quaternion, quaternion2, f);
        }
        double dSqrt = Math.sqrt(1.0d - ((double) (w * w)));
        double d = w;
        double dAcos = ((float) Math.acos(d)) * f;
        double dSin = ((double) ((float) Math.sin(dAcos))) / dSqrt;
        float fCos = (float) (((double) ((float) Math.cos(dAcos))) - (d * dSin));
        float f2 = (float) dSin;
        return new Quaternion((quaternion2.getX() * f2) + (quaternion.getX() * fCos), (quaternion2.getY() * f2) + (quaternion.getY() * fCos), (quaternion2.getZ() * f2) + (quaternion.getZ() * fCos), (quaternion2.getW() * f2) + (quaternion.getW() * fCos));
    }
}
