package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vue0 {

    /* JADX INFO: renamed from: a */
    public static final float f244931a = 48;

    /* JADX INFO: renamed from: a */
    public static final void m86416a(float f, float f2, boolean z, float f3, String str, boolean z2, qf40 qf40Var, j90 j90Var, yhu0 yhu0Var, gh00 gh00Var, qf40 qf40Var2, gh00 gh00Var2, fwv0 fwv0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        String str2;
        int i4;
        qf40 qf40Var3;
        int i5;
        fwv0 fwv0Var2;
        xq00 xq00Var2;
        float f5;
        float f6;
        xq00 xq00Var3;
        fbk fbkVar;
        fbk fbkVar2;
        kqi0 kqi0Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1383322455);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f4 = f3;
            i3 |= xq00Var.m91760d(f4) ? 2048 : 1024;
        } else {
            f4 = f3;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i3 |= xq00Var.m91766g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((i & 196608) == 0) {
            i3 |= xq00Var.m91768h(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= xq00Var.m91766g(qf40Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= xq00Var.m91770i(j90Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 = 32;
            i3 |= xq00Var.m91770i(yhu0Var) ? 67108864 : 33554432;
        } else {
            i4 = 32;
        }
        if ((i & 805306368) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            qf40Var3 = qf40Var2;
            i5 = i2 | (xq00Var.m91770i(qf40Var3) ? 4 : 2);
        } else {
            qf40Var3 = qf40Var2;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= xq00Var.m91770i(gh00Var2) ? i4 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= xq00Var.m91770i(fwv0Var) ? 256 : 128;
        }
        int i7 = i5;
        if (xq00Var.m91752Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var4 = (kqi0) objM91750T3;
            Object objM91750T4 = xq00Var.m91750T();
            if (objM91750T4 == ia7Var) {
                objM91750T4 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var5 = (kqi0) objM91750T4;
            float f7 = leu.m58816b(xq00Var).f117230b.f224763f;
            if (z2) {
                f5 = f7;
                xq00Var.m91771i0(348941983);
                xq00Var.m91788r(false);
                f6 = f2 + f5 + f244931a;
            } else {
                f5 = f7;
                xq00Var.m91771i0(349022862);
                f6 = f2 - leu.m58816b(xq00Var).f117230b.f224759b;
                xq00Var.m91788r(false);
            }
            float f8 = f6;
            long j = (((long) (-((yqq) xq00Var.m91774k(wsh.f254617h)).mo35990l0(f8))) & 4294967295L) | (((long) 0) << i4);
            wb9 wb9Var = z ? d7f0.f46170g : d7f0.f46166e;
            raq0 raq0Var = new raq0(24, true, true, true);
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == ia7Var) {
                objM91750T5 = new in70(kqi0Var2, 28);
                xq00Var3 = xq00Var;
                xq00Var3.m91793t0(objM91750T5);
            } else {
                xq00Var3 = xq00Var;
            }
            xq00Var2 = xq00Var3;
            int i8 = i4;
            sm4.m78515b(wb9Var, j, (eh00) objM91750T5, raq0Var, rkk.m75772x(26414612, new tue0(z, kqi0Var2, z2, str2, yhu0Var, qf40Var3, qf40Var, j90Var, kqi0Var3, kqi0Var4, kqi0Var5, f, f5, f4, f8), xq00Var2), xq00Var2, 28032, 0);
            Object objM91750T6 = xq00Var2.m91750T();
            if (objM91750T6 == ia7Var) {
                fbkVar = null;
                objM91750T6 = new vi1(14, fbkVar, kqi0Var2);
                xq00Var2.m91793t0(objM91750T6);
            } else {
                fbkVar = null;
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T6, xq00Var2);
            whu0 whu0Var = (whu0) kqi0Var3.getValue();
            boolean z3 = (i7 & ContentType.LONG_FORM_ON_DEMAND) == i8;
            Object objM91750T7 = xq00Var2.m91750T();
            if (z3 || objM91750T7 == ia7Var) {
                fbkVar2 = fbkVar;
                gnq gnqVar = new gnq(kqi0Var3, gh00Var2, kqi0Var2, fbkVar2, 29);
                kqi0Var = kqi0Var2;
                xq00Var2.m91793t0(gnqVar);
                objM91750T7 = gnqVar;
            } else {
                fbkVar2 = fbkVar;
                kqi0Var = kqi0Var2;
            }
            hz40.m49237i(whu0Var, (th00) objM91750T7, xq00Var2);
            Boolean bool = (Boolean) kqi0Var4.getValue();
            bool.getClass();
            boolean z4 = (i6 & 1879048192) == 536870912;
            Object objM91750T8 = xq00Var2.m91750T();
            if (z4 || objM91750T8 == ia7Var) {
                objM91750T8 = new kp1(29, gh00Var, kqi0Var4, kqi0Var, kqi0Var5, (fbk) null);
                xq00Var2.m91793t0(objM91750T8);
            }
            hz40.m49237i(bool, (th00) objM91750T8, xq00Var2);
            Boolean bool2 = (Boolean) kqi0Var.getValue();
            bool2.getClass();
            boolean z5 = (i7 & 896) == 256;
            Object objM91750T9 = xq00Var2.m91750T();
            if (z5 || objM91750T9 == ia7Var) {
                fwv0Var2 = fwv0Var;
                objM91750T9 = new sqc0(fwv0Var2, kqi0Var, fbkVar2, 20);
                xq00Var2.m91793t0(objM91750T9);
            } else {
                fwv0Var2 = fwv0Var;
            }
            hz40.m49237i(bool2, (th00) objM91750T9, xq00Var2);
        } else {
            fwv0Var2 = fwv0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new uue0(f, f2, z, f3, str, z2, qf40Var, j90Var, yhu0Var, gh00Var, qf40Var2, gh00Var2, fwv0Var2, i, i2);
        }
    }
}
