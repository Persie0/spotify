package p204p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class vxb0 implements nqc1 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qr60[] f245702f = {new spi0(vxb0.class, "currentKeyboardHeight", "getCurrentKeyboardHeight()I", 0), new spi0(vxb0.class, "currentSystemInsets", "getCurrentSystemInsets()Landroidx/core/graphics/Insets;", 0), new spi0(vxb0.class, "currentContainer", "getCurrentContainer()Lkotlin/jvm/functions/Function0;", 0)};

    /* JADX INFO: renamed from: a */
    public final View f245703a;

    /* JADX INFO: renamed from: b */
    public final hzd0 f245704b = new hzd0();

    /* JADX INFO: renamed from: c */
    public final uxb0 f245705c = new uxb0(this, 0);

    /* JADX INFO: renamed from: d */
    public final uxb0 f245706d = new uxb0(this, 1);

    /* JADX INFO: renamed from: e */
    public final uxb0 f245707e = new uxb0(new vmb0(this, 6), this);

    public vxb0(View view, kek0 kek0Var, hc80 hc80Var, iz60 iz60Var, qh61 qh61Var) {
        this.f245703a = view;
        iz60Var.mo51979a().m33099f(hc80Var, new sxb0(this, 0));
        qh61Var.mo72790a().m33099f(hc80Var, new txb0(this, 0));
        kek0Var.mo40979a().m33099f(hc80Var, new sxb0(this, 1));
    }

    /* JADX INFO: renamed from: b */
    public static final void m86650b(vxb0 vxb0Var) {
        uxb0 uxb0Var = vxb0Var.f245707e;
        qr60[] qr60VarArr = f245702f;
        qr60 qr60Var = qr60VarArr[2];
        View view = (View) ((eh00) uxb0Var.f61172a).invoke();
        uxb0 uxb0Var2 = vxb0Var.f245705c;
        qr60 qr60Var2 = qr60VarArr[0];
        int iIntValue = ((Number) uxb0Var2.f61172a).intValue();
        uxb0 uxb0Var3 = vxb0Var.f245706d;
        qr60 qr60Var3 = qr60VarArr[1];
        dx40 dx40Var = (dx40) uxb0Var3.f61172a;
        int height = view.getHeight();
        int width = view.getWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        vxb0Var.f245704b.m33101j(new Rect(i, i2, (width + i) - dx40Var.f53850c, iIntValue > 0 ? (height + i2) - iIntValue : height + i2));
    }

    @Override // p204p.nqc1
    /* JADX INFO: renamed from: a */
    public final ck90 mo44173a() {
        return this.f245704b;
    }
}
