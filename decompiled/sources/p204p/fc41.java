package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes2.dex */
public final class fc41 {

    /* JADX INFO: renamed from: a */
    public final e940 f68002a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2609yd f68003b;

    /* JADX INFO: renamed from: c */
    public final as4 f68004c;

    public fc41(e940 e940Var, InterfaceC2609yd interfaceC2609yd, as4 as4Var) {
        this.f68002a = e940Var;
        this.f68003b = interfaceC2609yd;
        this.f68004c = as4Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m41289c(fc41 fc41Var, xq00 xq00Var, int i) {
        fc41Var.getClass();
        xq00Var.m91775k0(-2013243806);
        int i2 = i & 1;
        if (xq00Var.m91752Y(i2, i2 != 0)) {
            View view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            vq00 vq00VarM70361t = pmg1.m70361t(xq00Var);
            boolean zM91770i = xq00Var.m91770i(view) | xq00Var.m91770i(vq00VarM70361t);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new by31(3, view, vq00VarM70361t);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49232d(view, vq00VarM70361t, (gh00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lvs0(fc41Var, i, 18);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m41290a(fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1640366394);
        if (xq00Var.m91752Y(i & 1, (i & 3) != 2)) {
            y0v.m92603a(2, fyfVar, xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dc41(this, fyfVar, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m41291b(fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-76609794);
        int i2 = (xq00Var.m91770i(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            m41290a(rkk.m75772x(678088098, new ec41(this, fyfVar, 1), xq00Var), xq00Var, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 6);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dc41(this, fyfVar, i, 1);
        }
    }
}
