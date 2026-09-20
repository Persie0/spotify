package p204p;

import android.graphics.Shader;
import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xk80 extends ug01 implements fj50 {

    /* JADX INFO: renamed from: d */
    public final List f262303d;

    /* JADX INFO: renamed from: e */
    public final List f262304e;

    /* JADX INFO: renamed from: f */
    public final long f262305f;

    /* JADX INFO: renamed from: g */
    public final long f262306g;

    /* JADX INFO: renamed from: h */
    public final int f262307h;

    public xk80(int i, long j, long j2, List list, List list2) {
        this.f262303d = list;
        this.f262304e = list2;
        this.f262305f = j;
        this.f262306g = j2;
        this.f262307h = i;
    }

    @Override // p204p.fj50
    /* JADX INFO: renamed from: b */
    public final Object mo41796b(Object obj, float f) {
        if (obj == null) {
            int i = n6f.f150872l;
            obj = new pk31(ly5.m60223m());
        }
        boolean z = obj instanceof pk31;
        List list = this.f262303d;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((n6f) list.get(i2)).getClass();
                arrayList.add(new n6f(((pk31) obj).f178375a));
            }
            obj = new xk80(this.f262307h, this.f262305f, this.f262306g, arrayList, this.f262304e);
        }
        if (!(obj instanceof xk80)) {
            return null;
        }
        xk80 xk80Var = (xk80) obj;
        ArrayList arrayListM92100u = xtm0.m92100u(list, xk80Var.f262303d, f);
        ArrayList arrayListM92101v = xtm0.m92101v(this.f262304e, xk80Var.f262304e, f);
        return new xk80(f < 0.5f ? this.f262307h : xk80Var.f262307h, xtm0.m92102w(f, this.f262305f, xk80Var.f262305f), xtm0.m92102w(f, this.f262306g, xk80Var.f262306g), arrayListM92100u, arrayListM92101v);
    }

    @Override // p204p.ug01
    /* JADX INFO: renamed from: c */
    public final Shader mo43315c(long j) {
        long j2 = this.f262305f;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f262306g;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return spg1.m78901j(this.f262307h, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.f262303d, this.f262304e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk80)) {
            return false;
        }
        xk80 xk80Var = (xk80) obj;
        return wj50.m88271j(this.f262303d, xk80Var.f262303d) && wj50.m88271j(this.f262304e, xk80Var.f262304e) && Offset.m253c(this.f262305f, xk80Var.f262305f) && Offset.m253c(this.f262306g, xk80Var.f262306g) && vyg1.m86773m(this.f262307h, xk80Var.f262307h);
    }

    public final int hashCode() {
        int iHashCode = this.f262303d.hashCode() * 31;
        List list = this.f262304e;
        return vyg1.m86775o(this.f262307h) + dq60.m36605e(dq60.m36605e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f262305f, 31), this.f262306g, 31);
    }

    public final String toString() {
        String str;
        long j = this.f262305f;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m259i(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f262306g;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m259i(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.f262303d + ", stops=" + this.f262304e + ", " + str + str2 + "tileMode=" + ((Object) vyg1.m86780t(this.f262307h)) + ')';
    }
}
