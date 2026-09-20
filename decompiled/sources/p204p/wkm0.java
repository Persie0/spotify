package p204p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes8.dex */
public final class wkm0 extends AbstractC2441u6 {

    /* JADX INFO: renamed from: Q0 */
    public static final /* synthetic */ int f252262Q0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final yum0 f252263L0;

    /* JADX INFO: renamed from: M0 */
    public final yum0 f252264M0;

    /* JADX INFO: renamed from: N0 */
    public final yum0 f252265N0;

    /* JADX INFO: renamed from: O0 */
    public final yum0 f252266O0;

    /* JADX INFO: renamed from: P0 */
    public final wg61 f252267P0;

    /* JADX INFO: renamed from: t */
    public final yum0 f252268t;

    public wkm0(Context context) {
        super(context, null, 4, 0);
        this.f252268t = sam.m77645B(null);
        this.f252263L0 = sam.m77645B(null);
        this.f252264M0 = sam.m77645B(alm0.f16901a);
        this.f252265N0 = sam.m77645B(null);
        this.f252266O0 = sam.m77645B(null);
        this.f252267P0 = new wg61(new pgm0(this, 1));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private final ofm0 getPageProperties() {
        return (ofm0) this.f252267P0.getValue();
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: a */
    public final void mo301a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(791401767);
        int i2 = (xq00Var.m91770i(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            bns bnsVar = rwb0.f203316a;
            qwb0 qwb0VarM76510b = rwb0.m76510b((View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f));
            qqg1.m73533c(new c4t0[]{q6m0.f185863b.mo30068a(getPageProperties()), bnsVar.mo30068a(qwb0VarM76510b), rwb0.f203317b.mo30068a(qwb0VarM76510b != null ? qwb0VarM76510b.mo30121a() : null)}, rkk.m75772x(-1879873433, new vkm0(this, 2, (byte) 0), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vkm0(this, i);
        }
    }

    public final th00 getActions() {
        return (th00) this.f252263L0.getValue();
    }

    @Override // android.view.View
    public final elm0 getBackground() {
        return (elm0) this.f252264M0.getValue();
    }

    public final eh00 getOnBackPressed() {
        return (eh00) this.f252266O0.getValue();
    }

    public final ilm0 getScrollState() {
        return (ilm0) this.f252265N0.getValue();
    }

    public final th00 getTitle() {
        return (th00) this.f252268t.getValue();
    }

    public final void setActions(th00 th00Var) {
        this.f252263L0.setValue(th00Var);
    }

    public final void setBackground(elm0 elm0Var) {
        this.f252264M0.setValue(elm0Var);
    }

    public final void setOnBackPressed(eh00 eh00Var) {
        this.f252266O0.setValue(eh00Var);
    }

    public final void setScrollState(ilm0 ilm0Var) {
        this.f252265N0.setValue(ilm0Var);
    }

    public final void setTitle(th00 th00Var) {
        this.f252268t.setValue(th00Var);
    }
}
