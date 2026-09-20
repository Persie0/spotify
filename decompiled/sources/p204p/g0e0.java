package p204p;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g0e0 {

    /* JADX INFO: renamed from: a */
    public static final float f75346a = 114;

    /* JADX INFO: renamed from: a */
    public static final void m43295a(fv41 fv41Var, int i, fyf fyfVar, fyf fyfVar2, fyf fyfVar3, fyf fyfVar4, fxh0 fxh0Var, boolean z, xre xreVar, boolean z2, cg21 cg21Var, boolean z3, eh00 eh00Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1913198036);
        int i3 = i2 | (xq00Var.m91770i(fv41Var) ? 4 : 2) | (xq00Var.m91762e(i) ? 32 : 16) | 1572864 | (xq00Var.m91768h(z) ? 8388608 : 4194304) | (xq00Var.m91766g(xreVar) ? 67108864 : 33554432) | (xq00Var.m91768h(z2) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i3 & 1, ((306783379 & i3) == 306783378 && ((((xq00Var.m91770i(cg21Var) ? (char) 4 : (char) 2) | (xq00Var.m91768h(z3) ? ' ' : (char) 16)) | (xq00Var.m91770i(eh00Var) ? 256 : 128)) & 147) == 146) ? false : true)) {
            ilx ilxVar = (ilx) fv41Var.f73656h;
            boolean zM63739o = cg21Var != null ? n5h1.m63739o(cg21Var) : false;
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = j4x.m52407e(0, xq00Var);
            }
            vum0 vum0Var = (vum0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = new oqi0(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T2);
            }
            oqi0 oqi0Var = (oqi0) objM91750T2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91770i = xq00Var.m91770i(oqi0Var) | ((i3 & 29360128) == 8388608);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                objM91750T3 = new c0e0(oqi0Var, z, (fbk) null);
                xq00Var.m91793t0(objM91750T3);
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T3, xq00Var);
            zye zyeVar = new zye(rpf.m76155n(ilxVar, xq00Var), fv41Var.f73673y);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48273f = hqg1.m48273f(cxh0Var, zyeVar);
            float f = 8;
            iyg1.m51914a(zsf1.m96832C(fxh0VarM48273f, f, 0.0f, f, ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35987O0(i), 2), null, rkk.m75772x(-75092802, new e0e0(ilxVar, oqi0Var, z2, fyfVar, z3, fv41Var, z, cg21Var, vum0Var, fyfVar2, fyfVar4, fyfVar3, zM63739o, eh00Var, xreVar), xq00Var), xq00Var, 3072, 6);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new f0e0(fv41Var, i, fyfVar, fyfVar2, fyfVar3, fyfVar4, fxh0Var2, z, xreVar, z2, cg21Var, z3, eh00Var, i2);
        }
    }
}
