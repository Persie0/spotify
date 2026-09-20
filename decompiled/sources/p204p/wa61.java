package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class wa61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xa61 f249406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa61(xa61 xa61Var, int i) {
        super(0);
        this.f249405a = i;
        this.f249406b = xa61Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f249405a) {
            case 0:
                xa61 xa61Var = this.f249406b;
                ConstraintLayout constraintLayout = xa61Var.f259577W0;
                ComposeView composeView = new ComposeView(constraintLayout.getContext(), null, 0, 6, null);
                composeView.setId(View.generateViewId());
                composeView.setContent(new fyf(new va61(xa61Var, 2), true, 1449183412));
                h6j h6jVar = new h6j(-2, -2);
                h6jVar.f88145i = 0;
                h6jVar.f88164t = 0;
                h6jVar.f88166v = 0;
                constraintLayout.addView(composeView, h6jVar);
                return composeView;
            case 1:
                xa61 xa61Var2 = this.f249406b;
                return new k6c(xa61Var2.f259578X0, (ComposeView) xa61Var2.f259581a1.getValue());
            default:
                return (y961) this.f249406b.f259574T0.f75319a.get();
        }
    }
}
