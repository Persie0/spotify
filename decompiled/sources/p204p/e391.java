package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes10.dex */
public final class e391 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f55697b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xk80 f55698c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f55699d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xk80 f55700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e391(boolean z, xk80 xk80Var, boolean z2, xk80 xk80Var2, int i) {
        super(1);
        this.f55696a = i;
        this.f55697b = z;
        this.f55698c = xk80Var;
        this.f55699d = z2;
        this.f55700e = xk80Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f55696a) {
            case 0:
                tgj tgjVar = (tgj) obj;
                tgjVar.mo50174s1();
                if (this.f55697b) {
                    DrawScope.m273U0(tgjVar, this.f55698c, 0L, 0L, 0.0f, null, null, 6, 62);
                }
                if (this.f55699d) {
                    DrawScope.m273U0(tgjVar, this.f55700e, 0L, 0L, 0.0f, null, null, 6, 62);
                }
                break;
            default:
                tgj tgjVar2 = (tgj) obj;
                tgjVar2.mo50174s1();
                if (this.f55697b) {
                    DrawScope.m273U0(tgjVar2, this.f55698c, 0L, 0L, 0.0f, null, null, 6, 62);
                }
                if (this.f55699d) {
                    DrawScope.m273U0(tgjVar2, this.f55700e, 0L, 0L, 0.0f, null, null, 6, 62);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
