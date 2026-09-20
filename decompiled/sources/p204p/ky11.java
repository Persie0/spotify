package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ky11 implements e9y0 {

    /* JADX INFO: renamed from: P0 */
    public static final /* synthetic */ qr60[] f127616P0 = {new spi0(ky11.class, "isSideDrawerOpened", "isSideDrawerOpened()Z", 0), new spi0(ky11.class, "onBackPressedCallback", "getOnBackPressedCallback()Landroidx/activity/OnBackPressedCallback;", 0), new spi0(ky11.class, "isOpeningSideDrawerAllowed", "isOpeningSideDrawerAllowed()Z", 0)};

    /* JADX INFO: renamed from: L0 */
    public final jfm0 f127617L0;

    /* JADX INFO: renamed from: M0 */
    public final iy11 f127618M0;

    /* JADX INFO: renamed from: N0 */
    public zzq0 f127619N0;

    /* JADX INFO: renamed from: O0 */
    public final xoi0 f127620O0;

    /* JADX INFO: renamed from: X */
    public final t040 f127621X;

    /* JADX INFO: renamed from: Y */
    public final u0p f127622Y;

    /* JADX INFO: renamed from: Z */
    public q040 f127623Z;

    /* JADX INFO: renamed from: a */
    public final sx11 f127624a;

    /* JADX INFO: renamed from: b */
    public final dy11 f127625b;

    /* JADX INFO: renamed from: c */
    public final b7l0 f127626c;

    /* JADX INFO: renamed from: d */
    public c9k f127627d;

    /* JADX INFO: renamed from: e */
    public final oc0 f127628e;

    /* JADX INFO: renamed from: f */
    public final jy11 f127629f;

    /* JADX INFO: renamed from: g */
    public final jy11 f127630g;

    /* JADX INFO: renamed from: h */
    public final jfm0 f127631h;

    /* JADX INFO: renamed from: i */
    public final iy11 f127632i;

    /* JADX INFO: renamed from: t */
    public String f127633t;

    public ky11(sx11 sx11Var, ofm0 ofm0Var, dy11 dy11Var, b7l0 b7l0Var) {
        this.f127624a = sx11Var;
        this.f127625b = dy11Var;
        this.f127626c = b7l0Var;
        Boolean bool = Boolean.FALSE;
        this.f127628e = new oc0(this);
        this.f127629f = new jy11(this, 0);
        this.f127630g = new jy11(this, 1);
        this.f127631h = ofm0Var.mo15684j0(do3.class);
        this.f127632i = new iy11(this, 0);
        this.f127621X = pqo0.m70673m(ofm0Var.mo15684j0(q040.class));
        this.f127622Y = new u0p(this, 6);
        this.f127617L0 = ofm0Var.mo15684j0(a0r0.class);
        this.f127618M0 = new iy11(this, 1);
        this.f127620O0 = new xoi0(bool);
        m57642a();
    }

    /* JADX INFO: renamed from: a */
    public final void m57642a() {
        qr60[] qr60VarArr = f127616P0;
        qr60 qr60Var = qr60VarArr[2];
        int i = 0;
        if (!((Boolean) this.f127630g.f61172a).booleanValue()) {
            qr60 qr60Var2 = qr60VarArr[0];
            if (!((Boolean) this.f127628e.f61172a).booleanValue()) {
                i = 1;
            }
        }
        this.f127624a.setDrawerLockMode(i);
    }

    @Override // p204p.e9y0
    /* JADX INFO: renamed from: f */
    public final Bundle mo25168f() {
        qr60 qr60Var = f127616P0[0];
        Boolean bool = (Boolean) this.f127628e.f61172a;
        bool.booleanValue();
        return pp91.m70529j(pft0.m69840u("isSideDrawerOpened", bool), pft0.m69840u("identifierWhenOpened", this.f127633t));
    }
}
