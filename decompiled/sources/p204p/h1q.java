package p204p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class h1q extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k1q f86678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f86679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1q(k1q k1qVar, gh00 gh00Var, int i) {
        super(1);
        this.f86677a = i;
        this.f86678b = k1qVar;
        this.f86679c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f86677a) {
            case 0:
                k1q k1qVar = this.f86678b;
                fxr0 fxr0Var = k1qVar.f118409c;
                int iOrdinal = ((abz0) obj).ordinal();
                gh00 gh00Var = this.f86679c;
                if (iOrdinal == 0) {
                    ConstraintLayout constraintLayout = fxr0Var.f74440d1;
                    View view = fxr0Var.f74430Y0;
                    if (constraintLayout.getBackground() != null) {
                        constraintLayout.setBackground(null);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.height = constraintLayout.getHeight();
                        view.setLayoutParams(layoutParams);
                        view.setVisibility(0);
                        fxr0Var.f74432Z0.setVisibility(0);
                    }
                    k1qVar.m55121a(bbz0.m28652a(fxr0Var.f74421R0.getModel(), null, cbz0.f36271b, null, 5));
                    gh00Var.invoke(ywr0.f277033N0);
                } else if (iOrdinal == 1) {
                    k1qVar.m55121a(bbz0.m28652a(fxr0Var.f74421R0.getModel(), null, cbz0.f36270a, null, 5));
                    gh00Var.invoke(ywr0.f277034O0);
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            default:
                ((Boolean) obj).booleanValue();
                boolean z = this.f86678b.f118411e;
                gh00 gh00Var2 = this.f86679c;
                if (z) {
                    gh00Var2.invoke(ywr0.f277037Y);
                } else {
                    gh00Var2.invoke(ywr0.f277046h);
                }
                return w2a1.f247311a;
        }
    }
}
