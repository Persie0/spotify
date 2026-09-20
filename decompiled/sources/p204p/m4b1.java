package p204p;

import androidx.p004xr.runtime.math.Vector3;

/* JADX INFO: loaded from: classes3.dex */
public final class m4b1 {
    /* JADX INFO: renamed from: a */
    public static float m60807a(Vector3 vector3, Vector3 vector4) {
        Vector3 vector3Minus = vector3.minus(vector4);
        return (float) Math.sqrt((vector3Minus.getZ() * vector3Minus.getZ()) + (vector3Minus.getY() * vector3Minus.getY()) + (vector3Minus.getX() * vector3Minus.getX()));
    }

    /* JADX INFO: renamed from: b */
    public static Vector3 m60808b(Vector3 vector3, Vector3 vector4, float f) {
        return new Vector3(bga.m29068K(vector3.getX(), vector4.getX(), f), bga.m29068K(vector3.getY(), vector4.getY(), f), bga.m29068K(vector3.getZ(), vector4.getZ(), f));
    }
}
