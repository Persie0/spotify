package p204p;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class l3u0 extends ug01 implements fj50 {

    /* JADX INFO: renamed from: d */
    public final List f129440d;

    /* JADX INFO: renamed from: e */
    public final List f129441e;

    /* JADX INFO: renamed from: f */
    public final long f129442f;

    /* JADX INFO: renamed from: g */
    public final float f129443g;

    /* JADX INFO: renamed from: h */
    public final int f129444h;

    public l3u0(List list, List list2, long j, float f, int i) {
        this.f129440d = list;
        this.f129441e = list2;
        this.f129442f = j;
        this.f129443g = f;
        this.f129444h = i;
    }

    @Override // p204p.fj50
    /* JADX INFO: renamed from: b */
    public final Object mo41796b(Object obj, float f) {
        if (obj == null) {
            obj = new pk31(n6f.f150870j);
        }
        boolean z = obj instanceof pk31;
        List list = this.f129440d;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((n6f) list.get(i)).getClass();
                arrayList.add(new n6f(((pk31) obj).f178375a));
            }
            obj = new l3u0(arrayList, this.f129441e, this.f129442f, this.f129443g, this.f129444h);
        }
        if (!(obj instanceof l3u0)) {
            return null;
        }
        l3u0 l3u0Var = (l3u0) obj;
        return new l3u0(xtm0.m92100u(list, l3u0Var.f129440d, f), xtm0.m92101v(this.f129441e, l3u0Var.f129441e, f), c95.m31817I(f, this.f129442f, l3u0Var.f129442f), wj50.m88249I(this.f129443g, l3u0Var.f129443g, f), f < 0.5f ? this.f129444h : l3u0Var.f129444h);
    }

    @Override // p204p.ug01
    /* JADX INFO: renamed from: c */
    public final Shader mo43315c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.f129442f;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jM85480u = vgg1.m85480u(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM85480u >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM85480u & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fM264e = this.f129443g;
        if (fM264e == Float.POSITIVE_INFINITY) {
            fM264e = Size.m264e(j) / 2;
        }
        float f = fM264e;
        List list = this.f129440d;
        List list2 = this.f129441e;
        pzb0.m71701A(list, list2);
        int iM71715m = pzb0.m71715m(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, pzb0.m71722t(iM71715m, list), pzb0.m71723u(iM71715m, list2, list), zuj0.m97061x(this.f129444h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3u0)) {
            return false;
        }
        l3u0 l3u0Var = (l3u0) obj;
        return this.f129440d.equals(l3u0Var.f129440d) && wj50.m88271j(this.f129441e, l3u0Var.f129441e) && Offset.m253c(this.f129442f, l3u0Var.f129442f) && this.f129443g == l3u0Var.f129443g && this.f129444h == l3u0Var.f129444h;
    }

    public final int hashCode() {
        int iHashCode = this.f129440d.hashCode() * 31;
        List list = this.f129441e;
        return Integer.hashCode(this.f129444h) + AbstractC0000a.m8g(dq60.m36605e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f129442f, 31), 31, this.f129443g);
    }

    public final String toString() {
        String str;
        long j = this.f129442f;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) Offset.m259i(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.f129443g;
        if ((Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.f129440d + ", stops=" + this.f129441e + ", " + str + str2 + "tileMode=" + ((Object) vyg1.m86780t(this.f129444h)) + ')';
    }
}
