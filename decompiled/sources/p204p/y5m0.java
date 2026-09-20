package p204p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class y5m0 extends wba {

    /* JADX INFO: renamed from: O0 */
    public final z9j0 f269488O0;

    /* JADX INFO: renamed from: P0 */
    public final boolean f269489P0;

    /* JADX INFO: renamed from: Q0 */
    public final int f269490Q0;

    /* JADX INFO: renamed from: R0 */
    public final wg61 f269491R0;

    /* JADX INFO: renamed from: S0 */
    public final wg61 f269492S0;

    /* JADX INFO: renamed from: T0 */
    public final wg61 f269493T0;

    public y5m0(ConstraintLayout constraintLayout, rmm0 rmm0Var, z9j0 z9j0Var) {
        super(constraintLayout.getContext());
        this.f269488O0 = z9j0Var;
        this.f269489P0 = true;
        this.f269490Q0 = -1;
        wg61 wg61Var = new wg61(new x5m0(this, 1));
        this.f269491R0 = wg61Var;
        this.f269492S0 = new wg61(new x5m0(this, 2));
        wg61 wg61Var2 = new wg61(new x5m0(this, 0));
        this.f269493T0 = wg61Var2;
        rmm0Var.mo29873e().getLifecycle().mo31986a(new v5m0(this));
        setContentView(constraintLayout);
        eug1.m40073o((View) wg61Var.getValue(), eug1.m40067h(constraintLayout));
        y85.m93047D((View) wg61Var.getValue(), this);
        setOnShowListener(new w5m0(this, 0));
        ((View) wg61Var2.getValue()).setBackground(getContext().getDrawable(R.drawable.bg_page_bottom_sheet));
        m87626g().f2008E = true;
    }

    @Override // p204p.wba, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wg61 wg61Var = this.f269491R0;
        ((View) wg61Var.getValue()).setFitsSystemWindows(false);
        p3h1.m69032r((View) wg61Var.getValue(), new bnl0(this, 3));
        ((View) this.f269492S0.getValue()).setFitsSystemWindows(false);
        wg61 wg61Var2 = this.f269493T0;
        ((View) wg61Var2.getValue()).setFitsSystemWindows(false);
        View view = (View) wg61Var2.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.f269490Q0;
        view.setLayoutParams(layoutParams);
    }
}
