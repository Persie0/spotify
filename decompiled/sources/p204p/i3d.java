package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i3d extends ijh {

    /* JADX INFO: renamed from: T1 */
    public final io9 f98134T1;

    /* JADX INFO: renamed from: V1 */
    public kv91 f98136V1;

    /* JADX INFO: renamed from: X1 */
    public boolean f98138X1;

    /* JADX INFO: renamed from: U1 */
    public final bbg0 f98135U1 = mvl0.m62933A();

    /* JADX INFO: renamed from: W1 */
    public qe70 f98137W1 = yva.f276604V0;

    /* JADX INFO: renamed from: Y1 */
    public boolean f98139Y1 = true;

    /* JADX INFO: renamed from: Z1 */
    public final zv41 f98140Z1 = jag1.m52819d(Boolean.FALSE);

    public i3d(io9 io9Var) {
        this.f98134T1 = io9Var;
    }

    /* JADX INFO: renamed from: y1 */
    public static final void m49602y1(i3d i3dVar, String str) {
        PackageManager packageManager;
        m500 m500VarM49715n0;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        m500 m500VarM49715n1 = i3dVar.m49715n0();
        if (m500VarM49715n1 == null || (packageManager = m500VarM49715n1.getPackageManager()) == null || intent.resolveActivity(packageManager) == null || (m500VarM49715n0 = i3dVar.m49715n0()) == null) {
            return;
        }
        m500VarM49715n0.startActivity(intent);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f98134T1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.my8, p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        super.mo881R0(view, bundle);
        m49603z1().mo57449i(this.f98135U1.mo24514e(), null);
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: t1 */
    public final void mo38127t1(srk srkVar) {
        srkVar.m87626g().m1578L(3);
    }

    @Override // p204p.my8
    /* JADX INFO: renamed from: u1 */
    public final void mo41980u1() {
        if (this.f98138X1) {
            return;
        }
        m49603z1().mo57453r(this.f98135U1.m28637h(), null);
    }

    @Override // p204p.ijh
    /* JADX INFO: renamed from: w1 */
    public final void mo38128w1(fjh fjhVar, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1977350908);
        int i2 = (xq00Var.m91770i(this) ? 32 : 16) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) sam.m77671j(this.f98140Z1, xq00Var, 0).getValue()).booleanValue();
            boolean zM91770i = xq00Var.m91770i(this);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new fub(this, 15);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            boolean zM91770i2 = xq00Var.m91770i(this);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T2 == ia7Var) {
                objM91750T2 = new h3d(this, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            boolean zM91770i3 = xq00Var.m91770i(this);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T3 == ia7Var) {
                objM91750T3 = new h3d(this, 1);
                xq00Var.m91793t0(objM91750T3);
            }
            xq00Var2 = xq00Var;
            uqe1.m83762a(eh00Var, gh00Var, (gh00) objM91750T3, null, zBooleanValue, xq00Var2, 0);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xm9(this, fjhVar, i, 15);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final kv91 m49603z1() {
        kv91 kv91Var = this.f98136V1;
        if (kv91Var != null) {
            return kv91Var;
        }
        wj50.m88260d0("ubiLogger");
        throw null;
    }
}
