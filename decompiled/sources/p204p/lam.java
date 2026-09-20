package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lam {

    /* JADX INFO: renamed from: a */
    public static final float f131375a = 176;

    /* JADX INFO: renamed from: b */
    public static final float f131376b = 160;

    /* JADX INFO: renamed from: a */
    public static final void m58573a(String str, hv01 hv01Var, ov01 ov01Var, long j, fxh0 fxh0Var, xu01 xu01Var, boolean z, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-228009157);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(hv01Var) ? 32 : 16) | (xq00Var.m91766g(ov01Var) ? 256 : 128) | (xq00Var.m91764f(j) ? 2048 : 1024) | 24576 | (xq00Var.m91762e(xu01Var == null ? -1 : xu01Var.ordinal()) ? 131072 : 65536) | (xq00Var.m91768h(z) ? 1048576 : 524288);
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean z2 = ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = Float.valueOf((xu01Var == xu01.f265969b || (xu01Var != null && z)) ? 0.5f : 1.0f);
                xq00Var.m91793t0(objM91750T2);
            }
            float fFloatValue = ((Number) objM91750T2).floatValue();
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = iam.f100294b;
                xq00Var.m91793t0(objM91750T3);
            }
            boolean z3 = !((Boolean) kqi0Var.getValue()).booleanValue();
            cxh0 cxh0Var = cxh0.f43038a;
            qkf1.m73082c(hv01Var, j, (eh00) objM91750T3, z3, zxc.m97185e(fFloatValue, cxh0Var), null, rkk.m75772x(541257650, new jam(str, ov01Var, j, z, kqi0Var), xq00Var), xq00Var, ((i2 >> 3) & 14) | 1573248 | ((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND), 32);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kam(str, hv01Var, ov01Var, j, fxh0Var2, xu01Var, z, i);
        }
    }
}
